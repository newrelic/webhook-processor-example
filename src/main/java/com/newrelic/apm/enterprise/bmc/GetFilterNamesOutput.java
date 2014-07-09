
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
 *         &lt;element name="StringArray" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_String"/>
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
    "stringArray"
})
@XmlRootElement(name = "GetFilterNames_output")
public class GetFilterNamesOutput {

    @XmlElement(name = "StringArray", required = true)
    protected ArrayOfString stringArray;

    /**
     * Gets the value of the stringArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getStringArray() {
        return stringArray;
    }

    /**
     * Sets the value of the stringArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setStringArray(ArrayOfString value) {
        this.stringArray = value;
    }

}
