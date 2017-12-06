
package com.redknee.util.crmapi.soap.common.xsd.common_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redknee.util.crmapi.soap.common.xsd.common_v1 package. 
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

    private final static QName _SuccessfulResponse_QNAME = new QName("http://soap.crmapi.util.redknee.com/common/xsd/Common-v1.1", "SuccessfulResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redknee.util.crmapi.soap.common.xsd.common_v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SuccessfulResponse }
     * 
     */
    public SuccessfulResponse createSuccessfulResponse() {
        return new SuccessfulResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessfulResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/common/xsd/Common-v1.1", name = "SuccessfulResponse")
    public JAXBElement<SuccessfulResponse> createSuccessfulResponse(SuccessfulResponse value) {
        return new JAXBElement<SuccessfulResponse>(_SuccessfulResponse_QNAME, SuccessfulResponse.class, null, value);
    }

}
