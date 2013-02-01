
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelItineraryRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelItineraryRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItinerary", propOrder = {
    "hotelItineraryRequest"
})
public class GetItinerary {

    @XmlElement(name = "HotelItineraryRequest")
    protected HotelItineraryRequest hotelItineraryRequest;

    /**
     * Gets the value of the hotelItineraryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link HotelItineraryRequest }
     *     
     */
    public HotelItineraryRequest getHotelItineraryRequest() {
        return hotelItineraryRequest;
    }

    /**
     * Sets the value of the hotelItineraryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelItineraryRequest }
     *     
     */
    public void setHotelItineraryRequest(HotelItineraryRequest value) {
        this.hotelItineraryRequest = value;
    }

}
