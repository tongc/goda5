
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRoomImageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomImageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="RoomImages" type="{http://v3.hotel.wsapi.ean.com/}RoomImages"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomImageResponse", propOrder = {
    "roomImages"
})
public class HotelRoomImageResponse
    extends BaseResponse
{

    @XmlElement(name = "RoomImages", required = true)
    protected RoomImages roomImages;

    /**
     * Gets the value of the roomImages property.
     * 
     * @return
     *     possible object is
     *     {@link RoomImages }
     *     
     */
    public RoomImages getRoomImages() {
        return roomImages;
    }

    /**
     * Sets the value of the roomImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomImages }
     *     
     */
    public void setRoomImages(RoomImages value) {
        this.roomImages = value;
    }

}
