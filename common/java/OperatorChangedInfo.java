
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Emis de Operator cand i s-au schimbat datele de identificare/persoane/adresa/etc.
 * 
 * <p>Java class for OperatorChangedInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorChangedInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="domainUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.anre.ro/ANRESchema}Operator"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorChangedInfo", propOrder = {
    "domainUrl",
    "operator"
})
@XmlRootElement(name = "OperatorChangedInfo")
public class OperatorChangedInfo
    extends Message
{

    protected String domainUrl;
    @XmlElement(required = true)
    protected Operator operator;

    /**
     * Gets the value of the domainUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainUrl() {
        return domainUrl;
    }

    /**
     * Sets the value of the domainUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainUrl(String value) {
        this.domainUrl = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Operator }
     *     
     */
    public Operator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operator }
     *     
     */
    public void setOperator(Operator value) {
        this.operator = value;
    }

}
