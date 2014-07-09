
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
 *         &lt;element name="classDefs" type="{http://blueprint.bmc.com/ImapiTypes}ArrayOf_ClassDefInfo"/>
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
    "classDefs"
})
@XmlRootElement(name = "QueryClassDefinitions_output")
public class QueryClassDefinitionsOutput {

    @XmlElement(required = true)
    protected ArrayOfClassDefInfo classDefs;

    /**
     * Gets the value of the classDefs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClassDefInfo }
     *     
     */
    public ArrayOfClassDefInfo getClassDefs() {
        return classDefs;
    }

    /**
     * Sets the value of the classDefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClassDefInfo }
     *     
     */
    public void setClassDefs(ArrayOfClassDefInfo value) {
        this.classDefs = value;
    }

}
