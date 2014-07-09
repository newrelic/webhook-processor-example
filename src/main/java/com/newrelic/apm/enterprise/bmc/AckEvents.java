
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
 *         &lt;element name="filterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="context_nio" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "filterName",
    "contextNio",
    "numOfEvents"
})
@XmlRootElement(name = "AckEvents")
public class AckEvents {

    @XmlElement(required = true, nillable = true)
    protected String filterName;
    @XmlElement(name = "context_nio", required = true, nillable = true)
    protected String contextNio;
    @XmlElement(name = "num_of_events")
    protected int numOfEvents;

    /**
     * Gets the value of the filterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * Sets the value of the filterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName(String value) {
        this.filterName = value;
    }

    /**
     * Gets the value of the contextNio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextNio() {
        return contextNio;
    }

    /**
     * Sets the value of the contextNio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextNio(String value) {
        this.contextNio = value;
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
