
package com.redknee.util.crmapi.soap.common.xsd._2008._08;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overallResult" type="{http://soap.crmapi.util.redknee.com/common/xsd/2008/08}BatchResultType" minOccurs="0"/>
 *         &lt;element name="numberOfRequests" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfSuccesses" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResults", propOrder = {
    "overallResult",
    "numberOfRequests",
    "numberOfSuccesses"
})
public class BatchResults {

    @XmlElementRef(name = "overallResult", namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> overallResult;
    @XmlElementRef(name = "numberOfRequests", namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfRequests;
    @XmlElementRef(name = "numberOfSuccesses", namespace = "http://soap.crmapi.util.redknee.com/common/xsd/2008/08", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfSuccesses;

    /**
     * Gets the value of the overallResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOverallResult() {
        return overallResult;
    }

    /**
     * Sets the value of the overallResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOverallResult(JAXBElement<Long> value) {
        this.overallResult = value;
    }

    /**
     * Gets the value of the numberOfRequests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfRequests() {
        return numberOfRequests;
    }

    /**
     * Sets the value of the numberOfRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfRequests(JAXBElement<Integer> value) {
        this.numberOfRequests = value;
    }

    /**
     * Gets the value of the numberOfSuccesses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfSuccesses() {
        return numberOfSuccesses;
    }

    /**
     * Sets the value of the numberOfSuccesses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfSuccesses(JAXBElement<Integer> value) {
        this.numberOfSuccesses = value;
    }

}
