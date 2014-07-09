
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IMMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IMMessageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MSG_TYPE_NONE"/>
 *     &lt;enumeration value="MSG_TYPE_NEW_EVENT"/>
 *     &lt;enumeration value="MSG_TYPE_MOD_EVENT"/>
 *     &lt;enumeration value="MSG_TYPE_NEW_DATA"/>
 *     &lt;enumeration value="MSG_TYPE_OVERWRITE_DATA"/>
 *     &lt;enumeration value="MSG_TYPE_MOD_DATA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IMMessageType", namespace = "http://blueprint.bmc.com/ImapiTypes")
@XmlEnum
public enum IMMessageType {

    MSG_TYPE_NONE,
    MSG_TYPE_NEW_EVENT,
    MSG_TYPE_MOD_EVENT,
    MSG_TYPE_NEW_DATA,
    MSG_TYPE_OVERWRITE_DATA,
    MSG_TYPE_MOD_DATA;

    public String value() {
        return name();
    }

    public static IMMessageType fromValue(String v) {
        return valueOf(v);
    }

}
