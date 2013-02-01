
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomGroup" type="{http://v3.hotel.wsapi.ean.com/}RoomGroup" minOccurs="0"/>
 *         &lt;element name="ChargeableRateInfo" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfo" minOccurs="0"/>
 *         &lt;element name="ConvertedRateInfo" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfo" minOccurs="0"/>
 *         &lt;element name="confirmationNumbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelPolicyInfoList" type="{http://v3.hotel.wsapi.ean.com/}CancelPolicyInfoList" minOccurs="0"/>
 *         &lt;element name="nonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ratePlanType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" minOccurs="0"/>
 *         &lt;element name="HotelFees" type="{http://v3.hotel.wsapi.ean.com/}HotelFees" minOccurs="0"/>
 *         &lt;element name="rateType" type="{http://v3.hotel.wsapi.ean.com/}RatePlanType" minOccurs="0"/>
 *         &lt;element name="promoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoType" type="{http://v3.hotel.wsapi.ean.com/}PromoType" minOccurs="0"/>
 *         &lt;element name="currentAllotment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="guaranteeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="depositRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="taxRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="priceBreakdown" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="promo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rateChange" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="pkgSavingsPercent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pkgSavingsAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRateInfo", propOrder = {
    "roomGroup",
    "chargeableRateInfo",
    "convertedRateInfo",
    "confirmationNumbers",
    "cancellationPolicy",
    "cancelPolicyInfoList",
    "nonRefundable",
    "online",
    "ratePlanType",
    "hotelFees",
    "rateType",
    "promoId",
    "promoDescription",
    "promoDetailText",
    "promoType",
    "currentAllotment",
    "guaranteeRequired",
    "depositRequired",
    "taxRate"
})
public class HotelRateInfo {

    @XmlElement(name = "RoomGroup")
    protected RoomGroup roomGroup;
    @XmlElement(name = "ChargeableRateInfo")
    protected BaseRateInfo chargeableRateInfo;
    @XmlElement(name = "ConvertedRateInfo")
    protected BaseRateInfo convertedRateInfo;
    protected List<String> confirmationNumbers;
    protected String cancellationPolicy;
    @XmlElement(name = "CancelPolicyInfoList")
    protected CancelPolicyInfoList cancelPolicyInfoList;
    protected Boolean nonRefundable;
    protected Boolean online;
    protected RatePlanType ratePlanType;
    @XmlElement(name = "HotelFees")
    protected HotelFees hotelFees;
    protected RatePlanType rateType;
    protected String promoId;
    protected String promoDescription;
    protected String promoDetailText;
    protected PromoType promoType;
    protected Integer currentAllotment;
    protected Boolean guaranteeRequired;
    protected Boolean depositRequired;
    protected String taxRate;
    @XmlAttribute(name = "priceBreakdown")
    protected Boolean priceBreakdown;
    @XmlAttribute(name = "promo")
    protected Boolean promo;
    @XmlAttribute(name = "rateChange")
    protected Boolean rateChange;
    @XmlAttribute(name = "pkgSavingsPercent")
    protected String pkgSavingsPercent;
    @XmlAttribute(name = "pkgSavingsAmount")
    protected String pkgSavingsAmount;

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
     * Gets the value of the chargeableRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfo }
     *     
     */
    public BaseRateInfo getChargeableRateInfo() {
        return chargeableRateInfo;
    }

    /**
     * Sets the value of the chargeableRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfo }
     *     
     */
    public void setChargeableRateInfo(BaseRateInfo value) {
        this.chargeableRateInfo = value;
    }

    /**
     * Gets the value of the convertedRateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfo }
     *     
     */
    public BaseRateInfo getConvertedRateInfo() {
        return convertedRateInfo;
    }

    /**
     * Sets the value of the convertedRateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfo }
     *     
     */
    public void setConvertedRateInfo(BaseRateInfo value) {
        this.convertedRateInfo = value;
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
     * Gets the value of the online property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnline(Boolean value) {
        this.online = value;
    }

    /**
     * Gets the value of the ratePlanType property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanType }
     *     
     */
    public RatePlanType getRatePlanType() {
        return ratePlanType;
    }

    /**
     * Sets the value of the ratePlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanType }
     *     
     */
    public void setRatePlanType(RatePlanType value) {
        this.ratePlanType = value;
    }

    /**
     * Gets the value of the hotelFees property.
     * 
     * @return
     *     possible object is
     *     {@link HotelFees }
     *     
     */
    public HotelFees getHotelFees() {
        return hotelFees;
    }

    /**
     * Sets the value of the hotelFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelFees }
     *     
     */
    public void setHotelFees(HotelFees value) {
        this.hotelFees = value;
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
     * Gets the value of the promoType property.
     * 
     * @return
     *     possible object is
     *     {@link PromoType }
     *     
     */
    public PromoType getPromoType() {
        return promoType;
    }

    /**
     * Sets the value of the promoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromoType }
     *     
     */
    public void setPromoType(PromoType value) {
        this.promoType = value;
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
     * Gets the value of the priceBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceBreakdown() {
        return priceBreakdown;
    }

    /**
     * Sets the value of the priceBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceBreakdown(Boolean value) {
        this.priceBreakdown = value;
    }

    /**
     * Gets the value of the promo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromo() {
        return promo;
    }

    /**
     * Sets the value of the promo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromo(Boolean value) {
        this.promo = value;
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
     * Gets the value of the pkgSavingsPercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgSavingsPercent() {
        return pkgSavingsPercent;
    }

    /**
     * Sets the value of the pkgSavingsPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgSavingsPercent(String value) {
        this.pkgSavingsPercent = value;
    }

    /**
     * Gets the value of the pkgSavingsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgSavingsAmount() {
        return pkgSavingsAmount;
    }

    /**
     * Sets the value of the pkgSavingsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgSavingsAmount(String value) {
        this.pkgSavingsAmount = value;
    }

}
