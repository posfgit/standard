
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FURNIZARE"/>
 *     &lt;enumeration value="RETEA"/>
 *     &lt;enumeration value="TRANSPORT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractType")
@XmlEnum
public enum ContractType {

    FURNIZARE,
    RETEA,
    TRANSPORT;

    public String value() {
        return name();
    }

    public static ContractType fromValue(String v) {
        return valueOf(v);
    }

}
