
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;


/**
 * Se emite cand un operator inregistreaza cu succes in baza de date a unui nou loc de consum (POD/CLC)
 * 
 * <p>Java class for PlaceCreatedByOperator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceCreatedByOperator">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="place" type="{http://www.anre.ro/ANRESchema}Place"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceCreatedByOperator", propOrder = {
    "place",
    "info"
})
@XmlRootElement(name = "PlaceCreatedByOperator")
public class PlaceCreatedByOperator
    extends Message
{

    @XmlElement(required = true)
    protected Place place;
    protected String info;

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
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

}
