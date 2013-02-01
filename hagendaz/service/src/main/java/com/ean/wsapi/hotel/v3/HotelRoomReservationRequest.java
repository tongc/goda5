
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRoomReservationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomReservationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sendReservationEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="frequentGuestNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateConfirmationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="chargeableRate" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="specialInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup"/>
 *         &lt;element name="rateType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" minOccurs="0"/>
 *         &lt;element name="ReservationInfo" type="{http://v3.hotel.wsapi.ean.com/}reservationInfo"/>
 *         &lt;element name="AddressInfo" type="{http://v3.hotel.wsapi.ean.com/}addressInfo"/>
 *         &lt;element name="CouponData" type="{http://v3.hotel.wsapi.ean.com/}CouponData" minOccurs="0"/>
 *         &lt;element name="MultiRoomRes" type="{http://v3.hotel.wsapi.ean.com/}MultiRoomResType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomReservationRequest", propOrder = {
    "hotelId",
    "arrivalDate",
    "departureDate",
    "supplierType",
    "rateKey",
    "roomTypeCode",
    "roomDescription",
    "rateCode",
    "sendReservationEmail",
    "frequentGuestNumber",
    "affiliateConfirmationId",
    "affiliateCustomerId",
    "itineraryId",
    "chargeableRate",
    "specialInformation",
    "roomGroup",
    "rateType",
    "reservationInfo",
    "addressInfo",
    "couponData",
    "multiRoomRes"
})
public class HotelRoomReservationRequest
    extends HotelBaseRequest
{

    protected long hotelId;
    @XmlElement(required = true)
    protected String arrivalDate;
    @XmlElement(required = true)
    protected String departureDate;
    @XmlElement(required = true)
    protected SupplierType supplierType;
    @XmlElement(required = true)
    protected String rateKey;
    @XmlElement(required = true)
    protected String roomTypeCode;
    protected String roomDescription;
    @XmlElement(required = true)
    protected String rateCode;
    protected boolean sendReservationEmail;
    protected String frequentGuestNumber;
    protected String affiliateConfirmationId;
    protected String affiliateCustomerId;
    protected Long itineraryId;
    protected float chargeableRate;
    protected String specialInformation;
    @XmlElement(name = "RoomGroup", required = true)
    protected RoomGroup roomGroup;
    protected RatePlanType rateType;
    @XmlElement(name = "ReservationInfo", required = true)
    protected ReservationInfo reservationInfo;
    @XmlElement(name = "AddressInfo", required = true)
    protected AddressInfo addressInfo;
    @XmlElement(name = "CouponData")
    protected CouponData couponData;
    @XmlElement(name = "MultiRoomRes")
    protected MultiRoomResType multiRoomRes;

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public long getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(long value) {
        this.hotelId = value;
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
     * Gets the value of the supplierType property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierType }
     *     
     */
    public SupplierType getSupplierType() {
        return supplierType;
    }

    /**
     * Sets the value of the supplierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierType }
     *     
     */
    public void setSupplierType(SupplierType value) {
        this.supplierType = value;
    }

    /**
     * Gets the value of the rateKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateKey() {
        return rateKey;
    }

    /**
     * Sets the value of the rateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateKey(String value) {
        this.rateKey = value;
    }

    /**
     * Gets the value of the roomTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * Sets the value of the roomTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
    }

    /**
     * Gets the value of the roomDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * Sets the value of the roomDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomDescription(String value) {
        this.roomDescription = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the sendReservationEmail property.
     * 
     */
    public boolean isSendReservationEmail() {
        return sendReservationEmail;
    }

    /**
     * Sets the value of the sendReservationEmail property.
     * 
     */
    public void setSendReservationEmail(boolean value) {
        this.sendReservationEmail = value;
    }

    /**
     * Gets the value of the frequentGuestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequentGuestNumber() {
        return frequentGuestNumber;
    }

    /**
     * Sets the value of the frequentGuestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequentGuestNumber(String value) {
        this.frequentGuestNumber = value;
    }

    /**
     * Gets the value of the affiliateConfirmationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateConfirmationId() {
        return affiliateConfirmationId;
    }

    /**
     * Sets the value of the affiliateConfirmationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateConfirmationId(String value) {
        this.affiliateConfirmationId = value;
    }

    /**
     * Gets the value of the affiliateCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateCustomerId() {
        return affiliateCustomerId;
    }

    /**
     * Sets the value of the affiliateCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateCustomerId(String value) {
        this.affiliateCustomerId = value;
    }

    /**
     * Gets the value of the itineraryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItineraryId() {
        return itineraryId;
    }

    /**
     * Sets the value of the itineraryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItineraryId(Long value) {
        this.itineraryId = value;
    }

    /**
     * Gets the value of the chargeableRate property.
     * 
     */
    public float getChargeableRate() {
        return chargeableRate;
    }

    /**
     * Sets the value of the chargeableRate property.
     * 
     */
    public void setChargeableRate(float value) {
        this.chargeableRate = value;
    }

    /**
     * Gets the value of the specialInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInformation() {
        return specialInformation;
    }

    /**
     * Sets the value of the specialInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInformation(String value) {
        this.specialInformation = value;
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
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationInfo }
     *     
     */
    public ReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationInfo }
     *     
     */
    public void setReservationInfo(ReservationInfo value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfo }
     *     
     */
    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfo }
     *     
     */
    public void setAddressInfo(AddressInfo value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the couponData property.
     * 
     * @return
     *     possible object is
     *     {@link CouponData }
     *     
     */
    public CouponData getCouponData() {
        return couponData;
    }

    /**
     * Sets the value of the couponData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponData }
     *     
     */
    public void setCouponData(CouponData value) {
        this.couponData = value;
    }

    /**
     * Gets the value of the multiRoomRes property.
     * 
     * @return
     *     possible object is
     *     {@link MultiRoomResType }
     *     
     */
    public MultiRoomResType getMultiRoomRes() {
        return multiRoomRes;
    }

    /**
     * Sets the value of the multiRoomRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRoomResType }
     *     
     */
    public void setMultiRoomRes(MultiRoomResType value) {
        this.multiRoomRes = value;
    }

}
