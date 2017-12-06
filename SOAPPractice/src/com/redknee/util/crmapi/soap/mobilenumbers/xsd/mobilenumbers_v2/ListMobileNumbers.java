
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
 * <p>Java class for listMobileNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listMobileNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://soap.crmapi.util.redknee.com/common/xsd/2011/05}CRMRequestHeader"/>
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="state" type="{http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07}MobileNumberState" minOccurs="0"/>
 *         &lt;element name="pageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isAscending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://soap.crmapi.util.redknee.com/common/xsd/2008/08}GenericParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paidType" type="{http://soap.crmapi.util.redknee.com/common/xsd/2008/08}PaidType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listMobileNumbers", propOrder = {
    "header",
    "groupID",
    "state",
    "pageKey",
    "limit",
    "isAscending",
    "parameters",
    "paidType"
})
public class ListMobileNumbers {

    @XmlElement(required = true)
    protected CRMRequestHeader header;
    protected long groupID;
    protected Long state;
    protected String pageKey;
    protected int limit;
    @XmlElement(defaultValue = "true")
    protected Boolean isAscending;
    @XmlElement(nillable = true)
    protected List<GenericParameter> parameters;
    protected Long paidType;

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
     * Gets the value of the groupID property.
     * 
     */
    public long getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     */
    public void setGroupID(long value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setState(Long value) {
        this.state = value;
    }

    /**
     * Gets the value of the pageKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageKey() {
        return pageKey;
    }

    /**
     * Sets the value of the pageKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageKey(String value) {
        this.pageKey = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * Gets the value of the isAscending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAscending() {
        return isAscending;
    }

    /**
     * Sets the value of the isAscending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAscending(Boolean value) {
        this.isAscending = value;
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

    /**
     * Gets the value of the paidType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaidType() {
        return paidType;
    }

    /**
     * Sets the value of the paidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaidType(Long value) {
        this.paidType = value;
    }

}
