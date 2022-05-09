
package ro.anre.anreschema.standard;

import java.time.LocalDateTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, LocalDateTime>
{


    public LocalDateTime unmarshal(String value) {
        return (ro.anre.anreschema.jaxb.Adapter.parseDateTime(value));
    }

    public String marshal(LocalDateTime value) {
        return (ro.anre.anreschema.jaxb.Adapter.printDateTime(value));
    }

}
