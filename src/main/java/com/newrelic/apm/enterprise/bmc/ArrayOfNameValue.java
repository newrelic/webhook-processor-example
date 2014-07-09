
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOf_NameValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_NameValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameValue_element" type="{http://blueprint.bmc.com/BasicTypes}NameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_NameValue", namespace = "http://blueprint.bmc.com/BasicTypes", propOrder = {
    "nameValueElement"
})
@XmlSeeAlso({
    Event.class,
    SMComponent.class
})
public class ArrayOfNameValue {

    @XmlElement(name = "NameValue_element")
    protected List<NameValue> nameValueElement;

    /**
     * Gets the value of the nameValueElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValueElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValueElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getNameValueElement() {
        if (nameValueElement == null) {
            nameValueElement = new ArrayList<NameValue>();
        }
        return this.nameValueElement;
    }

}
