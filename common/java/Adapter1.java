
package ro.anre.anreschema.standard;

import java.time.ZonedDateTime;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, ZonedDateTime>
{


    public ZonedDateTime unmarshal(String value) {
        return (ro.anre.anreschema.standard.Adapter.parseDateTime(value));
    }

    public String marshal(ZonedDateTime value) {
        return (ro.anre.anreschema.standard.Adapter.printDateTime(value));
    }

}
