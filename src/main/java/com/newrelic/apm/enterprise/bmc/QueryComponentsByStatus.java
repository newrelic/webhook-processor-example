
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
 *         &lt;element name="lStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="baseClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="getSubclasses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="slotsList" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "lStatus",
    "hStatus",
    "baseClass",
    "getSubclasses",
    "slotsList"
})
@XmlRootElement(name = "QueryComponentsByStatus")
public class QueryComponentsByStatus {

    @XmlElement(required = true, nillable = true)
    protected String imname;
    @XmlElement(required = true, nillable = true)
    protected String lStatus;
    @XmlElement(required = true, nillable = true)
    protected String hStatus;
    @XmlElement(required = true, nillable = true)
    protected String baseClass;
    protected boolean getSubclasses;
    @XmlElement(required = true, nillable = true)
    protected String slotsList;

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
     * Gets the value of the lStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLStatus() {
        return lStatus;
    }

    /**
     * Sets the value of the lStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLStatus(String value) {
        this.lStatus = value;
    }

    /**
     * Gets the value of the hStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHStatus() {
        return hStatus;
    }

    /**
     * Sets the value of the hStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHStatus(String value) {
        this.hStatus = value;
    }

    /**
     * Gets the value of the baseClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseClass() {
        return baseClass;
    }

    /**
     * Sets the value of the baseClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseClass(String value) {
        this.baseClass = value;
    }

    /**
     * Gets the value of the getSubclasses property.
     * 
     */
    public boolean isGetSubclasses() {
        return getSubclasses;
    }

    /**
     * Sets the value of the getSubclasses property.
     * 
     */
    public void setGetSubclasses(boolean value) {
        this.getSubclasses = value;
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

}
