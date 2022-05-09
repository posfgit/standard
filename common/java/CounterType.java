
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CounterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="GAS"/>
 *     &lt;enumeration value="REACTIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CounterType")
@XmlEnum
public enum CounterType {

    ACTIVE,
    GAS,
    REACTIVE;

    public String value() {
        return name();
    }

    public static CounterType fromValue(String v) {
        return valueOf(v);
    }

}
