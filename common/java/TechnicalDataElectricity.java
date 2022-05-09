
package ro.anre.anreschema.standard;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Date tehnice Energie Electrica
 * 
 * <p>Java class for TechnicalDataElectricity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalDataElectricity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}TechnicalData">
 *       &lt;sequence>
 *         &lt;element name="approvedConsumptionPower" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="approvedProducedPower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="connectionType" type="{http://www.anre.ro/ANRESchema}ConnectionType"/>
 *         &lt;element name="networkType" type="{http://www.anre.ro/ANRESchema}NetworkType"/>
 *         &lt;element name="voltageLevel" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalDataElectricity", propOrder = {
    "approvedConsumptionPower",
    "approvedProducedPower",
    "connectionType",
    "networkType",
    "voltageLevel"
})
@XmlRootElement(name = "TechnicalDataElectricity")
public class TechnicalDataElectricity
    extends TechnicalData
{

    protected double approvedConsumptionPower;
    protected BigDecimal approvedProducedPower;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ConnectionType connectionType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NetworkType networkType;
    @XmlElement(required = true)
    protected BigDecimal voltageLevel;

    /**
     * Gets the value of the approvedConsumptionPower property.
     * 
     */
    public double getApprovedConsumptionPower() {
        return approvedConsumptionPower;
    }

    /**
     * Sets the value of the approvedConsumptionPower property.
     * 
     */
    public void setApprovedConsumptionPower(double value) {
        this.approvedConsumptionPower = value;
    }

    /**
     * Gets the value of the approvedProducedPower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovedProducedPower() {
        return approvedProducedPower;
    }

    /**
     * Sets the value of the approvedProducedPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovedProducedPower(BigDecimal value) {
        this.approvedProducedPower = value;
    }

    /**
     * Gets the value of the connectionType property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionType }
     *     
     */
    public ConnectionType getConnectionType() {
        return connectionType;
    }

    /**
     * Sets the value of the connectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionType }
     *     
     */
    public void setConnectionType(ConnectionType value) {
        this.connectionType = value;
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
     * Gets the value of the voltageLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoltageLevel() {
        return voltageLevel;
    }

    /**
     * Sets the value of the voltageLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoltageLevel(BigDecimal value) {
        this.voltageLevel = value;
    }

}
