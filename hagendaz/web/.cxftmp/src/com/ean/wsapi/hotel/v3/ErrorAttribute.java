
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorAttribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errorAttribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CC_TRANSACTIONSTATUS"/>
 *     &lt;enumeration value="TRANSACTIONSTATUSMSG"/>
 *     &lt;enumeration value="PA_TRANSACTIONSTATUS"/>
 *     &lt;enumeration value="XID"/>
 *     &lt;enumeration value="ACS_URL"/>
 *     &lt;enumeration value="PA_REQ"/>
 *     &lt;enumeration value="AUTH_CODE"/>
 *     &lt;enumeration value="PAS_TRANSACTION_ID"/>
 *     &lt;enumeration value="SUPPLIER_ERROR_CODE"/>
 *     &lt;enumeration value="MULTI_ROOMTYPE_CONFIRMATIONS"/>
 *     &lt;enumeration value="RATE_CHANGE"/>
 *     &lt;enumeration value="RATE_KEY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "errorAttribute")
@XmlEnum
public enum ErrorAttribute {

    CC_TRANSACTIONSTATUS,
    TRANSACTIONSTATUSMSG,
    PA_TRANSACTIONSTATUS,
    XID,
    ACS_URL,
    PA_REQ,
    AUTH_CODE,
    PAS_TRANSACTION_ID,
    SUPPLIER_ERROR_CODE,
    MULTI_ROOMTYPE_CONFIRMATIONS,
    RATE_CHANGE,
    RATE_KEY;

    public String value() {
        return name();
    }

    public static ErrorAttribute fromValue(String v) {
        return valueOf(v);
    }

}
