
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPaymentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPaymentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelPaymentRequest" type="{http://v3.hotel.wsapi.ean.com/}v3.HotelPaymentRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPaymentInfo", propOrder = {
    "hotelPaymentRequest"
})
public class GetPaymentInfo {

    @XmlElement(name = "HotelPaymentRequest")
    protected V3HotelPaymentRequest hotelPaymentRequest;

    /**
     * Gets the value of the hotelPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link V3HotelPaymentRequest }
     *     
     */
    public V3HotelPaymentRequest getHotelPaymentRequest() {
        return hotelPaymentRequest;
    }

    /**
     * Sets the value of the hotelPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link V3HotelPaymentRequest }
     *     
     */
    public void setHotelPaymentRequest(V3HotelPaymentRequest value) {
        this.hotelPaymentRequest = value;
    }

}
