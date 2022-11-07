
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.UUID;


/**
 * Furnizor
 * 
 * <p>Java class for Supplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supplier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Company">
 *       &lt;sequence>
 *         &lt;element name="fuiType" type="{http://www.anre.ro/ANRESchema}FUIType" minOccurs="0"/>
 *         &lt;element name="isFUI" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="license" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierId" type="{http://www.anre.ro/ANRESchema}Guid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supplier", propOrder = {
    "fuiType",
    "isFUI",
    "license",
    "supplierId"
})
@XmlRootElement(name = "Supplier")
public class Supplier
    extends Company
{

    @XmlSchemaType(name = "string")
    protected FUIType fuiType;
    protected boolean isFUI;
    protected String license;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected UUID supplierId;

    /**
     * Gets the value of the fuiType property.
     * 
     * @return
     *     possible object is
     *     {@link FUIType }
     *     
     */
    public FUIType getFuiType() {
        return fuiType;
    }

    /**
     * Sets the value of the fuiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FUIType }
     *     
     */
    public void setFuiType(FUIType value) {
        this.fuiType = value;
    }

    /**
     * Gets the value of the isFUI property.
     * 
     */
    public boolean isIsFUI() {
        return isFUI;
    }

    /**
     * Sets the value of the isFUI property.
     * 
     */
    public void setIsFUI(boolean value) {
        this.isFUI = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicense(String value) {
        this.license = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierId(UUID value) {
        this.supplierId = value;
    }

}
