
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType" minOccurs="0"/>
 *         &lt;element name="propertyCategory" type="{http://v3.hotel.wsapi.ean.com/}PropertyCategory" minOccurs="0"/>
 *         &lt;element name="hotelRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="confidenceRating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="amenityMask" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="tripAdvisorReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tripAdvisorRatingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="lowRate" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="rateCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="proximityDistance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="proximityUnit" type="{http://v3.hotel.wsapi.ean.com/}SearchRadiusUnitType" minOccurs="0"/>
 *         &lt;element name="hotelInDestination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="thumbNailUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deepLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomRateDetailsList" type="{http://v3.hotel.wsapi.ean.com/}RoomRateDetailsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ubsScore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSummary", propOrder = {
    "hotelId",
    "name",
    "address1",
    "address2",
    "address3",
    "phoneNumber",
    "city",
    "stateProvinceCode",
    "postalCode",
    "countryCode",
    "airportCode",
    "supplierType",
    "propertyCategory",
    "hotelRating",
    "confidenceRating",
    "amenityMask",
    "tripAdvisorRating",
    "tripAdvisorReviewCount",
    "tripAdvisorRatingUrl",
    "locationDescription",
    "shortDescription",
    "highRate",
    "lowRate",
    "rateCurrencyCode",
    "latitude",
    "longitude",
    "proximityDistance",
    "proximityUnit",
    "hotelInDestination",
    "thumbNailUrl",
    "deepLink",
    "roomRateDetailsList"
})
public class HotelSummary {

    protected Long hotelId;
    protected String name;
    protected String address1;
    protected String address2;
    protected String address3;
    protected String phoneNumber;
    protected String city;
    protected String stateProvinceCode;
    protected String postalCode;
    protected String countryCode;
    protected String airportCode;
    protected SupplierType supplierType;
    protected String propertyCategory;
    protected Float hotelRating;
    protected Integer confidenceRating;
    protected Long amenityMask;
    protected Float tripAdvisorRating;
    protected Integer tripAdvisorReviewCount;
    protected String tripAdvisorRatingUrl;
    protected String locationDescription;
    protected String shortDescription;
    protected Float highRate;
    protected Float lowRate;
    protected String rateCurrencyCode;
    protected Float latitude;
    protected Float longitude;
    protected Float proximityDistance;
    protected SearchRadiusUnitType proximityUnit;
    protected Boolean hotelInDestination;
    protected String thumbNailUrl;
    protected String deepLink;
    @XmlElement(name = "RoomRateDetailsList")
    protected RoomRateDetailsList roomRateDetailsList;
    @XmlAttribute(name = "order", required = true)
    protected int order;
    @XmlAttribute(name = "ubsScore")
    protected String ubsScore;

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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * Sets the value of the stateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceCode(String value) {
        this.stateProvinceCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
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
     * Gets the value of the propertyCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyCategory() {
        return propertyCategory;
    }

    /**
     * Sets the value of the propertyCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyCategory(String value) {
        this.propertyCategory = value;
    }

    /**
     * Gets the value of the hotelRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHotelRating() {
        return hotelRating;
    }

    /**
     * Sets the value of the hotelRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHotelRating(Float value) {
        this.hotelRating = value;
    }

    /**
     * Gets the value of the confidenceRating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidenceRating() {
        return confidenceRating;
    }

    /**
     * Sets the value of the confidenceRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidenceRating(Integer value) {
        this.confidenceRating = value;
    }

    /**
     * Gets the value of the amenityMask property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmenityMask() {
        return amenityMask;
    }

    /**
     * Sets the value of the amenityMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmenityMask(Long value) {
        this.amenityMask = value;
    }

    /**
     * Gets the value of the tripAdvisorRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTripAdvisorRating() {
        return tripAdvisorRating;
    }

    /**
     * Sets the value of the tripAdvisorRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTripAdvisorRating(Float value) {
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
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription(String value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the highRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHighRate() {
        return highRate;
    }

    /**
     * Sets the value of the highRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHighRate(Float value) {
        this.highRate = value;
    }

    /**
     * Gets the value of the lowRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLowRate() {
        return lowRate;
    }

    /**
     * Sets the value of the lowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLowRate(Float value) {
        this.lowRate = value;
    }

    /**
     * Gets the value of the rateCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCurrencyCode() {
        return rateCurrencyCode;
    }

    /**
     * Sets the value of the rateCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCurrencyCode(String value) {
        this.rateCurrencyCode = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLatitude(Float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLongitude(Float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the proximityDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProximityDistance() {
        return proximityDistance;
    }

    /**
     * Sets the value of the proximityDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProximityDistance(Float value) {
        this.proximityDistance = value;
    }

    /**
     * Gets the value of the proximityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRadiusUnitType }
     *     
     */
    public SearchRadiusUnitType getProximityUnit() {
        return proximityUnit;
    }

    /**
     * Sets the value of the proximityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRadiusUnitType }
     *     
     */
    public void setProximityUnit(SearchRadiusUnitType value) {
        this.proximityUnit = value;
    }

    /**
     * Gets the value of the hotelInDestination property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotelInDestination() {
        return hotelInDestination;
    }

    /**
     * Sets the value of the hotelInDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotelInDestination(Boolean value) {
        this.hotelInDestination = value;
    }

    /**
     * Gets the value of the thumbNailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbNailUrl() {
        return thumbNailUrl;
    }

    /**
     * Sets the value of the thumbNailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbNailUrl(String value) {
        this.thumbNailUrl = value;
    }

    /**
     * Gets the value of the deepLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeepLink() {
        return deepLink;
    }

    /**
     * Sets the value of the deepLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeepLink(String value) {
        this.deepLink = value;
    }

    /**
     * Gets the value of the roomRateDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link RoomRateDetailsList }
     *     
     */
    public RoomRateDetailsList getRoomRateDetailsList() {
        return roomRateDetailsList;
    }

    /**
     * Sets the value of the roomRateDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomRateDetailsList }
     *     
     */
    public void setRoomRateDetailsList(RoomRateDetailsList value) {
        this.roomRateDetailsList = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the ubsScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbsScore() {
        return ubsScore;
    }

    /**
     * Sets the value of the ubsScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbsScore(String value) {
        this.ubsScore = value;
    }

}
