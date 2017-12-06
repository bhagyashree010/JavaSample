
package com.redknee.util.crmapi.soap.common.xsd.common_v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redknee.util.crmapi.soap.common.xsd.common_v2 package. 
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

    private final static QName _ExecuteResultResponse_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/Common-v2.0", "executeResultResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redknee.util.crmapi.soap.common.xsd.common_v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExecuteResultResponse }
     * 
     */
    public ExecuteResultResponse createExecuteResultResponse() {
        return new ExecuteResultResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/Common-v2.0", name = "executeResultResponse")
    public JAXBElement<ExecuteResultResponse> createExecuteResultResponse(ExecuteResultResponse value) {
        return new JAXBElement<ExecuteResultResponse>(_ExecuteResultResponse_QNAME, ExecuteResultResponse.class, null, value);
    }

}
