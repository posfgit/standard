
package ro.anre.anreschema.standard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ro.anre.anreschema.standard package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TechnicalData_QNAME = new QName("http://www.anre.ro/ANRESchema", "TechnicalData");
    private final static QName _Message_QNAME = new QName("http://www.anre.ro/ANRESchema", "Message");
    private final static QName _Company_QNAME = new QName("http://www.anre.ro/ANRESchema", "Company");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ro.anre.anreschema.standard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link Operator }
     * 
     */
    public Operator createOperator() {
        return new Operator();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ContactAddress }
     * 
     */
    public ContactAddress createContactAddress() {
        return new ContactAddress();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ConventionSignedByClient }
     * 
     */
    public ConventionSignedByClient createConventionSignedByClient() {
        return new ConventionSignedByClient();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link Convention }
     * 
     */
    public Convention createConvention() {
        return new Convention();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link ContractMoreInfo }
     * 
     */
    public ContractMoreInfo createContractMoreInfo() {
        return new ContractMoreInfo();
    }

    /**
     * Create an instance of {@link ContractActivatedByANRE }
     * 
     */
    public ContractActivatedByANRE createContractActivatedByANRE() {
        return new ContractActivatedByANRE();
    }

    /**
     * Create an instance of {@link PlaceCreatedByOperator }
     * 
     */
    public PlaceCreatedByOperator createPlaceCreatedByOperator() {
        return new PlaceCreatedByOperator();
    }

    /**
     * Create an instance of {@link ContractNetworkSignedByClient }
     * 
     */
    public ContractNetworkSignedByClient createContractNetworkSignedByClient() {
        return new ContractNetworkSignedByClient();
    }

    /**
     * Create an instance of {@link Marketing }
     * 
     */
    public Marketing createMarketing() {
        return new Marketing();
    }

    /**
     * Create an instance of {@link ConsumptionItem }
     * 
     */
    public ConsumptionItem createConsumptionItem() {
        return new ConsumptionItem();
    }

    /**
     * Create an instance of {@link ContractNetworkChangedInfo }
     * 
     */
    public ContractNetworkChangedInfo createContractNetworkChangedInfo() {
        return new ContractNetworkChangedInfo();
    }

    /**
     * Create an instance of {@link ContractTransferredToFUIByOperator }
     * 
     */
    public ContractTransferredToFUIByOperator createContractTransferredToFUIByOperator() {
        return new ContractTransferredToFUIByOperator();
    }

    /**
     * Create an instance of {@link PlaceDisconnectedByOperator }
     * 
     */
    public PlaceDisconnectedByOperator createPlaceDisconnectedByOperator() {
        return new PlaceDisconnectedByOperator();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link ConventionChangedInfo }
     * 
     */
    public ConventionChangedInfo createConventionChangedInfo() {
        return new ConventionChangedInfo();
    }

    /**
     * Create an instance of {@link SupplierChangedInfo }
     * 
     */
    public SupplierChangedInfo createSupplierChangedInfo() {
        return new SupplierChangedInfo();
    }

    /**
     * Create an instance of {@link Supplier }
     * 
     */
    public Supplier createSupplier() {
        return new Supplier();
    }

    /**
     * Create an instance of {@link TechnicalDataElectricity }
     * 
     */
    public TechnicalDataElectricity createTechnicalDataElectricity() {
        return new TechnicalDataElectricity();
    }

    /**
     * Create an instance of {@link TechnicalData }
     * 
     */
    public TechnicalData createTechnicalData() {
        return new TechnicalData();
    }

    /**
     * Create an instance of {@link Consumption }
     * 
     */
    public Consumption createConsumption() {
        return new Consumption();
    }

    /**
     * Create an instance of {@link ContractNetworkSignedBySupplier }
     * 
     */
    public ContractNetworkSignedBySupplier createContractNetworkSignedBySupplier() {
        return new ContractNetworkSignedBySupplier();
    }

    /**
     * Create an instance of {@link ConventionSignedByOperator }
     * 
     */
    public ConventionSignedByOperator createConventionSignedByOperator() {
        return new ConventionSignedByOperator();
    }

    /**
     * Create an instance of {@link ContractCancelledBySupplier }
     * 
     */
    public ContractCancelledBySupplier createContractCancelledBySupplier() {
        return new ContractCancelledBySupplier();
    }

    /**
     * Create an instance of {@link ContractNetworkSignedByOperator }
     * 
     */
    public ContractNetworkSignedByOperator createContractNetworkSignedByOperator() {
        return new ContractNetworkSignedByOperator();
    }

    /**
     * Create an instance of {@link ContractChangedInfo }
     * 
     */
    public ContractChangedInfo createContractChangedInfo() {
        return new ContractChangedInfo();
    }

    /**
     * Create an instance of {@link ContractNetworkCancelledByOperator }
     * 
     */
    public ContractNetworkCancelledByOperator createContractNetworkCancelledByOperator() {
        return new ContractNetworkCancelledByOperator();
    }

    /**
     * Create an instance of {@link PlaceUpdatedByOperator }
     * 
     */
    public PlaceUpdatedByOperator createPlaceUpdatedByOperator() {
        return new PlaceUpdatedByOperator();
    }

    /**
     * Create an instance of {@link ContractTransferredToFUIByAnre }
     * 
     */
    public ContractTransferredToFUIByAnre createContractTransferredToFUIByAnre() {
        return new ContractTransferredToFUIByAnre();
    }

    /**
     * Create an instance of {@link AddressChangedInfo }
     * 
     */
    public AddressChangedInfo createAddressChangedInfo() {
        return new AddressChangedInfo();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link OperatorChangedInfo }
     * 
     */
    public OperatorChangedInfo createOperatorChangedInfo() {
        return new OperatorChangedInfo();
    }

    /**
     * Create an instance of {@link TechnicalDataGas }
     * 
     */
    public TechnicalDataGas createTechnicalDataGas() {
        return new TechnicalDataGas();
    }

    /**
     * Create an instance of {@link Offer }
     * 
     */
    public Offer createOffer() {
        return new Offer();
    }

    /**
     * Create an instance of {@link ClientInfoUpdated }
     * 
     */
    public ClientInfoUpdated createClientInfoUpdated() {
        return new ClientInfoUpdated();
    }

    /**
     * Create an instance of {@link ContractCancelledByClient }
     * 
     */
    public ContractCancelledByClient createContractCancelledByClient() {
        return new ContractCancelledByClient();
    }

    /**
     * Create an instance of {@link ConventionSignedBySupplier }
     * 
     */
    public ConventionSignedBySupplier createConventionSignedBySupplier() {
        return new ConventionSignedBySupplier();
    }

    /**
     * Create an instance of {@link ContractSignedByClient }
     * 
     */
    public ContractSignedByClient createContractSignedByClient() {
        return new ContractSignedByClient();
    }

    /**
     * Create an instance of {@link Aggregate }
     * 
     */
    public Aggregate createAggregate() {
        return new Aggregate();
    }

    /**
     * Create an instance of {@link ContractSuspendedByAnre }
     * 
     */
    public ContractSuspendedByAnre createContractSuspendedByAnre() {
        return new ContractSuspendedByAnre();
    }

    /**
     * Create an instance of {@link Contract.Url }
     * 
     */
    public Contract.Url createContractUrl() {
        return new Contract.Url();
    }

    /**
     * Create an instance of {@link ContractSignedBySupplier }
     * 
     */
    public ContractSignedBySupplier createContractSignedBySupplier() {
        return new ContractSignedBySupplier();
    }

    /**
     * Create an instance of {@link Place.Url }
     * 
     */
    public Place.Url createPlaceUrl() {
        return new Place.Url();
    }

    /**
     * Create an instance of {@link ConventionGeneratedByPOSF }
     * 
     */
    public ConventionGeneratedByPOSF createConventionGeneratedByPOSF() {
        return new ConventionGeneratedByPOSF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.anre.ro/ANRESchema", name = "TechnicalData")
    public JAXBElement<TechnicalData> createTechnicalData(TechnicalData value) {
        return new JAXBElement<TechnicalData>(_TechnicalData_QNAME, TechnicalData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.anre.ro/ANRESchema", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.anre.ro/ANRESchema", name = "Company")
    public JAXBElement<Company> createCompany(Company value) {
        return new JAXBElement<Company>(_Company_QNAME, Company.class, null, value);
    }

}
