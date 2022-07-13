
package ro.anre.posf.standard;

import java.time.LocalDate;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, LocalDate>
{


    public LocalDate unmarshal(String value) {
        return (ro.anre.posf.standard.Adapter.parseDate(value));
    }

    public String marshal(LocalDate value) {
        return (ro.anre.posf.standard.Adapter.printDate(value));
    }

}
