
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CellInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cell_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cell_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cell_hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="encryption_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trusted_servers" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellInfo", namespace = "http://blueprint.bmc.com/ImapiTypes", propOrder = {
    "cellName",
    "cellType",
    "cellHostname",
    "port",
    "encryptionKey",
    "trustedServers"
})
public class CellInfo {

    @XmlElement(name = "cell_name", required = true)
    protected String cellName;
    @XmlElement(name = "cell_type", required = true)
    protected String cellType;
    @XmlElement(name = "cell_hostname", required = true)
    protected String cellHostname;
    @XmlSchemaType(name = "unsignedInt")
    protected long port;
    @XmlElement(name = "encryption_key", required = true)
    protected String encryptionKey;
    @XmlElement(name = "trusted_servers", required = true)
    protected String trustedServers;

    /**
     * Gets the value of the cellName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellName() {
        return cellName;
    }

    /**
     * Sets the value of the cellName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellName(String value) {
        this.cellName = value;
    }

    /**
     * Gets the value of the cellType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellType() {
        return cellType;
    }

    /**
     * Sets the value of the cellType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellType(String value) {
        this.cellType = value;
    }

    /**
     * Gets the value of the cellHostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellHostname() {
        return cellHostname;
    }

    /**
     * Sets the value of the cellHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellHostname(String value) {
        this.cellHostname = value;
    }

    /**
     * Gets the value of the port property.
     * 
     */
    public long getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     */
    public void setPort(long value) {
        this.port = value;
    }

    /**
     * Gets the value of the encryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Sets the value of the encryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
    }

    /**
     * Gets the value of the trustedServers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrustedServers() {
        return trustedServers;
    }

    /**
     * Sets the value of the trustedServers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrustedServers(String value) {
        this.trustedServers = value;
    }

}
