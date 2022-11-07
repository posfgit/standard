
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="hasProsumer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.anre.ro/ANRESchema}PlaceType"/>
 *         &lt;element name="url" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="technicalDataElectricity" type="{http://www.anre.ro/ANRESchema}TechnicalDataElectricity"/>
 *           &lt;element name="technicalDataGas" type="{http://www.anre.ro/ANRESchema}TechnicalDataGas"/>
 *         &lt;/choice>
 *         &lt;element name="extraData" type="{http://www.anre.ro/ANRESchema}TechnicalDatas" minOccurs="0"/>
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
    "hasProsumer",
    "type",
    "urls",
    "technicalDataGas",
    "technicalDataElectricity",
    "extraData"
})
@XmlRootElement(name = "Place")
public class Place {

    protected Address address;
    protected String code;
    protected Operator operator;
    protected Boolean hasProsumer;
    @XmlSchemaType(name = "string")
    protected PlaceType type;
    @XmlElement(name = "url")
    protected List<Place.Url> urls;
    protected TechnicalDataGas technicalDataGas;
    protected TechnicalDataElectricity technicalDataElectricity;
    protected TechnicalDatas extraData;

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
     * Gets the value of the hasProsumer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasProsumer() {
        return hasProsumer;
    }

    /**
     * Sets the value of the hasProsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasProsumer(Boolean value) {
        this.hasProsumer = value;
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
     * {@link Place.Url }
     * 
     * 
     */
    public List<Place.Url> getUrls() {
        if (urls == null) {
            urls = new ArrayList<Place.Url>();
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

    /**
     * Gets the value of the extraData property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalDatas }
     *     
     */
    public TechnicalDatas getExtraData() {
        return extraData;
    }

    /**
     * Sets the value of the extraData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalDatas }
     *     
     */
    public void setExtraData(TechnicalDatas value) {
        this.extraData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Url {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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

    }

}
