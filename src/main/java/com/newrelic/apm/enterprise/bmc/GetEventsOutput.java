
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
 *         &lt;element name="getEventsResponse" type="{http://blueprint.bmc.com/ImapiTypes}GetEventsResponse"/>
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
    "getEventsResponse"
})
@XmlRootElement(name = "GetEvents_output")
public class GetEventsOutput {

    @XmlElement(required = true, nillable = true)
    protected GetEventsResponse getEventsResponse;

    /**
     * Gets the value of the getEventsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetEventsResponse }
     *     
     */
    public GetEventsResponse getGetEventsResponse() {
        return getEventsResponse;
    }

    /**
     * Sets the value of the getEventsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEventsResponse }
     *     
     */
    public void setGetEventsResponse(GetEventsResponse value) {
        this.getEventsResponse = value;
    }

}
