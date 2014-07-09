
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
 *         &lt;element name="CellInfo_Array" type="{http://blueprint.bmc.com/ImapiTypes}ArrayOf_CellInfo"/>
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
    "cellInfoArray"
})
@XmlRootElement(name = "GetCellInfo_output")
public class GetCellInfoOutput {

    @XmlElement(name = "CellInfo_Array", required = true)
    protected ArrayOfCellInfo cellInfoArray;

    /**
     * Gets the value of the cellInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCellInfo }
     *     
     */
    public ArrayOfCellInfo getCellInfoArray() {
        return cellInfoArray;
    }

    /**
     * Sets the value of the cellInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCellInfo }
     *     
     */
    public void setCellInfoArray(ArrayOfCellInfo value) {
        this.cellInfoArray = value;
    }

}
