
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMBufferType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IMBufferType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BMCII_BUFFER_MODE_DEFAULT"/>
 *     &lt;enumeration value="BMCII_BUFFER_MODE_NONE"/>
 *     &lt;enumeration value="BMCII_BUFFER_MODE_LOW"/>
 *     &lt;enumeration value="BMCII_BUFFER_MODE_HIGH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IMBufferType", namespace = "http://blueprint.bmc.com/ImapiTypes")
@XmlEnum
public enum IMBufferType {

    BMCII_BUFFER_MODE_DEFAULT,
    BMCII_BUFFER_MODE_NONE,
    BMCII_BUFFER_MODE_LOW,
    BMCII_BUFFER_MODE_HIGH;

    public String value() {
        return name();
    }

    public static IMBufferType fromValue(String v) {
        return valueOf(v);
    }

}
