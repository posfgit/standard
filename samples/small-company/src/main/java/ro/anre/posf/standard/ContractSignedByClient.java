
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Instiintare despre contract semnat de client in aplicatia WebPOSF
 * 
 * <p>Java class for ContractSignedByClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractSignedByClient">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="contract" type="{http://www.anre.ro/ANRESchema}Contract"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractSignedByClient", propOrder = {
    "contract"
})
@XmlRootElement(name = "ContractSignedByClient")
public class ContractSignedByClient
    extends Message
{

    @XmlElement(required = true)
    protected Contract contract;

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Contract }
     *     
     */
    public Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contract }
     *     
     */
    public void setContract(Contract value) {
        this.contract = value;
    }

}
