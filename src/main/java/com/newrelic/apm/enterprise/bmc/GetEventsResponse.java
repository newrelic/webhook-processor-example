
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEventsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEventsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://blueprint.bmc.com/Event}ArrayOf_Event"/>
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
@XmlType(name = "GetEventsResponse", namespace = "http://blueprint.bmc.com/ImapiTypes", propOrder = {
    "response",
    "numOfEvents"
})
public class GetEventsResponse {

    @XmlElement(required = true)
    protected ArrayOfEvent response;
    @XmlElement(name = "num_of_events")
    protected int numOfEvents;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvent }
     *     
     */
    public ArrayOfEvent getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvent }
     *     
     */
    public void setResponse(ArrayOfEvent value) {
        this.response = value;
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
