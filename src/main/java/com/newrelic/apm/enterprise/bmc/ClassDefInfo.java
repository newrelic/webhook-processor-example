
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassDefInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassDefInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="class_parent_idx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="class_child_cnt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="class_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="child_idx" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_Int"/>
 *         &lt;element name="slots_count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="slots_list" type="{http://blueprint.bmc.com/ImapiTypes}ArrayOf_SlotDefInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassDefInfo", namespace = "http://blueprint.bmc.com/ImapiTypes", propOrder = {
    "classParentIdx",
    "classChildCnt",
    "className",
    "childIdx",
    "slotsCount",
    "slotsList"
})
public class ClassDefInfo {

    @XmlElement(name = "class_parent_idx")
    protected int classParentIdx;
    @XmlElement(name = "class_child_cnt")
    protected int classChildCnt;
    @XmlElement(name = "class_name", required = true)
    protected String className;
    @XmlElement(name = "child_idx", required = true)
    protected ArrayOfInt childIdx;
    @XmlElement(name = "slots_count")
    protected int slotsCount;
    @XmlElement(name = "slots_list", required = true)
    protected ArrayOfSlotDefInfo slotsList;

    /**
     * Gets the value of the classParentIdx property.
     * 
     */
    public int getClassParentIdx() {
        return classParentIdx;
    }

    /**
     * Sets the value of the classParentIdx property.
     * 
     */
    public void setClassParentIdx(int value) {
        this.classParentIdx = value;
    }

    /**
     * Gets the value of the classChildCnt property.
     * 
     */
    public int getClassChildCnt() {
        return classChildCnt;
    }

    /**
     * Sets the value of the classChildCnt property.
     * 
     */
    public void setClassChildCnt(int value) {
        this.classChildCnt = value;
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
     * Gets the value of the childIdx property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getChildIdx() {
        return childIdx;
    }

    /**
     * Sets the value of the childIdx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setChildIdx(ArrayOfInt value) {
        this.childIdx = value;
    }

    /**
     * Gets the value of the slotsCount property.
     * 
     */
    public int getSlotsCount() {
        return slotsCount;
    }

    /**
     * Sets the value of the slotsCount property.
     * 
     */
    public void setSlotsCount(int value) {
        this.slotsCount = value;
    }

    /**
     * Gets the value of the slotsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSlotDefInfo }
     *     
     */
    public ArrayOfSlotDefInfo getSlotsList() {
        return slotsList;
    }

    /**
     * Sets the value of the slotsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSlotDefInfo }
     *     
     */
    public void setSlotsList(ArrayOfSlotDefInfo value) {
        this.slotsList = value;
    }

}
