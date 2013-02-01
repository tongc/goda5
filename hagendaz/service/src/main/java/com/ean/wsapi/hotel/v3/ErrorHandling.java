
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorHandling.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errorHandling">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="RECOVERABLE"/>
 *     &lt;enumeration value="UNRECOVERABLE"/>
 *     &lt;enumeration value="AGENT_ATTENTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "errorHandling")
@XmlEnum
public enum ErrorHandling {

    UNKNOWN,
    RECOVERABLE,
    UNRECOVERABLE,
    AGENT_ATTENTION;

    public String value() {
        return name();
    }

    public static ErrorHandling fromValue(String v) {
        return valueOf(v);
    }

}
