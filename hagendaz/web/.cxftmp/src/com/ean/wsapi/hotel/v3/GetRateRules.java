
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRateRules complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRateRules">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRateRulesRequest" type="{http://v3.hotel.wsapi.ean.com/}HotelRateRulesRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRateRules", propOrder = {
    "hotelRateRulesRequest"
})
public class GetRateRules {

    @XmlElement(name = "HotelRateRulesRequest")
    protected HotelRateRulesRequest hotelRateRulesRequest;

    /**
     * Gets the value of the hotelRateRulesRequest property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateRulesRequest }
     *     
     */
    public HotelRateRulesRequest getHotelRateRulesRequest() {
        return hotelRateRulesRequest;
    }

    /**
     * Sets the value of the hotelRateRulesRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateRulesRequest }
     *     
     */
    public void setHotelRateRulesRequest(HotelRateRulesRequest value) {
        this.hotelRateRulesRequest = value;
    }

}
