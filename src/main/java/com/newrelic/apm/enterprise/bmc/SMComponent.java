
package com.newrelic.apm.enterprise.bmc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SMComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://blueprint.bmc.com/BasicTypes}ArrayOf_NameValue">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMComponent", namespace = "http://blueprint.bmc.com/ImapiTypes")
public class SMComponent
    extends ArrayOfNameValue
{


}
