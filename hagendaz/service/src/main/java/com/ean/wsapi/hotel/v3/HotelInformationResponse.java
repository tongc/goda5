
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelInformationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelInformationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="HotelSummary" type="{http://v3.hotel.wsapi.ean.com/}HotelSummary" minOccurs="0"/>
 *         &lt;element name="HotelDetails" type="{http://v3.hotel.wsapi.ean.com/}HotelDetails" minOccurs="0"/>
 *         &lt;element name="Suppliers" type="{http://v3.hotel.wsapi.ean.com/}Suppliers" minOccurs="0"/>
 *         &lt;element name="RoomTypes" type="{http://v3.hotel.wsapi.ean.com/}RoomTypes" minOccurs="0"/>
 *         &lt;element name="PropertyAmenities" type="{http://v3.hotel.wsapi.ean.com/}PropertyAmenities" minOccurs="0"/>
 *         &lt;element name="HotelImages" type="{http://v3.hotel.wsapi.ean.com/}HotelImages" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInformationResponse", propOrder = {
    "hotelSummary",
    "hotelDetails",
    "suppliers",
    "roomTypes",
    "propertyAmenities",
    "hotelImages"
})
public class HotelInformationResponse
    extends BaseResponse
{

    @XmlElement(name = "HotelSummary")
    protected HotelSummary hotelSummary;
    @XmlElement(name = "HotelDetails")
    protected HotelDetails hotelDetails;
    @XmlElement(name = "Suppliers")
    protected Suppliers suppliers;
    @XmlElement(name = "RoomTypes")
    protected RoomTypes roomTypes;
    @XmlElement(name = "PropertyAmenities")
    protected PropertyAmenities propertyAmenities;
    @XmlElement(name = "HotelImages")
    protected HotelImages hotelImages;
    @XmlAttribute(name = "hotelId")
    protected Long hotelId;

    /**
     * Gets the value of the hotelSummary property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSummary }
     *     
     */
    public HotelSummary getHotelSummary() {
        return hotelSummary;
    }

    /**
     * Sets the value of the hotelSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSummary }
     *     
     */
    public void setHotelSummary(HotelSummary value) {
        this.hotelSummary = value;
    }

    /**
     * Gets the value of the hotelDetails property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDetails }
     *     
     */
    public HotelDetails getHotelDetails() {
        return hotelDetails;
    }

    /**
     * Sets the value of the hotelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDetails }
     *     
     */
    public void setHotelDetails(HotelDetails value) {
        this.hotelDetails = value;
    }

    /**
     * Gets the value of the suppliers property.
     * 
     * @return
     *     possible object is
     *     {@link Suppliers }
     *     
     */
    public Suppliers getSuppliers() {
        return suppliers;
    }

    /**
     * Sets the value of the suppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Suppliers }
     *     
     */
    public void setSuppliers(Suppliers value) {
        this.suppliers = value;
    }

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link RoomTypes }
     *     
     */
    public RoomTypes getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypes }
     *     
     */
    public void setRoomTypes(RoomTypes value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the propertyAmenities property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyAmenities }
     *     
     */
    public PropertyAmenities getPropertyAmenities() {
        return propertyAmenities;
    }

    /**
     * Sets the value of the propertyAmenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyAmenities }
     *     
     */
    public void setPropertyAmenities(PropertyAmenities value) {
        this.propertyAmenities = value;
    }

    /**
     * Gets the value of the hotelImages property.
     * 
     * @return
     *     possible object is
     *     {@link HotelImages }
     *     
     */
    public HotelImages getHotelImages() {
        return hotelImages;
    }

    /**
     * Sets the value of the hotelImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelImages }
     *     
     */
    public void setHotelImages(HotelImages value) {
        this.hotelImages = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHotelId(Long value) {
        this.hotelId = value;
    }

}
