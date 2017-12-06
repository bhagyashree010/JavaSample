
package com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileNumberReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileNumberReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paidType" type="{http://soap.crmapi.util.redknee.com/common/xsd/2008/08}PaidType" minOccurs="0"/>
 *         &lt;element name="spid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="state" type="{http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07}MobileNumberState" minOccurs="0"/>
 *         &lt;element name="technology" type="{http://soap.crmapi.util.redknee.com/common/xsd/2008/08}TechnologyType" minOccurs="0"/>
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileNumberReference", propOrder = {
    "groupID",
    "identifier",
    "paidType",
    "spid",
    "state",
    "technology",
    "feeAmount"
})
@XmlSeeAlso({
    MobileNumber.class
})
public class MobileNumberReference {

    @XmlElementRef(name = "groupID", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> groupID;
    @XmlElementRef(name = "identifier", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "paidType", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> paidType;
    @XmlElementRef(name = "spid", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> spid;
    @XmlElementRef(name = "state", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> state;
    @XmlElementRef(name = "technology", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> technology;
    @XmlElementRef(name = "feeAmount", namespace = "http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> feeAmount;

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setGroupID(JAXBElement<Long> value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the paidType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPaidType() {
        return paidType;
    }

    /**
     * Sets the value of the paidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPaidType(JAXBElement<Long> value) {
        this.paidType = value;
    }

    /**
     * Gets the value of the spid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSpid() {
        return spid;
    }

    /**
     * Sets the value of the spid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSpid(JAXBElement<Integer> value) {
        this.spid = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setState(JAXBElement<Long> value) {
        this.state = value;
    }

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTechnology() {
        return technology;
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTechnology(JAXBElement<Long> value) {
        this.technology = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setFeeAmount(JAXBElement<Long> value) {
        this.feeAmount = value;
    }

}
