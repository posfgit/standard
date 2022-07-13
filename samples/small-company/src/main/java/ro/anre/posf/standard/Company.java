
package ro.anre.posf.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Persoana juridica
 * 
 * <p>Java class for Company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Company">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="address" type="{http://www.anre.ro/ANRESchema}Address" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactAddress" type="{http://www.anre.ro/ANRESchema}ContactAddress" minOccurs="0"/>
 *         &lt;element name="correspondenceAddress" type="{http://www.anre.ro/ANRESchema}Address" minOccurs="0"/>
 *         &lt;element name="extra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incorporation" type="{http://www.anre.ro/ANRESchema}Incorporation" minOccurs="0"/>
 *         &lt;element name="legalRepresentative" type="{http://www.anre.ro/ANRESchema}Person" minOccurs="0"/>
 *         &lt;element name="legalRepresentativeQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Company", propOrder = {
    "address",
    "code",
    "contactAddress",
    "correspondenceAddress",
    "extra",
    "incorporation",
    "legalRepresentative",
    "legalRepresentativeQuality",
    "name",
    "number"
})
@XmlSeeAlso({
    Supplier.class,
    Operator.class
})
public class Company {

    protected Address address;
    protected String code;
    protected ContactAddress contactAddress;
    protected Address correspondenceAddress;
    protected String extra;
    @XmlSchemaType(name = "string")
    protected Incorporation incorporation;
    protected Person legalRepresentative;
    protected String legalRepresentativeQuality;
    protected String name;
    protected String number;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAddress }
     *     
     */
    public ContactAddress getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAddress }
     *     
     */
    public void setContactAddress(ContactAddress value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the correspondenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    /**
     * Sets the value of the correspondenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCorrespondenceAddress(Address value) {
        this.correspondenceAddress = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtra(String value) {
        this.extra = value;
    }

    /**
     * Gets the value of the incorporation property.
     * 
     * @return
     *     possible object is
     *     {@link Incorporation }
     *     
     */
    public Incorporation getIncorporation() {
        return incorporation;
    }

    /**
     * Sets the value of the incorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incorporation }
     *     
     */
    public void setIncorporation(Incorporation value) {
        this.incorporation = value;
    }

    /**
     * Gets the value of the legalRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getLegalRepresentative() {
        return legalRepresentative;
    }

    /**
     * Sets the value of the legalRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setLegalRepresentative(Person value) {
        this.legalRepresentative = value;
    }

    /**
     * Gets the value of the legalRepresentativeQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalRepresentativeQuality() {
        return legalRepresentativeQuality;
    }

    /**
     * Sets the value of the legalRepresentativeQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalRepresentativeQuality(String value) {
        this.legalRepresentativeQuality = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

}
