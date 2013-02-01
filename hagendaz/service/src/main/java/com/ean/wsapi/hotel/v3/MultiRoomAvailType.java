
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiRoomAvailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultiRoomAvailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_SUPPPORTED"/>
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="STRICT"/>
 *     &lt;enumeration value="RELAXED"/>
 *     &lt;enumeration value="ENHANCED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultiRoomAvailType")
@XmlEnum
public enum MultiRoomAvailType {

    NOT_SUPPPORTED,
    BASIC,
    STRICT,
    RELAXED,
    ENHANCED;

    public String value() {
        return name();
    }

    public static MultiRoomAvailType fromValue(String v) {
        return valueOf(v);
    }

}
