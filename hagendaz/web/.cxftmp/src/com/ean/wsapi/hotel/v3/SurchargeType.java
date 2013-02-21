
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurchargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurchargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Tax"/>
 *     &lt;enumeration value="ServiceFee"/>
 *     &lt;enumeration value="ExtraPersonFee"/>
 *     &lt;enumeration value="SalesTax"/>
 *     &lt;enumeration value="HotelOccupancyTax"/>
 *     &lt;enumeration value="TaxAndServiceFee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurchargeType")
@XmlEnum
public enum SurchargeType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("ServiceFee")
    SERVICE_FEE("ServiceFee"),
    @XmlEnumValue("ExtraPersonFee")
    EXTRA_PERSON_FEE("ExtraPersonFee"),
    @XmlEnumValue("SalesTax")
    SALES_TAX("SalesTax"),
    @XmlEnumValue("HotelOccupancyTax")
    HOTEL_OCCUPANCY_TAX("HotelOccupancyTax"),
    @XmlEnumValue("TaxAndServiceFee")
    TAX_AND_SERVICE_FEE("TaxAndServiceFee");
    private final String value;

    SurchargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurchargeType fromValue(String v) {
        for (SurchargeType c: SurchargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
