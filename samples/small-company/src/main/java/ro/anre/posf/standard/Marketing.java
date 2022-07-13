
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Marketing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Marketing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agreeContactTerms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="agreeGDPRTerms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="agreePlatformTerms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="clientIBAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electronicInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="smsInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="electronicMoneyReturn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Marketing", propOrder = {
    "agreeContactTerms",
    "agreeGDPRTerms",
    "agreePlatformTerms",
    "clientIBAN",
    "electronicInvoice",
    "smsInvoice",
    "electronicMoneyReturn"
})
@XmlRootElement(name = "Marketing")
public class Marketing {

    protected Boolean agreeContactTerms;
    protected Boolean agreeGDPRTerms;
    protected Boolean agreePlatformTerms;
    protected String clientIBAN;
    protected Boolean electronicInvoice;
    protected Boolean smsInvoice;
    protected Boolean electronicMoneyReturn;

    /**
     * Gets the value of the agreeContactTerms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgreeContactTerms() {
        return agreeContactTerms;
    }

    /**
     * Sets the value of the agreeContactTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgreeContactTerms(Boolean value) {
        this.agreeContactTerms = value;
    }

    /**
     * Gets the value of the agreeGDPRTerms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgreeGDPRTerms() {
        return agreeGDPRTerms;
    }

    /**
     * Sets the value of the agreeGDPRTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgreeGDPRTerms(Boolean value) {
        this.agreeGDPRTerms = value;
    }

    /**
     * Gets the value of the agreePlatformTerms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgreePlatformTerms() {
        return agreePlatformTerms;
    }

    /**
     * Sets the value of the agreePlatformTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgreePlatformTerms(Boolean value) {
        this.agreePlatformTerms = value;
    }

    /**
     * Gets the value of the clientIBAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientIBAN() {
        return clientIBAN;
    }

    /**
     * Sets the value of the clientIBAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientIBAN(String value) {
        this.clientIBAN = value;
    }

    /**
     * Gets the value of the electronicInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicInvoice() {
        return electronicInvoice;
    }

    /**
     * Sets the value of the electronicInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronicInvoice(Boolean value) {
        this.electronicInvoice = value;
    }

    /**
     * Gets the value of the smsInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmsInvoice() {
        return smsInvoice;
    }

    /**
     * Sets the value of the smsInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmsInvoice(Boolean value) {
        this.smsInvoice = value;
    }

    /**
     * Gets the value of the electronicMoneyReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElectronicMoneyReturn() {
        return electronicMoneyReturn;
    }

    /**
     * Sets the value of the electronicMoneyReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElectronicMoneyReturn(Boolean value) {
        this.electronicMoneyReturn = value;
    }

}
