
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalIDType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegalIDType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CNP"/>
 *     &lt;enumeration value="CUI"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PASSPORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegalIDType")
@XmlEnum
public enum LegalIDType {

    CNP,
    CUI,
    OTHER,
    PASSPORT;

    public String value() {
        return name();
    }

    public static LegalIDType fromValue(String v) {
        return valueOf(v);
    }

}
