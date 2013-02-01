
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomRateDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomRateDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxRoomOccupancy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="quotedRoomOccupancy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minGuestAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentAllotment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propertyRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expediaPropertyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RateInfo" type="{http://v3.hotel.wsapi.ean.com/}HotelRateInfo" minOccurs="0"/>
 *         &lt;element name="RateInfos" type="{http://v3.hotel.wsapi.ean.com/}RateInfos" minOccurs="0"/>
 *         &lt;element name="ValueAdds" type="{http://v3.hotel.wsapi.ean.com/}ValueAdds" minOccurs="0"/>
 *         &lt;element name="BedTypes" type="{http://v3.hotel.wsapi.ean.com/}BedTypes" minOccurs="0"/>
 *         &lt;element name="smokingPreferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomRateDetails", propOrder = {
    "roomTypeCode",
    "rateCode",
    "maxRoomOccupancy",
    "quotedRoomOccupancy",
    "minGuestAge",
    "roomDescription",
    "promoId",
    "promoDescription",
    "promoDetailText",
    "currentAllotment",
    "propertyAvailable",
    "propertyRestricted",
    "expediaPropertyId",
    "rateKey",
    "rateType",
    "nonRefundable",
    "rateInfo",
    "rateInfos",
    "valueAdds",
    "bedTypes",
    "smokingPreferences"
})
public class RoomRateDetails {

    protected String roomTypeCode;
    protected String rateCode;
    protected Integer maxRoomOccupancy;
    protected Integer quotedRoomOccupancy;
    protected Integer minGuestAge;
    protected String roomDescription;
    protected String promoId;
    protected String promoDescription;
    protected String promoDetailText;
    protected Integer currentAllotment;
    protected Boolean propertyAvailable;
    protected Boolean propertyRestricted;
    protected String expediaPropertyId;
    protected String rateKey;
    protected String rateType;
    protected Boolean nonRefundable;
    @XmlElement(name = "RateInfo")
    protected HotelRateInfo rateInfo;
    @XmlElement(name = "RateInfos")
    protected RateInfos rateInfos;
    @XmlElement(name = "ValueAdds")
    protected ValueAdds valueAdds;
    @XmlElement(name = "BedTypes")
    protected BedTypes bedTypes;
    protected String smokingPreferences;

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
     * Gets the value of the maxRoomOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRoomOccupancy() {
        return maxRoomOccupancy;
    }

    /**
     * Sets the value of the maxRoomOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRoomOccupancy(Integer value) {
        this.maxRoomOccupancy = value;
    }

    /**
     * Gets the value of the quotedRoomOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuotedRoomOccupancy() {
        return quotedRoomOccupancy;
    }

    /**
     * Sets the value of the quotedRoomOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuotedRoomOccupancy(Integer value) {
        this.quotedRoomOccupancy = value;
    }

    /**
     * Gets the value of the minGuestAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinGuestAge() {
        return minGuestAge;
    }

    /**
     * Sets the value of the minGuestAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinGuestAge(Integer value) {
        this.minGuestAge = value;
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
     * Gets the value of the promoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoId() {
        return promoId;
    }

    /**
     * Sets the value of the promoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoId(String value) {
        this.promoId = value;
    }

    /**
     * Gets the value of the promoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDescription() {
        return promoDescription;
    }

    /**
     * Sets the value of the promoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDescription(String value) {
        this.promoDescription = value;
    }

    /**
     * Gets the value of the promoDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDetailText() {
        return promoDetailText;
    }

    /**
     * Sets the value of the promoDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDetailText(String value) {
        this.promoDetailText = value;
    }

    /**
     * Gets the value of the currentAllotment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentAllotment() {
        return currentAllotment;
    }

    /**
     * Sets the value of the currentAllotment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentAllotment(Integer value) {
        this.currentAllotment = value;
    }

    /**
     * Gets the value of the propertyAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyAvailable() {
        return propertyAvailable;
    }

    /**
     * Sets the value of the propertyAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyAvailable(Boolean value) {
        this.propertyAvailable = value;
    }

    /**
     * Gets the value of the propertyRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPropertyRestricted() {
        return propertyRestricted;
    }

    /**
     * Sets the value of the propertyRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPropertyRestricted(Boolean value) {
        this.propertyRestricted = value;
    }

    /**
     * Gets the value of the expediaPropertyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpediaPropertyId() {
        return expediaPropertyId;
    }

    /**
     * Sets the value of the expediaPropertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpediaPropertyId(String value) {
        this.expediaPropertyId = value;
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
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
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

    /**
     * Gets the value of the valueAdds property.
     * 
     * @return
     *     possible object is
     *     {@link ValueAdds }
     *     
     */
    public ValueAdds getValueAdds() {
        return valueAdds;
    }

    /**
     * Sets the value of the valueAdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAdds }
     *     
     */
    public void setValueAdds(ValueAdds value) {
        this.valueAdds = value;
    }

    /**
     * Gets the value of the bedTypes property.
     * 
     * @return
     *     possible object is
     *     {@link BedTypes }
     *     
     */
    public BedTypes getBedTypes() {
        return bedTypes;
    }

    /**
     * Sets the value of the bedTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BedTypes }
     *     
     */
    public void setBedTypes(BedTypes value) {
        this.bedTypes = value;
    }

    /**
     * Gets the value of the smokingPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmokingPreferences() {
        return smokingPreferences;
    }

    /**
     * Sets the value of the smokingPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmokingPreferences(String value) {
        this.smokingPreferences = value;
    }

}
