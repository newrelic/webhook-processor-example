
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TableOf_NameValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableOf_NameValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameValueArray_element" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_NameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableOf_NameValue", namespace = "http://blueprint.bmc.com/BasicTypes", propOrder = {
    "nameValueArrayElement"
})
public class TableOfNameValue {

    @XmlElement(name = "NameValueArray_element")
    protected List<ArrayOfNameValue> nameValueArrayElement;

    /**
     * Gets the value of the nameValueArrayElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValueArrayElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValueArrayElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfNameValue }
     * 
     * 
     */
    public List<ArrayOfNameValue> getNameValueArrayElement() {
        if (nameValueArrayElement == null) {
            nameValueArrayElement = new ArrayList<ArrayOfNameValue>();
        }
        return this.nameValueArrayElement;
    }

}
