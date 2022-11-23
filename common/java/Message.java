
package ro.anre.posf.standard;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import java.util.UUID;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorID" type="{http://www.anre.ro/ANRESchema}Guid"/>
 *         &lt;element name="authorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="correlationID" type="{http://www.anre.ro/ANRESchema}Guid"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageID" type="{http://www.anre.ro/ANRESchema}Guid"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "Message", propOrder = {
    "authorID",
    "authorName",
    "correlationID",
    "description",
    "messageID",
    "timestamp",
    "type"
})
@XmlSeeAlso({
    ContractSuspendedByAnre.class,
    NotificationDeadlineReached.class,
    ContractCancelledByClient.class,
    ClientInfoUpdated.class,
    OperatorChangedInfo.class,
    Response.class,
    ContractTransferredToFUIByAnre.class,
    ContractNetworkCancelledByOperator.class,
    ContractNetworkSignedByOperator.class,
    ContractCancelledBySupplier.class,
    ConventionSignedByOperator.class,
    NotificationDeadlineDue.class,
    ConventionChangedInfo.class,
    PlaceDisconnectedByOperator.class,
    ContractNetworkChangedInfo.class,
    PlaceCreatedByOperator.class,
    ContractSignedBySupplier.class,
    ContractSignedByClient.class,
    ConventionSignedBySupplier.class,
    NotificationPublishedByOperator.class,
    AddressChangedInfo.class,
    PlaceUpdatedByOperator.class,
    ContractChangedInfo.class,
    ConventionGeneratedByPOSF.class,
    ContractNetworkSignedBySupplier.class,
    NotificationPublishedBySupplier.class,
    SupplierChangedInfo.class,
    ContractTransferredToFUIByOperator.class,
    ContractNetworkSignedByClient.class,
    ContractActivatedByANRE.class,
    ContractMoreInfo.class,
    ConventionSignedByClient.class
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type",  include = JsonTypeInfo.As.EXISTING_PROPERTY, visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type (name = "ConventionGeneratedByPOSF", value = ConventionGeneratedByPOSF.class),
        @JsonSubTypes.Type (name = "ClientInfoUpdated", value = ClientInfoUpdated.class),
        @JsonSubTypes.Type (name = "ContractActivatedByANRE", value = ContractActivatedByANRE.class),
        @JsonSubTypes.Type (name = "ContractCancelledByClient", value = ContractCancelledByClient.class),
        @JsonSubTypes.Type (name = "ContractCancelledBySupplier", value = ContractCancelledBySupplier.class),
        @JsonSubTypes.Type (name = "ContractChangedInfo", value = ContractChangedInfo.class),
        @JsonSubTypes.Type (name = "ContractMoreInfo", value = ContractMoreInfo.class),
        @JsonSubTypes.Type (name = "ContractNetworkCancelledByOperator", value = ContractNetworkCancelledByOperator.class),
        @JsonSubTypes.Type (name = "ContractNetworkSignedByClient", value = ContractNetworkSignedByClient.class),
        @JsonSubTypes.Type (name = "ContractNetworkSignedByOperator", value = ContractNetworkSignedByOperator.class),
        @JsonSubTypes.Type (name = "ContractNetworkSignedBySupplier", value = ContractNetworkSignedBySupplier.class),
        @JsonSubTypes.Type (name = "ContractSignedByClient", value = ContractSignedByClient.class),
        @JsonSubTypes.Type (name = "ContractSignedBySupplier", value = ContractSignedBySupplier.class),
        @JsonSubTypes.Type (name = "ContractSuspendedByAnre", value = ContractSuspendedByAnre.class),
        @JsonSubTypes.Type (name = "ContractTransferredToFUIByAnre", value = ContractTransferredToFUIByAnre.class),
        @JsonSubTypes.Type (name = "ContractTransferredToFUIByOperator", value = ContractTransferredToFUIByOperator.class),
        @JsonSubTypes.Type (name = "ConventionSignedByClient", value = ConventionSignedByClient.class),
        @JsonSubTypes.Type (name = "ConventionSignedByOperator", value = ConventionSignedByOperator.class),
        @JsonSubTypes.Type (name = "ConventionSignedBySupplier", value = ConventionSignedBySupplier.class),
        @JsonSubTypes.Type (name = "PlaceCreatedByOperator", value = PlaceCreatedByOperator.class),
        @JsonSubTypes.Type (name = "PlaceDisconnectedByOperator", value = PlaceDisconnectedByOperator.class),
        @JsonSubTypes.Type (name = "PlaceUpdatedByOperator", value = PlaceUpdatedByOperator.class),
        @JsonSubTypes.Type (name = "ConventionChangedInfo", value = ConventionChangedInfo.class),
        @JsonSubTypes.Type (name = "ContractNetworkChangedInfo", value = ContractNetworkChangedInfo.class),
        @JsonSubTypes.Type (name = "OperatorChangedInfo", value = OperatorChangedInfo.class),
        @JsonSubTypes.Type (name = "SupplierChangedInfo", value = SupplierChangedInfo.class),
        @JsonSubTypes.Type (name = "AddressChangedInfo", value = AddressChangedInfo.class),
        @JsonSubTypes.Type (name = "NotificationPublishedBySupplier", value = NotificationPublishedBySupplier.class),
        @JsonSubTypes.Type (name = "NotificationDeadlineDue", value = NotificationDeadlineDue.class),
        @JsonSubTypes.Type (name = "NotificationDeadlineReached", value = NotificationDeadlineReached.class),
        @JsonSubTypes.Type (name = "NotificationPublishedByOperator", value = NotificationPublishedByOperator.class),
})
@XmlRootElement()
public class Message {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected UUID authorID;
    @XmlElement(required = true)
    protected String authorName;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected UUID correlationID;
    protected String description;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected UUID messageID;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timestamp;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the authorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getAuthorID() {
        return authorID;
    }

    /**
     * Sets the value of the authorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorID(UUID value) {
        this.authorID = value;
    }

    /**
     * Gets the value of the authorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Sets the value of the authorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorName(String value) {
        this.authorName = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(UUID value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public UUID getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(UUID value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(ZonedDateTime value) {
        this.timestamp = value;
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
