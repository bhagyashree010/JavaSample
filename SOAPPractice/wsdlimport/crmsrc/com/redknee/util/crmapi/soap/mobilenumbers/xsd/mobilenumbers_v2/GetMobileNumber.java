
package com.redknee.util.crmapi.soap.mobilenumbers.xsd.mobilenumbers_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.redknee.util.crmapi.soap.common.xsd._2011._05.CRMRequestHeader;


/**
 * <p>Java class for getMobileNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMobileNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://soap.crmapi.util.redknee.com/common/xsd/2011/05}CRMRequestHeader"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMobileNumber", propOrder = {
    "header",
    "identifier"
})
public class GetMobileNumber {

    @XmlElement(required = true)
    protected CRMRequestHeader header;
    @XmlElement(required = true)
    protected String identifier;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link CRMRequestHeader }
     *     
     */
    public CRMRequestHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMRequestHeader }
     *     
     */
    public void setHeader(CRMRequestHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
