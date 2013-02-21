
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCancellation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCancellation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRoomCancellationRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomCancellationRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCancellation", propOrder = {
    "hotelRoomCancellationRequest"
})
public class GetCancellation {

    @XmlElement(name = "HotelRoomCancellationRequest")
    protected HotelRoomCancellationRequest hotelRoomCancellationRequest;

    /**
     * Gets the value of the hotelRoomCancellationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomCancellationRequest }
     *     
     */
    public HotelRoomCancellationRequest getHotelRoomCancellationRequest() {
        return hotelRoomCancellationRequest;
    }

    /**
     * Sets the value of the hotelRoomCancellationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomCancellationRequest }
     *     
     */
    public void setHotelRoomCancellationRequest(HotelRoomCancellationRequest value) {
        this.hotelRoomCancellationRequest = value;
    }

}
