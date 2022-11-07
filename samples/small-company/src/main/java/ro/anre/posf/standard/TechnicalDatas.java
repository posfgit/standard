
package ro.anre.posf.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Elemente de tip technical data pentru contoare suplimentare. Se completeaza doar daca exista 2 sau mai multe contoare la locul de consum. Va contine obligatoriu si elementul technicaldata care se regaseste in continutul mesajului, chiar daca este duplicat. Totalul elementelor din extraData va fi numarul de contoare instalate. 
 * 
 * <p>Java class for TechnicalDatas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechnicalDatas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="technicalDataElectricity" type="{http://www.anre.ro/ANRESchema}TechnicalDataElectricity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="technicalDataGas" type="{http://www.anre.ro/ANRESchema}TechnicalDataGas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechnicalDatas", propOrder = {
    "technicalDataElectricities",
    "technicalDataGas"
})
public class TechnicalDatas {

    @XmlElement(name = "technicalDataElectricity")
    protected List<TechnicalDataElectricity> technicalDataElectricities;
    protected List<TechnicalDataGas> technicalDataGas;

    /**
     * Gets the value of the technicalDataElectricities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalDataElectricities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalDataElectricities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalDataElectricity }
     * 
     * 
     */
    public List<TechnicalDataElectricity> getTechnicalDataElectricities() {
        if (technicalDataElectricities == null) {
            technicalDataElectricities = new ArrayList<TechnicalDataElectricity>();
        }
        return this.technicalDataElectricities;
    }

    /**
     * Gets the value of the technicalDataGas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalDataGas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalDataGas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalDataGas }
     * 
     * 
     */
    public List<TechnicalDataGas> getTechnicalDataGas() {
        if (technicalDataGas == null) {
            technicalDataGas = new ArrayList<TechnicalDataGas>();
        }
        return this.technicalDataGas;
    }

}
