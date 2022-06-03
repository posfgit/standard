
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * Conventie contract de retea
 * 
 * <p>Java class for Convention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Convention">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activeSupplier" type="{http://www.anre.ro/ANRESchema}Supplier" maxOccurs="unbounded"/>
 *         &lt;element name="contract" type="{http://www.anre.ro/ANRESchema}Contract"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="removedSupplier" type="{http://www.anre.ro/ANRESchema}Supplier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.anre.ro/ANRESchema}ConventionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Convention", propOrder = {
    "activeSuppliers",
    "contract",
    "date",
    "number",
    "removedSuppliers",
    "type"
})
@XmlRootElement(name = "Convention")
public class Convention {

    @XmlElement(name = "activeSupplier", required = true)
    protected List<Supplier> activeSuppliers;
    @XmlElement(required = true)
    protected Contract contract;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate date;
    @XmlElement(required = true)
    protected String number;
    @XmlElement(name = "removedSupplier")
    protected List<Supplier> removedSuppliers;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConventionType type;

    /**
     * Gets the value of the activeSuppliers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeSuppliers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveSuppliers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supplier }
     * 
     * 
     */
    public List<Supplier> getActiveSuppliers() {
        if (activeSuppliers == null) {
            activeSuppliers = new ArrayList<Supplier>();
        }
        return this.activeSuppliers;
    }

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(LocalDate value) {
        this.date = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the removedSuppliers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removedSuppliers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemovedSuppliers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supplier }
     * 
     * 
     */
    public List<Supplier> getRemovedSuppliers() {
        if (removedSuppliers == null) {
            removedSuppliers = new ArrayList<Supplier>();
        }
        return this.removedSuppliers;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ConventionType }
     *     
     */
    public ConventionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConventionType }
     *     
     */
    public void setType(ConventionType value) {
        this.type = value;
    }

}
