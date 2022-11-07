
package ro.anre.posf.standard;

import javax.xml.bind.annotation.*;


/**
 * Emis de POSF cand se creaza o conventie sau apar noi parti intr-o conventie
 * 
 * <p>Java class for ConventionGeneratedByPOSF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConventionGeneratedByPOSF">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.anre.ro/ANRESchema}Message">
 *       &lt;sequence>
 *         &lt;element name="convention" type="{http://www.anre.ro/ANRESchema}Convention"/>
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
@XmlType(name = "ConventionGeneratedByPOSF", propOrder = {
    "convention",
    "info"
})
@XmlRootElement(name = "ConventionGeneratedByPOSF")
public class ConventionGeneratedByPOSF
    extends Message
{

    @XmlElement(required = true)
    protected Convention convention;
    protected String info;

    /**
     * Gets the value of the convention property.
     * 
     * @return
     *     possible object is
     *     {@link Convention }
     *     
     */
    public Convention getConvention() {
        return convention;
    }

    /**
     * Sets the value of the convention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Convention }
     *     
     */
    public void setConvention(Convention value) {
        this.convention = value;
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
