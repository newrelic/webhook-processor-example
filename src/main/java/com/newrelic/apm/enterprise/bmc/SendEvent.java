
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
 *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="message" type="{http://blueprint.bmc.com/Event}Event"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageType" type="{http://blueprint.bmc.com/ImapiTypes}IMMessageType"/>
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
    "connection",
    "message",
    "timeout",
    "messageClass",
    "messageType"
})
@XmlRootElement(name = "SendEvent")
public class SendEvent {

    protected long connection;
    @XmlElement(required = true, nillable = true)
    protected Event message;
    protected int timeout;
    @XmlElement(required = true)
    protected String messageClass;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected IMMessageType messageType;

    /**
     * Gets the value of the connection property.
     * 
     */
    public long getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     */
    public void setConnection(long value) {
        this.connection = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setMessage(Event value) {
        this.message = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the messageClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageClass() {
        return messageClass;
    }

    /**
     * Sets the value of the messageClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageClass(String value) {
        this.messageClass = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link IMMessageType }
     *     
     */
    public IMMessageType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMMessageType }
     *     
     */
    public void setMessageType(IMMessageType value) {
        this.messageType = value;
    }

}
