
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRoomImageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRoomImageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomImageResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomImageResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRoomImageResponse", propOrder = {
    "hotelRoomImageResponse"
})
public class GetRoomImageResponse {

    @XmlElement(name = "HotelRoomImageResponse")
    protected HotelRoomImageResponse hotelRoomImageResponse;

    /**
     * Gets the value of the hotelRoomImageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomImageResponse }
     *     
     */
    public HotelRoomImageResponse getHotelRoomImageResponse() {
        return hotelRoomImageResponse;
    }

    /**
     * Sets the value of the hotelRoomImageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomImageResponse }
     *     
     */
    public void setHotelRoomImageResponse(HotelRoomImageResponse value) {
        this.hotelRoomImageResponse = value;
    }

}
