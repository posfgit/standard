
package ro.anre.anreschema.standard;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="address" type="{http://www.anre.ro/ANRESchema}Address"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operator" type="{http://www.anre.ro/ANRESchema}Operator"/>
 *         &lt;element name="type" type="{http://www.anre.ro/ANRESchema}PlaceType"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="technicalDataElectricity" type="{http://www.anre.ro/ANRESchema}TechnicalDataElectricity" minOccurs="0"/>
 *           &lt;element name="technicalDataGas" type="{http://www.anre.ro/ANRESchema}TechnicalDataGas" minOccurs="0"/>
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
@XmlType(name = "Place", propOrder = {
    "address",
    "code",
    "operator",
    "type",
    "urls",
    "technicalDataGas",
    "technicalDataElectricity"
})
@XmlRootElement(name = "Place")
public class Place {

    protected Address address;
    protected String code;
    protected Operator operator;
    @XmlSchemaType(name = "string")
    protected PlaceType type;
    @XmlElement(name = "url")
    protected List<String> urls;
    protected TechnicalDataGas technicalDataGas;
    protected TechnicalDataElectricity technicalDataElectricity;

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

    /**
     * Gets the value of the urls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUrls() {
        if (urls == null) {
            urls = new ArrayList<String>();
        }
        return this.urls;
    }

    /**
     * Gets the value of the technicalDataGas property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalDataGas }
     *     
     */
    public TechnicalDataGas getTechnicalDataGas() {
        return technicalDataGas;
    }

    /**
     * Sets the value of the technicalDataGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalDataGas }
     *     
     */
    public void setTechnicalDataGas(TechnicalDataGas value) {
        this.technicalDataGas = value;
    }

    /**
     * Gets the value of the technicalDataElectricity property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalDataElectricity }
     *     
     */
    public TechnicalDataElectricity getTechnicalDataElectricity() {
        return technicalDataElectricity;
    }

    /**
     * Sets the value of the technicalDataElectricity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalDataElectricity }
     *     
     */
    public void setTechnicalDataElectricity(TechnicalDataElectricity value) {
        this.technicalDataElectricity = value;
    }

}
