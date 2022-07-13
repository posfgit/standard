
package ro.anre.posf.standard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Date tehnice Gaze Naturale
 * 
 * <p>Java class for TechnicalDataGas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalDataGas">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}TechnicalData">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://www.anre.ro/ANRESchema}ConsumptionCategory"/>
 *         &lt;element name="debit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maximumPressure" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minimumPressure" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minimumTechnicalPressure" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="networkType" type="{http://www.anre.ro/ANRESchema}NetworkType"/>
 *         &lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="reservedCapacity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalDataGas", propOrder = {
    "category",
    "debit",
    "maximumPressure",
    "minimumPressure",
    "minimumTechnicalPressure",
    "networkType",
    "pressure",
    "reservedCapacity"
})
@XmlRootElement(name = "TechnicalDataGas")
public class TechnicalDataGas
    extends TechnicalData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConsumptionCategory category;
    protected BigDecimal debit;
    protected BigDecimal maximumPressure;
    protected BigDecimal minimumPressure;
    protected BigDecimal minimumTechnicalPressure;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NetworkType networkType;
    protected BigDecimal pressure;
    protected BigDecimal reservedCapacity;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionCategory }
     *     
     */
    public ConsumptionCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionCategory }
     *     
     */
    public void setCategory(ConsumptionCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebit(BigDecimal value) {
        this.debit = value;
    }

    /**
     * Gets the value of the maximumPressure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumPressure() {
        return maximumPressure;
    }

    /**
     * Sets the value of the maximumPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumPressure(BigDecimal value) {
        this.maximumPressure = value;
    }

    /**
     * Gets the value of the minimumPressure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumPressure() {
        return minimumPressure;
    }

    /**
     * Sets the value of the minimumPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumPressure(BigDecimal value) {
        this.minimumPressure = value;
    }

    /**
     * Gets the value of the minimumTechnicalPressure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumTechnicalPressure() {
        return minimumTechnicalPressure;
    }

    /**
     * Sets the value of the minimumTechnicalPressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumTechnicalPressure(BigDecimal value) {
        this.minimumTechnicalPressure = value;
    }

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkType }
     *     
     */
    public NetworkType getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkType }
     *     
     */
    public void setNetworkType(NetworkType value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPressure(BigDecimal value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the reservedCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReservedCapacity() {
        return reservedCapacity;
    }

    /**
     * Sets the value of the reservedCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReservedCapacity(BigDecimal value) {
        this.reservedCapacity = value;
    }

}
