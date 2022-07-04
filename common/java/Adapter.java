package ro.anre.anreschema.standard;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Adapter  {

    public static ZonedDateTime parseDateTime(String date) {
        ZonedDateTime zdtInstanceAtOffset = ZonedDateTime.parse(date, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        return  zdtInstanceAtOffset.withZoneSameInstant(ZoneOffset.UTC);
    }

    public static String printDateTime(ZonedDateTime val) {
        return val.withZoneSameInstant(ZoneOffset.UTC).toString();
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
