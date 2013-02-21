
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelListRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelListRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getList", propOrder = {
    "hotelListRequest"
})
public class GetList {

    @XmlElement(name = "HotelListRequest")
    protected HotelListRequest hotelListRequest;

    /**
     * Gets the value of the hotelListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link HotelListRequest }
     *     
     */
    public HotelListRequest getHotelListRequest() {
        return hotelListRequest;
    }

    /**
     * Sets the value of the hotelListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelListRequest }
     *     
     */
    public void setHotelListRequest(HotelListRequest value) {
        this.hotelListRequest = value;
    }

}
