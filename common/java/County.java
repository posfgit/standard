
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for County.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="County">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="BV"/>
 *     &lt;enumeration value="BZ"/>
 *     &lt;enumeration value="CJ"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="DB"/>
 *     &lt;enumeration value="DJ"/>
 *     &lt;enumeration value="GJ"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="IF"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="NT"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SJ"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="VL"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="VS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "County")
@XmlEnum
public enum County {

    AB,
    AG,
    AR,
    B,
    BC,
    BH,
    BN,
    BR,
    BT,
    BV,
    BZ,
    CJ,
    CL,
    CS,
    CT,
    CV,
    DB,
    DJ,
    GJ,
    GL,
    GR,
    HD,
    HR,
    IF,
    IL,
    IS,
    MH,
    MM,
    MS,
    NT,
    OT,
    OTHER,
    PH,
    SB,
    SJ,
    SM,
    SV,
    TL,
    TM,
    TR,
    VL,
    VN,
    VS;

    public String value() {
        return name();
    }

    public static County fromValue(String v) {
        return valueOf(v);
    }

}
