
package com.redknee.util.crmapi.soap.common.xsd._2011._05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redknee.util.crmapi.soap.common.xsd._2011._05 package. 
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

    private final static QName _GenericResponse_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2011/05", "GenericResponse");
    private final static QName _ExecuteResult_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2011/05", "ExecuteResult");
    private final static QName _CRMRequestHeader_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2011/05", "CRMRequestHeader");
    private final static QName _CRMRequestHeaderTransactionID_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2011/05", "transactionID");
    private final static QName _CRMRequestHeaderUsername_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2011/05", "username");
    private final static QName _CRMRequestHeaderPassword_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2011/05", "password");
    private final static QName _CRMRequestHeaderAgentID_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2011/05", "agentID");
    private final static QName _ExecuteResultResultMessage_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/2011/05", "resultMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redknee.util.crmapi.soap.common.xsd._2011._05
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenericResponse }
     * 
     */
    public GenericResponse createGenericResponse() {
        return new GenericResponse();
    }

    /**
     * Create an instance of {@link ExecuteResult }
     * 
     */
    public ExecuteResult createExecuteResult() {
        return new ExecuteResult();
    }

    /**
     * Create an instance of {@link CRMRequestHeader }
     * 
     */
    public CRMRequestHeader createCRMRequestHeader() {
        return new CRMRequestHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2011/05", name = "GenericResponse")
    public JAXBElement<GenericResponse> createGenericResponse(GenericResponse value) {
        return new JAXBElement<GenericResponse>(_GenericResponse_QNAME, GenericResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2011/05", name = "ExecuteResult")
    public JAXBElement<ExecuteResult> createExecuteResult(ExecuteResult value) {
        return new JAXBElement<ExecuteResult>(_ExecuteResult_QNAME, ExecuteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRMRequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2011/05", name = "CRMRequestHeader")
    public JAXBElement<CRMRequestHeader> createCRMRequestHeader(CRMRequestHeader value) {
        return new JAXBElement<CRMRequestHeader>(_CRMRequestHeader_QNAME, CRMRequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2011/05", name = "transactionID", scope = CRMRequestHeader.class)
    public JAXBElement<String> createCRMRequestHeaderTransactionID(String value) {
        return new JAXBElement<String>(_CRMRequestHeaderTransactionID_QNAME, String.class, CRMRequestHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2011/05", name = "username", scope = CRMRequestHeader.class)
    public JAXBElement<String> createCRMRequestHeaderUsername(String value) {
        return new JAXBElement<String>(_CRMRequestHeaderUsername_QNAME, String.class, CRMRequestHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2011/05", name = "password", scope = CRMRequestHeader.class)
    public JAXBElement<String> createCRMRequestHeaderPassword(String value) {
        return new JAXBElement<String>(_CRMRequestHeaderPassword_QNAME, String.class, CRMRequestHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2011/05", name = "agentID", scope = CRMRequestHeader.class)
    public JAXBElement<String> createCRMRequestHeaderAgentID(String value) {
        return new JAXBElement<String>(_CRMRequestHeaderAgentID_QNAME, String.class, CRMRequestHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2011/05", name = "resultMessage", scope = ExecuteResult.class)
    public JAXBElement<String> createExecuteResultResultMessage(String value) {
        return new JAXBElement<String>(_ExecuteResultResultMessage_QNAME, String.class, ExecuteResult.class, value);
    }

}
