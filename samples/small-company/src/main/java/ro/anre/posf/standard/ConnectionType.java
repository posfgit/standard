
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MONOFAZAT"/>
 *     &lt;enumeration value="TRIFAZAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectionType")
@XmlEnum
public enum ConnectionType {

    MONOFAZAT,
    TRIFAZAT;

    public String value() {
        return name();
    }

    public static ConnectionType fromValue(String v) {
        return valueOf(v);
    }

}
