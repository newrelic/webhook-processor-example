
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cmpStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="impStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="manStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CStatus", namespace = "http://blueprint.bmc.com/ImapiTypes", propOrder = {
    "cmpStatus",
    "impStatus",
    "manStatus",
    "subStatus"
})
public class CStatus {

    @XmlElement(required = true)
    protected String cmpStatus;
    @XmlElement(required = true)
    protected String impStatus;
    @XmlElement(required = true)
    protected String manStatus;
    @XmlElement(required = true)
    protected String subStatus;

    /**
     * Gets the value of the cmpStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmpStatus() {
        return cmpStatus;
    }

    /**
     * Sets the value of the cmpStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmpStatus(String value) {
        this.cmpStatus = value;
    }

    /**
     * Gets the value of the impStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpStatus() {
        return impStatus;
    }

    /**
     * Sets the value of the impStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpStatus(String value) {
        this.impStatus = value;
    }

    /**
     * Gets the value of the manStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManStatus() {
        return manStatus;
    }

    /**
     * Sets the value of the manStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManStatus(String value) {
        this.manStatus = value;
    }

    /**
     * Gets the value of the subStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

}
