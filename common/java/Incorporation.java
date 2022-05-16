
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Incorporation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Incorporation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALTE_PERSOANE_JURIDICE"/>
 *     &lt;enumeration value="AUTORITATE_INSTITUTIE_PUBLICA"/>
 *     &lt;enumeration value="COMPANIE_NATIONALA"/>
 *     &lt;enumeration value="FUNDATIE"/>
 *     &lt;enumeration value="INSTITUT_CULTURALAL_UNUI_STAT"/>
 *     &lt;enumeration value="INSTITUTIE_DE_CREDIT"/>
 *     &lt;enumeration value="MISIUNE_DIPLOMATICA"/>
 *     &lt;enumeration value="OFICIU_CONSULAR"/>
 *     &lt;enumeration value="ORGANIZATIE_ASOCIATIE_CU_PERSONALITATE_JURIDICA"/>
 *     &lt;enumeration value="ORGANIZATIE_PATRONALA"/>
 *     &lt;enumeration value="ORGANIZATIE_SINDICALA"/>
 *     &lt;enumeration value="REGIE_AUTONOMA"/>
 *     &lt;enumeration value="REPREZENTANTA_COMERCIALA_SI_ECONOMICA_ALE_ALTUI_STAT"/>
 *     &lt;enumeration value="REPREZENTANTA_DIN_ROMANIA_PENTRU_PJ_STRAINA"/>
 *     &lt;enumeration value="SOCIETATE_COMERCIALA"/>
 *     &lt;enumeration value="SOCIETATE_COOPERATIVA"/>
 *     &lt;enumeration value="SOCIETATE_NATIONALA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Incorporation")
@XmlEnum
public enum Incorporation {

    ALTE_PERSOANE_JURIDICE,
    AUTORITATE_INSTITUTIE_PUBLICA,
    COMPANIE_NATIONALA,
    FUNDATIE,
    INSTITUT_CULTURALAL_UNUI_STAT,
    INSTITUTIE_DE_CREDIT,
    MISIUNE_DIPLOMATICA,
    OFICIU_CONSULAR,
    ORGANIZATIE_ASOCIATIE_CU_PERSONALITATE_JURIDICA,
    ORGANIZATIE_PATRONALA,
    ORGANIZATIE_SINDICALA,
    REGIE_AUTONOMA,
    REPREZENTANTA_COMERCIALA_SI_ECONOMICA_ALE_ALTUI_STAT,
    REPREZENTANTA_DIN_ROMANIA_PENTRU_PJ_STRAINA,
    SOCIETATE_COMERCIALA,
    SOCIETATE_COOPERATIVA,
    SOCIETATE_NATIONALA;

    public String value() {
        return name();
    }

    public static Incorporation fromValue(String v) {
        return valueOf(v);
    }

}
