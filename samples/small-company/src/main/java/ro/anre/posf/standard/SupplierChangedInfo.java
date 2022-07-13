
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Emis de Furnizor cand i s-au schimbat datele de identificare/persoane/adresa/etc.
 * 
 * <p>Java class for SupplierChangedInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierChangedInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="domainUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplier" type="{http://www.anre.ro/ANRESchema}Supplier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierChangedInfo", propOrder = {
    "domainUrl",
    "supplier"
})
@XmlRootElement(name = "SupplierChangedInfo")
public class SupplierChangedInfo
    extends Message
{

    protected String domainUrl;
    @XmlElement(required = true)
    protected Supplier supplier;

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
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    public void setSupplier(Supplier value) {
        this.supplier = value;
    }

}
