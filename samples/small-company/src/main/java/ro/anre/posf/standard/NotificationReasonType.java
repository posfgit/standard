
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AJUNGERE_LA_TERMEN"/>
 *     &lt;enumeration value="EROARE_PROCESARE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NotificationReasonType")
@XmlEnum
public enum NotificationReasonType {

    AJUNGERE_LA_TERMEN,

    /**
     * Folosit pentru a informa ca mesajul primit (semnare sau modificare) nu poate fi procesat de sistem (in special de catre OD cand emite NotificationPublishedByOperator). In campul reasonDesc se va completa descrierea problemei intampinate
     * 
     */
    EROARE_PROCESARE;

    public String value() {
        return name();
    }

    public static NotificationReasonType fromValue(String v) {
        return valueOf(v);
    }

}
