
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiRoomResType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultiRoomResType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_SUPPPORTED"/>
 *     &lt;enumeration value="SERIAL"/>
 *     &lt;enumeration value="PARALLEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultiRoomResType")
@XmlEnum
public enum MultiRoomResType {

    NOT_SUPPPORTED,
    SERIAL,
    PARALLEL;

    public String value() {
        return name();
    }

    public static MultiRoomResType fromValue(String v) {
        return valueOf(v);
    }

}
