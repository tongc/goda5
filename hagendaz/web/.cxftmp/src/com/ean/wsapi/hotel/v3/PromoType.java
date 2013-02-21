
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Mobile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromoType")
@XmlEnum
public enum PromoType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile");
    private final String value;

    PromoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromoType fromValue(String v) {
        for (PromoType c: PromoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
