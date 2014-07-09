
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bCompChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bCompDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bRelChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bRelDelete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateChangeType", namespace = "http://blueprint.bmc.com/ImapiTypes", propOrder = {
    "bCompChange",
    "bCompDelete",
    "bRelChange",
    "bRelDelete",
    "bAll"
})
public class StateChangeType {

    protected boolean bCompChange;
    protected boolean bCompDelete;
    protected boolean bRelChange;
    protected boolean bRelDelete;
    protected boolean bAll;

    /**
     * Gets the value of the bCompChange property.
     * 
     */
    public boolean isBCompChange() {
        return bCompChange;
    }

    /**
     * Sets the value of the bCompChange property.
     * 
     */
    public void setBCompChange(boolean value) {
        this.bCompChange = value;
    }

    /**
     * Gets the value of the bCompDelete property.
     * 
     */
    public boolean isBCompDelete() {
        return bCompDelete;
    }

    /**
     * Sets the value of the bCompDelete property.
     * 
     */
    public void setBCompDelete(boolean value) {
        this.bCompDelete = value;
    }

    /**
     * Gets the value of the bRelChange property.
     * 
     */
    public boolean isBRelChange() {
        return bRelChange;
    }

    /**
     * Sets the value of the bRelChange property.
     * 
     */
    public void setBRelChange(boolean value) {
        this.bRelChange = value;
    }

    /**
     * Gets the value of the bRelDelete property.
     * 
     */
    public boolean isBRelDelete() {
        return bRelDelete;
    }

    /**
     * Sets the value of the bRelDelete property.
     * 
     */
    public void setBRelDelete(boolean value) {
        this.bRelDelete = value;
    }

    /**
     * Gets the value of the bAll property.
     * 
     */
    public boolean isBAll() {
        return bAll;
    }

    /**
     * Sets the value of the bAll property.
     * 
     */
    public void setBAll(boolean value) {
        this.bAll = value;
    }

}
