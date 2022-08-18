
package ro.anre.anreschema.standard;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * s
 * 
 * <p>Java class for Offer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Offer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dutyExemption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceIntervalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceUndiferentiated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricePerDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pricePerNight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hourOfDayStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hourOfDayEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hourOfNightStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hourOfNightEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceEnergy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceFixedComponent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceTransport" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceSystemService" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDistributionService" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceTaxCogeneration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceExciseDuty" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="valueAddedTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceSubscription" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceOfGC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="discountStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceOther" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="validityStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="validityEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="monthlyConsumptionStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="monthlyConsumptionEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="counterIndexReadingInterval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="counterIndexTransmissionInterval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renuableSourcePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yearOfEnergyAcquisition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acquisitionOfCoal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="acquisitionOfGas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="acquisitionOfHidro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="acquisitionOfNuclear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="acquisitionOfWind" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="acquisitionOfSolar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="acquisitionOfOther" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="invoiceDeliveryMeans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceFrequencyCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guarantees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceMWh" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceKWh" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceMWhNG" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceMWhTransport" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceMWhDistribution" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceMWhFixed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.household.c1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.household.c2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.household.c3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.household.c4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.household.c5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.nonhousehold.c1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.nonhousehold.c2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.nonhousehold.c3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.nonhousehold.c4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceDS.nonhousehold.c5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceTS.household.c1_3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceTS.household.c4_5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceTS.nonhousehold.c1_3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceTS.nonhousehold.c4_5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceUSP.household.c1_3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceUSP.household.c4_5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceUSP.nonhousehold.c1_3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceUSP.nonhousehold.c4_5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Offer", propOrder = {
    "offerName",
    "offerCode",
    "clientType",
    "clientCategory",
    "dutyExemption",
    "offerType",
    "startDate",
    "endDate",
    "productType",
    "priceIntervalNote",
    "contractDuration",
    "offerUrl",
    "priceType",
    "priceUndiferentiated",
    "pricePerDay",
    "pricePerNight",
    "hourOfDayStart",
    "hourOfDayEnd",
    "hourOfNightStart",
    "hourOfNightEnd",
    "unitOfMeasure",
    "priceEnergy",
    "priceFixedComponent",
    "priceTransport",
    "priceSystemService",
    "priceDistributionService",
    "priceTaxCogeneration",
    "priceExciseDuty",
    "valueAddedTax",
    "priceSubscription",
    "priceOfGC",
    "priceDiscount",
    "discountStart",
    "discountEnd",
    "priceOther",
    "validityStart",
    "validityEnd",
    "monthlyConsumptionStart",
    "monthlyConsumptionEnd",
    "counterIndexReadingInterval",
    "counterIndexTransmissionInterval",
    "renuableSourcePercentage",
    "yearOfEnergyAcquisition",
    "acquisitionOfCoal",
    "acquisitionOfGas",
    "acquisitionOfHidro",
    "acquisitionOfNuclear",
    "acquisitionOfWind",
    "acquisitionOfSolar",
    "acquisitionOfOther",
    "invoiceDeliveryMeans",
    "invoiceFrequency",
    "invoiceFrequencyCompany",
    "paymentTerm",
    "additionalServices",
    "otherConditions",
    "guarantees",
    "priceMWh",
    "priceKWh",
    "priceMWhNG",
    "priceMWhTransport",
    "priceMWhDistribution",
    "priceMWhFixed",
    "priceDSHouseholdC1",
    "priceDSHouseholdC2",
    "priceDSHouseholdC3",
    "priceDSHouseholdC4",
    "priceDSHouseholdC5",
    "priceDSNonhouseholdC1",
    "priceDSNonhouseholdC2",
    "priceDSNonhouseholdC3",
    "priceDSNonhouseholdC4",
    "priceDSNonhouseholdC5",
    "priceTSHouseholdC13",
    "priceTSHouseholdC45",
    "priceTSNonhouseholdC13",
    "priceTSNonhouseholdC45",
    "priceUSPHouseholdC13",
    "priceUSPHouseholdC45",
    "priceUSPNonhouseholdC13",
    "priceUSPNonhouseholdC45"
})
@XmlRootElement(name = "Offer")
public class Offer {

    protected String offerName;
    protected String offerCode;
    protected String clientType;
    protected String clientCategory;
    protected String dutyExemption;
    protected String offerType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate startDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate endDate;
    protected String productType;
    protected String priceIntervalNote;
    protected String contractDuration;
    protected String offerUrl;
    protected String priceType;
    protected String priceUndiferentiated;
    protected BigDecimal pricePerDay;
    protected BigDecimal pricePerNight;
    protected String hourOfDayStart;
    protected String hourOfDayEnd;
    protected String hourOfNightStart;
    protected String hourOfNightEnd;
    protected String unitOfMeasure;
    protected BigDecimal priceEnergy;
    protected BigDecimal priceFixedComponent;
    protected BigDecimal priceTransport;
    protected BigDecimal priceSystemService;
    protected BigDecimal priceDistributionService;
    protected BigDecimal priceTaxCogeneration;
    protected BigDecimal priceExciseDuty;
    protected BigDecimal valueAddedTax;
    protected BigDecimal priceSubscription;
    protected BigDecimal priceOfGC;
    protected BigDecimal priceDiscount;
    protected String discountStart;
    protected String discountEnd;
    protected BigDecimal priceOther;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate validityStart;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate validityEnd;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate monthlyConsumptionStart;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate monthlyConsumptionEnd;
    protected String counterIndexReadingInterval;
    protected String counterIndexTransmissionInterval;
    protected String renuableSourcePercentage;
    protected String yearOfEnergyAcquisition;
    protected BigDecimal acquisitionOfCoal;
    protected BigDecimal acquisitionOfGas;
    protected BigDecimal acquisitionOfHidro;
    protected BigDecimal acquisitionOfNuclear;
    protected BigDecimal acquisitionOfWind;
    protected BigDecimal acquisitionOfSolar;
    protected BigDecimal acquisitionOfOther;
    protected String invoiceDeliveryMeans;
    protected String invoiceFrequency;
    protected String invoiceFrequencyCompany;
    protected String paymentTerm;
    protected String additionalServices;
    protected String otherConditions;
    protected String guarantees;
    protected BigDecimal priceMWh;
    protected BigDecimal priceKWh;
    protected BigDecimal priceMWhNG;
    protected BigDecimal priceMWhTransport;
    protected BigDecimal priceMWhDistribution;
    protected BigDecimal priceMWhFixed;
    @XmlElement(name = "priceDS.household.c1")
    protected BigDecimal priceDSHouseholdC1;
    @XmlElement(name = "priceDS.household.c2")
    protected BigDecimal priceDSHouseholdC2;
    @XmlElement(name = "priceDS.household.c3")
    protected BigDecimal priceDSHouseholdC3;
    @XmlElement(name = "priceDS.household.c4")
    protected BigDecimal priceDSHouseholdC4;
    @XmlElement(name = "priceDS.household.c5")
    protected BigDecimal priceDSHouseholdC5;
    @XmlElement(name = "priceDS.nonhousehold.c1")
    protected BigDecimal priceDSNonhouseholdC1;
    @XmlElement(name = "priceDS.nonhousehold.c2")
    protected BigDecimal priceDSNonhouseholdC2;
    @XmlElement(name = "priceDS.nonhousehold.c3")
    protected BigDecimal priceDSNonhouseholdC3;
    @XmlElement(name = "priceDS.nonhousehold.c4")
    protected BigDecimal priceDSNonhouseholdC4;
    @XmlElement(name = "priceDS.nonhousehold.c5")
    protected BigDecimal priceDSNonhouseholdC5;
    @XmlElement(name = "priceTS.household.c1_3")
    protected BigDecimal priceTSHouseholdC13;
    @XmlElement(name = "priceTS.household.c4_5")
    protected BigDecimal priceTSHouseholdC45;
    @XmlElement(name = "priceTS.nonhousehold.c1_3")
    protected BigDecimal priceTSNonhouseholdC13;
    @XmlElement(name = "priceTS.nonhousehold.c4_5")
    protected BigDecimal priceTSNonhouseholdC45;
    @XmlElement(name = "priceUSP.household.c1_3")
    protected BigDecimal priceUSPHouseholdC13;
    @XmlElement(name = "priceUSP.household.c4_5")
    protected BigDecimal priceUSPHouseholdC45;
    @XmlElement(name = "priceUSP.nonhousehold.c1_3")
    protected BigDecimal priceUSPNonhouseholdC13;
    @XmlElement(name = "priceUSP.nonhousehold.c4_5")
    protected BigDecimal priceUSPNonhouseholdC45;

    /**
     * Gets the value of the offerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferName() {
        return offerName;
    }

    /**
     * Sets the value of the offerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferName(String value) {
        this.offerName = value;
    }

    /**
     * Gets the value of the offerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferCode(String value) {
        this.offerCode = value;
    }

    /**
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientType(String value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the clientCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientCategory() {
        return clientCategory;
    }

    /**
     * Sets the value of the clientCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientCategory(String value) {
        this.clientCategory = value;
    }

    /**
     * Gets the value of the dutyExemption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyExemption() {
        return dutyExemption;
    }

    /**
     * Sets the value of the dutyExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyExemption(String value) {
        this.dutyExemption = value;
    }

    /**
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferType(String value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(LocalDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(LocalDate value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the priceIntervalNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceIntervalNote() {
        return priceIntervalNote;
    }

    /**
     * Sets the value of the priceIntervalNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceIntervalNote(String value) {
        this.priceIntervalNote = value;
    }

    /**
     * Gets the value of the contractDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractDuration() {
        return contractDuration;
    }

    /**
     * Sets the value of the contractDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractDuration(String value) {
        this.contractDuration = value;
    }

    /**
     * Gets the value of the offerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferUrl() {
        return offerUrl;
    }

    /**
     * Sets the value of the offerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferUrl(String value) {
        this.offerUrl = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the priceUndiferentiated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceUndiferentiated() {
        return priceUndiferentiated;
    }

    /**
     * Sets the value of the priceUndiferentiated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceUndiferentiated(String value) {
        this.priceUndiferentiated = value;
    }

    /**
     * Gets the value of the pricePerDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    /**
     * Sets the value of the pricePerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerDay(BigDecimal value) {
        this.pricePerDay = value;
    }

    /**
     * Gets the value of the pricePerNight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    /**
     * Sets the value of the pricePerNight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerNight(BigDecimal value) {
        this.pricePerNight = value;
    }

    /**
     * Gets the value of the hourOfDayStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHourOfDayStart() {
        return hourOfDayStart;
    }

    /**
     * Sets the value of the hourOfDayStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHourOfDayStart(String value) {
        this.hourOfDayStart = value;
    }

    /**
     * Gets the value of the hourOfDayEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHourOfDayEnd() {
        return hourOfDayEnd;
    }

    /**
     * Sets the value of the hourOfDayEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHourOfDayEnd(String value) {
        this.hourOfDayEnd = value;
    }

    /**
     * Gets the value of the hourOfNightStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHourOfNightStart() {
        return hourOfNightStart;
    }

    /**
     * Sets the value of the hourOfNightStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHourOfNightStart(String value) {
        this.hourOfNightStart = value;
    }

    /**
     * Gets the value of the hourOfNightEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHourOfNightEnd() {
        return hourOfNightEnd;
    }

    /**
     * Sets the value of the hourOfNightEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHourOfNightEnd(String value) {
        this.hourOfNightEnd = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the priceEnergy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceEnergy() {
        return priceEnergy;
    }

    /**
     * Sets the value of the priceEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceEnergy(BigDecimal value) {
        this.priceEnergy = value;
    }

    /**
     * Gets the value of the priceFixedComponent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceFixedComponent() {
        return priceFixedComponent;
    }

    /**
     * Sets the value of the priceFixedComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceFixedComponent(BigDecimal value) {
        this.priceFixedComponent = value;
    }

    /**
     * Gets the value of the priceTransport property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTransport() {
        return priceTransport;
    }

    /**
     * Sets the value of the priceTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTransport(BigDecimal value) {
        this.priceTransport = value;
    }

    /**
     * Gets the value of the priceSystemService property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceSystemService() {
        return priceSystemService;
    }

    /**
     * Sets the value of the priceSystemService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceSystemService(BigDecimal value) {
        this.priceSystemService = value;
    }

    /**
     * Gets the value of the priceDistributionService property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDistributionService() {
        return priceDistributionService;
    }

    /**
     * Sets the value of the priceDistributionService property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDistributionService(BigDecimal value) {
        this.priceDistributionService = value;
    }

    /**
     * Gets the value of the priceTaxCogeneration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTaxCogeneration() {
        return priceTaxCogeneration;
    }

    /**
     * Sets the value of the priceTaxCogeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTaxCogeneration(BigDecimal value) {
        this.priceTaxCogeneration = value;
    }

    /**
     * Gets the value of the priceExciseDuty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceExciseDuty() {
        return priceExciseDuty;
    }

    /**
     * Sets the value of the priceExciseDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceExciseDuty(BigDecimal value) {
        this.priceExciseDuty = value;
    }

    /**
     * Gets the value of the valueAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValueAddedTax() {
        return valueAddedTax;
    }

    /**
     * Sets the value of the valueAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValueAddedTax(BigDecimal value) {
        this.valueAddedTax = value;
    }

    /**
     * Gets the value of the priceSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceSubscription() {
        return priceSubscription;
    }

    /**
     * Sets the value of the priceSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceSubscription(BigDecimal value) {
        this.priceSubscription = value;
    }

    /**
     * Gets the value of the priceOfGC property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceOfGC() {
        return priceOfGC;
    }

    /**
     * Sets the value of the priceOfGC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceOfGC(BigDecimal value) {
        this.priceOfGC = value;
    }

    /**
     * Gets the value of the priceDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDiscount() {
        return priceDiscount;
    }

    /**
     * Sets the value of the priceDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDiscount(BigDecimal value) {
        this.priceDiscount = value;
    }

    /**
     * Gets the value of the discountStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountStart() {
        return discountStart;
    }

    /**
     * Sets the value of the discountStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountStart(String value) {
        this.discountStart = value;
    }

    /**
     * Gets the value of the discountEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountEnd() {
        return discountEnd;
    }

    /**
     * Sets the value of the discountEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountEnd(String value) {
        this.discountEnd = value;
    }

    /**
     * Gets the value of the priceOther property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceOther() {
        return priceOther;
    }

    /**
     * Sets the value of the priceOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceOther(BigDecimal value) {
        this.priceOther = value;
    }

    /**
     * Gets the value of the validityStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValidityStart() {
        return validityStart;
    }

    /**
     * Sets the value of the validityStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityStart(LocalDate value) {
        this.validityStart = value;
    }

    /**
     * Gets the value of the validityEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValidityEnd() {
        return validityEnd;
    }

    /**
     * Sets the value of the validityEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityEnd(LocalDate value) {
        this.validityEnd = value;
    }

    /**
     * Gets the value of the monthlyConsumptionStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMonthlyConsumptionStart() {
        return monthlyConsumptionStart;
    }

    /**
     * Sets the value of the monthlyConsumptionStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyConsumptionStart(LocalDate value) {
        this.monthlyConsumptionStart = value;
    }

    /**
     * Gets the value of the monthlyConsumptionEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMonthlyConsumptionEnd() {
        return monthlyConsumptionEnd;
    }

    /**
     * Sets the value of the monthlyConsumptionEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonthlyConsumptionEnd(LocalDate value) {
        this.monthlyConsumptionEnd = value;
    }

    /**
     * Gets the value of the counterIndexReadingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterIndexReadingInterval() {
        return counterIndexReadingInterval;
    }

    /**
     * Sets the value of the counterIndexReadingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterIndexReadingInterval(String value) {
        this.counterIndexReadingInterval = value;
    }

    /**
     * Gets the value of the counterIndexTransmissionInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterIndexTransmissionInterval() {
        return counterIndexTransmissionInterval;
    }

    /**
     * Sets the value of the counterIndexTransmissionInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterIndexTransmissionInterval(String value) {
        this.counterIndexTransmissionInterval = value;
    }

    /**
     * Gets the value of the renuableSourcePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenuableSourcePercentage() {
        return renuableSourcePercentage;
    }

    /**
     * Sets the value of the renuableSourcePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenuableSourcePercentage(String value) {
        this.renuableSourcePercentage = value;
    }

    /**
     * Gets the value of the yearOfEnergyAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearOfEnergyAcquisition() {
        return yearOfEnergyAcquisition;
    }

    /**
     * Sets the value of the yearOfEnergyAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearOfEnergyAcquisition(String value) {
        this.yearOfEnergyAcquisition = value;
    }

    /**
     * Gets the value of the acquisitionOfCoal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquisitionOfCoal() {
        return acquisitionOfCoal;
    }

    /**
     * Sets the value of the acquisitionOfCoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquisitionOfCoal(BigDecimal value) {
        this.acquisitionOfCoal = value;
    }

    /**
     * Gets the value of the acquisitionOfGas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquisitionOfGas() {
        return acquisitionOfGas;
    }

    /**
     * Sets the value of the acquisitionOfGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquisitionOfGas(BigDecimal value) {
        this.acquisitionOfGas = value;
    }

    /**
     * Gets the value of the acquisitionOfHidro property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquisitionOfHidro() {
        return acquisitionOfHidro;
    }

    /**
     * Sets the value of the acquisitionOfHidro property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquisitionOfHidro(BigDecimal value) {
        this.acquisitionOfHidro = value;
    }

    /**
     * Gets the value of the acquisitionOfNuclear property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquisitionOfNuclear() {
        return acquisitionOfNuclear;
    }

    /**
     * Sets the value of the acquisitionOfNuclear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquisitionOfNuclear(BigDecimal value) {
        this.acquisitionOfNuclear = value;
    }

    /**
     * Gets the value of the acquisitionOfWind property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquisitionOfWind() {
        return acquisitionOfWind;
    }

    /**
     * Sets the value of the acquisitionOfWind property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquisitionOfWind(BigDecimal value) {
        this.acquisitionOfWind = value;
    }

    /**
     * Gets the value of the acquisitionOfSolar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquisitionOfSolar() {
        return acquisitionOfSolar;
    }

    /**
     * Sets the value of the acquisitionOfSolar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquisitionOfSolar(BigDecimal value) {
        this.acquisitionOfSolar = value;
    }

    /**
     * Gets the value of the acquisitionOfOther property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcquisitionOfOther() {
        return acquisitionOfOther;
    }

    /**
     * Sets the value of the acquisitionOfOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcquisitionOfOther(BigDecimal value) {
        this.acquisitionOfOther = value;
    }

    /**
     * Gets the value of the invoiceDeliveryMeans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDeliveryMeans() {
        return invoiceDeliveryMeans;
    }

    /**
     * Sets the value of the invoiceDeliveryMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDeliveryMeans(String value) {
        this.invoiceDeliveryMeans = value;
    }

    /**
     * Gets the value of the invoiceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceFrequency() {
        return invoiceFrequency;
    }

    /**
     * Sets the value of the invoiceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceFrequency(String value) {
        this.invoiceFrequency = value;
    }

    /**
     * Gets the value of the invoiceFrequencyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceFrequencyCompany() {
        return invoiceFrequencyCompany;
    }

    /**
     * Sets the value of the invoiceFrequencyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceFrequencyCompany(String value) {
        this.invoiceFrequencyCompany = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerm(String value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the additionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalServices() {
        return additionalServices;
    }

    /**
     * Sets the value of the additionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalServices(String value) {
        this.additionalServices = value;
    }

    /**
     * Gets the value of the otherConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherConditions() {
        return otherConditions;
    }

    /**
     * Sets the value of the otherConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherConditions(String value) {
        this.otherConditions = value;
    }

    /**
     * Gets the value of the guarantees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantees() {
        return guarantees;
    }

    /**
     * Sets the value of the guarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantees(String value) {
        this.guarantees = value;
    }

    /**
     * Gets the value of the priceMWh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMWh() {
        return priceMWh;
    }

    /**
     * Sets the value of the priceMWh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMWh(BigDecimal value) {
        this.priceMWh = value;
    }

    /**
     * Gets the value of the priceKWh property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceKWh() {
        return priceKWh;
    }

    /**
     * Sets the value of the priceKWh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceKWh(BigDecimal value) {
        this.priceKWh = value;
    }

    /**
     * Gets the value of the priceMWhNG property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMWhNG() {
        return priceMWhNG;
    }

    /**
     * Sets the value of the priceMWhNG property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMWhNG(BigDecimal value) {
        this.priceMWhNG = value;
    }

    /**
     * Gets the value of the priceMWhTransport property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMWhTransport() {
        return priceMWhTransport;
    }

    /**
     * Sets the value of the priceMWhTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMWhTransport(BigDecimal value) {
        this.priceMWhTransport = value;
    }

    /**
     * Gets the value of the priceMWhDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMWhDistribution() {
        return priceMWhDistribution;
    }

    /**
     * Sets the value of the priceMWhDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMWhDistribution(BigDecimal value) {
        this.priceMWhDistribution = value;
    }

    /**
     * Gets the value of the priceMWhFixed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceMWhFixed() {
        return priceMWhFixed;
    }

    /**
     * Sets the value of the priceMWhFixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceMWhFixed(BigDecimal value) {
        this.priceMWhFixed = value;
    }

    /**
     * Gets the value of the priceDSHouseholdC1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSHouseholdC1() {
        return priceDSHouseholdC1;
    }

    /**
     * Sets the value of the priceDSHouseholdC1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSHouseholdC1(BigDecimal value) {
        this.priceDSHouseholdC1 = value;
    }

    /**
     * Gets the value of the priceDSHouseholdC2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSHouseholdC2() {
        return priceDSHouseholdC2;
    }

    /**
     * Sets the value of the priceDSHouseholdC2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSHouseholdC2(BigDecimal value) {
        this.priceDSHouseholdC2 = value;
    }

    /**
     * Gets the value of the priceDSHouseholdC3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSHouseholdC3() {
        return priceDSHouseholdC3;
    }

    /**
     * Sets the value of the priceDSHouseholdC3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSHouseholdC3(BigDecimal value) {
        this.priceDSHouseholdC3 = value;
    }

    /**
     * Gets the value of the priceDSHouseholdC4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSHouseholdC4() {
        return priceDSHouseholdC4;
    }

    /**
     * Sets the value of the priceDSHouseholdC4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSHouseholdC4(BigDecimal value) {
        this.priceDSHouseholdC4 = value;
    }

    /**
     * Gets the value of the priceDSHouseholdC5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSHouseholdC5() {
        return priceDSHouseholdC5;
    }

    /**
     * Sets the value of the priceDSHouseholdC5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSHouseholdC5(BigDecimal value) {
        this.priceDSHouseholdC5 = value;
    }

    /**
     * Gets the value of the priceDSNonhouseholdC1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSNonhouseholdC1() {
        return priceDSNonhouseholdC1;
    }

    /**
     * Sets the value of the priceDSNonhouseholdC1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSNonhouseholdC1(BigDecimal value) {
        this.priceDSNonhouseholdC1 = value;
    }

    /**
     * Gets the value of the priceDSNonhouseholdC2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSNonhouseholdC2() {
        return priceDSNonhouseholdC2;
    }

    /**
     * Sets the value of the priceDSNonhouseholdC2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSNonhouseholdC2(BigDecimal value) {
        this.priceDSNonhouseholdC2 = value;
    }

    /**
     * Gets the value of the priceDSNonhouseholdC3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSNonhouseholdC3() {
        return priceDSNonhouseholdC3;
    }

    /**
     * Sets the value of the priceDSNonhouseholdC3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSNonhouseholdC3(BigDecimal value) {
        this.priceDSNonhouseholdC3 = value;
    }

    /**
     * Gets the value of the priceDSNonhouseholdC4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSNonhouseholdC4() {
        return priceDSNonhouseholdC4;
    }

    /**
     * Sets the value of the priceDSNonhouseholdC4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSNonhouseholdC4(BigDecimal value) {
        this.priceDSNonhouseholdC4 = value;
    }

    /**
     * Gets the value of the priceDSNonhouseholdC5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDSNonhouseholdC5() {
        return priceDSNonhouseholdC5;
    }

    /**
     * Sets the value of the priceDSNonhouseholdC5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDSNonhouseholdC5(BigDecimal value) {
        this.priceDSNonhouseholdC5 = value;
    }

    /**
     * Gets the value of the priceTSHouseholdC13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTSHouseholdC13() {
        return priceTSHouseholdC13;
    }

    /**
     * Sets the value of the priceTSHouseholdC13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTSHouseholdC13(BigDecimal value) {
        this.priceTSHouseholdC13 = value;
    }

    /**
     * Gets the value of the priceTSHouseholdC45 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTSHouseholdC45() {
        return priceTSHouseholdC45;
    }

    /**
     * Sets the value of the priceTSHouseholdC45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTSHouseholdC45(BigDecimal value) {
        this.priceTSHouseholdC45 = value;
    }

    /**
     * Gets the value of the priceTSNonhouseholdC13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTSNonhouseholdC13() {
        return priceTSNonhouseholdC13;
    }

    /**
     * Sets the value of the priceTSNonhouseholdC13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTSNonhouseholdC13(BigDecimal value) {
        this.priceTSNonhouseholdC13 = value;
    }

    /**
     * Gets the value of the priceTSNonhouseholdC45 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceTSNonhouseholdC45() {
        return priceTSNonhouseholdC45;
    }

    /**
     * Sets the value of the priceTSNonhouseholdC45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceTSNonhouseholdC45(BigDecimal value) {
        this.priceTSNonhouseholdC45 = value;
    }

    /**
     * Gets the value of the priceUSPHouseholdC13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceUSPHouseholdC13() {
        return priceUSPHouseholdC13;
    }

    /**
     * Sets the value of the priceUSPHouseholdC13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceUSPHouseholdC13(BigDecimal value) {
        this.priceUSPHouseholdC13 = value;
    }

    /**
     * Gets the value of the priceUSPHouseholdC45 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceUSPHouseholdC45() {
        return priceUSPHouseholdC45;
    }

    /**
     * Sets the value of the priceUSPHouseholdC45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceUSPHouseholdC45(BigDecimal value) {
        this.priceUSPHouseholdC45 = value;
    }

    /**
     * Gets the value of the priceUSPNonhouseholdC13 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceUSPNonhouseholdC13() {
        return priceUSPNonhouseholdC13;
    }

    /**
     * Sets the value of the priceUSPNonhouseholdC13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceUSPNonhouseholdC13(BigDecimal value) {
        this.priceUSPNonhouseholdC13 = value;
    }

    /**
     * Gets the value of the priceUSPNonhouseholdC45 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceUSPNonhouseholdC45() {
        return priceUSPNonhouseholdC45;
    }

    /**
     * Sets the value of the priceUSPNonhouseholdC45 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceUSPNonhouseholdC45(BigDecimal value) {
        this.priceUSPNonhouseholdC45 = value;
    }

}
