
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveQueryResultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveQueryResultResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://blueprint.bmc.com/BasicTypes}TableOf_NameValue"/>
 *         &lt;element name="num_of_results" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveQueryResultResponse", namespace = "http://blueprint.bmc.com/ImapiTypes", propOrder = {
    "response",
    "numOfResults"
})
public class RetrieveQueryResultResponse {

    @XmlElement(required = true)
    protected TableOfNameValue response;
    @XmlElement(name = "num_of_results")
    protected int numOfResults;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link TableOfNameValue }
     *     
     */
    public TableOfNameValue getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOfNameValue }
     *     
     */
    public void setResponse(TableOfNameValue value) {
        this.response = value;
    }

    /**
     * Gets the value of the numOfResults property.
     * 
     */
    public int getNumOfResults() {
        return numOfResults;
    }

    /**
     * Sets the value of the numOfResults property.
     * 
     */
    public void setNumOfResults(int value) {
        this.numOfResults = value;
    }

}
