
package com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07 package. 
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

    private final static QName _MobileNumberQueryResult_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "MobileNumberQueryResult");
    private final static QName _MobileNumberReference_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "MobileNumberReference");
    private final static QName _PortingTypeReference_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "PortingTypeReference");
    private final static QName _MobileNumber_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "MobileNumber");
    private final static QName _PortingTypeReferencePortingType_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "portingType");
    private final static QName _MobileNumberReferenceIdentifier_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "identifier");
    private final static QName _MobileNumberReferenceFeeAmount_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "feeAmount");
    private final static QName _MobileNumberReferencePaidType_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "paidType");
    private final static QName _MobileNumberReferenceGroupID_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "groupID");
    private final static QName _MobileNumberReferenceState_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "state");
    private final static QName _MobileNumberReferenceTechnology_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "technology");
    private final static QName _MobileNumberReferenceSpid_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "spid");
    private final static QName _MobileNumberAccountID_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "accountID");
    private final static QName _MobileNumberCreated_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "created");
    private final static QName _MobileNumberSubscriberID_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "subscriberID");
    private final static QName _MobileNumberLastModified_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", "lastModified");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MobileNumberReference }
     * 
     */
    public MobileNumberReference createMobileNumberReference() {
        return new MobileNumberReference();
    }

    /**
     * Create an instance of {@link MobileNumber }
     * 
     */
    public MobileNumber createMobileNumber() {
        return new MobileNumber();
    }

    /**
     * Create an instance of {@link MobileNumberQueryResult }
     * 
     */
    public MobileNumberQueryResult createMobileNumberQueryResult() {
        return new MobileNumberQueryResult();
    }

    /**
     * Create an instance of {@link PortingTypeReference }
     * 
     */
    public PortingTypeReference createPortingTypeReference() {
        return new PortingTypeReference();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileNumberQueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "MobileNumberQueryResult")
    public JAXBElement<MobileNumberQueryResult> createMobileNumberQueryResult(MobileNumberQueryResult value) {
        return new JAXBElement<MobileNumberQueryResult>(_MobileNumberQueryResult_QNAME, MobileNumberQueryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileNumberReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "MobileNumberReference")
    public JAXBElement<MobileNumberReference> createMobileNumberReference(MobileNumberReference value) {
        return new JAXBElement<MobileNumberReference>(_MobileNumberReference_QNAME, MobileNumberReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortingTypeReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "PortingTypeReference")
    public JAXBElement<PortingTypeReference> createPortingTypeReference(PortingTypeReference value) {
        return new JAXBElement<PortingTypeReference>(_PortingTypeReference_QNAME, PortingTypeReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "MobileNumber")
    public JAXBElement<MobileNumber> createMobileNumber(MobileNumber value) {
        return new JAXBElement<MobileNumber>(_MobileNumber_QNAME, MobileNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "portingType", scope = PortingTypeReference.class)
    public JAXBElement<Long> createPortingTypeReferencePortingType(Long value) {
        return new JAXBElement<Long>(_PortingTypeReferencePortingType_QNAME, Long.class, PortingTypeReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "identifier", scope = MobileNumberReference.class)
    public JAXBElement<String> createMobileNumberReferenceIdentifier(String value) {
        return new JAXBElement<String>(_MobileNumberReferenceIdentifier_QNAME, String.class, MobileNumberReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "feeAmount", scope = MobileNumberReference.class)
    public JAXBElement<Long> createMobileNumberReferenceFeeAmount(Long value) {
        return new JAXBElement<Long>(_MobileNumberReferenceFeeAmount_QNAME, Long.class, MobileNumberReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "paidType", scope = MobileNumberReference.class)
    public JAXBElement<Long> createMobileNumberReferencePaidType(Long value) {
        return new JAXBElement<Long>(_MobileNumberReferencePaidType_QNAME, Long.class, MobileNumberReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "groupID", scope = MobileNumberReference.class)
    public JAXBElement<Long> createMobileNumberReferenceGroupID(Long value) {
        return new JAXBElement<Long>(_MobileNumberReferenceGroupID_QNAME, Long.class, MobileNumberReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "state", scope = MobileNumberReference.class)
    public JAXBElement<Long> createMobileNumberReferenceState(Long value) {
        return new JAXBElement<Long>(_MobileNumberReferenceState_QNAME, Long.class, MobileNumberReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "technology", scope = MobileNumberReference.class)
    public JAXBElement<Long> createMobileNumberReferenceTechnology(Long value) {
        return new JAXBElement<Long>(_MobileNumberReferenceTechnology_QNAME, Long.class, MobileNumberReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "spid", scope = MobileNumberReference.class)
    public JAXBElement<Integer> createMobileNumberReferenceSpid(Integer value) {
        return new JAXBElement<Integer>(_MobileNumberReferenceSpid_QNAME, Integer.class, MobileNumberReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "accountID", scope = MobileNumber.class)
    public JAXBElement<String> createMobileNumberAccountID(String value) {
        return new JAXBElement<String>(_MobileNumberAccountID_QNAME, String.class, MobileNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "created", scope = MobileNumber.class)
    public JAXBElement<XMLGregorianCalendar> createMobileNumberCreated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MobileNumberCreated_QNAME, XMLGregorianCalendar.class, MobileNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "subscriberID", scope = MobileNumber.class)
    public JAXBElement<String> createMobileNumberSubscriberID(String value) {
        return new JAXBElement<String>(_MobileNumberSubscriberID_QNAME, String.class, MobileNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", name = "lastModified", scope = MobileNumber.class)
    public JAXBElement<XMLGregorianCalendar> createMobileNumberLastModified(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MobileNumberLastModified_QNAME, XMLGregorianCalendar.class, MobileNumber.class, value);
    }

}
