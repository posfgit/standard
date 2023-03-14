
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalDataMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TechnicalDataMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEZONIER"/>
 *     &lt;enumeration value="PERMANENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TechnicalDataMode")
@XmlEnum
public enum TechnicalDataMode {


    /**
     * Regim sezonier
     * 
     */
    SEZONIER,

    /**
     * Regim permanent
     * 
     */
    PERMANENT;

    public String value() {
        return name();
    }

    public static TechnicalDataMode fromValue(String v) {
        return valueOf(v);
    }

}
