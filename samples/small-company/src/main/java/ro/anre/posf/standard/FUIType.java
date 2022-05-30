
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FUIType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FUIType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DESEMNAT"/>
 *     &lt;enumeration value="NOMINALIZAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FUIType")
@XmlEnum
public enum FUIType {

    DESEMNAT,
    NOMINALIZAT;

    public String value() {
        return name();
    }

    public static FUIType fromValue(String v) {
        return valueOf(v);
    }

}
