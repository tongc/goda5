
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailabilityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAvailabilityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomAvailabilityResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomAvailabilityResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailabilityResponse", propOrder = {
    "hotelRoomAvailabilityResponse"
})
public class GetAvailabilityResponse {

    @XmlElement(name = "HotelRoomAvailabilityResponse")
    protected HotelRoomAvailabilityResponse hotelRoomAvailabilityResponse;

    /**
     * Gets the value of the hotelRoomAvailabilityResponse property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomAvailabilityResponse }
     *     
     */
    public HotelRoomAvailabilityResponse getHotelRoomAvailabilityResponse() {
        return hotelRoomAvailabilityResponse;
    }

    /**
     * Sets the value of the hotelRoomAvailabilityResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomAvailabilityResponse }
     *     
     */
    public void setHotelRoomAvailabilityResponse(HotelRoomAvailabilityResponse value) {
        this.hotelRoomAvailabilityResponse = value;
    }

}
