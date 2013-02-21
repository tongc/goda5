
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRoomAvailabilityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomAvailabilityResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelStateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRoomsRequested" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="checkInInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripAdvisorReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRatingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CouponInformationResponse" type="{http://v3.hotel.wsapi.ean.com/}CouponInformationResponse" minOccurs="0"/>
 *         &lt;element name="HotelRoomResponse" type="{http://v3.hotel.wsapi.ean.com/}HotelRoomResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HotelDetails" type="{http://v3.hotel.wsapi.ean.com/}HotelDetails" minOccurs="0"/>
 *         &lt;element name="PropertyAmenities" type="{http://v3.hotel.wsapi.ean.com/}PropertyAmenities" minOccurs="0"/>
 *         &lt;element name="HotelImages" type="{http://v3.hotel.wsapi.ean.com/}HotelImages" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomAvailabilityResponse", propOrder = {
    "hotelId",
    "arrivalDate",
    "departureDate",
    "hotelName",
    "hotelAddress",
    "hotelCity",
    "hotelStateProvince",
    "hotelCountry",
    "numberOfRoomsRequested",
    "checkInInstructions",
    "tripAdvisorRating",
    "tripAdvisorReviewCount",
    "tripAdvisorRatingUrl",
    "rateKey",
    "couponInformationResponse",
    "hotelRoomResponse",
    "hotelDetails",
    "propertyAmenities",
    "hotelImages"
})
public class HotelRoomAvailabilityResponse
    extends BaseResponse
{

    protected long hotelId;
    protected String arrivalDate;
    protected String departureDate;
    protected String hotelName;
    protected String hotelAddress;
    protected String hotelCity;
    protected String hotelStateProvince;
    protected String hotelCountry;
    protected Integer numberOfRoomsRequested;
    protected String checkInInstructions;
    protected String tripAdvisorRating;
    protected Integer tripAdvisorReviewCount;
    protected String tripAdvisorRatingUrl;
    protected String rateKey;
    @XmlElement(name = "CouponInformationResponse")
    protected CouponInformationResponse couponInformationResponse;
    @XmlElement(name = "HotelRoomResponse")
    protected List<HotelRoomResponse> hotelRoomResponse;
    @XmlElement(name = "HotelDetails")
    protected HotelDetails hotelDetails;
    @XmlElement(name = "PropertyAmenities")
    protected PropertyAmenities propertyAmenities;
    @XmlElement(name = "HotelImages")
    protected HotelImages hotelImages;
    @XmlAttribute(name = "size", required = true)
    protected int size;

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
     * Gets the value of the hotelStateProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelStateProvince() {
        return hotelStateProvince;
    }

    /**
     * Sets the value of the hotelStateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelStateProvince(String value) {
        this.hotelStateProvince = value;
    }

    /**
     * Gets the value of the hotelCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCountry() {
        return hotelCountry;
    }

    /**
     * Sets the value of the hotelCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCountry(String value) {
        this.hotelCountry = value;
    }

    /**
     * Gets the value of the numberOfRoomsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRoomsRequested() {
        return numberOfRoomsRequested;
    }

    /**
     * Sets the value of the numberOfRoomsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRoomsRequested(Integer value) {
        this.numberOfRoomsRequested = value;
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
     * Gets the value of the hotelRoomResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRoomResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRoomResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRoomResponse }
     * 
     * 
     */
    public List<HotelRoomResponse> getHotelRoomResponse() {
        if (hotelRoomResponse == null) {
            hotelRoomResponse = new ArrayList<HotelRoomResponse>();
        }
        return this.hotelRoomResponse;
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
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

}
