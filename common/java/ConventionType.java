
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConventionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConventionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MULTIPARTITA"/>
 *     &lt;enumeration value="TRIPARTITA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConventionType")
@XmlEnum
public enum ConventionType {

    MULTIPARTITA,
    TRIPARTITA;

    public String value() {
        return name();
    }

    public static ConventionType fromValue(String v) {
        return valueOf(v);
    }

}
