
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumptionCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConsumptionCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C_1"/>
 *     &lt;enumeration value="C_2"/>
 *     &lt;enumeration value="C_3"/>
 *     &lt;enumeration value="C_4"/>
 *     &lt;enumeration value="C_5"/>
 *     &lt;enumeration value="C_6"/>
 *     &lt;enumeration value="C_7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConsumptionCategory")
@XmlEnum
public enum ConsumptionCategory {

    C_1,
    C_2,
    C_3,
    C_4,
    C_5,
    C_6,
    C_7;

    public String value() {
        return name();
    }

    public static ConsumptionCategory fromValue(String v) {
        return valueOf(v);
    }

}
