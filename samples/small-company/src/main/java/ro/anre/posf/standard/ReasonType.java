
package ro.anre.posf.standard;

import com.fasterxml.jackson.annotation.JsonCreator;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import java.util.List;


/**
 * <p>Java class for ReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANULARE_CERERE_CONTRACTARE"/>
 *     &lt;enumeration value="DENUNTARE"/>
 *     &lt;enumeration value="DENUNTARE_INCETARE_LOC"/>
 *     &lt;enumeration value="REZILIERE"/>
 *     &lt;enumeration value="REZILIERE_NEPLATA"/>
 *     &lt;enumeration value="ACORDUL_PARTILOR"/>
 *     &lt;enumeration value="EROARE_MATERIALA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReasonType")
@XmlEnum
public enum ReasonType {

    ANULARE_CERERE_CONTRACTARE,

    /**
     * Folosit doar la cererea clientului
     * 
     */
    DENUNTARE,

    /**
     * Folosit la cererea clientului cand se solicita ridicarea contorului
     * 
     */
    DENUNTARE_INCETARE_LOC,

    /**
     * Folosit doar la cererea furnizorului
     * 
     */
    REZILIERE,

    /**
     * Folosit doar la cererea furnizorului in caz de neplata
     * 
     */
    REZILIERE_NEPLATA,
    ACORDUL_PARTILOR,

    /**
     * Folosit pentru a informa ca mesajul trimis anterior de semnare contract a fost introdus gresit
     * 
     */
    EROARE_MATERIALA;

    public String value() {
        return name();
    }

    public static ReasonType fromValue(String v) {
        return valueOf(v);
    }


    @JsonCreator
    public static ReasonType forValues(String reason) {
        if (List.of(
                "AJUNGERE_LA_TERMEN",
                "ANULARE_SCHIMBARE_FURNIZOR",
                "EROARE_PROCESARE",
                "ALTELE"
        ).contains(reason)) {
            return null;
        }

        return ReasonType.valueOf(reason);
    }
}
