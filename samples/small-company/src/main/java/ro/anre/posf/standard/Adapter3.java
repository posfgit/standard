
package ro.anre.posf.standard;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.UUID;

public class Adapter3
    extends XmlAdapter<String, UUID>
{


    public UUID unmarshal(String value) {
        return (ro.anre.posf.standard.Adapter.parseUuid(value));
    }

    public String marshal(UUID value) {
        return (ro.anre.posf.standard.Adapter.printUuid(value));
    }

}
