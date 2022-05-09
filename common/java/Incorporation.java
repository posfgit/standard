
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Incorporation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Incorporation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AltePersoaneJuridice"/>
 *     &lt;enumeration value="AutoritateInstitutiePublica"/>
 *     &lt;enumeration value="CompanieNationala"/>
 *     &lt;enumeration value="Fundatie"/>
 *     &lt;enumeration value="InstitutCulturalAlUnuiStat"/>
 *     &lt;enumeration value="InstitutieDeCredit"/>
 *     &lt;enumeration value="MisiuneDiplomatica"/>
 *     &lt;enumeration value="OficiuConsular"/>
 *     &lt;enumeration value="OrganizatieAsociatieCuPersonalitateJuridica"/>
 *     &lt;enumeration value="OrganizatiePatronala"/>
 *     &lt;enumeration value="OrganizatieSindicala"/>
 *     &lt;enumeration value="RegieAutonoma"/>
 *     &lt;enumeration value="ReprezentantaComercialaSiEconomicaAleAltuiStat"/>
 *     &lt;enumeration value="ReprezentantaDinRomaniaPentruPJStraina"/>
 *     &lt;enumeration value="SocietateComerciala"/>
 *     &lt;enumeration value="SocietateCooperativa"/>
 *     &lt;enumeration value="SocietateNationala"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Incorporation")
@XmlEnum
public enum Incorporation {

    @XmlEnumValue("AltePersoaneJuridice")
    ALTE_PERSOANE_JURIDICE("AltePersoaneJuridice"),
    @XmlEnumValue("AutoritateInstitutiePublica")
    AUTORITATE_INSTITUTIE_PUBLICA("AutoritateInstitutiePublica"),
    @XmlEnumValue("CompanieNationala")
    COMPANIE_NATIONALA("CompanieNationala"),
    @XmlEnumValue("Fundatie")
    FUNDATIE("Fundatie"),
    @XmlEnumValue("InstitutCulturalAlUnuiStat")
    INSTITUT_CULTURAL_AL_UNUI_STAT("InstitutCulturalAlUnuiStat"),
    @XmlEnumValue("InstitutieDeCredit")
    INSTITUTIE_DE_CREDIT("InstitutieDeCredit"),
    @XmlEnumValue("MisiuneDiplomatica")
    MISIUNE_DIPLOMATICA("MisiuneDiplomatica"),
    @XmlEnumValue("OficiuConsular")
    OFICIU_CONSULAR("OficiuConsular"),
    @XmlEnumValue("OrganizatieAsociatieCuPersonalitateJuridica")
    ORGANIZATIE_ASOCIATIE_CU_PERSONALITATE_JURIDICA("OrganizatieAsociatieCuPersonalitateJuridica"),
    @XmlEnumValue("OrganizatiePatronala")
    ORGANIZATIE_PATRONALA("OrganizatiePatronala"),
    @XmlEnumValue("OrganizatieSindicala")
    ORGANIZATIE_SINDICALA("OrganizatieSindicala"),
    @XmlEnumValue("RegieAutonoma")
    REGIE_AUTONOMA("RegieAutonoma"),
    @XmlEnumValue("ReprezentantaComercialaSiEconomicaAleAltuiStat")
    REPREZENTANTA_COMERCIALA_SI_ECONOMICA_ALE_ALTUI_STAT("ReprezentantaComercialaSiEconomicaAleAltuiStat"),
    @XmlEnumValue("ReprezentantaDinRomaniaPentruPJStraina")
    REPREZENTANTA_DIN_ROMANIA_PENTRU_PJ_STRAINA("ReprezentantaDinRomaniaPentruPJStraina"),
    @XmlEnumValue("SocietateComerciala")
    SOCIETATE_COMERCIALA("SocietateComerciala"),
    @XmlEnumValue("SocietateCooperativa")
    SOCIETATE_COOPERATIVA("SocietateCooperativa"),
    @XmlEnumValue("SocietateNationala")
    SOCIETATE_NATIONALA("SocietateNationala");
    private final String value;

    Incorporation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Incorporation fromValue(String v) {
        for (Incorporation c: Incorporation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
