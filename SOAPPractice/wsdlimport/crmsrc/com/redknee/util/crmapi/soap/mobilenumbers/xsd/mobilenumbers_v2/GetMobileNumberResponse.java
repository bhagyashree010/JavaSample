
package com.redknee.util.crmapi.soap.mobilenumbers.xsd.mobilenumbers_v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07.MobileNumber;


/**
 * <p>Java class for getMobileNumberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMobileNumberResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07}MobileNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMobileNumberResponse", propOrder = {
    "_return"
})
public class GetMobileNumberResponse {

    @XmlElementRef(name = "return", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/MobileNumbers-v2.0", type = JAXBElement.class, required = false)
    protected JAXBElement<MobileNumber> _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MobileNumber }{@code >}
     *     
     */
    public JAXBElement<MobileNumber> getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MobileNumber }{@code >}
     *     
     */
    public void setReturn(JAXBElement<MobileNumber> value) {
        this._return = value;
    }

}
