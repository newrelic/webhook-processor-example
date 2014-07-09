
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for value complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="value">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="byte_value" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="short_value" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="int_value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="long_value" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="float_value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="double_value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="string_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ByteArray" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_Byte"/>
 *         &lt;element name="ShortArray" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_Short"/>
 *         &lt;element name="IntArray" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_Int"/>
 *         &lt;element name="LongArray" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_Long"/>
 *         &lt;element name="FloatArray" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_Float"/>
 *         &lt;element name="DoubleArray" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_Double"/>
 *         &lt;element name="StringArray" type="{http://blueprint.bmc.com/BasicTypes}ArrayOf_String"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "value", namespace = "http://blueprint.bmc.com/BasicTypes", propOrder = {
    "byteValue",
    "shortValue",
    "intValue",
    "longValue",
    "floatValue",
    "doubleValue",
    "stringValue",
    "byteArray",
    "shortArray",
    "intArray",
    "longArray",
    "floatArray",
    "doubleArray",
    "stringArray"
})
public class Value {

    @XmlElement(name = "byte_value")
    protected Byte byteValue;
    @XmlElement(name = "short_value")
    protected Short shortValue;
    @XmlElement(name = "int_value")
    protected Integer intValue;
    @XmlElement(name = "long_value")
    protected Long longValue;
    @XmlElement(name = "float_value")
    protected Float floatValue;
    @XmlElement(name = "double_value")
    protected Double doubleValue;
    @XmlElement(name = "string_value")
    protected String stringValue;
    @XmlElement(name = "ByteArray")
    protected ArrayOfByte byteArray;
    @XmlElement(name = "ShortArray")
    protected ArrayOfShort shortArray;
    @XmlElement(name = "IntArray")
    protected ArrayOfInt intArray;
    @XmlElement(name = "LongArray")
    protected ArrayOfLong longArray;
    @XmlElement(name = "FloatArray")
    protected ArrayOfFloat floatArray;
    @XmlElement(name = "DoubleArray")
    protected ArrayOfDouble doubleArray;
    @XmlElement(name = "StringArray")
    protected ArrayOfString stringArray;

    /**
     * Gets the value of the byteValue property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getByteValue() {
        return byteValue;
    }

    /**
     * Sets the value of the byteValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setByteValue(Byte value) {
        this.byteValue = value;
    }

    /**
     * Gets the value of the shortValue property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getShortValue() {
        return shortValue;
    }

    /**
     * Sets the value of the shortValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setShortValue(Short value) {
        this.shortValue = value;
    }

    /**
     * Gets the value of the intValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntValue() {
        return intValue;
    }

    /**
     * Sets the value of the intValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntValue(Integer value) {
        this.intValue = value;
    }

    /**
     * Gets the value of the longValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongValue() {
        return longValue;
    }

    /**
     * Sets the value of the longValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongValue(Long value) {
        this.longValue = value;
    }

    /**
     * Gets the value of the floatValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFloatValue() {
        return floatValue;
    }

    /**
     * Sets the value of the floatValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFloatValue(Float value) {
        this.floatValue = value;
    }

    /**
     * Gets the value of the doubleValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * Sets the value of the doubleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoubleValue(Double value) {
        this.doubleValue = value;
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the byteArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfByte }
     *     
     */
    public ArrayOfByte getByteArray() {
        return byteArray;
    }

    /**
     * Sets the value of the byteArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfByte }
     *     
     */
    public void setByteArray(ArrayOfByte value) {
        this.byteArray = value;
    }

    /**
     * Gets the value of the shortArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShort }
     *     
     */
    public ArrayOfShort getShortArray() {
        return shortArray;
    }

    /**
     * Sets the value of the shortArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShort }
     *     
     */
    public void setShortArray(ArrayOfShort value) {
        this.shortArray = value;
    }

    /**
     * Gets the value of the intArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getIntArray() {
        return intArray;
    }

    /**
     * Sets the value of the intArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setIntArray(ArrayOfInt value) {
        this.intArray = value;
    }

    /**
     * Gets the value of the longArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getLongArray() {
        return longArray;
    }

    /**
     * Sets the value of the longArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setLongArray(ArrayOfLong value) {
        this.longArray = value;
    }

    /**
     * Gets the value of the floatArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFloat }
     *     
     */
    public ArrayOfFloat getFloatArray() {
        return floatArray;
    }

    /**
     * Sets the value of the floatArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFloat }
     *     
     */
    public void setFloatArray(ArrayOfFloat value) {
        this.floatArray = value;
    }

    /**
     * Gets the value of the doubleArray property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDouble }
     *     
     */
    public ArrayOfDouble getDoubleArray() {
        return doubleArray;
    }

    /**
     * Sets the value of the doubleArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDouble }
     *     
     */
    public void setDoubleArray(ArrayOfDouble value) {
        this.doubleArray = value;
    }

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
