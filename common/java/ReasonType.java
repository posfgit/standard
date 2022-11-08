
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AJUNGERE_LA_TERMEN"/>
 *     &lt;enumeration value="DENUNTARE"/>
 *     &lt;enumeration value="REZILIERE"/>
 *     &lt;enumeration value="ACORDUL_PARTILOR"/>
 *     &lt;enumeration value="ALTELE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReasonType")
@XmlEnum
public enum ReasonType {

    AJUNGERE_LA_TERMEN,
    DENUNTARE,
    REZILIERE,
    ACORDUL_PARTILOR,
    ALTELE;

    public String value() {
        return name();
    }

    public static ReasonType fromValue(String v) {
        return valueOf(v);
    }

}
