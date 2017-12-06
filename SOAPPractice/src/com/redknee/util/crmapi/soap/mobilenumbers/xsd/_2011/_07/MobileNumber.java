
package com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MobileNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileNumber">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07}MobileNumberReference">
 *       &lt;sequence>
 *         &lt;element name="accountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscriberID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileNumber", propOrder = {
    "accountID",
    "subscriberID",
    "created",
    "lastModified"
})
public class MobileNumber
    extends MobileNumberReference
{

    @XmlElementRef(name = "accountID", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountID;
    @XmlElementRef(name = "subscriberID", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subscriberID;
    @XmlElementRef(name = "created", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> created;
    @XmlElementRef(name = "lastModified", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModified;

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountID(JAXBElement<String> value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the subscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubscriberID() {
        return subscriberID;
    }

    /**
     * Sets the value of the subscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubscriberID(JAXBElement<String> value) {
        this.subscriberID = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreated(JAXBElement<XMLGregorianCalendar> value) {
        this.created = value;
    }

    /**
     * Gets the value of the lastModified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModified(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModified = value;
    }

}
