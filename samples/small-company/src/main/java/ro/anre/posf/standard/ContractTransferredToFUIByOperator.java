
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;


/**
 * Emis de WebPOSF / platforma operator cand un angajat al operatorului introduce faptul ca un furnizor se afla in imposibilitate de furnizare
 * 
 * <p>Java class for ContractTransferredToFUIByOperator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractTransferredToFUIByOperator">
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
@XmlType(name = "ContractTransferredToFUIByOperator", propOrder = {
    "contract"
})
@XmlRootElement(name = "ContractTransferredToFUIByOperator")
public class ContractTransferredToFUIByOperator
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
