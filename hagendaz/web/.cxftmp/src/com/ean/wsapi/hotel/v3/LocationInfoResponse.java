
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="LocationInfos" type="{http://v3.hotel.wsapi.ean.com/}LocationInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationInfoResponse", propOrder = {
    "locationInfos"
})
public class LocationInfoResponse
    extends BaseResponse
{

    @XmlElement(name = "LocationInfos")
    protected LocationInfos locationInfos;

    /**
     * Gets the value of the locationInfos property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfos }
     *     
     */
    public LocationInfos getLocationInfos() {
        return locationInfos;
    }

    /**
     * Sets the value of the locationInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfos }
     *     
     */
    public void setLocationInfos(LocationInfos value) {
        this.locationInfos = value;
    }

}
