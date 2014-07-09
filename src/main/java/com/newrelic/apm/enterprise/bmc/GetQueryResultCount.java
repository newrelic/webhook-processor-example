
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultHandle",
    "timeout"
})
@XmlRootElement(name = "GetQueryResultCount")
public class GetQueryResultCount {

    @XmlElement(required = true, nillable = true)
    protected String resultHandle;
    protected int timeout;

    /**
     * Gets the value of the resultHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultHandle() {
        return resultHandle;
    }

    /**
     * Sets the value of the resultHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultHandle(String value) {
        this.resultHandle = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

}
