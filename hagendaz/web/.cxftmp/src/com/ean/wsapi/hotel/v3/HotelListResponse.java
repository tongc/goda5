
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="numberOfRoomsRequested" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="moreResultsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cacheKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cacheLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cachedSupplierResponse" type="{http://v3.hotel.wsapi.ean.com/}CachedSupplierResponse" minOccurs="0"/>
 *         &lt;element name="HotelList" type="{http://v3.hotel.wsapi.ean.com/}HotelList" minOccurs="0"/>
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
@XmlType(name = "HotelListResponse", propOrder = {
    "numberOfRoomsRequested",
    "moreResultsAvailable",
    "cacheKey",
    "cacheLocation",
    "cachedSupplierResponse",
    "hotelList",
    "locationInfos"
})
public class HotelListResponse
    extends BaseResponse
{

    protected Integer numberOfRoomsRequested;
    protected Boolean moreResultsAvailable;
    protected String cacheKey;
    protected String cacheLocation;
    protected CachedSupplierResponse cachedSupplierResponse;
    @XmlElement(name = "HotelList")
    protected HotelList hotelList;
    @XmlElement(name = "LocationInfos")
    protected LocationInfos locationInfos;

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
     * Gets the value of the moreResultsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    /**
     * Sets the value of the moreResultsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreResultsAvailable(Boolean value) {
        this.moreResultsAvailable = value;
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
     * Gets the value of the cachedSupplierResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CachedSupplierResponse }
     *     
     */
    public CachedSupplierResponse getCachedSupplierResponse() {
        return cachedSupplierResponse;
    }

    /**
     * Sets the value of the cachedSupplierResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CachedSupplierResponse }
     *     
     */
    public void setCachedSupplierResponse(CachedSupplierResponse value) {
        this.cachedSupplierResponse = value;
    }

    /**
     * Gets the value of the hotelList property.
     * 
     * @return
     *     possible object is
     *     {@link HotelList }
     *     
     */
    public HotelList getHotelList() {
        return hotelList;
    }

    /**
     * Sets the value of the hotelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelList }
     *     
     */
    public void setHotelList(HotelList value) {
        this.hotelList = value;
    }

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
