
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReservationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReservationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomReservationResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomReservationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReservationResponse", propOrder = {
    "hotelRoomReservationResponse"
})
public class GetReservationResponse {

    @XmlElement(name = "HotelRoomReservationResponse")
    protected HotelRoomReservationResponse hotelRoomReservationResponse;

    /**
     * Gets the value of the hotelRoomReservationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomReservationResponse }
     *     
     */
    public HotelRoomReservationResponse getHotelRoomReservationResponse() {
        return hotelRoomReservationResponse;
    }

    /**
     * Sets the value of the hotelRoomReservationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomReservationResponse }
     *     
     */
    public void setHotelRoomReservationResponse(HotelRoomReservationResponse value) {
        this.hotelRoomReservationResponse = value;
    }

}
