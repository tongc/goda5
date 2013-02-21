
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRateRulesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRateRulesResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="ratePlanText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nativeCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guaranteeMethods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancellationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="miscellaneous" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraChargeRollawayAdult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraChargeRollawayChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraChargeCrib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraChargeAdult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalRoomRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateChangeInfos" type="{http://v3.hotel.wsapi.ean.com/}RateChangeInfos" minOccurs="0"/>
 *         &lt;element name="RateRulesFreeFlows" type="{http://v3.hotel.wsapi.ean.com/}RateRulesFreeFlows" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRateRulesResponse", propOrder = {
    "ratePlanText",
    "nativeCurrencyCode",
    "guaranteeMethods",
    "depositText",
    "cancellationPolicy",
    "miscellaneous",
    "extraChargeRollawayAdult",
    "extraChargeRollawayChild",
    "extraChargeCrib",
    "extraChargeAdult",
    "roomDescription",
    "roomRate",
    "totalRoomRate",
    "rateChangeInfos",
    "rateRulesFreeFlows"
})
public class HotelRateRulesResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected String ratePlanText;
    protected String nativeCurrencyCode;
    protected String guaranteeMethods;
    protected String depositText;
    protected String cancellationPolicy;
    protected String miscellaneous;
    protected String extraChargeRollawayAdult;
    protected String extraChargeRollawayChild;
    protected String extraChargeCrib;
    protected String extraChargeAdult;
    protected String roomDescription;
    protected String roomRate;
    protected String totalRoomRate;
    @XmlElement(name = "RateChangeInfos")
    protected RateChangeInfos rateChangeInfos;
    @XmlElement(name = "RateRulesFreeFlows")
    protected RateRulesFreeFlows rateRulesFreeFlows;

    /**
     * Gets the value of the ratePlanText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanText() {
        return ratePlanText;
    }

    /**
     * Sets the value of the ratePlanText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanText(String value) {
        this.ratePlanText = value;
    }

    /**
     * Gets the value of the nativeCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeCurrencyCode() {
        return nativeCurrencyCode;
    }

    /**
     * Sets the value of the nativeCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeCurrencyCode(String value) {
        this.nativeCurrencyCode = value;
    }

    /**
     * Gets the value of the guaranteeMethods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeMethods() {
        return guaranteeMethods;
    }

    /**
     * Sets the value of the guaranteeMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeMethods(String value) {
        this.guaranteeMethods = value;
    }

    /**
     * Gets the value of the depositText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositText() {
        return depositText;
    }

    /**
     * Sets the value of the depositText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositText(String value) {
        this.depositText = value;
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
     * Gets the value of the miscellaneous property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscellaneous() {
        return miscellaneous;
    }

    /**
     * Sets the value of the miscellaneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscellaneous(String value) {
        this.miscellaneous = value;
    }

    /**
     * Gets the value of the extraChargeRollawayAdult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChargeRollawayAdult() {
        return extraChargeRollawayAdult;
    }

    /**
     * Sets the value of the extraChargeRollawayAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChargeRollawayAdult(String value) {
        this.extraChargeRollawayAdult = value;
    }

    /**
     * Gets the value of the extraChargeRollawayChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChargeRollawayChild() {
        return extraChargeRollawayChild;
    }

    /**
     * Sets the value of the extraChargeRollawayChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChargeRollawayChild(String value) {
        this.extraChargeRollawayChild = value;
    }

    /**
     * Gets the value of the extraChargeCrib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChargeCrib() {
        return extraChargeCrib;
    }

    /**
     * Sets the value of the extraChargeCrib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChargeCrib(String value) {
        this.extraChargeCrib = value;
    }

    /**
     * Gets the value of the extraChargeAdult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChargeAdult() {
        return extraChargeAdult;
    }

    /**
     * Sets the value of the extraChargeAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChargeAdult(String value) {
        this.extraChargeAdult = value;
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
     * Gets the value of the roomRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomRate() {
        return roomRate;
    }

    /**
     * Sets the value of the roomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomRate(String value) {
        this.roomRate = value;
    }

    /**
     * Gets the value of the totalRoomRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRoomRate() {
        return totalRoomRate;
    }

    /**
     * Sets the value of the totalRoomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRoomRate(String value) {
        this.totalRoomRate = value;
    }

    /**
     * Gets the value of the rateChangeInfos property.
     * 
     * @return
     *     possible object is
     *     {@link RateChangeInfos }
     *     
     */
    public RateChangeInfos getRateChangeInfos() {
        return rateChangeInfos;
    }

    /**
     * Sets the value of the rateChangeInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateChangeInfos }
     *     
     */
    public void setRateChangeInfos(RateChangeInfos value) {
        this.rateChangeInfos = value;
    }

    /**
     * Gets the value of the rateRulesFreeFlows property.
     * 
     * @return
     *     possible object is
     *     {@link RateRulesFreeFlows }
     *     
     */
    public RateRulesFreeFlows getRateRulesFreeFlows() {
        return rateRulesFreeFlows;
    }

    /**
     * Sets the value of the rateRulesFreeFlows property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateRulesFreeFlows }
     *     
     */
    public void setRateRulesFreeFlows(RateRulesFreeFlows value) {
        this.rateRulesFreeFlows = value;
    }

}
