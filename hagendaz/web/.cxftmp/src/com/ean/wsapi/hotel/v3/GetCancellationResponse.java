
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCancellationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCancellationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomCancellationResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomCancellationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCancellationResponse", propOrder = {
    "hotelRoomCancellationResponse"
})
public class GetCancellationResponse {

    @XmlElement(name = "HotelRoomCancellationResponse")
    protected HotelRoomCancellationResponse hotelRoomCancellationResponse;

    /**
     * Gets the value of the hotelRoomCancellationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomCancellationResponse }
     *     
     */
    public HotelRoomCancellationResponse getHotelRoomCancellationResponse() {
        return hotelRoomCancellationResponse;
    }

    /**
     * Sets the value of the hotelRoomCancellationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomCancellationResponse }
     *     
     */
    public void setHotelRoomCancellationResponse(HotelRoomCancellationResponse value) {
        this.hotelRoomCancellationResponse = value;
    }

}
