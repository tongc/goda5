
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierCacheTolerance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupplierCacheTolerance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_SUPPORTED"/>
 *     &lt;enumeration value="MIN"/>
 *     &lt;enumeration value="MIN_ENHANCED"/>
 *     &lt;enumeration value="MED"/>
 *     &lt;enumeration value="MED_ENHANCED"/>
 *     &lt;enumeration value="MAX"/>
 *     &lt;enumeration value="MAX_ENHANCED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupplierCacheTolerance")
@XmlEnum
public enum SupplierCacheTolerance {

    NOT_SUPPORTED,
    MIN,
    MIN_ENHANCED,
    MED,
    MED_ENHANCED,
    MAX,
    MAX_ENHANCED;

    public String value() {
        return name();
    }

    public static SupplierCacheTolerance fromValue(String v) {
        return valueOf(v);
    }

}
