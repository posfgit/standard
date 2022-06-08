package ro.anre.posf.standard;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Adapter  {

    public static LocalDateTime parseDateTime(String date) {
        if (date.endsWith("Z")) {
            return LocalDateTime.parse(date.substring(0, date.length() - 1));
        }
        return  LocalDateTime.parse(date);
    }

    public static String printDateTime(LocalDateTime val) {
        return val.toString();
    }

    public static LocalDate parseDate(String date) {
        return  LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static String printDate(LocalDate val) {
        return val.toString();
    }

    public static UUID parseUuid(String uuid) {
        return UUID.fromString(uuid);
    }

    public static String printUuid(UUID val) {
        return val.toString();
    }


}
