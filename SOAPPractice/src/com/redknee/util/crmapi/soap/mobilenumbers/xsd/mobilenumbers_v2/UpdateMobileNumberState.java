
package com.redknee.util.crmapi.soap.mobilenumbers.xsd.mobilenumbers_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.redknee.util.crmapi.soap.common.xsd._2008._08.GenericParameter;
import com.redknee.util.crmapi.soap.common.xsd._2011._05.CRMRequestHeader;


/**
 * <p>Java class for updateMobileNumberState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateMobileNumberState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://soap.crmapi.util.redknee.com/common/xsd/2011/05}CRMRequestHeader"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newState" type="{http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07}MobileNumberState"/>
 *         &lt;element name="parameters" type="{http://soap.crmapi.util.redknee.com/common/xsd/2008/08}GenericParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMobileNumberState", propOrder = {
    "header",
    "identifier",
    "newState",
    "parameters"
})
public class UpdateMobileNumberState {

    @XmlElement(required = true)
    protected CRMRequestHeader header;
    @XmlElement(required = true)
    protected String identifier;
    protected long newState;
    @XmlElement(nillable = true)
    protected List<GenericParameter> parameters;

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

    /**
     * Gets the value of the newState property.
     * 
     */
    public long getNewState() {
        return newState;
    }

    /**
     * Sets the value of the newState property.
     * 
     */
    public void setNewState(long value) {
        this.newState = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericParameter }
     * 
     * 
     */
    public List<GenericParameter> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<GenericParameter>();
        }
        return this.parameters;
    }

}
