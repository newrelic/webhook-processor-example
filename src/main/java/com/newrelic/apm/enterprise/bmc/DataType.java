
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BYTE"/>
 *     &lt;enumeration value="SHORT"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="DOUBLE"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="BYTE_ARRAY"/>
 *     &lt;enumeration value="SHORT_ARRAY"/>
 *     &lt;enumeration value="INT_ARRAY"/>
 *     &lt;enumeration value="LONG_ARRAY"/>
 *     &lt;enumeration value="FLOAT_ARRAY"/>
 *     &lt;enumeration value="DOUBLE_ARRAY"/>
 *     &lt;enumeration value="STRING_ARRAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataType", namespace = "http://blueprint.bmc.com/BasicTypes")
@XmlEnum
public enum DataType {

    BYTE,
    SHORT,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    STRING,
    BYTE_ARRAY,
    SHORT_ARRAY,
    INT_ARRAY,
    LONG_ARRAY,
    FLOAT_ARRAY,
    DOUBLE_ARRAY,
    STRING_ARRAY;

    public String value() {
        return name();
    }

    public static DataType fromValue(String v) {
        return valueOf(v);
    }

}
