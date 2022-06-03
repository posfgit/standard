
package ro.anre.anreschema.standard;

import java.util.UUID;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, UUID>
{


    public UUID unmarshal(String value) {
        return (ro.anre.anreschema.standard.Adapter.parseUuid(value));
    }

    public String marshal(UUID value) {
        return (ro.anre.anreschema.standard.Adapter.printUuid(value));
    }

}
