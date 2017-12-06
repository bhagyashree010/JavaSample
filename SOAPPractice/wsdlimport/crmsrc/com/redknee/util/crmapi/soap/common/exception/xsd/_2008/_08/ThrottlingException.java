
package com.redknee.util.crmapi.soap.common.exception.xsd._2008._08;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThrottlingException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThrottlingException">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08}CRMException">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThrottlingException", propOrder = {
    "rest"
})
public class ThrottlingException
    extends CRMException
{

    @XmlElementRef(name = "code", namespace = "http://soap.crmapi.util.redknee.com/common/exception/xsd/2008/08", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Long>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Code" is used by two different parts of a schema. See: 
     * line 77 of http://pun1lvm19:11648/RedkneeSoap_v3_0/services/MobileNumberService?xsd=Common_fault_types_1_0.xsd
     * line 6 of http://pun1lvm19:11648/RedkneeSoap_v3_0/services/MobileNumberService?xsd=Common_fault_types_1_0.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Long>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<Long>>();
        }
        return this.rest;
    }

}
