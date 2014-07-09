
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BMCII_EVENT_CLASSES"/>
 *     &lt;enumeration value="BMCII_DATA_CLASSES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryMode", namespace = "http://blueprint.bmc.com/ImapiTypes")
@XmlEnum
public enum QueryMode {

    BMCII_EVENT_CLASSES,
    BMCII_DATA_CLASSES;

    public String value() {
        return name();
    }

    public static QueryMode fromValue(String v) {
        return valueOf(v);
    }

}
