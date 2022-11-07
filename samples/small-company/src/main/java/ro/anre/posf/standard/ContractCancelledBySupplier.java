
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;


/**
 * Se emite din aplicatia WebPOSF sau sistemul furnizorului cand un furnizor s-a razgandit pe un contract semnat sau vrea sa anuleze un contract existent.
 * 
 * <p>Java class for ContractCancelledBySupplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractCancelledBySupplier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="contract" type="{http://www.anre.ro/ANRESchema}Contract"/>
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
@XmlType(name = "ContractCancelledBySupplier", propOrder = {
    "contract",
    "info"
})
@XmlRootElement(name = "ContractCancelledBySupplier")
public class ContractCancelledBySupplier
    extends Message
{

    @XmlElement(required = true)
    protected Contract contract;
    protected String info;

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
