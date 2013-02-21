
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatePlanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RatePlanType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MerchantStandard"/>
 *     &lt;enumeration value="MerchantPackage"/>
 *     &lt;enumeration value="MerchantCorporate"/>
 *     &lt;enumeration value="DirectAgency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RatePlanType")
@XmlEnum
public enum RatePlanType {

    @XmlEnumValue("MerchantStandard")
    MERCHANT_STANDARD("MerchantStandard"),
    @XmlEnumValue("MerchantPackage")
    MERCHANT_PACKAGE("MerchantPackage"),
    @XmlEnumValue("MerchantCorporate")
    MERCHANT_CORPORATE("MerchantCorporate"),
    @XmlEnumValue("DirectAgency")
    DIRECT_AGENCY("DirectAgency");
    private final String value;

    RatePlanType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RatePlanType fromValue(String v) {
        for (RatePlanType c: RatePlanType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
