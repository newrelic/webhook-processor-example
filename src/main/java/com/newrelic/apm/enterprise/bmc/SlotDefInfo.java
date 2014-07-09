
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SlotDefInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlotDefInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="slot_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slot_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slot_rep_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slot_flags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slot_def_val" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlotDefInfo", namespace = "http://blueprint.bmc.com/ImapiTypes", propOrder = {
    "slotName",
    "slotType",
    "slotRepType",
    "slotFlags",
    "slotDefVal"
})
public class SlotDefInfo {

    @XmlElement(name = "slot_name", required = true)
    protected String slotName;
    @XmlElement(name = "slot_type", required = true)
    protected String slotType;
    @XmlElement(name = "slot_rep_type", required = true)
    protected String slotRepType;
    @XmlElement(name = "slot_flags", required = true)
    protected String slotFlags;
    @XmlElement(name = "slot_def_val", required = true)
    protected String slotDefVal;

    /**
     * Gets the value of the slotName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotName() {
        return slotName;
    }

    /**
     * Sets the value of the slotName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotName(String value) {
        this.slotName = value;
    }

    /**
     * Gets the value of the slotType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotType() {
        return slotType;
    }

    /**
     * Sets the value of the slotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotType(String value) {
        this.slotType = value;
    }

    /**
     * Gets the value of the slotRepType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotRepType() {
        return slotRepType;
    }

    /**
     * Sets the value of the slotRepType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotRepType(String value) {
        this.slotRepType = value;
    }

    /**
     * Gets the value of the slotFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotFlags() {
        return slotFlags;
    }

    /**
     * Sets the value of the slotFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotFlags(String value) {
        this.slotFlags = value;
    }

    /**
     * Gets the value of the slotDefVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotDefVal() {
        return slotDefVal;
    }

    /**
     * Sets the value of the slotDefVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotDefVal(String value) {
        this.slotDefVal = value;
    }

}
