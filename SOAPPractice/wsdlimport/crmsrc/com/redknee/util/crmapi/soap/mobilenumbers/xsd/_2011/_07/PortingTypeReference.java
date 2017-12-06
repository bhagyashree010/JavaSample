
package com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortingTypeReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortingTypeReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portingType" type="{http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07}PortingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortingTypeReference", propOrder = {
    "portingType"
})
public class PortingTypeReference {

    @XmlElementRef(name = "portingType", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> portingType;

    /**
     * Gets the value of the portingType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPortingType() {
        return portingType;
    }

    /**
     * Sets the value of the portingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPortingType(JAXBElement<Long> value) {
        this.portingType = value;
    }

}
