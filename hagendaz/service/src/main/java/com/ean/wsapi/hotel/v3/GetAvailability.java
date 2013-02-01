
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomAvailabilityRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomAvailabilityRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailability", propOrder = {
    "hotelRoomAvailabilityRequest"
})
public class GetAvailability {

    @XmlElement(name = "HotelRoomAvailabilityRequest")
    protected HotelRoomAvailabilityRequest hotelRoomAvailabilityRequest;

    /**
     * Gets the value of the hotelRoomAvailabilityRequest property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomAvailabilityRequest }
     *     
     */
    public HotelRoomAvailabilityRequest getHotelRoomAvailabilityRequest() {
        return hotelRoomAvailabilityRequest;
    }

    /**
     * Sets the value of the hotelRoomAvailabilityRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomAvailabilityRequest }
     *     
     */
    public void setHotelRoomAvailabilityRequest(HotelRoomAvailabilityRequest value) {
        this.hotelRoomAvailabilityRequest = value;
    }

}
