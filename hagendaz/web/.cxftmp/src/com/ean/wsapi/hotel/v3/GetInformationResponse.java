
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getInformationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInformationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelInformationResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelInformationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInformationResponse", propOrder = {
    "hotelInformationResponse"
})
public class GetInformationResponse {

    @XmlElement(name = "HotelInformationResponse")
    protected HotelInformationResponse hotelInformationResponse;

    /**
     * Gets the value of the hotelInformationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInformationResponse }
     *     
     */
    public HotelInformationResponse getHotelInformationResponse() {
        return hotelInformationResponse;
    }

    /**
     * Sets the value of the hotelInformationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInformationResponse }
     *     
     */
    public void setHotelInformationResponse(HotelInformationResponse value) {
        this.hotelInformationResponse = value;
    }

}
