
package com.redknee.util.crmapi.soap.common.xsd.common_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.redknee.util.crmapi.soap.common.xsd._2011._05.ExecuteResult;


/**
 * <p>Java class for executeResultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeResultResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://soap.crmapi.util.redknee.com/common/xsd/2011/05}ExecuteResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeResultResponse", propOrder = {
    "result"
})
public class ExecuteResultResponse {

    @XmlElement(required = true)
    protected ExecuteResult result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteResult }
     *     
     */
    public ExecuteResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteResult }
     *     
     */
    public void setResult(ExecuteResult value) {
        this.result = value;
    }

}
