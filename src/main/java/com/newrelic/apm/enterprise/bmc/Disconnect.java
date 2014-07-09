
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="deleteBuffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "deleteBuffer"
})
@XmlRootElement(name = "Disconnect")
public class Disconnect {

    protected long connection;
    protected boolean deleteBuffer;

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
     * Gets the value of the deleteBuffer property.
     * 
     */
    public boolean isDeleteBuffer() {
        return deleteBuffer;
    }

    /**
     * Sets the value of the deleteBuffer property.
     * 
     */
    public void setDeleteBuffer(boolean value) {
        this.deleteBuffer = value;
    }

}
