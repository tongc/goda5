
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_SORT"/>
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="CITY_VALUE"/>
 *     &lt;enumeration value="OVERALL_VALUE"/>
 *     &lt;enumeration value="PRICE"/>
 *     &lt;enumeration value="QUALITY"/>
 *     &lt;enumeration value="ALPHA"/>
 *     &lt;enumeration value="SPECIAL_VALUE"/>
 *     &lt;enumeration value="PROXIMITY"/>
 *     &lt;enumeration value="POSTAL_CODE"/>
 *     &lt;enumeration value="PROMO"/>
 *     &lt;enumeration value="PRICE_AVERAGE"/>
 *     &lt;enumeration value="TRIP_ADVISOR"/>
 *     &lt;enumeration value="PRICE_REVERSE"/>
 *     &lt;enumeration value="QUALITY_REVERSE"/>
 *     &lt;enumeration value="CONFIDENCE"/>
 *     &lt;enumeration value="MARKETING_CONFIDENCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortType")
@XmlEnum
public enum SortType {

    NO_SORT,
    DEFAULT,
    CITY_VALUE,
    OVERALL_VALUE,
    PRICE,
    QUALITY,
    ALPHA,
    SPECIAL_VALUE,
    PROXIMITY,
    POSTAL_CODE,
    PROMO,
    PRICE_AVERAGE,
    TRIP_ADVISOR,
    PRICE_REVERSE,
    QUALITY_REVERSE,
    CONFIDENCE,
    MARKETING_CONFIDENCE;

    public String value() {
        return name();
    }

    public static SortType fromValue(String v) {
        return valueOf(v);
    }

}
