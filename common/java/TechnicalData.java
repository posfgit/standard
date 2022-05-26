
package ro.anre.anreschema.standard;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Date tehnice
 * 
 * <p>Java class for TechnicalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consumption" type="{http://www.anre.ro/ANRESchema}Consumption" minOccurs="0"/>
 *         &lt;element name="counterIndexReadDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="counterIndexValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="counterSeries" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="counterType" type="{http://www.anre.ro/ANRESchema}CounterType"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="documentType" type="{http://www.anre.ro/ANRESchema}TechnicalDataType"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smartMeter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="status" type="{http://www.anre.ro/ANRESchema}TechnicalDataStatus"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalData", propOrder = {
    "consumption",
    "counterIndexReadDate",
    "counterIndexValue",
    "counterSeries",
    "counterType",
    "date",
    "documentType",
    "number",
    "smartMeter",
    "status",
    "type"
})
@XmlSeeAlso({
    TechnicalDataGas.class,
    TechnicalDataElectricity.class
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type",  include = JsonTypeInfo.As.EXISTING_PROPERTY, visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(name = "TechnicalDataGas", value = TechnicalDataGas.class),
        @JsonSubTypes.Type(name = "TechnicalDataElectricity", value = TechnicalDataElectricity.class),
})
public class TechnicalData {

    protected Consumption consumption;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate counterIndexReadDate;
    protected String counterIndexValue;
    @XmlElement(required = true)
    protected String counterSeries;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CounterType counterType;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate date;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TechnicalDataType documentType;
    @XmlElement(required = true)
    protected String number;
    protected boolean smartMeter;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TechnicalDataStatus status;
    @XmlElement(required = true)
    protected String type;

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
     * Gets the value of the counterIndexReadDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCounterIndexReadDate() {
        return counterIndexReadDate;
    }

    /**
     * Sets the value of the counterIndexReadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterIndexReadDate(LocalDate value) {
        this.counterIndexReadDate = value;
    }

    /**
     * Gets the value of the counterIndexValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterIndexValue() {
        return counterIndexValue;
    }

    /**
     * Sets the value of the counterIndexValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterIndexValue(String value) {
        this.counterIndexValue = value;
    }

    /**
     * Gets the value of the counterSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterSeries() {
        return counterSeries;
    }

    /**
     * Sets the value of the counterSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterSeries(String value) {
        this.counterSeries = value;
    }

    /**
     * Gets the value of the counterType property.
     * 
     * @return
     *     possible object is
     *     {@link CounterType }
     *     
     */
    public CounterType getCounterType() {
        return counterType;
    }

    /**
     * Sets the value of the counterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterType }
     *     
     */
    public void setCounterType(CounterType value) {
        this.counterType = value;
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
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalDataType }
     *     
     */
    public TechnicalDataType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalDataType }
     *     
     */
    public void setDocumentType(TechnicalDataType value) {
        this.documentType = value;
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
     * Gets the value of the smartMeter property.
     * 
     */
    public boolean isSmartMeter() {
        return smartMeter;
    }

    /**
     * Sets the value of the smartMeter property.
     * 
     */
    public void setSmartMeter(boolean value) {
        this.smartMeter = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalDataStatus }
     *     
     */
    public TechnicalDataStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalDataStatus }
     *     
     */
    public void setStatus(TechnicalDataStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
