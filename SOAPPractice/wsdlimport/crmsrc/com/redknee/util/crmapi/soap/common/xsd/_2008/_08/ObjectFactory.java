
package com.redknee.util.crmapi.soap.common.xsd._2008._08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redknee.util.crmapi.soap.common.xsd._2008._08 package. 
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

    private final static QName _BatchResults_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "BatchResults");
    private final static QName _GenericParameter_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "GenericParameter");
    private final static QName _NotificationPreferenceType_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "NotificationPreferenceType");
    private final static QName _GenericParameterArray_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "GenericParameterArray");
    private final static QName _BillingMessageReference_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "BillingMessageReference");
    private final static QName _BatchResultsNumberOfRequests_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "numberOfRequests");
    private final static QName _BatchResultsNumberOfSuccesses_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "numberOfSuccesses");
    private final static QName _BatchResultsOverallResult_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "overallResult");
    private final static QName _BillingMessageReferenceIdentifier_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "identifier");
    private final static QName _BillingMessageReferenceLanguage_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "language");
    private final static QName _BillingMessageReferenceState_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "state");
    private final static QName _BillingMessageReferenceMessage_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "message");
    private final static QName _BillingMessageReferenceSpid_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2008/08", "spid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redknee.util.crmapi.soap.common.xsd._2008._08
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenericParameter }
     * 
     */
    public GenericParameter createGenericParameter() {
        return new GenericParameter();
    }

    /**
     * Create an instance of {@link BatchResults }
     * 
     */
    public BatchResults createBatchResults() {
        return new BatchResults();
    }

    /**
     * Create an instance of {@link BillingMessageReference }
     * 
     */
    public BillingMessageReference createBillingMessageReference() {
        return new BillingMessageReference();
    }

    /**
     * Create an instance of {@link GenericParameterArray }
     * 
     */
    public GenericParameterArray createGenericParameterArray() {
        return new GenericParameterArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "BatchResults")
    public JAXBElement<BatchResults> createBatchResults(BatchResults value) {
        return new JAXBElement<BatchResults>(_BatchResults_QNAME, BatchResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "GenericParameter")
    public JAXBElement<GenericParameter> createGenericParameter(GenericParameter value) {
        return new JAXBElement<GenericParameter>(_GenericParameter_QNAME, GenericParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "NotificationPreferenceType")
    public JAXBElement<Long> createNotificationPreferenceType(Long value) {
        return new JAXBElement<Long>(_NotificationPreferenceType_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericParameterArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "GenericParameterArray")
    public JAXBElement<GenericParameterArray> createGenericParameterArray(GenericParameterArray value) {
        return new JAXBElement<GenericParameterArray>(_GenericParameterArray_QNAME, GenericParameterArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingMessageReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "BillingMessageReference")
    public JAXBElement<BillingMessageReference> createBillingMessageReference(BillingMessageReference value) {
        return new JAXBElement<BillingMessageReference>(_BillingMessageReference_QNAME, BillingMessageReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "numberOfRequests", scope = BatchResults.class)
    public JAXBElement<Integer> createBatchResultsNumberOfRequests(Integer value) {
        return new JAXBElement<Integer>(_BatchResultsNumberOfRequests_QNAME, Integer.class, BatchResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "numberOfSuccesses", scope = BatchResults.class)
    public JAXBElement<Integer> createBatchResultsNumberOfSuccesses(Integer value) {
        return new JAXBElement<Integer>(_BatchResultsNumberOfSuccesses_QNAME, Integer.class, BatchResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "overallResult", scope = BatchResults.class)
    public JAXBElement<Long> createBatchResultsOverallResult(Long value) {
        return new JAXBElement<Long>(_BatchResultsOverallResult_QNAME, Long.class, BatchResults.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "identifier", scope = BillingMessageReference.class)
    public JAXBElement<Long> createBillingMessageReferenceIdentifier(Long value) {
        return new JAXBElement<Long>(_BillingMessageReferenceIdentifier_QNAME, Long.class, BillingMessageReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "language", scope = BillingMessageReference.class)
    public JAXBElement<String> createBillingMessageReferenceLanguage(String value) {
        return new JAXBElement<String>(_BillingMessageReferenceLanguage_QNAME, String.class, BillingMessageReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "state", scope = BillingMessageReference.class)
    public JAXBElement<Long> createBillingMessageReferenceState(Long value) {
        return new JAXBElement<Long>(_BillingMessageReferenceState_QNAME, Long.class, BillingMessageReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "message", scope = BillingMessageReference.class)
    public JAXBElement<String> createBillingMessageReferenceMessage(String value) {
        return new JAXBElement<String>(_BillingMessageReferenceMessage_QNAME, String.class, BillingMessageReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", name = "spid", scope = BillingMessageReference.class)
    public JAXBElement<Integer> createBillingMessageReferenceSpid(Integer value) {
        return new JAXBElement<Integer>(_BillingMessageReferenceSpid_QNAME, Integer.class, BillingMessageReference.class, value);
    }

}
