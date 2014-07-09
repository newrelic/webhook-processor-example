
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
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bufferType" type="{http://blueprint.bmc.com/ImapiTypes}IMBufferType"/>
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
    "userName",
    "password",
    "imname",
    "bufferType"
})
@XmlRootElement(name = "Connect")
public class Connect {

    @XmlElement(required = true, nillable = true)
    protected String userName;
    @XmlElement(required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected String imname;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected IMBufferType bufferType;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

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
     * Gets the value of the bufferType property.
     * 
     * @return
     *     possible object is
     *     {@link IMBufferType }
     *     
     */
    public IMBufferType getBufferType() {
        return bufferType;
    }

    /**
     * Sets the value of the bufferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMBufferType }
     *     
     */
    public void setBufferType(IMBufferType value) {
        this.bufferType = value;
    }

}
