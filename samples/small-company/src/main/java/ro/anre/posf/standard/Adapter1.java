
package ro.anre.posf.standard;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;

public class Adapter1
    extends XmlAdapter<String, LocalDateTime>
{


    public LocalDateTime unmarshal(String value) {
        return (Adapter.parseDateTime(value));
    }

    public String marshal(LocalDateTime value) {
        return (Adapter.printDateTime(value));
    }

}
