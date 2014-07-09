
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
 *         &lt;element name="setOrCleared" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modeToSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "setOrCleared",
    "modeToSet",
    "comment"
})
@XmlRootElement(name = "SetMaintenanceMode")
public class SetMaintenanceMode {

    @XmlElement(required = true, nillable = true)
    protected String imname;
    @XmlElement(required = true, nillable = true)
    protected String componentId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer setOrCleared;
    @XmlElement(required = true, nillable = true)
    protected String modeToSet;
    @XmlElement(required = true, nillable = true)
    protected String comment;

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
     * Gets the value of the setOrCleared property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSetOrCleared() {
        return setOrCleared;
    }

    /**
     * Sets the value of the setOrCleared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSetOrCleared(Integer value) {
        this.setOrCleared = value;
    }

    /**
     * Gets the value of the modeToSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeToSet() {
        return modeToSet;
    }

    /**
     * Sets the value of the modeToSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeToSet(String value) {
        this.modeToSet = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
