
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.newrelic.apm.enterprise.bmc package. 
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

    private final static QName _ValueElement_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "value_element");
    private final static QName _EventArrayElement_QNAME = new QName("http://blueprint.bmc.com/Event", "EventArray_element");
    private final static QName _ConnectionId_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "connectionId");
    private final static QName _ByteArray_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "ByteArray");
    private final static QName _ClassDefInfoElement_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "ClassDefInfo_element");
    private final static QName _StartDate_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "startDate");
    private final static QName _OnlyImpacted_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "onlyImpacted");
    private final static QName _IntArray_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "IntArray");
    private final static QName _StringArray_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "StringArray");
    private final static QName _Condition_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "condition");
    private final static QName _CStatusElement_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "CStatus_element");
    private final static QName _NumOfComponents_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "num_of_components");
    private final static QName _SMComponentElement_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "SMComponent_element");
    private final static QName _CStatusLow_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "cStatusLow");
    private final static QName _ClassOnly_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "classOnly");
    private final static QName _NameValueElement_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "NameValue_element");
    private final static QName _NumOfResults_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "num_of_results");
    private final static QName _ImFailure_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "imFailure");
    private final static QName _StartIndexNio_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "startIndex_nio");
    private final static QName _RetrieveQueryResultResponseElement_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "RetrieveQueryResultResponse_element");
    private final static QName _Query_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "query");
    private final static QName _DoubleArray_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "DoubleArray");
    private final static QName _Context_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "context");
    private final static QName _Connection_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "connection");
    private final static QName _ContextAck_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "context_ack");
    private final static QName _CallbackURL_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "callbackURL");
    private final static QName _Reliable_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "reliable");
    private final static QName _Password_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "password");
    private final static QName _StartIndex_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "startIndex");
    private final static QName _MessageType_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "messageType");
    private final static QName _SlotsList_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "slotsList");
    private final static QName _SMComponentArrayElement_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "SMComponentArray_element");
    private final static QName _ErrorCode_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "errorCode");
    private final static QName _EventElement_QNAME = new QName("http://blueprint.bmc.com/Event", "Event_element");
    private final static QName _ClassNames_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "classNames");
    private final static QName _BaseClass_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "baseClass");
    private final static QName _StatusSet_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "statusSet");
    private final static QName _ComponentStatusId_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "componentStatusId");
    private final static QName _BufferType_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "bufferType");
    private final static QName _EndDate_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "endDate");
    private final static QName _MessageClass_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "messageClass");
    private final static QName _RetrieveResultHandle_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "retrieveResultHandle");
    private final static QName _ShortArray_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "ShortArray");
    private final static QName _SetOrCleared_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "setOrCleared");
    private final static QName _Comment_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "comment");
    private final static QName _CellInfoArray_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "CellInfo_Array");
    private final static QName _QueryEv_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "query_ev");
    private final static QName _SecurityToken_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "securityToken");
    private final static QName _NumOfEvents_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "num_of_events");
    private final static QName _CStatusHigh_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "cStatusHigh");
    private final static QName _DeleteBuffer_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "deleteBuffer");
    private final static QName _GetEventsResponseElement_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "GetEventsResponse_element");
    private final static QName _ResultHandle_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "resultHandle");
    private final static QName _UserName_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "userName");
    private final static QName _Message_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "message");
    private final static QName _ModeToSet_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "modeToSet");
    private final static QName _ContextNio_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "context_nio");
    private final static QName _RegID_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "regID");
    private final static QName _LongResponse_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "long_Response");
    private final static QName _LongArray_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "LongArray");
    private final static QName _FloatArray_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "FloatArray");
    private final static QName _ComponentCauseId_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "componentCauseId");
    private final static QName _FilterName_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "filterName");
    private final static QName _ResultCode_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "resultCode");
    private final static QName _NameValueArrayElement_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "NameValueArray_element");
    private final static QName _StateChangeTypeElement_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "StateChangeType_element");
    private final static QName _ClassDefInfoArray_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "ClassDefInfo_Array");
    private final static QName _ServerName_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "serverName");
    private final static QName _MessageID_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "messageID");
    private final static QName _ComponentStatus_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "componentStatus");
    private final static QName _ClassName_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "className");
    private final static QName _NameValueTableElement_QNAME = new QName("http://blueprint.bmc.com/BasicTypes", "NameValueTable_element");
    private final static QName _Timeout_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "timeout");
    private final static QName _QueryModeElement_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "QueryMode_element");
    private final static QName _Imname_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "imname");
    private final static QName _EventID_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "eventID");
    private final static QName _StringResponse_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "string_Response");
    private final static QName _SlotDefInfoArray_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "SlotDefInfo_Array");
    private final static QName _ComponentId_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "componentId");
    private final static QName _TrueCause_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "trueCause");
    private final static QName _GetSubclasses_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "getSubclasses");
    private final static QName _SlotDefInfoElement_QNAME = new QName("http://blueprint.bmc.com/ImapiTypes", "SlotDefInfo_element");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.newrelic.apm.enterprise.bmc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfLong }
     * 
     */
    public ArrayOfLong createArrayOfLong() {
        return new ArrayOfLong();
    }

    /**
     * Create an instance of {@link ArrayOfFloat }
     * 
     */
    public ArrayOfFloat createArrayOfFloat() {
        return new ArrayOfFloat();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link NameValue }
     * 
     */
    public NameValue createNameValue() {
        return new NameValue();
    }

    /**
     * Create an instance of {@link ArrayOfByte }
     * 
     */
    public ArrayOfByte createArrayOfByte() {
        return new ArrayOfByte();
    }

    /**
     * Create an instance of {@link TableOfNameValue }
     * 
     */
    public TableOfNameValue createTableOfNameValue() {
        return new TableOfNameValue();
    }

    /**
     * Create an instance of {@link ArrayOfShort }
     * 
     */
    public ArrayOfShort createArrayOfShort() {
        return new ArrayOfShort();
    }

    /**
     * Create an instance of {@link ArrayOfNameValue }
     * 
     */
    public ArrayOfNameValue createArrayOfNameValue() {
        return new ArrayOfNameValue();
    }

    /**
     * Create an instance of {@link ArrayOfDouble }
     * 
     */
    public ArrayOfDouble createArrayOfDouble() {
        return new ArrayOfDouble();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link ArrayOfEvent }
     * 
     */
    public ArrayOfEvent createArrayOfEvent() {
        return new ArrayOfEvent();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link ArrayOfSMComponent }
     * 
     */
    public ArrayOfSMComponent createArrayOfSMComponent() {
        return new ArrayOfSMComponent();
    }

    /**
     * Create an instance of {@link RetrieveQueryResultResponse }
     * 
     */
    public RetrieveQueryResultResponse createRetrieveQueryResultResponse() {
        return new RetrieveQueryResultResponse();
    }

    /**
     * Create an instance of {@link SMComponent }
     * 
     */
    public SMComponent createSMComponent() {
        return new SMComponent();
    }

    /**
     * Create an instance of {@link CStatus }
     * 
     */
    public CStatus createCStatus() {
        return new CStatus();
    }

    /**
     * Create an instance of {@link ClassDefInfo }
     * 
     */
    public ClassDefInfo createClassDefInfo() {
        return new ClassDefInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSlotDefInfo }
     * 
     */
    public ArrayOfSlotDefInfo createArrayOfSlotDefInfo() {
        return new ArrayOfSlotDefInfo();
    }

    /**
     * Create an instance of {@link SlotDefInfo }
     * 
     */
    public SlotDefInfo createSlotDefInfo() {
        return new SlotDefInfo();
    }

    /**
     * Create an instance of {@link StateChangeType }
     * 
     */
    public StateChangeType createStateChangeType() {
        return new StateChangeType();
    }

    /**
     * Create an instance of {@link ArrayOfClassDefInfo }
     * 
     */
    public ArrayOfClassDefInfo createArrayOfClassDefInfo() {
        return new ArrayOfClassDefInfo();
    }

    /**
     * Create an instance of {@link GetEventsResponse }
     * 
     */
    public GetEventsResponse createGetEventsResponse() {
        return new GetEventsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCellInfo }
     * 
     */
    public ArrayOfCellInfo createArrayOfCellInfo() {
        return new ArrayOfCellInfo();
    }

    /**
     * Create an instance of {@link CellInfo }
     * 
     */
    public CellInfo createCellInfo() {
        return new CellInfo();
    }

    /**
     * Create an instance of {@link GetQueryResultCount }
     * 
     */
    public GetQueryResultCount createGetQueryResultCount() {
        return new GetQueryResultCount();
    }

    /**
     * Create an instance of {@link QueryComponent }
     * 
     */
    public QueryComponent createQueryComponent() {
        return new QueryComponent();
    }

    /**
     * Create an instance of {@link NoValueOutput }
     * 
     */
    public NoValueOutput createNoValueOutput() {
        return new NoValueOutput();
    }

    /**
     * Create an instance of {@link SendEventOutput }
     * 
     */
    public SendEventOutput createSendEventOutput() {
        return new SendEventOutput();
    }

    /**
     * Create an instance of {@link GetFilterNames }
     * 
     */
    public GetFilterNames createGetFilterNames() {
        return new GetFilterNames();
    }

    /**
     * Create an instance of {@link RegisterStateChangeOutput }
     * 
     */
    public RegisterStateChangeOutput createRegisterStateChangeOutput() {
        return new RegisterStateChangeOutput();
    }

    /**
     * Create an instance of {@link QueryModelPossibleRootCauses }
     * 
     */
    public QueryModelPossibleRootCauses createQueryModelPossibleRootCauses() {
        return new QueryModelPossibleRootCauses();
    }

    /**
     * Create an instance of {@link QueryData }
     * 
     */
    public QueryData createQueryData() {
        return new QueryData();
    }

    /**
     * Create an instance of {@link GetFilterNamesOutput }
     * 
     */
    public GetFilterNamesOutput createGetFilterNamesOutput() {
        return new GetFilterNamesOutput();
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link GetCellInfo }
     * 
     */
    public GetCellInfo createGetCellInfo() {
        return new GetCellInfo();
    }

    /**
     * Create an instance of {@link SendEvent }
     * 
     */
    public SendEvent createSendEvent() {
        return new SendEvent();
    }

    /**
     * Create an instance of {@link QueryEvents }
     * 
     */
    public QueryEvents createQueryEvents() {
        return new QueryEvents();
    }

    /**
     * Create an instance of {@link Disconnect }
     * 
     */
    public Disconnect createDisconnect() {
        return new Disconnect();
    }

    /**
     * Create an instance of {@link QueryResultHandleOutput }
     * 
     */
    public QueryResultHandleOutput createQueryResultHandleOutput() {
        return new QueryResultHandleOutput();
    }

    /**
     * Create an instance of {@link QueryClassDefinitionsOutput }
     * 
     */
    public QueryClassDefinitionsOutput createQueryClassDefinitionsOutput() {
        return new QueryClassDefinitionsOutput();
    }

    /**
     * Create an instance of {@link QueryComponentStatus }
     * 
     */
    public QueryComponentStatus createQueryComponentStatus() {
        return new QueryComponentStatus();
    }

    /**
     * Create an instance of {@link QueryEventByID }
     * 
     */
    public QueryEventByID createQueryEventByID() {
        return new QueryEventByID();
    }

    /**
     * Create an instance of {@link UnregisterStateChange }
     * 
     */
    public UnregisterStateChange createUnregisterStateChange() {
        return new UnregisterStateChange();
    }

    /**
     * Create an instance of {@link SetMaintenanceModeOutput }
     * 
     */
    public SetMaintenanceModeOutput createSetMaintenanceModeOutput() {
        return new SetMaintenanceModeOutput();
    }

    /**
     * Create an instance of {@link Unsubscribe }
     * 
     */
    public Unsubscribe createUnsubscribe() {
        return new Unsubscribe();
    }

    /**
     * Create an instance of {@link QueryModelImpact }
     * 
     */
    public QueryModelImpact createQueryModelImpact() {
        return new QueryModelImpact();
    }

    /**
     * Create an instance of {@link QueryEventsByDate }
     * 
     */
    public QueryEventsByDate createQueryEventsByDate() {
        return new QueryEventsByDate();
    }

    /**
     * Create an instance of {@link SetMaintenanceMode }
     * 
     */
    public SetMaintenanceMode createSetMaintenanceMode() {
        return new SetMaintenanceMode();
    }

    /**
     * Create an instance of {@link EndQuery }
     * 
     */
    public EndQuery createEndQuery() {
        return new EndQuery();
    }

    /**
     * Create an instance of {@link QueryComponentEvents }
     * 
     */
    public QueryComponentEvents createQueryComponentEvents() {
        return new QueryComponentEvents();
    }

    /**
     * Create an instance of {@link SetManualStatusOutput }
     * 
     */
    public SetManualStatusOutput createSetManualStatusOutput() {
        return new SetManualStatusOutput();
    }

    /**
     * Create an instance of {@link Connect }
     * 
     */
    public Connect createConnect() {
        return new Connect();
    }

    /**
     * Create an instance of {@link RetrieveQueryResults }
     * 
     */
    public RetrieveQueryResults createRetrieveQueryResults() {
        return new RetrieveQueryResults();
    }

    /**
     * Create an instance of {@link RetrieveQueryResultsOutput }
     * 
     */
    public RetrieveQueryResultsOutput createRetrieveQueryResultsOutput() {
        return new RetrieveQueryResultsOutput();
    }

    /**
     * Create an instance of {@link SetManualStatus }
     * 
     */
    public SetManualStatus createSetManualStatus() {
        return new SetManualStatus();
    }

    /**
     * Create an instance of {@link GetQueryResultCountOutput }
     * 
     */
    public GetQueryResultCountOutput createGetQueryResultCountOutput() {
        return new GetQueryResultCountOutput();
    }

    /**
     * Create an instance of {@link UnregisterStateChangeOutput }
     * 
     */
    public UnregisterStateChangeOutput createUnregisterStateChangeOutput() {
        return new UnregisterStateChangeOutput();
    }

    /**
     * Create an instance of {@link ConnectOutput }
     * 
     */
    public ConnectOutput createConnectOutput() {
        return new ConnectOutput();
    }

    /**
     * Create an instance of {@link ExecutionFault }
     * 
     */
    public ExecutionFault createExecutionFault() {
        return new ExecutionFault();
    }

    /**
     * Create an instance of {@link GetEventsOutput }
     * 
     */
    public GetEventsOutput createGetEventsOutput() {
        return new GetEventsOutput();
    }

    /**
     * Create an instance of {@link GetCellInfoOutput }
     * 
     */
    public GetCellInfoOutput createGetCellInfoOutput() {
        return new GetCellInfoOutput();
    }

    /**
     * Create an instance of {@link QueryComponentsByStatus }
     * 
     */
    public QueryComponentsByStatus createQueryComponentsByStatus() {
        return new QueryComponentsByStatus();
    }

    /**
     * Create an instance of {@link QueryClassDefinitions }
     * 
     */
    public QueryClassDefinitions createQueryClassDefinitions() {
        return new QueryClassDefinitions();
    }

    /**
     * Create an instance of {@link GetEvents }
     * 
     */
    public GetEvents createGetEvents() {
        return new GetEvents();
    }

    /**
     * Create an instance of {@link AckEvents }
     * 
     */
    public AckEvents createAckEvents() {
        return new AckEvents();
    }

    /**
     * Create an instance of {@link QueryComponentsByCondition }
     * 
     */
    public QueryComponentsByCondition createQueryComponentsByCondition() {
        return new QueryComponentsByCondition();
    }

    /**
     * Create an instance of {@link RegisterStateChange }
     * 
     */
    public RegisterStateChange createRegisterStateChange() {
        return new RegisterStateChange();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Value }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "value_element")
    public JAXBElement<Value> createValueElement(Value value) {
        return new JAXBElement<Value>(_ValueElement_QNAME, Value.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/Event", name = "EventArray_element")
    public JAXBElement<ArrayOfEvent> createEventArrayElement(ArrayOfEvent value) {
        return new JAXBElement<ArrayOfEvent>(_EventArrayElement_QNAME, ArrayOfEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "connectionId")
    public JAXBElement<Long> createConnectionId(Long value) {
        return new JAXBElement<Long>(_ConnectionId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfByte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "ByteArray")
    public JAXBElement<ArrayOfByte> createByteArray(ArrayOfByte value) {
        return new JAXBElement<ArrayOfByte>(_ByteArray_QNAME, ArrayOfByte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassDefInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "ClassDefInfo_element")
    public JAXBElement<ClassDefInfo> createClassDefInfoElement(ClassDefInfo value) {
        return new JAXBElement<ClassDefInfo>(_ClassDefInfoElement_QNAME, ClassDefInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "startDate")
    public JAXBElement<XMLGregorianCalendar> createStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "onlyImpacted")
    public JAXBElement<Boolean> createOnlyImpacted(Boolean value) {
        return new JAXBElement<Boolean>(_OnlyImpacted_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "IntArray")
    public JAXBElement<ArrayOfInt> createIntArray(ArrayOfInt value) {
        return new JAXBElement<ArrayOfInt>(_IntArray_QNAME, ArrayOfInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "StringArray")
    public JAXBElement<ArrayOfString> createStringArray(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_StringArray_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "condition")
    public JAXBElement<String> createCondition(String value) {
        return new JAXBElement<String>(_Condition_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "CStatus_element")
    public JAXBElement<CStatus> createCStatusElement(CStatus value) {
        return new JAXBElement<CStatus>(_CStatusElement_QNAME, CStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "num_of_components")
    public JAXBElement<Integer> createNumOfComponents(Integer value) {
        return new JAXBElement<Integer>(_NumOfComponents_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "SMComponent_element")
    public JAXBElement<SMComponent> createSMComponentElement(SMComponent value) {
        return new JAXBElement<SMComponent>(_SMComponentElement_QNAME, SMComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "cStatusLow")
    public JAXBElement<String> createCStatusLow(String value) {
        return new JAXBElement<String>(_CStatusLow_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "classOnly")
    public JAXBElement<Boolean> createClassOnly(Boolean value) {
        return new JAXBElement<Boolean>(_ClassOnly_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "NameValue_element")
    public JAXBElement<NameValue> createNameValueElement(NameValue value) {
        return new JAXBElement<NameValue>(_NameValueElement_QNAME, NameValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "num_of_results")
    public JAXBElement<Integer> createNumOfResults(Integer value) {
        return new JAXBElement<Integer>(_NumOfResults_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "imFailure")
    public JAXBElement<String> createImFailure(String value) {
        return new JAXBElement<String>(_ImFailure_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "startIndex_nio")
    public JAXBElement<Long> createStartIndexNio(Long value) {
        return new JAXBElement<Long>(_StartIndexNio_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveQueryResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "RetrieveQueryResultResponse_element")
    public JAXBElement<RetrieveQueryResultResponse> createRetrieveQueryResultResponseElement(RetrieveQueryResultResponse value) {
        return new JAXBElement<RetrieveQueryResultResponse>(_RetrieveQueryResultResponseElement_QNAME, RetrieveQueryResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "query")
    public JAXBElement<String> createQuery(String value) {
        return new JAXBElement<String>(_Query_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDouble }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "DoubleArray")
    public JAXBElement<ArrayOfDouble> createDoubleArray(ArrayOfDouble value) {
        return new JAXBElement<ArrayOfDouble>(_DoubleArray_QNAME, ArrayOfDouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "context")
    public JAXBElement<String> createContext(String value) {
        return new JAXBElement<String>(_Context_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "connection")
    public JAXBElement<Long> createConnection(Long value) {
        return new JAXBElement<Long>(_Connection_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "context_ack")
    public JAXBElement<String> createContextAck(String value) {
        return new JAXBElement<String>(_ContextAck_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "callbackURL")
    public JAXBElement<String> createCallbackURL(String value) {
        return new JAXBElement<String>(_CallbackURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "reliable")
    public JAXBElement<Boolean> createReliable(Boolean value) {
        return new JAXBElement<Boolean>(_Reliable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "startIndex")
    public JAXBElement<Long> createStartIndex(Long value) {
        return new JAXBElement<Long>(_StartIndex_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "messageType")
    public JAXBElement<IMMessageType> createMessageType(IMMessageType value) {
        return new JAXBElement<IMMessageType>(_MessageType_QNAME, IMMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "slotsList")
    public JAXBElement<String> createSlotsList(String value) {
        return new JAXBElement<String>(_SlotsList_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSMComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "SMComponentArray_element")
    public JAXBElement<ArrayOfSMComponent> createSMComponentArrayElement(ArrayOfSMComponent value) {
        return new JAXBElement<ArrayOfSMComponent>(_SMComponentArrayElement_QNAME, ArrayOfSMComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "errorCode")
    public JAXBElement<Integer> createErrorCode(Integer value) {
        return new JAXBElement<Integer>(_ErrorCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Event }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/Event", name = "Event_element")
    public JAXBElement<Event> createEventElement(Event value) {
        return new JAXBElement<Event>(_EventElement_QNAME, Event.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "classNames")
    public JAXBElement<String> createClassNames(String value) {
        return new JAXBElement<String>(_ClassNames_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "baseClass")
    public JAXBElement<String> createBaseClass(String value) {
        return new JAXBElement<String>(_BaseClass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "statusSet")
    public JAXBElement<Integer> createStatusSet(Integer value) {
        return new JAXBElement<Integer>(_StatusSet_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "componentStatusId")
    public JAXBElement<String> createComponentStatusId(String value) {
        return new JAXBElement<String>(_ComponentStatusId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMBufferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "bufferType")
    public JAXBElement<IMBufferType> createBufferType(IMBufferType value) {
        return new JAXBElement<IMBufferType>(_BufferType_QNAME, IMBufferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "endDate")
    public JAXBElement<XMLGregorianCalendar> createEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "messageClass")
    public JAXBElement<String> createMessageClass(String value) {
        return new JAXBElement<String>(_MessageClass_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "retrieveResultHandle")
    public JAXBElement<String> createRetrieveResultHandle(String value) {
        return new JAXBElement<String>(_RetrieveResultHandle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfShort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "ShortArray")
    public JAXBElement<ArrayOfShort> createShortArray(ArrayOfShort value) {
        return new JAXBElement<ArrayOfShort>(_ShortArray_QNAME, ArrayOfShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "setOrCleared")
    public JAXBElement<Integer> createSetOrCleared(Integer value) {
        return new JAXBElement<Integer>(_SetOrCleared_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "comment")
    public JAXBElement<String> createComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCellInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "CellInfo_Array")
    public JAXBElement<ArrayOfCellInfo> createCellInfoArray(ArrayOfCellInfo value) {
        return new JAXBElement<ArrayOfCellInfo>(_CellInfoArray_QNAME, ArrayOfCellInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "query_ev")
    public JAXBElement<String> createQueryEv(String value) {
        return new JAXBElement<String>(_QueryEv_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "securityToken")
    public JAXBElement<String> createSecurityToken(String value) {
        return new JAXBElement<String>(_SecurityToken_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "num_of_events")
    public JAXBElement<Integer> createNumOfEvents(Integer value) {
        return new JAXBElement<Integer>(_NumOfEvents_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "cStatusHigh")
    public JAXBElement<String> createCStatusHigh(String value) {
        return new JAXBElement<String>(_CStatusHigh_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "deleteBuffer")
    public JAXBElement<Boolean> createDeleteBuffer(Boolean value) {
        return new JAXBElement<Boolean>(_DeleteBuffer_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "GetEventsResponse_element")
    public JAXBElement<GetEventsResponse> createGetEventsResponseElement(GetEventsResponse value) {
        return new JAXBElement<GetEventsResponse>(_GetEventsResponseElement_QNAME, GetEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "resultHandle")
    public JAXBElement<String> createResultHandle(String value) {
        return new JAXBElement<String>(_ResultHandle_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "userName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Event }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "message")
    public JAXBElement<Event> createMessage(Event value) {
        return new JAXBElement<Event>(_Message_QNAME, Event.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "modeToSet")
    public JAXBElement<String> createModeToSet(String value) {
        return new JAXBElement<String>(_ModeToSet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "context_nio")
    public JAXBElement<String> createContextNio(String value) {
        return new JAXBElement<String>(_ContextNio_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "regID")
    public JAXBElement<String> createRegID(String value) {
        return new JAXBElement<String>(_RegID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "long_Response")
    public JAXBElement<Long> createLongResponse(Long value) {
        return new JAXBElement<Long>(_LongResponse_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "LongArray")
    public JAXBElement<ArrayOfLong> createLongArray(ArrayOfLong value) {
        return new JAXBElement<ArrayOfLong>(_LongArray_QNAME, ArrayOfLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFloat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "FloatArray")
    public JAXBElement<ArrayOfFloat> createFloatArray(ArrayOfFloat value) {
        return new JAXBElement<ArrayOfFloat>(_FloatArray_QNAME, ArrayOfFloat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "componentCauseId")
    public JAXBElement<String> createComponentCauseId(String value) {
        return new JAXBElement<String>(_ComponentCauseId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "filterName")
    public JAXBElement<String> createFilterName(String value) {
        return new JAXBElement<String>(_FilterName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "resultCode")
    public JAXBElement<Integer> createResultCode(Integer value) {
        return new JAXBElement<Integer>(_ResultCode_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "NameValueArray_element")
    public JAXBElement<ArrayOfNameValue> createNameValueArrayElement(ArrayOfNameValue value) {
        return new JAXBElement<ArrayOfNameValue>(_NameValueArrayElement_QNAME, ArrayOfNameValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateChangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "StateChangeType_element")
    public JAXBElement<StateChangeType> createStateChangeTypeElement(StateChangeType value) {
        return new JAXBElement<StateChangeType>(_StateChangeTypeElement_QNAME, StateChangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClassDefInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "ClassDefInfo_Array")
    public JAXBElement<ArrayOfClassDefInfo> createClassDefInfoArray(ArrayOfClassDefInfo value) {
        return new JAXBElement<ArrayOfClassDefInfo>(_ClassDefInfoArray_QNAME, ArrayOfClassDefInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "serverName")
    public JAXBElement<String> createServerName(String value) {
        return new JAXBElement<String>(_ServerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "messageID")
    public JAXBElement<String> createMessageID(String value) {
        return new JAXBElement<String>(_MessageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "componentStatus")
    public JAXBElement<String> createComponentStatus(String value) {
        return new JAXBElement<String>(_ComponentStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "className")
    public JAXBElement<String> createClassName(String value) {
        return new JAXBElement<String>(_ClassName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TableOfNameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/BasicTypes", name = "NameValueTable_element")
    public JAXBElement<TableOfNameValue> createNameValueTableElement(TableOfNameValue value) {
        return new JAXBElement<TableOfNameValue>(_NameValueTableElement_QNAME, TableOfNameValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "timeout")
    public JAXBElement<Integer> createTimeout(Integer value) {
        return new JAXBElement<Integer>(_Timeout_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "QueryMode_element")
    public JAXBElement<QueryMode> createQueryModeElement(QueryMode value) {
        return new JAXBElement<QueryMode>(_QueryModeElement_QNAME, QueryMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "imname")
    public JAXBElement<String> createImname(String value) {
        return new JAXBElement<String>(_Imname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "eventID")
    public JAXBElement<String> createEventID(String value) {
        return new JAXBElement<String>(_EventID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "string_Response")
    public JAXBElement<String> createStringResponse(String value) {
        return new JAXBElement<String>(_StringResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSlotDefInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "SlotDefInfo_Array")
    public JAXBElement<ArrayOfSlotDefInfo> createSlotDefInfoArray(ArrayOfSlotDefInfo value) {
        return new JAXBElement<ArrayOfSlotDefInfo>(_SlotDefInfoArray_QNAME, ArrayOfSlotDefInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "componentId")
    public JAXBElement<String> createComponentId(String value) {
        return new JAXBElement<String>(_ComponentId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "trueCause")
    public JAXBElement<Boolean> createTrueCause(Boolean value) {
        return new JAXBElement<Boolean>(_TrueCause_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "getSubclasses")
    public JAXBElement<Boolean> createGetSubclasses(Boolean value) {
        return new JAXBElement<Boolean>(_GetSubclasses_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlotDefInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blueprint.bmc.com/ImapiTypes", name = "SlotDefInfo_element")
    public JAXBElement<SlotDefInfo> createSlotDefInfoElement(SlotDefInfo value) {
        return new JAXBElement<SlotDefInfo>(_SlotDefInfoElement_QNAME, SlotDefInfo.class, null, value);
    }

}
