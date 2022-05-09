
package ro.anre.anreschema.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Loc de consum
 * 
 * <p>Java class for Place complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Place">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.anre.ro/ANRESchema}Address"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operator" type="{http://www.anre.ro/ANRESchema}Operator"/>
 *         &lt;element name="technicalData" type="{http://www.anre.ro/ANRESchema}TechnicalData"/>
 *         &lt;element name="type" type="{http://www.anre.ro/ANRESchema}PlaceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Place", propOrder = {
    "address",
    "code",
    "operator",
    "technicalData",
    "type"
})
@XmlRootElement(name = "Place")
public class Place {

    @XmlElement(required = true)
    protected Address address;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected Operator operator;
    @XmlElement(required = true)
    protected TechnicalData technicalData;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PlaceType type;

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
     * Gets the value of the technicalData property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalData }
     *     
     */
    public TechnicalData getTechnicalData() {
        return technicalData;
    }

    /**
     * Sets the value of the technicalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalData }
     *     
     */
    public void setTechnicalData(TechnicalData value) {
        this.technicalData = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceType }
     *     
     */
    public PlaceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceType }
     *     
     */
    public void setType(PlaceType value) {
        this.type = value;
    }

}
