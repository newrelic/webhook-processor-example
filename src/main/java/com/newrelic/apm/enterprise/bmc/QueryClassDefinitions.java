
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
 *         &lt;element name="queryMode" type="{http://blueprint.bmc.com/ImapiTypes}QueryMode"/>
 *         &lt;element name="baseClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="classOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "queryMode",
    "baseClass",
    "className",
    "classOnly"
})
@XmlRootElement(name = "QueryClassDefinitions")
public class QueryClassDefinitions {

    @XmlElement(required = true, nillable = true)
    protected String imname;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected QueryMode queryMode;
    @XmlElement(required = true, nillable = true)
    protected String baseClass;
    @XmlElement(required = true, nillable = true)
    protected String className;
    protected boolean classOnly;

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
     * Gets the value of the queryMode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryMode }
     *     
     */
    public QueryMode getQueryMode() {
        return queryMode;
    }

    /**
     * Sets the value of the queryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryMode }
     *     
     */
    public void setQueryMode(QueryMode value) {
        this.queryMode = value;
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
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the classOnly property.
     * 
     */
    public boolean isClassOnly() {
        return classOnly;
    }

    /**
     * Sets the value of the classOnly property.
     * 
     */
    public void setClassOnly(boolean value) {
        this.classOnly = value;
    }

}
