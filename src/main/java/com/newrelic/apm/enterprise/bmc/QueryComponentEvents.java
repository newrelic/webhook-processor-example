
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
 *         &lt;element name="imname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="componentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slotsList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onlyImpacted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "imname",
    "componentId",
    "slotsList",
    "onlyImpacted"
})
@XmlRootElement(name = "QueryComponentEvents")
public class QueryComponentEvents {

    @XmlElement(required = true, nillable = true)
    protected String imname;
    @XmlElement(required = true, nillable = true)
    protected String componentId;
    @XmlElement(required = true, nillable = true)
    protected String slotsList;
    protected boolean onlyImpacted;

    /**
     * Gets the value of the imname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImname() {
        return imname;
    }

    /**
     * Sets the value of the imname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImname(String value) {
        this.imname = value;
    }

    /**
     * Gets the value of the componentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentId() {
        return componentId;
    }

    /**
     * Sets the value of the componentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentId(String value) {
        this.componentId = value;
    }

    /**
     * Gets the value of the slotsList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotsList() {
        return slotsList;
    }

    /**
     * Sets the value of the slotsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotsList(String value) {
        this.slotsList = value;
    }

    /**
     * Gets the value of the onlyImpacted property.
     * 
     */
    public boolean isOnlyImpacted() {
        return onlyImpacted;
    }

    /**
     * Sets the value of the onlyImpacted property.
     * 
     */
    public void setOnlyImpacted(boolean value) {
        this.onlyImpacted = value;
    }

}
