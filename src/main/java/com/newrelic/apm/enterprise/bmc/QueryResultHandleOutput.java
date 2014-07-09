
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
 *         &lt;element name="resultCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "resultCount"
})
@XmlRootElement(name = "QueryResultHandle_output")
public class QueryResultHandleOutput {

    @XmlElement(required = true, nillable = true)
    protected String resultHandle;
    protected long resultCount;

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
     * Gets the value of the resultCount property.
     * 
     */
    public long getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(long value) {
        this.resultCount = value;
    }

}
