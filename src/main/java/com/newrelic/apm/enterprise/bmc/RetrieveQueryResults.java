
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
 *         &lt;element name="retrieveResultHandle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num_of_events" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "retrieveResultHandle",
    "startIndex",
    "timeout",
    "numOfEvents"
})
@XmlRootElement(name = "RetrieveQueryResults")
public class RetrieveQueryResults {

    @XmlElement(required = true, nillable = true)
    protected String retrieveResultHandle;
    protected long startIndex;
    protected int timeout;
    @XmlElement(name = "num_of_events")
    protected int numOfEvents;

    /**
     * Gets the value of the retrieveResultHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrieveResultHandle() {
        return retrieveResultHandle;
    }

    /**
     * Sets the value of the retrieveResultHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrieveResultHandle(String value) {
        this.retrieveResultHandle = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public long getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(long value) {
        this.startIndex = value;
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

    /**
     * Gets the value of the numOfEvents property.
     * 
     */
    public int getNumOfEvents() {
        return numOfEvents;
    }

    /**
     * Sets the value of the numOfEvents property.
     * 
     */
    public void setNumOfEvents(int value) {
        this.numOfEvents = value;
    }

}
