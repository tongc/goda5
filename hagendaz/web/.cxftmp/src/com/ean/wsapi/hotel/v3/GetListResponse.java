
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelListResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelListResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListResponse", propOrder = {
    "hotelListResponse"
})
public class GetListResponse {

    @XmlElement(name = "HotelListResponse")
    protected HotelListResponse hotelListResponse;

    /**
     * Gets the value of the hotelListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link HotelListResponse }
     *     
     */
    public HotelListResponse getHotelListResponse() {
        return hotelListResponse;
    }

    /**
     * Sets the value of the hotelListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelListResponse }
     *     
     */
    public void setHotelListResponse(HotelListResponse value) {
        this.hotelListResponse = value;
    }

}
