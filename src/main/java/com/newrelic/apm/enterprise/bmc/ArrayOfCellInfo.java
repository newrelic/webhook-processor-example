
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOf_CellInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_CellInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CellInfo_element" type="{http://blueprint.bmc.com/ImapiTypes}CellInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_CellInfo", namespace = "http://blueprint.bmc.com/ImapiTypes", propOrder = {
    "cellInfoElement"
})
public class ArrayOfCellInfo {

    @XmlElement(name = "CellInfo_element")
    protected List<CellInfo> cellInfoElement;

    /**
     * Gets the value of the cellInfoElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellInfoElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellInfoElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellInfo }
     * 
     * 
     */
    public List<CellInfo> getCellInfoElement() {
        if (cellInfoElement == null) {
            cellInfoElement = new ArrayList<CellInfo>();
        }
        return this.cellInfoElement;
    }

}
