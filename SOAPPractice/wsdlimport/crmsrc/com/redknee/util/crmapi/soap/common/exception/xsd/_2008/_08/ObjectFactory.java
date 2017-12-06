
package com.redknee.util.crmapi.soap.common.exception.xsd._2008._08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redknee.util.crmapi.soap.common.exception.xsd._2008._08 package. 
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

    private final static QName _ShutdownException_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "ShutdownException");
    private final static QName _ValidationException_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "ValidationException");
    private final static QName _DataDeletionException_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "DataDeletionException");
    private final static QName _ValidationExceptionEntry_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "ValidationExceptionEntry");
    private final static QName _CRMException_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "CRMException");
    private final static QName _DataCreationException_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "DataCreationException");
    private final static QName _DataStoreException_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "DataStoreException");
    private final static QName _CompoundException_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "CompoundException");
    private final static QName _ThrottlingException_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "ThrottlingException");
    private final static QName _ShutdownExceptionCode_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "code");
    private final static QName _CompoundExceptionCompoundEntries_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "compoundEntries");
    private final static QName _DataCreationExceptionProfileCreated_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "profileCreated");
    private final static QName _DataStoreExceptionProfileStored_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "profileStored");
    private final static QName _ValidationExceptionEntries_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "entries");
    private final static QName _DataDeletionExceptionProfileDeleted_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", "profileDeleted");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redknee.util.crmapi.soap.common.exception.xsd._2008._08
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataStoreException }
     * 
     */
    public DataStoreException createDataStoreException() {
        return new DataStoreException();
    }

    /**
     * Create an instance of {@link ValidationException }
     * 
     */
    public ValidationException createValidationException() {
        return new ValidationException();
    }

    /**
     * Create an instance of {@link CompoundException }
     * 
     */
    public CompoundException createCompoundException() {
        return new CompoundException();
    }

    /**
     * Create an instance of {@link DataDeletionException }
     * 
     */
    public DataDeletionException createDataDeletionException() {
        return new DataDeletionException();
    }

    /**
     * Create an instance of {@link ValidationExceptionEntry }
     * 
     */
    public ValidationExceptionEntry createValidationExceptionEntry() {
        return new ValidationExceptionEntry();
    }

    /**
     * Create an instance of {@link CRMException }
     * 
     */
    public CRMException createCRMException() {
        return new CRMException();
    }

    /**
     * Create an instance of {@link ShutdownException }
     * 
     */
    public ShutdownException createShutdownException() {
        return new ShutdownException();
    }

    /**
     * Create an instance of {@link ThrottlingException }
     * 
     */
    public ThrottlingException createThrottlingException() {
        return new ThrottlingException();
    }

    /**
     * Create an instance of {@link DataCreationException }
     * 
     */
    public DataCreationException createDataCreationException() {
        return new DataCreationException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShutdownException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "ShutdownException")
    public JAXBElement<ShutdownException> createShutdownException(ShutdownException value) {
        return new JAXBElement<ShutdownException>(_ShutdownException_QNAME, ShutdownException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "ValidationException")
    public JAXBElement<ValidationException> createValidationException(ValidationException value) {
        return new JAXBElement<ValidationException>(_ValidationException_QNAME, ValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataDeletionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "DataDeletionException")
    public JAXBElement<DataDeletionException> createDataDeletionException(DataDeletionException value) {
        return new JAXBElement<DataDeletionException>(_DataDeletionException_QNAME, DataDeletionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationExceptionEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "ValidationExceptionEntry")
    public JAXBElement<ValidationExceptionEntry> createValidationExceptionEntry(ValidationExceptionEntry value) {
        return new JAXBElement<ValidationExceptionEntry>(_ValidationExceptionEntry_QNAME, ValidationExceptionEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "CRMException")
    public JAXBElement<CRMException> createCRMException(CRMException value) {
        return new JAXBElement<CRMException>(_CRMException_QNAME, CRMException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataCreationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "DataCreationException")
    public JAXBElement<DataCreationException> createDataCreationException(DataCreationException value) {
        return new JAXBElement<DataCreationException>(_DataCreationException_QNAME, DataCreationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataStoreException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "DataStoreException")
    public JAXBElement<DataStoreException> createDataStoreException(DataStoreException value) {
        return new JAXBElement<DataStoreException>(_DataStoreException_QNAME, DataStoreException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "CompoundException")
    public JAXBElement<CompoundException> createCompoundException(CompoundException value) {
        return new JAXBElement<CompoundException>(_CompoundException_QNAME, CompoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThrottlingException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "ThrottlingException")
    public JAXBElement<ThrottlingException> createThrottlingException(ThrottlingException value) {
        return new JAXBElement<ThrottlingException>(_ThrottlingException_QNAME, ThrottlingException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "code", scope = ShutdownException.class, defaultValue = "27")
    public JAXBElement<Long> createShutdownExceptionCode(Long value) {
        return new JAXBElement<Long>(_ShutdownExceptionCode_QNAME, Long.class, ShutdownException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "compoundEntries", scope = CompoundException.class)
    public JAXBElement<CRMException> createCompoundExceptionCompoundEntries(CRMException value) {
        return new JAXBElement<CRMException>(_CompoundExceptionCompoundEntries_QNAME, CRMException.class, CompoundException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "code", scope = CompoundException.class, defaultValue = "2")
    public JAXBElement<Long> createCompoundExceptionCode(Long value) {
        return new JAXBElement<Long>(_ShutdownExceptionCode_QNAME, Long.class, CompoundException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "profileCreated", scope = DataCreationException.class)
    public JAXBElement<Boolean> createDataCreationExceptionProfileCreated(Boolean value) {
        return new JAXBElement<Boolean>(_DataCreationExceptionProfileCreated_QNAME, Boolean.class, DataCreationException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "code", scope = DataCreationException.class, defaultValue = "16")
    public JAXBElement<Long> createDataCreationExceptionCode(Long value) {
        return new JAXBElement<Long>(_ShutdownExceptionCode_QNAME, Long.class, DataCreationException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "code", scope = DataStoreException.class, defaultValue = "3")
    public JAXBElement<Long> createDataStoreExceptionCode(Long value) {
        return new JAXBElement<Long>(_ShutdownExceptionCode_QNAME, Long.class, DataStoreException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "profileStored", scope = DataStoreException.class)
    public JAXBElement<Boolean> createDataStoreExceptionProfileStored(Boolean value) {
        return new JAXBElement<Boolean>(_DataStoreExceptionProfileStored_QNAME, Boolean.class, DataStoreException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "code", scope = ThrottlingException.class, defaultValue = "26")
    public JAXBElement<Long> createThrottlingExceptionCode(Long value) {
        return new JAXBElement<Long>(_ShutdownExceptionCode_QNAME, Long.class, ThrottlingException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationExceptionEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "entries", scope = ValidationException.class)
    public JAXBElement<ValidationExceptionEntry> createValidationExceptionEntries(ValidationExceptionEntry value) {
        return new JAXBElement<ValidationExceptionEntry>(_ValidationExceptionEntries_QNAME, ValidationExceptionEntry.class, ValidationException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "code", scope = ValidationException.class, defaultValue = "14")
    public JAXBElement<Long> createValidationExceptionCode(Long value) {
        return new JAXBElement<Long>(_ShutdownExceptionCode_QNAME, Long.class, ValidationException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "profileDeleted", scope = DataDeletionException.class)
    public JAXBElement<Boolean> createDataDeletionExceptionProfileDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_DataDeletionExceptionProfileDeleted_QNAME, Boolean.class, DataDeletionException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", name = "code", scope = DataDeletionException.class, defaultValue = "17")
    public JAXBElement<Long> createDataDeletionExceptionCode(Long value) {
        return new JAXBElement<Long>(_ShutdownExceptionCode_QNAME, Long.class, DataDeletionException.class, value);
    }

}
