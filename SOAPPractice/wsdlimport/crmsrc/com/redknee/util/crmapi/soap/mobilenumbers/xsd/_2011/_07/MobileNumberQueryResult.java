
package com.redknee.util.crmapi.soap.mobilenumbers.xsd._2011._07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileNumberQueryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileNumberQueryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="references" type="{http://soap.crmapi.util.redknee.com/mobilenumbers/xsd/2011/07}MobileNumberReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileNumberQueryResult", propOrder = {
    "pageKey",
    "references"
})
public class MobileNumberQueryResult {

    protected String pageKey;
    @XmlElement(nillable = true)
    protected List<MobileNumberReference> references;

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
     * Gets the value of the references property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the references property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileNumberReference }
     * 
     * 
     */
    public List<MobileNumberReference> getReferences() {
        if (references == null) {
            references = new ArrayList<MobileNumberReference>();
        }
        return this.references;
    }

}
