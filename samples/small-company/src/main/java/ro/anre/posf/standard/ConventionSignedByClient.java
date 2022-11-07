
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;


/**
 * Emis de WebPOSF cand a semnat clientul conventia
 * 
 * <p>Java class for ConventionSignedByClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConventionSignedByClient">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="contract" type="{http://www.anre.ro/ANRESchema}Convention"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConventionSignedByClient", propOrder = {
    "contract",
    "info"
})
@XmlRootElement(name = "ConventionSignedByClient")
public class ConventionSignedByClient
    extends Message
{

    @XmlElement(required = true)
    protected Convention contract;
    protected String info;

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Convention }
     *     
     */
    public Convention getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Convention }
     *     
     */
    public void setContract(Convention value) {
        this.contract = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

}
