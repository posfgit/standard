package ro.anre.posf;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.ClassUtils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.IntStream;

@UtilityClass
public class ObjectMapperUtil {

    public static Map<String, String> objectFieldMapper(Object element, String rootName) {
        Map<String, String> fieldMap = new HashMap<>();
        Field[] fields = element.getClass().getDeclaredFields();
        Arrays.stream(fields)
                .filter(field -> !field.isSynthetic())
                .forEach(field -> getNestedFieldMap(field, rootName, fieldMap, element));

        return fieldMap;
    }

    @SuppressWarnings("unchecked")
    @SneakyThrows
    private void getNestedFieldMap(Field field, String root, Map<String, String> fieldMap, Object element) {
        field.setAccessible(true);
        String keyFieldName = field.getName();

        Object value = field.get(element);
        String parentPath = root != null ? root  + "." : "";

        if(value != null){
            if (value instanceof String ||
                    value instanceof LocalDate ||
                    value instanceof LocalDateTime ||
                    value instanceof Long ||
                    value instanceof UUID ||
                    value instanceof BigInteger ||
                    value instanceof BigDecimal ||
                    value instanceof Boolean ||
                    value.getClass().isEnum() ||
                    ClassUtils.isPrimitiveOrWrapper(field.getClass())
            ) {
                fieldMap.put(parentPath + keyFieldName, value.toString());
            } else if (value instanceof List) {
                Field listField = element.getClass().getDeclaredField(field.getName());
                listField.setAccessible(true);
                Optional<Class<?>> genericTypeClass = getGenericTypeOfFieldByClassName(element.getClass(),
                        field.getName());

                List<Object> valueItems = (List<Object>) listField.get(element);
                genericTypeClass.filter(ObjectMapperUtil::isClassPrimitiveAndNotUserDefinedType)
                        .ifPresent(c -> IntStream.range(0, valueItems.size()).forEach(i -> {
                            String key = root + "." + keyFieldName + "[" + i + "]";
                            String keyValue = valueItems.get(i).toString();
                            fieldMap.put(key, keyValue);
                        }));
                genericTypeClass.filter(ObjectMapperUtil::isClassNotPrimitiveAndIsUserDefinedType)
                        .ifPresent(c -> IntStream.range(0, valueItems.size()).forEach(i -> {
                            String newRoot = root + "." + keyFieldName + "[" + i + "]";
                            Arrays.stream(c.getDeclaredFields()).filter(f -> !f.isSynthetic())
                                    .forEach(f -> getNestedFieldMap(f, newRoot, fieldMap, valueItems.get(i)));
                        }));

            } else {
                Arrays.stream(field.getType().getDeclaredFields())
                        .filter(f -> !f.isSynthetic())
                        .forEach(f -> getNestedFieldMap(f, parentPath + keyFieldName, fieldMap, value));

                Arrays.stream(value.getClass().getSuperclass().getDeclaredFields())
                        .filter(f -> !f.isSynthetic())
                        .forEach(f -> getNestedFieldMap(f, parentPath + keyFieldName, fieldMap, value));
            }
        }



    }

    public Optional<Class<?>> getGenericTypeOfFieldByClassName(Class<?> clazz, String fieldName) {
        Class<?> fieldType = null;
        try {
            Field field = clazz.getDeclaredField(fieldName);
            fieldType = field.getType();
            ParameterizedType stringListType = (ParameterizedType) field.getGenericType();
            Class<?> stringListClass = (Class<?>) stringListType.getActualTypeArguments()[0];
            return Optional.of(stringListClass);
        } catch (NoSuchFieldException ignored) {
        } catch (ClassCastException e2) {
            return Optional.of(fieldType);
        }
        return Optional.empty();
    }


    public Boolean isClassPrimitiveAndNotUserDefinedType(Class<?> clazz) {
        return clazz.equals(String.class) || ClassUtils.isPrimitiveOrWrapper(clazz);
    }


    public Boolean isClassNotPrimitiveAndIsUserDefinedType(Class<?> clazz) {
        return !clazz.equals(String.class) && !ClassUtils.isPrimitiveOrWrapper(clazz);
    }
}
