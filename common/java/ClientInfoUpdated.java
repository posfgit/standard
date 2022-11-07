
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;


/**
 * Este emis din WebPOSF cand se schimba datele clientului (nume/adresa de corespondenta) pentru informarea celor cu care sunt in relatie contractuala.
 * 
 * <p>Java class for ClientInfoUpdated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientInfoUpdated">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="client" type="{http://www.anre.ro/ANRESchema}Client"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientInfoUpdated", propOrder = {
    "client"
})
@XmlRootElement(name = "ClientInfoUpdated")
public class ClientInfoUpdated
    extends Message
{

    @XmlElement(required = true)
    protected Client client;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

}
