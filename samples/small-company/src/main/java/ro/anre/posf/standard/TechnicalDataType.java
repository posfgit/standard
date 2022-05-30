
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnicalDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TechnicalDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACORDACCES"/>
 *     &lt;enumeration value="ATREE"/>
 *     &lt;enumeration value="ATRGN"/>
 *     &lt;enumeration value="CERTIFICATRACORDARE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TechnicalDataType")
@XmlEnum
public enum TechnicalDataType {


    /**
     * Acord acces
     * 
     */
    ACORDACCES,

    /**
     *  Aviz tehnic de racordare Energie Electrica
     * 
     */
    ATREE,

    /**
     * Aviz tehnic de racordare gaze naturale
     * 
     */
    ATRGN,

    /**
     * Certificat de racordare
     * 
     */
    CERTIFICATRACORDARE;

    public String value() {
        return name();
    }

    public static TechnicalDataType fromValue(String v) {
        return valueOf(v);
    }

}
