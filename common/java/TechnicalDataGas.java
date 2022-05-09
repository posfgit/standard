
package ro.anre.anreschema.standard;

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
 *         &lt;element name="debit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="networkType" type="{http://www.anre.ro/ANRESchema}NetworkType"/>
 *         &lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "networkType",
    "pressure"
})
@XmlRootElement(name = "TechnicalDataGas")
public class TechnicalDataGas
    extends TechnicalData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConsumptionCategory category;
    @XmlElement(required = true)
    protected BigDecimal debit;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NetworkType networkType;
    @XmlElement(required = true)
    protected BigDecimal pressure;

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

}
