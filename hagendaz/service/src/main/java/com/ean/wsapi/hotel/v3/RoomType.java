
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomAmenities" type="{http://v3.hotel.wsapi.ean.com/}RoomAmenities" minOccurs="0"/>
 *         &lt;element name="roomImages" type="{http://v3.hotel.wsapi.ean.com/}HotelImages" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="roomTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="roomCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomType", propOrder = {
    "description",
    "descriptionLong",
    "roomAmenities",
    "roomImages"
})
public class RoomType {

    protected String description;
    protected String descriptionLong;
    protected RoomAmenities roomAmenities;
    protected HotelImages roomImages;
    @XmlAttribute(name = "roomTypeId", required = true)
    protected long roomTypeId;
    @XmlAttribute(name = "roomCode")
    protected String roomCode;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the descriptionLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionLong() {
        return descriptionLong;
    }

    /**
     * Sets the value of the descriptionLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionLong(String value) {
        this.descriptionLong = value;
    }

    /**
     * Gets the value of the roomAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link RoomAmenities }
     *     
     */
    public RoomAmenities getRoomAmenities() {
        return roomAmenities;
    }

    /**
     * Sets the value of the roomAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomAmenities }
     *     
     */
    public void setRoomAmenities(RoomAmenities value) {
        this.roomAmenities = value;
    }

    /**
     * Gets the value of the roomImages property.
     * 
     * @return
     *     possible object is
     *     {@link HotelImages }
     *     
     */
    public HotelImages getRoomImages() {
        return roomImages;
    }

    /**
     * Sets the value of the roomImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelImages }
     *     
     */
    public void setRoomImages(HotelImages value) {
        this.roomImages = value;
    }

    /**
     * Gets the value of the roomTypeId property.
     * 
     */
    public long getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     */
    public void setRoomTypeId(long value) {
        this.roomTypeId = value;
    }

    /**
     * Gets the value of the roomCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomCode() {
        return roomCode;
    }

    /**
     * Sets the value of the roomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomCode(String value) {
        this.roomCode = value;
    }

}
