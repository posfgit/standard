
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Client
 * 
 * <p>Java class for Client complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Client">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;choice minOccurs="0">
 *           &lt;element name="aggregateCompany" type="{http://www.anre.ro/ANRESchema}Company" minOccurs="0"/>
 *           &lt;element name="aggregatePerson" type="{http://www.anre.ro/ANRESchema}Person" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="finalClientType" type="{http://www.anre.ro/ANRESchema}ClientType" minOccurs="0"/>
 *         &lt;element name="isAgregate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPre" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preCompany" type="{http://www.anre.ro/ANRESchema}Company" minOccurs="0"/>
 *         &lt;element name="prosumer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="uninterruptible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="vulnerable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="company" type="{http://www.anre.ro/ANRESchema}Company" minOccurs="0"/>
 *           &lt;element name="person" type="{http://www.anre.ro/ANRESchema}Person" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Client", propOrder = {
    "aggregatePerson",
    "aggregateCompany",
    "finalClientType",
    "isAgregate",
    "isPre",
    "preCompany",
    "prosumer",
    "uninterruptible",
    "vulnerable",
    "person",
    "company"
})
@XmlRootElement(name = "Client")
public class Client {

    protected Person aggregatePerson;
    protected Company aggregateCompany;
    @XmlSchemaType(name = "string")
    protected ClientType finalClientType;
    protected Boolean isAgregate;
    protected Boolean isPre;
    protected Company preCompany;
    protected Boolean prosumer;
    protected Boolean uninterruptible;
    protected Boolean vulnerable;
    protected Person person;
    protected Company company;

    /**
     * Gets the value of the aggregatePerson property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getAggregatePerson() {
        return aggregatePerson;
    }

    /**
     * Sets the value of the aggregatePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setAggregatePerson(Person value) {
        this.aggregatePerson = value;
    }

    /**
     * Gets the value of the aggregateCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getAggregateCompany() {
        return aggregateCompany;
    }

    /**
     * Sets the value of the aggregateCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setAggregateCompany(Company value) {
        this.aggregateCompany = value;
    }

    /**
     * Gets the value of the finalClientType property.
     * 
     * @return
     *     possible object is
     *     {@link ClientType }
     *     
     */
    public ClientType getFinalClientType() {
        return finalClientType;
    }

    /**
     * Sets the value of the finalClientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientType }
     *     
     */
    public void setFinalClientType(ClientType value) {
        this.finalClientType = value;
    }

    /**
     * Gets the value of the isAgregate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAgregate() {
        return isAgregate;
    }

    /**
     * Sets the value of the isAgregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAgregate(Boolean value) {
        this.isAgregate = value;
    }

    /**
     * Gets the value of the isPre property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPre() {
        return isPre;
    }

    /**
     * Sets the value of the isPre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPre(Boolean value) {
        this.isPre = value;
    }

    /**
     * Gets the value of the preCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getPreCompany() {
        return preCompany;
    }

    /**
     * Sets the value of the preCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setPreCompany(Company value) {
        this.preCompany = value;
    }

    /**
     * Gets the value of the prosumer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProsumer() {
        return prosumer;
    }

    /**
     * Sets the value of the prosumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProsumer(Boolean value) {
        this.prosumer = value;
    }

    /**
     * Gets the value of the uninterruptible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUninterruptible() {
        return uninterruptible;
    }

    /**
     * Sets the value of the uninterruptible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUninterruptible(Boolean value) {
        this.uninterruptible = value;
    }

    /**
     * Gets the value of the vulnerable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVulnerable() {
        return vulnerable;
    }

    /**
     * Sets the value of the vulnerable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVulnerable(Boolean value) {
        this.vulnerable = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

}
