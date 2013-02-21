
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EanWsError" type="{http://v3.hotel.wsapi.ean.com/}EanWsError" minOccurs="0"/>
 *         &lt;element name="customerSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponse", propOrder = {
    "eanWsError",
    "customerSessionId"
})
@XmlSeeAlso({
    HotelListResponse.class,
    HotelRoomCancellationResponse.class,
    HotelRoomReservationResponse.class,
    AlternatePropertyListResponse.class,
    HotelPaymentResponse.class,
    HotelRoomAvailabilityResponse.class,
    LocationInfoResponse.class,
    HotelRateRulesResponse.class,
    HotelInformationResponse.class,
    HotelItineraryResponse.class,
    PingResponse.class,
    HotelRoomImageResponse.class
})
public class BaseResponse {

    @XmlElement(name = "EanWsError")
    protected EanWsError eanWsError;
    protected String customerSessionId;

    /**
     * Gets the value of the eanWsError property.
     * 
     * @return
     *     possible object is
     *     {@link EanWsError }
     *     
     */
    public EanWsError getEanWsError() {
        return eanWsError;
    }

    /**
     * Sets the value of the eanWsError property.
     * 
     * @param value
     *     allowed object is
     *     {@link EanWsError }
     *     
     */
    public void setEanWsError(EanWsError value) {
        this.eanWsError = value;
    }

    /**
     * Gets the value of the customerSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSessionId() {
        return customerSessionId;
    }

    /**
     * Sets the value of the customerSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSessionId(String value) {
        this.customerSessionId = value;
    }

}
