
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errorCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="EXCEPTION"/>
 *     &lt;enumeration value="CREDITCARD"/>
 *     &lt;enumeration value="DATA_VALIDATION"/>
 *     &lt;enumeration value="AUTHENTICATION"/>
 *     &lt;enumeration value="UNABLE_TO_PROCESS_REQUEST"/>
 *     &lt;enumeration value="INVALID_PROPERTY_ID"/>
 *     &lt;enumeration value="RESULT_NULL"/>
 *     &lt;enumeration value="PROCESS_FAIL"/>
 *     &lt;enumeration value="SOLD_OUT"/>
 *     &lt;enumeration value="RESTRICTED_CHECKIN"/>
 *     &lt;enumeration value="ONEROOM"/>
 *     &lt;enumeration value="SUPPLIER_COMMUNICATION"/>
 *     &lt;enumeration value="DATA_PARSE_RESULT"/>
 *     &lt;enumeration value="CORPORATE_RATE"/>
 *     &lt;enumeration value="RES_NOT_FOUND"/>
 *     &lt;enumeration value="RES_CANCELLED"/>
 *     &lt;enumeration value="HRN_QUOTE_KEY_FAILURE"/>
 *     &lt;enumeration value="HRN_QUOTE_KEY_INVALID"/>
 *     &lt;enumeration value="SYS_OFFLINE"/>
 *     &lt;enumeration value="SUPPLIER_INITITIALIZATION"/>
 *     &lt;enumeration value="SUPPLIER_ROUTER_EXCEPTION"/>
 *     &lt;enumeration value="EJB_CREATE_EXCEPTION"/>
 *     &lt;enumeration value="FINDER_EXCEPTION"/>
 *     &lt;enumeration value="BML_FAIL"/>
 *     &lt;enumeration value="PRICE_MISMATCH"/>
 *     &lt;enumeration value="CSV_FAIL"/>
 *     &lt;enumeration value="PAYER_AUTH_REQUIRED"/>
 *     &lt;enumeration value="PAYER_AUTH_FAILED"/>
 *     &lt;enumeration value="ITINERARY_ALREADY_BOOKED"/>
 *     &lt;enumeration value="FRAUD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "errorCategory")
@XmlEnum
public enum ErrorCategory {

    UNKNOWN,
    EXCEPTION,
    CREDITCARD,
    DATA_VALIDATION,
    AUTHENTICATION,
    UNABLE_TO_PROCESS_REQUEST,
    INVALID_PROPERTY_ID,
    RESULT_NULL,
    PROCESS_FAIL,
    SOLD_OUT,
    RESTRICTED_CHECKIN,
    ONEROOM,
    SUPPLIER_COMMUNICATION,
    DATA_PARSE_RESULT,
    CORPORATE_RATE,
    RES_NOT_FOUND,
    RES_CANCELLED,
    HRN_QUOTE_KEY_FAILURE,
    HRN_QUOTE_KEY_INVALID,
    SYS_OFFLINE,
    SUPPLIER_INITITIALIZATION,
    SUPPLIER_ROUTER_EXCEPTION,
    EJB_CREATE_EXCEPTION,
    FINDER_EXCEPTION,
    BML_FAIL,
    PRICE_MISMATCH,
    CSV_FAIL,
    PAYER_AUTH_REQUIRED,
    PAYER_AUTH_FAILED,
    ITINERARY_ALREADY_BOOKED,
    FRAUD;

    public String value() {
        return name();
    }

    public static ErrorCategory fromValue(String v) {
        return valueOf(v);
    }

}
