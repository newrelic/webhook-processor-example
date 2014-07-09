
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
 *         &lt;element name="results" type="{http://blueprint.bmc.com/BasicTypes}TableOf_NameValue"/>
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
    "results",
    "numOfEvents"
})
@XmlRootElement(name = "RetrieveQueryResults_output")
public class RetrieveQueryResultsOutput {

    @XmlElement(required = true)
    protected TableOfNameValue results;
    @XmlElement(name = "num_of_events")
    protected int numOfEvents;

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfNameValue }
     *     
     */
    public TableOfNameValue getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfNameValue }
     *     
     */
    public void setResults(TableOfNameValue value) {
        this.results = value;
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
