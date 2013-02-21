
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hotelInfoOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="hotelInfoOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="HOTEL_SUMMARY"/>
 *     &lt;enumeration value="HOTEL_DETAILS"/>
 *     &lt;enumeration value="SUPPLIERS"/>
 *     &lt;enumeration value="ROOM_TYPES"/>
 *     &lt;enumeration value="ROOM_AMENITIES"/>
 *     &lt;enumeration value="PROPERTY_AMENITIES"/>
 *     &lt;enumeration value="HOTEL_IMAGES"/>
 *     &lt;enumeration value="SUPPLIERS_CHAIN_CODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "hotelInfoOption")
@XmlEnum
public enum HotelInfoOption {

    DEFAULT,
    HOTEL_SUMMARY,
    HOTEL_DETAILS,
    SUPPLIERS,
    ROOM_TYPES,
    ROOM_AMENITIES,
    PROPERTY_AMENITIES,
    HOTEL_IMAGES,
    SUPPLIERS_CHAIN_CODE;

    public String value() {
        return name();
    }

    public static HotelInfoOption fromValue(String v) {
        return valueOf(v);
    }

}
