
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nativeCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numberOfFloors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="checkInTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkOutTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraPersonCharge" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="propertyInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propertyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guaranteePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guaranteeCreditCardsAccepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depositCreditCardsAccepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="drivingDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkInInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDetails", propOrder = {
    "nativeCurrencyCode",
    "numberOfRooms",
    "numberOfFloors",
    "checkInTime",
    "checkOutTime",
    "extraPersonCharge",
    "propertyInformation",
    "areaInformation",
    "propertyDescription",
    "hotelPolicy",
    "guaranteePolicy",
    "depositPolicy",
    "guaranteeCreditCardsAccepted",
    "depositCreditCardsAccepted",
    "roomInformation",
    "drivingDirections",
    "checkInInstructions"
})
public class HotelDetails {

    protected String nativeCurrencyCode;
    protected Integer numberOfRooms;
    protected Integer numberOfFloors;
    protected String checkInTime;
    protected String checkOutTime;
    protected Float extraPersonCharge;
    protected String propertyInformation;
    protected String areaInformation;
    protected String propertyDescription;
    protected String hotelPolicy;
    protected String guaranteePolicy;
    protected String depositPolicy;
    protected String guaranteeCreditCardsAccepted;
    protected String depositCreditCardsAccepted;
    protected String roomInformation;
    protected String drivingDirections;
    protected String checkInInstructions;

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
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRooms(Integer value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the numberOfFloors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * Sets the value of the numberOfFloors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfFloors(Integer value) {
        this.numberOfFloors = value;
    }

    /**
     * Gets the value of the checkInTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInTime() {
        return checkInTime;
    }

    /**
     * Sets the value of the checkInTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInTime(String value) {
        this.checkInTime = value;
    }

    /**
     * Gets the value of the checkOutTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutTime() {
        return checkOutTime;
    }

    /**
     * Sets the value of the checkOutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutTime(String value) {
        this.checkOutTime = value;
    }

    /**
     * Gets the value of the extraPersonCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getExtraPersonCharge() {
        return extraPersonCharge;
    }

    /**
     * Sets the value of the extraPersonCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setExtraPersonCharge(Float value) {
        this.extraPersonCharge = value;
    }

    /**
     * Gets the value of the propertyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyInformation() {
        return propertyInformation;
    }

    /**
     * Sets the value of the propertyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyInformation(String value) {
        this.propertyInformation = value;
    }

    /**
     * Gets the value of the areaInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaInformation() {
        return areaInformation;
    }

    /**
     * Sets the value of the areaInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaInformation(String value) {
        this.areaInformation = value;
    }

    /**
     * Gets the value of the propertyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyDescription() {
        return propertyDescription;
    }

    /**
     * Sets the value of the propertyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyDescription(String value) {
        this.propertyDescription = value;
    }

    /**
     * Gets the value of the hotelPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelPolicy() {
        return hotelPolicy;
    }

    /**
     * Sets the value of the hotelPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelPolicy(String value) {
        this.hotelPolicy = value;
    }

    /**
     * Gets the value of the guaranteePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteePolicy() {
        return guaranteePolicy;
    }

    /**
     * Sets the value of the guaranteePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteePolicy(String value) {
        this.guaranteePolicy = value;
    }

    /**
     * Gets the value of the depositPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositPolicy() {
        return depositPolicy;
    }

    /**
     * Sets the value of the depositPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositPolicy(String value) {
        this.depositPolicy = value;
    }

    /**
     * Gets the value of the guaranteeCreditCardsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeCreditCardsAccepted() {
        return guaranteeCreditCardsAccepted;
    }

    /**
     * Sets the value of the guaranteeCreditCardsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeCreditCardsAccepted(String value) {
        this.guaranteeCreditCardsAccepted = value;
    }

    /**
     * Gets the value of the depositCreditCardsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositCreditCardsAccepted() {
        return depositCreditCardsAccepted;
    }

    /**
     * Sets the value of the depositCreditCardsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositCreditCardsAccepted(String value) {
        this.depositCreditCardsAccepted = value;
    }

    /**
     * Gets the value of the roomInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomInformation() {
        return roomInformation;
    }

    /**
     * Sets the value of the roomInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomInformation(String value) {
        this.roomInformation = value;
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

}
