
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRoomReservationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomReservationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="confirmationNumbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RateInfo" type="{http://v3.hotel.wsapi.ean.com/}HotelRateInfo" minOccurs="0"/>
 *         &lt;element name="processedWithConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="errorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelReplyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType" minOccurs="0"/>
 *         &lt;element name="reservationStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="existingItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numberOfRoomsBooked" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup" minOccurs="0"/>
 *         &lt;element name="drivingDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkInInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelStateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripAdvisorReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRatingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelPolicyInfoList" type="{http://v3.hotel.wsapi.ean.com/}CancelPolicyInfoList" minOccurs="0"/>
 *         &lt;element name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rateOccupancyPerRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CouponInformationResponse" type="{http://v3.hotel.wsapi.ean.com/}CouponInformationResponse" minOccurs="0"/>
 *         &lt;element name="RateInfos" type="{http://v3.hotel.wsapi.ean.com/}RateInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomReservationResponse", propOrder = {
    "itineraryId",
    "confirmationNumbers",
    "rateInfo",
    "processedWithConfirmation",
    "errorText",
    "hotelReplyText",
    "supplierType",
    "reservationStatusCode",
    "existingItinerary",
    "numberOfRoomsBooked",
    "roomGroup",
    "drivingDirections",
    "checkInInstructions",
    "arrivalDate",
    "departureDate",
    "hotelName",
    "hotelAddress",
    "hotelCity",
    "hotelStateProvinceCode",
    "hotelPostalCode",
    "hotelCountryCode",
    "roomDescription",
    "tripAdvisorRating",
    "tripAdvisorReviewCount",
    "tripAdvisorRatingUrl",
    "cancellationPolicy",
    "cancelPolicyInfoList",
    "nonRefundable",
    "rateOccupancyPerRoom",
    "couponInformationResponse",
    "rateInfos"
})
public class HotelRoomReservationResponse
    extends BaseResponse
{

    protected Long itineraryId;
    protected List<String> confirmationNumbers;
    @XmlElement(name = "RateInfo")
    protected HotelRateInfo rateInfo;
    protected Boolean processedWithConfirmation;
    protected String errorText;
    protected String hotelReplyText;
    protected SupplierType supplierType;
    protected String reservationStatusCode;
    protected Boolean existingItinerary;
    protected Integer numberOfRoomsBooked;
    @XmlElement(name = "RoomGroup")
    protected RoomGroup roomGroup;
    protected String drivingDirections;
    protected String checkInInstructions;
    protected String arrivalDate;
    protected String departureDate;
    protected String hotelName;
    protected String hotelAddress;
    protected String hotelCity;
    protected String hotelStateProvinceCode;
    protected String hotelPostalCode;
    protected String hotelCountryCode;
    protected String roomDescription;
    protected String tripAdvisorRating;
    protected Integer tripAdvisorReviewCount;
    protected String tripAdvisorRatingUrl;
    protected String cancellationPolicy;
    @XmlElement(name = "CancelPolicyInfoList")
    protected CancelPolicyInfoList cancelPolicyInfoList;
    protected Boolean nonRefundable;
    protected Integer rateOccupancyPerRoom;
    @XmlElement(name = "CouponInformationResponse")
    protected CouponInformationResponse couponInformationResponse;
    @XmlElement(name = "RateInfos")
    protected RateInfos rateInfos;

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
     * Gets the value of the confirmationNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmationNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmationNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConfirmationNumbers() {
        if (confirmationNumbers == null) {
            confirmationNumbers = new ArrayList<String>();
        }
        return this.confirmationNumbers;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRateInfo }
     *     
     */
    public HotelRateInfo getRateInfo() {
        return rateInfo;
    }

    /**
     * Sets the value of the rateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRateInfo }
     *     
     */
    public void setRateInfo(HotelRateInfo value) {
        this.rateInfo = value;
    }

    /**
     * Gets the value of the processedWithConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessedWithConfirmation() {
        return processedWithConfirmation;
    }

    /**
     * Sets the value of the processedWithConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessedWithConfirmation(Boolean value) {
        this.processedWithConfirmation = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the hotelReplyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelReplyText() {
        return hotelReplyText;
    }

    /**
     * Sets the value of the hotelReplyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelReplyText(String value) {
        this.hotelReplyText = value;
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
     * Gets the value of the reservationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatusCode() {
        return reservationStatusCode;
    }

    /**
     * Sets the value of the reservationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatusCode(String value) {
        this.reservationStatusCode = value;
    }

    /**
     * Gets the value of the existingItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExistingItinerary() {
        return existingItinerary;
    }

    /**
     * Sets the value of the existingItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExistingItinerary(Boolean value) {
        this.existingItinerary = value;
    }

    /**
     * Gets the value of the numberOfRoomsBooked property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRoomsBooked() {
        return numberOfRoomsBooked;
    }

    /**
     * Sets the value of the numberOfRoomsBooked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRoomsBooked(Integer value) {
        this.numberOfRoomsBooked = value;
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
     * Gets the value of the drivingDirections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivingDirections() {
        return drivingDirections;
    }

    /**
     * Sets the value of the drivingDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivingDirections(String value) {
        this.drivingDirections = value;
    }

    /**
     * Gets the value of the checkInInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInInstructions() {
        return checkInInstructions;
    }

    /**
     * Sets the value of the checkInInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInInstructions(String value) {
        this.checkInInstructions = value;
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
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the hotelAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelAddress() {
        return hotelAddress;
    }

    /**
     * Sets the value of the hotelAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelAddress(String value) {
        this.hotelAddress = value;
    }

    /**
     * Gets the value of the hotelCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCity() {
        return hotelCity;
    }

    /**
     * Sets the value of the hotelCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCity(String value) {
        this.hotelCity = value;
    }

    /**
     * Gets the value of the hotelStateProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelStateProvinceCode() {
        return hotelStateProvinceCode;
    }

    /**
     * Sets the value of the hotelStateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelStateProvinceCode(String value) {
        this.hotelStateProvinceCode = value;
    }

    /**
     * Gets the value of the hotelPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelPostalCode() {
        return hotelPostalCode;
    }

    /**
     * Sets the value of the hotelPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelPostalCode(String value) {
        this.hotelPostalCode = value;
    }

    /**
     * Gets the value of the hotelCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    /**
     * Sets the value of the hotelCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCountryCode(String value) {
        this.hotelCountryCode = value;
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
     * Gets the value of the tripAdvisorRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripAdvisorRating() {
        return tripAdvisorRating;
    }

    /**
     * Sets the value of the tripAdvisorRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripAdvisorRating(String value) {
        this.tripAdvisorRating = value;
    }

    /**
     * Gets the value of the tripAdvisorReviewCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTripAdvisorReviewCount() {
        return tripAdvisorReviewCount;
    }

    /**
     * Sets the value of the tripAdvisorReviewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTripAdvisorReviewCount(Integer value) {
        this.tripAdvisorReviewCount = value;
    }

    /**
     * Gets the value of the tripAdvisorRatingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripAdvisorRatingUrl() {
        return tripAdvisorRatingUrl;
    }

    /**
     * Sets the value of the tripAdvisorRatingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripAdvisorRatingUrl(String value) {
        this.tripAdvisorRatingUrl = value;
    }

    /**
     * Gets the value of the cancellationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    /**
     * Sets the value of the cancellationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationPolicy(String value) {
        this.cancellationPolicy = value;
    }

    /**
     * Gets the value of the cancelPolicyInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPolicyInfoList }
     *     
     */
    public CancelPolicyInfoList getCancelPolicyInfoList() {
        return cancelPolicyInfoList;
    }

    /**
     * Sets the value of the cancelPolicyInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPolicyInfoList }
     *     
     */
    public void setCancelPolicyInfoList(CancelPolicyInfoList value) {
        this.cancelPolicyInfoList = value;
    }

    /**
     * Gets the value of the nonRefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRefundable() {
        return nonRefundable;
    }

    /**
     * Sets the value of the nonRefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRefundable(Boolean value) {
        this.nonRefundable = value;
    }

    /**
     * Gets the value of the rateOccupancyPerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRateOccupancyPerRoom() {
        return rateOccupancyPerRoom;
    }

    /**
     * Sets the value of the rateOccupancyPerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRateOccupancyPerRoom(Integer value) {
        this.rateOccupancyPerRoom = value;
    }

    /**
     * Gets the value of the couponInformationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformationResponse }
     *     
     */
    public CouponInformationResponse getCouponInformationResponse() {
        return couponInformationResponse;
    }

    /**
     * Sets the value of the couponInformationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformationResponse }
     *     
     */
    public void setCouponInformationResponse(CouponInformationResponse value) {
        this.couponInformationResponse = value;
    }

    /**
     * Gets the value of the rateInfos property.
     * 
     * @return
     *     possible object is
     *     {@link RateInfos }
     *     
     */
    public RateInfos getRateInfos() {
        return rateInfos;
    }

    /**
     * Sets the value of the rateInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInfos }
     *     
     */
    public void setRateInfos(RateInfos value) {
        this.rateInfos = value;
    }

}
