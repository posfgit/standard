
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalDataStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TechnicalDataStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONECTAT"/>
 *     &lt;enumeration value="DECONECTAT"/>
 *     &lt;enumeration value="INACTIV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TechnicalDataStatus")
@XmlEnum
public enum TechnicalDataStatus {

    CONECTAT,
    DECONECTAT,
    INACTIV;

    public String value() {
        return name();
    }

    public static TechnicalDataStatus fromValue(String v) {
        return valueOf(v);
    }

}
