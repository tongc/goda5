
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelListRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelIdList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="searchRadius" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="searchRadiusUnit" type="{http://v3.hotel.wsapi.ean.com/}SearchRadiusUnitType" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://v3.hotel.wsapi.ean.com/}SortType" minOccurs="0"/>
 *         &lt;element name="propertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amenities" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="minStarRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxStarRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minTripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="maxTripAdvisorRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="minRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyCategory" type="{http://v3.hotel.wsapi.ean.com/}PropertyCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfBedRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxRatePlanCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cacheLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cacheKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="options" type="{http://v3.hotel.wsapi.ean.com/}hotelListOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="multiRoomAvail" type="{http://v3.hotel.wsapi.ean.com/}MultiRoomAvailType" minOccurs="0"/>
 *         &lt;element name="merchantScoringSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scoringAlgorithmId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ignoreMmOverrides" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="supplierCacheTolerance" type="{http://v3.hotel.wsapi.ean.com/}SupplierCacheTolerance" minOccurs="0"/>
 *         &lt;element name="datelessSupplierSort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelListRequest", propOrder = {
    "address",
    "city",
    "stateProvinceCode",
    "postalCode",
    "countryCode",
    "destinationId",
    "destinationString",
    "hotelIdList",
    "latitude",
    "longitude",
    "searchRadius",
    "searchRadiusUnit",
    "sort",
    "propertyName",
    "amenities",
    "minStarRating",
    "maxStarRating",
    "minTripAdvisorRating",
    "maxTripAdvisorRating",
    "minRate",
    "maxRate",
    "propertyCategory",
    "supplierType",
    "numberOfBedRooms",
    "numberOfResults",
    "maxRatePlanCount",
    "arrivalDate",
    "departureDate",
    "roomGroup",
    "rateType",
    "cacheLocation",
    "cacheKey",
    "options",
    "multiRoomAvail",
    "merchantScoringSource",
    "scoringAlgorithmId",
    "ignoreMmOverrides",
    "supplierCacheTolerance",
    "datelessSupplierSort",
    "includeDetails"
})
public class HotelListRequest
    extends HotelBaseRequest
{

    protected String address;
    protected String city;
    protected String stateProvinceCode;
    protected String postalCode;
    protected String countryCode;
    protected String destinationId;
    protected String destinationString;
    @XmlElement(type = Long.class)
    protected List<Long> hotelIdList;
    protected Float latitude;
    protected Float longitude;
    protected Integer searchRadius;
    protected SearchRadiusUnitType searchRadiusUnit;
    protected SortType sort;
    protected String propertyName;
    @XmlElement(type = Integer.class)
    protected List<Integer> amenities;
    protected Float minStarRating;
    protected Float maxStarRating;
    protected Float minTripAdvisorRating;
    protected Float maxTripAdvisorRating;
    protected Integer minRate;
    protected Integer maxRate;
    protected List<String> propertyCategory;
    protected String supplierType;
    protected Integer numberOfBedRooms;
    protected Integer numberOfResults;
    protected Integer maxRatePlanCount;
    protected String arrivalDate;
    protected String departureDate;
    @XmlElement(name = "RoomGroup")
    protected RoomGroup roomGroup;
    protected List<RatePlanType> rateType;
    protected String cacheLocation;
    protected String cacheKey;
    protected List<HotelListOption> options;
    protected MultiRoomAvailType multiRoomAvail;
    protected String merchantScoringSource;
    protected Integer scoringAlgorithmId;
    protected Boolean ignoreMmOverrides;
    protected SupplierCacheTolerance supplierCacheTolerance;
    protected Boolean datelessSupplierSort;
    protected Boolean includeDetails;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
     * Gets the value of the destinationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationId() {
        return destinationId;
    }

    /**
     * Sets the value of the destinationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationId(String value) {
        this.destinationId = value;
    }

    /**
     * Gets the value of the destinationString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationString() {
        return destinationString;
    }

    /**
     * Sets the value of the destinationString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationString(String value) {
        this.destinationString = value;
    }

    /**
     * Gets the value of the hotelIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getHotelIdList() {
        if (hotelIdList == null) {
            hotelIdList = new ArrayList<Long>();
        }
        return this.hotelIdList;
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
     * Gets the value of the searchRadius property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchRadius() {
        return searchRadius;
    }

    /**
     * Sets the value of the searchRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchRadius(Integer value) {
        this.searchRadius = value;
    }

    /**
     * Gets the value of the searchRadiusUnit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchRadiusUnitType }
     *     
     */
    public SearchRadiusUnitType getSearchRadiusUnit() {
        return searchRadiusUnit;
    }

    /**
     * Sets the value of the searchRadiusUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchRadiusUnitType }
     *     
     */
    public void setSearchRadiusUnit(SearchRadiusUnitType value) {
        this.searchRadiusUnit = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link SortType }
     *     
     */
    public SortType getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortType }
     *     
     */
    public void setSort(SortType value) {
        this.sort = value;
    }

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amenities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmenities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getAmenities() {
        if (amenities == null) {
            amenities = new ArrayList<Integer>();
        }
        return this.amenities;
    }

    /**
     * Gets the value of the minStarRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinStarRating() {
        return minStarRating;
    }

    /**
     * Sets the value of the minStarRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinStarRating(Float value) {
        this.minStarRating = value;
    }

    /**
     * Gets the value of the maxStarRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxStarRating() {
        return maxStarRating;
    }

    /**
     * Sets the value of the maxStarRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxStarRating(Float value) {
        this.maxStarRating = value;
    }

    /**
     * Gets the value of the minTripAdvisorRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinTripAdvisorRating() {
        return minTripAdvisorRating;
    }

    /**
     * Sets the value of the minTripAdvisorRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinTripAdvisorRating(Float value) {
        this.minTripAdvisorRating = value;
    }

    /**
     * Gets the value of the maxTripAdvisorRating property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxTripAdvisorRating() {
        return maxTripAdvisorRating;
    }

    /**
     * Sets the value of the maxTripAdvisorRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxTripAdvisorRating(Float value) {
        this.maxTripAdvisorRating = value;
    }

    /**
     * Gets the value of the minRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinRate() {
        return minRate;
    }

    /**
     * Sets the value of the minRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinRate(Integer value) {
        this.minRate = value;
    }

    /**
     * Gets the value of the maxRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRate() {
        return maxRate;
    }

    /**
     * Sets the value of the maxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRate(Integer value) {
        this.maxRate = value;
    }

    /**
     * Gets the value of the propertyCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPropertyCategory() {
        if (propertyCategory == null) {
            propertyCategory = new ArrayList<String>();
        }
        return this.propertyCategory;
    }

    /**
     * Gets the value of the supplierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierType() {
        return supplierType;
    }

    /**
     * Sets the value of the supplierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierType(String value) {
        this.supplierType = value;
    }

    /**
     * Gets the value of the numberOfBedRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfBedRooms() {
        return numberOfBedRooms;
    }

    /**
     * Sets the value of the numberOfBedRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfBedRooms(Integer value) {
        this.numberOfBedRooms = value;
    }

    /**
     * Gets the value of the numberOfResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Sets the value of the numberOfResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfResults(Integer value) {
        this.numberOfResults = value;
    }

    /**
     * Gets the value of the maxRatePlanCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRatePlanCount() {
        return maxRatePlanCount;
    }

    /**
     * Sets the value of the maxRatePlanCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRatePlanCount(Integer value) {
        this.maxRatePlanCount = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePlanType }
     * 
     * 
     */
    public List<RatePlanType> getRateType() {
        if (rateType == null) {
            rateType = new ArrayList<RatePlanType>();
        }
        return this.rateType;
    }

    /**
     * Gets the value of the cacheLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheLocation() {
        return cacheLocation;
    }

    /**
     * Sets the value of the cacheLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheLocation(String value) {
        this.cacheLocation = value;
    }

    /**
     * Gets the value of the cacheKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCacheKey() {
        return cacheKey;
    }

    /**
     * Sets the value of the cacheKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCacheKey(String value) {
        this.cacheKey = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelListOption }
     * 
     * 
     */
    public List<HotelListOption> getOptions() {
        if (options == null) {
            options = new ArrayList<HotelListOption>();
        }
        return this.options;
    }

    /**
     * Gets the value of the multiRoomAvail property.
     * 
     * @return
     *     possible object is
     *     {@link MultiRoomAvailType }
     *     
     */
    public MultiRoomAvailType getMultiRoomAvail() {
        return multiRoomAvail;
    }

    /**
     * Sets the value of the multiRoomAvail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiRoomAvailType }
     *     
     */
    public void setMultiRoomAvail(MultiRoomAvailType value) {
        this.multiRoomAvail = value;
    }

    /**
     * Gets the value of the merchantScoringSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantScoringSource() {
        return merchantScoringSource;
    }

    /**
     * Sets the value of the merchantScoringSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantScoringSource(String value) {
        this.merchantScoringSource = value;
    }

    /**
     * Gets the value of the scoringAlgorithmId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoringAlgorithmId() {
        return scoringAlgorithmId;
    }

    /**
     * Sets the value of the scoringAlgorithmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoringAlgorithmId(Integer value) {
        this.scoringAlgorithmId = value;
    }

    /**
     * Gets the value of the ignoreMmOverrides property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreMmOverrides() {
        return ignoreMmOverrides;
    }

    /**
     * Sets the value of the ignoreMmOverrides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreMmOverrides(Boolean value) {
        this.ignoreMmOverrides = value;
    }

    /**
     * Gets the value of the supplierCacheTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierCacheTolerance }
     *     
     */
    public SupplierCacheTolerance getSupplierCacheTolerance() {
        return supplierCacheTolerance;
    }

    /**
     * Sets the value of the supplierCacheTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierCacheTolerance }
     *     
     */
    public void setSupplierCacheTolerance(SupplierCacheTolerance value) {
        this.supplierCacheTolerance = value;
    }

    /**
     * Gets the value of the datelessSupplierSort property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDatelessSupplierSort() {
        return datelessSupplierSort;
    }

    /**
     * Sets the value of the datelessSupplierSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDatelessSupplierSort(Boolean value) {
        this.datelessSupplierSort = value;
    }

    /**
     * Gets the value of the includeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDetails() {
        return includeDetails;
    }

    /**
     * Sets the value of the includeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDetails(Boolean value) {
        this.includeDetails = value;
    }

}
