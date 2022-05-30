
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIV"/>
 *     &lt;enumeration value="INCETAT"/>
 *     &lt;enumeration value="SUSPENDAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractStatus")
@XmlEnum
public enum ContractStatus {

    ACTIV,
    INCETAT,
    SUSPENDAT;

    public String value() {
        return name();
    }

    public static ContractStatus fromValue(String v) {
        return valueOf(v);
    }

}
