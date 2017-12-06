
package com.redknee.util.crmapi.soap.mobilenumbers.xsd.mobilenumbers_v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07.MobileNumber;
import com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07.MobileNumberQueryResult;
import com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07.PortingTypeReference;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.redknee.util.crmapi.soap.mobilenumbers.xsd.mobilenumbers_v2 package. 
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

    private final static QName _GetMobileNumberResponse_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", "getMobileNumberResponse");
    private final static QName _ListMobileNumbersResponse_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", "listMobileNumbersResponse");
    private final static QName _GetMobileNumber_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", "getMobileNumber");
    private final static QName _GetMobileNumberPortingTypeResponse_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", "getMobileNumberPortingTypeResponse");
    private final static QName _UpdateMobileNumberState_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", "updateMobileNumberState");
    private final static QName _GetMobileNumberPortingType_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", "getMobileNumberPortingType");
    private final static QName _ListMobileNumbers_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", "listMobileNumbers");
    private final static QName _UpdateMobileNumberStateResponse_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", "updateMobileNumberStateResponse");
    private final static QName _UpdateMobileNumberStateResponseReturn_QNAME = new QName("http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.redknee.util.crmapi.soap.mobilenumbers.xsd.mobilenumbers_v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMobileNumber }
     * 
     */
    public GetMobileNumber createGetMobileNumber() {
        return new GetMobileNumber();
    }

    /**
     * Create an instance of {@link UpdateMobileNumberStateResponse }
     * 
     */
    public UpdateMobileNumberStateResponse createUpdateMobileNumberStateResponse() {
        return new UpdateMobileNumberStateResponse();
    }

    /**
     * Create an instance of {@link ListMobileNumbers }
     * 
     */
    public ListMobileNumbers createListMobileNumbers() {
        return new ListMobileNumbers();
    }

    /**
     * Create an instance of {@link ListMobileNumbersResponse }
     * 
     */
    public ListMobileNumbersResponse createListMobileNumbersResponse() {
        return new ListMobileNumbersResponse();
    }

    /**
     * Create an instance of {@link GetMobileNumberPortingType }
     * 
     */
    public GetMobileNumberPortingType createGetMobileNumberPortingType() {
        return new GetMobileNumberPortingType();
    }

    /**
     * Create an instance of {@link UpdateMobileNumberState }
     * 
     */
    public UpdateMobileNumberState createUpdateMobileNumberState() {
        return new UpdateMobileNumberState();
    }

    /**
     * Create an instance of {@link GetMobileNumberResponse }
     * 
     */
    public GetMobileNumberResponse createGetMobileNumberResponse() {
        return new GetMobileNumberResponse();
    }

    /**
     * Create an instance of {@link GetMobileNumberPortingTypeResponse }
     * 
     */
    public GetMobileNumberPortingTypeResponse createGetMobileNumberPortingTypeResponse() {
        return new GetMobileNumberPortingTypeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "getMobileNumberResponse")
    public JAXBElement<GetMobileNumberResponse> createGetMobileNumberResponse(GetMobileNumberResponse value) {
        return new JAXBElement<GetMobileNumberResponse>(_GetMobileNumberResponse_QNAME, GetMobileNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMobileNumbersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "listMobileNumbersResponse")
    public JAXBElement<ListMobileNumbersResponse> createListMobileNumbersResponse(ListMobileNumbersResponse value) {
        return new JAXBElement<ListMobileNumbersResponse>(_ListMobileNumbersResponse_QNAME, ListMobileNumbersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "getMobileNumber")
    public JAXBElement<GetMobileNumber> createGetMobileNumber(GetMobileNumber value) {
        return new JAXBElement<GetMobileNumber>(_GetMobileNumber_QNAME, GetMobileNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileNumberPortingTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "getMobileNumberPortingTypeResponse")
    public JAXBElement<GetMobileNumberPortingTypeResponse> createGetMobileNumberPortingTypeResponse(GetMobileNumberPortingTypeResponse value) {
        return new JAXBElement<GetMobileNumberPortingTypeResponse>(_GetMobileNumberPortingTypeResponse_QNAME, GetMobileNumberPortingTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMobileNumberState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "updateMobileNumberState")
    public JAXBElement<UpdateMobileNumberState> createUpdateMobileNumberState(UpdateMobileNumberState value) {
        return new JAXBElement<UpdateMobileNumberState>(_UpdateMobileNumberState_QNAME, UpdateMobileNumberState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMobileNumberPortingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "getMobileNumberPortingType")
    public JAXBElement<GetMobileNumberPortingType> createGetMobileNumberPortingType(GetMobileNumberPortingType value) {
        return new JAXBElement<GetMobileNumberPortingType>(_GetMobileNumberPortingType_QNAME, GetMobileNumberPortingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListMobileNumbers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "listMobileNumbers")
    public JAXBElement<ListMobileNumbers> createListMobileNumbers(ListMobileNumbers value) {
        return new JAXBElement<ListMobileNumbers>(_ListMobileNumbers_QNAME, ListMobileNumbers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMobileNumberStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "updateMobileNumberStateResponse")
    public JAXBElement<UpdateMobileNumberStateResponse> createUpdateMobileNumberStateResponse(UpdateMobileNumberStateResponse value) {
        return new JAXBElement<UpdateMobileNumberStateResponse>(_UpdateMobileNumberStateResponse_QNAME, UpdateMobileNumberStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "return", scope = UpdateMobileNumberStateResponse.class)
    public JAXBElement<MobileNumber> createUpdateMobileNumberStateResponseReturn(MobileNumber value) {
        return new JAXBElement<MobileNumber>(_UpdateMobileNumberStateResponseReturn_QNAME, MobileNumber.class, UpdateMobileNumberStateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileNumberQueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "return", scope = ListMobileNumbersResponse.class)
    public JAXBElement<MobileNumberQueryResult> createListMobileNumbersResponseReturn(MobileNumberQueryResult value) {
        return new JAXBElement<MobileNumberQueryResult>(_UpdateMobileNumberStateResponseReturn_QNAME, MobileNumberQueryResult.class, ListMobileNumbersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "return", scope = GetMobileNumberResponse.class)
    public JAXBElement<MobileNumber> createGetMobileNumberResponseReturn(MobileNumber value) {
        return new JAXBElement<MobileNumber>(_UpdateMobileNumberStateResponseReturn_QNAME, MobileNumber.class, GetMobileNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortingTypeReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", name = "return", scope = GetMobileNumberPortingTypeResponse.class)
    public JAXBElement<PortingTypeReference> createGetMobileNumberPortingTypeResponseReturn(PortingTypeReference value) {
        return new JAXBElement<PortingTypeReference>(_UpdateMobileNumberStateResponseReturn_QNAME, PortingTypeReference.class, GetMobileNumberPortingTypeResponse.class, value);
    }

}
