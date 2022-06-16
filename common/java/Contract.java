
package ro.anre.anreschema.standard;

import java.time.LocalDate;
import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Informatii Contract
 * 
 * <p>Java class for Contract complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contract">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="additionalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="additionalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="client" type="{http://www.anre.ro/ANRESchema}Client" minOccurs="0"/>
 *         &lt;element name="consumption" type="{http://www.anre.ro/ANRESchema}Consumption" minOccurs="0"/>
 *         &lt;element name="contractStatus" type="{http://www.anre.ro/ANRESchema}ContractStatus" minOccurs="0"/>
 *         &lt;element name="contractWithOperatorNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="conventionNeeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="correspondenceClientAddress" type="{http://www.anre.ro/ANRESchema}Address" minOccurs="0"/>
 *         &lt;element name="correspondenceClientContactAddress" type="{http://www.anre.ro/ANRESchema}ContactAddress" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="executionAddress" type="{http://www.anre.ro/ANRESchema}Address"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.anre.ro/ANRESchema}Guid"/>
 *         &lt;element name="marketing" type="{http://www.anre.ro/ANRESchema}Marketing" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="offerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.anre.ro/ANRESchema}Operator" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.anre.ro/ANRESchema}Place" minOccurs="0"/>
 *         &lt;element name="previousSupplier" type="{http://www.anre.ro/ANRESchema}Supplier" minOccurs="0"/>
 *         &lt;element name="startingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="supplier" type="{http://www.anre.ro/ANRESchema}Supplier" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.anre.ro/ANRESchema}ContractType"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contract", propOrder = {
    "additionalDate",
    "additionalNumber",
    "client",
    "consumption",
    "contractStatus",
    "contractWithOperatorNeeded",
    "conventionNeeded",
    "correspondenceClientAddress",
    "correspondenceClientContactAddress",
    "date",
    "executionAddress",
    "expirationDate",
    "id",
    "marketing",
    "number",
    "offerCode",
    "operator",
    "place",
    "previousSupplier",
    "startingDate",
    "supplier",
    "type",
    "url"
})
@XmlRootElement(name = "Contract")
public class Contract {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate additionalDate;
    protected String additionalNumber;
    protected Client client;
    protected Consumption consumption;
    @XmlSchemaType(name = "string")
    protected ContractStatus contractStatus;
    protected Boolean contractWithOperatorNeeded;
    protected Boolean conventionNeeded;
    protected Address correspondenceClientAddress;
    protected ContactAddress correspondenceClientContactAddress;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate date;
    protected Address executionAddress;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate expirationDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected UUID id;
    protected Marketing marketing;
    protected String number;
    protected String offerCode;
    protected Operator operator;
    protected Place place;
    protected Supplier previousSupplier;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate startingDate;
    protected Supplier supplier;
    @XmlSchemaType(name = "string")
    protected ContractType type;
    protected String url;

    /**
     * Gets the value of the additionalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getAdditionalDate() {
        return additionalDate;
    }

    /**
     * Sets the value of the additionalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDate(LocalDate value) {
        this.additionalDate = value;
    }

    /**
     * Gets the value of the additionalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalNumber() {
        return additionalNumber;
    }

    /**
     * Sets the value of the additionalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalNumber(String value) {
        this.additionalNumber = value;
    }

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

    /**
     * Gets the value of the consumption property.
     * 
     * @return
     *     possible object is
     *     {@link Consumption }
     *     
     */
    public Consumption getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumption }
     *     
     */
    public void setConsumption(Consumption value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ContractStatus }
     *     
     */
    public ContractStatus getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractStatus }
     *     
     */
    public void setContractStatus(ContractStatus value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the contractWithOperatorNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContractWithOperatorNeeded() {
        return contractWithOperatorNeeded;
    }

    /**
     * Sets the value of the contractWithOperatorNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContractWithOperatorNeeded(Boolean value) {
        this.contractWithOperatorNeeded = value;
    }

    /**
     * Gets the value of the conventionNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConventionNeeded() {
        return conventionNeeded;
    }

    /**
     * Sets the value of the conventionNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConventionNeeded(Boolean value) {
        this.conventionNeeded = value;
    }

    /**
     * Gets the value of the correspondenceClientAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCorrespondenceClientAddress() {
        return correspondenceClientAddress;
    }

    /**
     * Sets the value of the correspondenceClientAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCorrespondenceClientAddress(Address value) {
        this.correspondenceClientAddress = value;
    }

    /**
     * Gets the value of the correspondenceClientContactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAddress }
     *     
     */
    public ContactAddress getCorrespondenceClientContactAddress() {
        return correspondenceClientContactAddress;
    }

    /**
     * Sets the value of the correspondenceClientContactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAddress }
     *     
     */
    public void setCorrespondenceClientContactAddress(ContactAddress value) {
        this.correspondenceClientContactAddress = value;
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
     * Gets the value of the executionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getExecutionAddress() {
        return executionAddress;
    }

    /**
     * Sets the value of the executionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setExecutionAddress(Address value) {
        this.executionAddress = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(LocalDate value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(UUID value) {
        this.id = value;
    }

    /**
     * Gets the value of the marketing property.
     * 
     * @return
     *     possible object is
     *     {@link Marketing }
     *     
     */
    public Marketing getMarketing() {
        return marketing;
    }

    /**
     * Sets the value of the marketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Marketing }
     *     
     */
    public void setMarketing(Marketing value) {
        this.marketing = value;
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
     * Gets the value of the offerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
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

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link Place }
     *     
     */
    public Place getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link Place }
     *     
     */
    public void setPlace(Place value) {
        this.place = value;
    }

    /**
     * Gets the value of the previousSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    public Supplier getPreviousSupplier() {
        return previousSupplier;
    }

    /**
     * Sets the value of the previousSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    public void setPreviousSupplier(Supplier value) {
        this.previousSupplier = value;
    }

    /**
     * Gets the value of the startingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStartingDate() {
        return startingDate;
    }

    /**
     * Sets the value of the startingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingDate(LocalDate value) {
        this.startingDate = value;
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

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setType(ContractType value) {
        this.type = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
