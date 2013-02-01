
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternatePropertyListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternatePropertyListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="originalHotelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalAverageNightlyRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup"/>
 *         &lt;element name="rateType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" minOccurs="0"/>
 *         &lt;element name="priceType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternatePropertyListRequest", propOrder = {
    "originalHotelId",
    "arrivalDate",
    "departureDate",
    "originalAverageNightlyRate",
    "roomGroup",
    "rateType",
    "priceType"
})
public class AlternatePropertyListRequest
    extends HotelBaseRequest
{

    protected long originalHotelId;
    @XmlElement(required = true)
    protected String arrivalDate;
    @XmlElement(required = true)
    protected String departureDate;
    protected float originalAverageNightlyRate;
    @XmlElement(name = "RoomGroup", required = true)
    protected RoomGroup roomGroup;
    protected RatePlanType rateType;
    protected Integer priceType;

    /**
     * Gets the value of the originalHotelId property.
     * 
     */
    public long getOriginalHotelId() {
        return originalHotelId;
    }

    /**
     * Sets the value of the originalHotelId property.
     * 
     */
    public void setOriginalHotelId(long value) {
        this.originalHotelId = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the originalAverageNightlyRate property.
     * 
     */
    public float getOriginalAverageNightlyRate() {
        return originalAverageNightlyRate;
    }

    /**
     * Sets the value of the originalAverageNightlyRate property.
     * 
     */
    public void setOriginalAverageNightlyRate(float value) {
        this.originalAverageNightlyRate = value;
    }

    /**
     * Gets the value of the roomGroup property.
     * 
     * @return
     *     possible object is
     *     {@link RoomGroup }
     *     
     */
    public RoomGroup getRoomGroup() {
        return roomGroup;
    }

    /**
     * Sets the value of the roomGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomGroup }
     *     
     */
    public void setRoomGroup(RoomGroup value) {
        this.roomGroup = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType }
     *     
     */
    public RatePlanType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType }
     *     
     */
    public void setRateType(RatePlanType value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriceType(Integer value) {
        this.priceType = value;
    }

}
