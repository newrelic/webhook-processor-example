
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOf_SMComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_SMComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SMComponent_element" type="{http://blueprint.bmc.com/ImapiTypes}SMComponent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_SMComponent", namespace = "http://blueprint.bmc.com/ImapiTypes", propOrder = {
    "smComponentElement"
})
public class ArrayOfSMComponent {

    @XmlElement(name = "SMComponent_element")
    protected List<SMComponent> smComponentElement;

    /**
     * Gets the value of the smComponentElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smComponentElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSMComponentElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SMComponent }
     * 
     * 
     */
    public List<SMComponent> getSMComponentElement() {
        if (smComponentElement == null) {
            smComponentElement = new ArrayList<SMComponent>();
        }
        return this.smComponentElement;
    }

}
