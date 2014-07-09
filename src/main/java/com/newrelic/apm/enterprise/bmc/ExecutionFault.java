
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
 *         &lt;element name="IMFailure" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "imFailure"
})
@XmlRootElement(name = "execution_fault")
public class ExecutionFault {

    @XmlElement(name = "IMFailure", required = true, nillable = true)
    protected String imFailure;

    /**
     * Gets the value of the imFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMFailure() {
        return imFailure;
    }

    /**
     * Sets the value of the imFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMFailure(String value) {
        this.imFailure = value;
    }

}
