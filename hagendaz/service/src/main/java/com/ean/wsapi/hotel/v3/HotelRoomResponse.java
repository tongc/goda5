
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRoomResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://v3.hotel.wsapi.ean.com/}RoomType" minOccurs="0"/>
 *         &lt;element name="supplierType" type="{http://v3.hotel.wsapi.ean.com/}SupplierType" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateChange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="guaranteeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="depositRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="immediateChargeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentAllotment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="propertyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BedTypes" type="{http://v3.hotel.wsapi.ean.com/}BedTypes" minOccurs="0"/>
 *         &lt;element name="CancelPolicyInfoList" type="{http://v3.hotel.wsapi.ean.com/}CancelPolicyInfoList" minOccurs="0"/>
 *         &lt;element name="smokingPreferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateOccupancyPerRoom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quotedOccupancy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minGuestAge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RateInfo" type="{http://v3.hotel.wsapi.ean.com/}HotelRateInfo" minOccurs="0"/>
 *         &lt;element name="RateInfos" type="{http://v3.hotel.wsapi.ean.com/}RateInfos" minOccurs="0"/>
 *         &lt;element name="ValueAdds" type="{http://v3.hotel.wsapi.ean.com/}ValueAdds" minOccurs="0"/>
 *         &lt;element name="deepLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomImages" type="{http://v3.hotel.wsapi.ean.com/}RoomImages" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomResponse", propOrder = {
    "cancellationPolicy",
    "policy",
    "rateCode",
    "rateKey",
    "roomTypeCode",
    "rateDescription",
    "roomTypeDescription",
    "roomType",
    "supplierType",
    "taxRate",
    "otherInformation",
    "rateChange",
    "nonRefundable",
    "guaranteeRequired",
    "depositRequired",
    "immediateChargeRequired",
    "rateType",
    "currentAllotment",
    "propertyId",
    "promoId",
    "promoDescription",
    "promoType",
    "promoDetailText",
    "bedTypes",
    "cancelPolicyInfoList",
    "smokingPreferences",
    "rateOccupancyPerRoom",
    "quotedOccupancy",
    "minGuestAge",
    "rateInfo",
    "rateInfos",
    "valueAdds",
    "deepLink",
    "roomImages"
})
public class HotelRoomResponse {

    protected String cancellationPolicy;
    protected String policy;
    protected String rateCode;
    protected String rateKey;
    protected String roomTypeCode;
    protected String rateDescription;
    protected String roomTypeDescription;
    @XmlElement(name = "RoomType")
    protected RoomType roomType;
    protected SupplierType supplierType;
    protected String taxRate;
    protected String otherInformation;
    protected Boolean rateChange;
    protected Boolean nonRefundable;
    protected Boolean guaranteeRequired;
    protected Boolean depositRequired;
    protected Boolean immediateChargeRequired;
    protected String rateType;
    protected Integer currentAllotment;
    protected String propertyId;
    protected String promoId;
    protected String promoDescription;
    protected String promoType;
    protected String promoDetailText;
    @XmlElement(name = "BedTypes")
    protected BedTypes bedTypes;
    @XmlElement(name = "CancelPolicyInfoList")
    protected CancelPolicyInfoList cancelPolicyInfoList;
    protected String smokingPreferences;
    protected int rateOccupancyPerRoom;
    protected int quotedOccupancy;
    protected int minGuestAge;
    @XmlElement(name = "RateInfo")
    protected HotelRateInfo rateInfo;
    @XmlElement(name = "RateInfos")
    protected RateInfos rateInfos;
    @XmlElement(name = "ValueAdds")
    protected ValueAdds valueAdds;
    protected String deepLink;
    @XmlElement(name = "RoomImages")
    protected RoomImages roomImages;

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
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicy(String value) {
        this.policy = value;
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
     * Gets the value of the rateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateDescription() {
        return rateDescription;
    }

    /**
     * Sets the value of the rateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateDescription(String value) {
        this.rateDescription = value;
    }

    /**
     * Gets the value of the roomTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeDescription() {
        return roomTypeDescription;
    }

    /**
     * Sets the value of the roomTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeDescription(String value) {
        this.roomTypeDescription = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link RoomType }
     *     
     */
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomType }
     *     
     */
    public void setRoomType(RoomType value) {
        this.roomType = value;
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
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRate(String value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the otherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInformation() {
        return otherInformation;
    }

    /**
     * Sets the value of the otherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInformation(String value) {
        this.otherInformation = value;
    }

    /**
     * Gets the value of the rateChange property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateChange() {
        return rateChange;
    }

    /**
     * Sets the value of the rateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateChange(Boolean value) {
        this.rateChange = value;
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
     * Gets the value of the guaranteeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteeRequired() {
        return guaranteeRequired;
    }

    /**
     * Sets the value of the guaranteeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteeRequired(Boolean value) {
        this.guaranteeRequired = value;
    }

    /**
     * Gets the value of the depositRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositRequired() {
        return depositRequired;
    }

    /**
     * Sets the value of the depositRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositRequired(Boolean value) {
        this.depositRequired = value;
    }

    /**
     * Gets the value of the immediateChargeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediateChargeRequired() {
        return immediateChargeRequired;
    }

    /**
     * Sets the value of the immediateChargeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediateChargeRequired(Boolean value) {
        this.immediateChargeRequired = value;
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
     * Gets the value of the propertyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyId(String value) {
        this.propertyId = value;
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
     * Gets the value of the promoType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoType() {
        return promoType;
    }

    /**
     * Sets the value of the promoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoType(String value) {
        this.promoType = value;
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

    /**
     * Gets the value of the rateOccupancyPerRoom property.
     * 
     */
    public int getRateOccupancyPerRoom() {
        return rateOccupancyPerRoom;
    }

    /**
     * Sets the value of the rateOccupancyPerRoom property.
     * 
     */
    public void setRateOccupancyPerRoom(int value) {
        this.rateOccupancyPerRoom = value;
    }

    /**
     * Gets the value of the quotedOccupancy property.
     * 
     */
    public int getQuotedOccupancy() {
        return quotedOccupancy;
    }

    /**
     * Sets the value of the quotedOccupancy property.
     * 
     */
    public void setQuotedOccupancy(int value) {
        this.quotedOccupancy = value;
    }

    /**
     * Gets the value of the minGuestAge property.
     * 
     */
    public int getMinGuestAge() {
        return minGuestAge;
    }

    /**
     * Sets the value of the minGuestAge property.
     * 
     */
    public void setMinGuestAge(int value) {
        this.minGuestAge = value;
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
     * Gets the value of the roomImages property.
     * 
     * @return
     *     possible object is
     *     {@link RoomImages }
     *     
     */
    public RoomImages getRoomImages() {
        return roomImages;
    }

    /**
     * Sets the value of the roomImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomImages }
     *     
     */
    public void setRoomImages(RoomImages value) {
        this.roomImages = value;
    }

}
