
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGeoLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGeoLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationInfoRequest" type="{http://v3.hotel.wsapi.ean.com/}LocationInfoRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGeoLocation", propOrder = {
    "locationInfoRequest"
})
public class GetGeoLocation {

    @XmlElement(name = "LocationInfoRequest")
    protected LocationInfoRequest locationInfoRequest;

    /**
     * Gets the value of the locationInfoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfoRequest }
     *     
     */
    public LocationInfoRequest getLocationInfoRequest() {
        return locationInfoRequest;
    }

    /**
     * Sets the value of the locationInfoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfoRequest }
     *     
     */
    public void setLocationInfoRequest(LocationInfoRequest value) {
        this.locationInfoRequest = value;
    }

}
