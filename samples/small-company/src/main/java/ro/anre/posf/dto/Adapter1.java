
package ro.anre.posf.dto;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Adapter1 extends XmlAdapter<String, LocalDateTime>
{


    public LocalDateTime unmarshal(String value) {
        return  LocalDateTime.parse(value, DateTimeFormatter.ISO_LOCAL_DATE_TIME);

    }

    public String marshal(LocalDateTime value) {
        return value.toString();
    }

}
