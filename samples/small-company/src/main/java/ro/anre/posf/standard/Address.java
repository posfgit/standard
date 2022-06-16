
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.UUID;


/**
 * Adresa
 * 
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorId" type="{http://www.anre.ro/ANRESchema}Guid" minOccurs="0"/>
 *         &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.anre.ro/ANRESchema}City"/>
 *         &lt;element name="county" type="{http://www.anre.ro/ANRESchema}County"/>
 *         &lt;element name="cua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuaAuthor" type="{http://www.anre.ro/ANRESchema}Guid" minOccurs="0"/>
 *         &lt;element name="extended" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="position" type="{http://www.anre.ro/ANRESchema}Position" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stair" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="streetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "authorId",
    "building",
    "city",
    "county",
    "cua",
    "cuaAuthor",
    "extended",
    "flat",
    "floor",
    "number",
    "position",
    "postcode",
    "stair",
    "street",
    "streetType"
})
@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected UUID authorId;
    protected String building;
    @XmlElement(required = true)
    protected City city;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected County county;
    protected String cua;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected UUID cuaAuthor;
    protected String extended;
    protected String flat;
    protected String floor;
    @XmlElement(required = true)
    protected String number;
    protected Position position;
    protected String postcode;
    protected String stair;
    @XmlElement(required = true)
    protected String street;
    protected String streetType;

    /**
     * Gets the value of the authorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getAuthorId() {
        return authorId;
    }

    /**
     * Sets the value of the authorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorId(UUID value) {
        this.authorId = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link County }
     *     
     */
    public County getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link County }
     *     
     */
    public void setCounty(County value) {
        this.county = value;
    }

    /**
     * Gets the value of the cua property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCua() {
        return cua;
    }

    /**
     * Sets the value of the cua property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCua(String value) {
        this.cua = value;
    }

    /**
     * Gets the value of the cuaAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getCuaAuthor() {
        return cuaAuthor;
    }

    /**
     * Sets the value of the cuaAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuaAuthor(UUID value) {
        this.cuaAuthor = value;
    }

    /**
     * Gets the value of the extended property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtended() {
        return extended;
    }

    /**
     * Sets the value of the extended property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtended(String value) {
        this.extended = value;
    }

    /**
     * Gets the value of the flat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlat() {
        return flat;
    }

    /**
     * Sets the value of the flat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlat(String value) {
        this.flat = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPosition(Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the stair property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStair() {
        return stair;
    }

    /**
     * Sets the value of the stair property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStair(String value) {
        this.stair = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType(String value) {
        this.streetType = value;
    }

}
