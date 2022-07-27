
package ro.anre.posf.standard;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.ZonedDateTime;

public class Adapter1
    extends XmlAdapter<String, ZonedDateTime>
{


    public ZonedDateTime unmarshal(String value) {
        return (ro.anre.posf.standard.Adapter.parseDateTime(value));
    }

    public String marshal(ZonedDateTime value) {
        return (ro.anre.posf.standard.Adapter.printDateTime(value));
    }

}
