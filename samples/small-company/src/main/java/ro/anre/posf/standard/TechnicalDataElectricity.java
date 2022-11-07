
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


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
 *         &lt;element name="approvedConsumptionPower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="approvedProducedPower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="connectionType" type="{http://www.anre.ro/ANRESchema}ConnectionType" minOccurs="0"/>
 *         &lt;element name="networkType" type="{http://www.anre.ro/ANRESchema}NetworkType" minOccurs="0"/>
 *         &lt;element name="voltageLevel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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

    protected BigDecimal approvedConsumptionPower;
    protected BigDecimal approvedProducedPower;
    @XmlSchemaType(name = "string")
    protected ConnectionType connectionType;
    @XmlSchemaType(name = "string")
    protected NetworkType networkType;
    protected BigDecimal voltageLevel;

    /**
     * Gets the value of the approvedConsumptionPower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprovedConsumptionPower() {
        return approvedConsumptionPower;
    }

    /**
     * Sets the value of the approvedConsumptionPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprovedConsumptionPower(BigDecimal value) {
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
