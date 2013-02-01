
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Amenities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Amenities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fitnessCenter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hotTubOnsite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="interAccessAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="childrensActivities" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kitchenOrKitchinette" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="petsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pool" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="restaurantOnsite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="spaOnsite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="whirlPoolBathAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amenities", propOrder = {
    "businessCenter",
    "fitnessCenter",
    "hotTubOnsite",
    "interAccessAvailable",
    "childrensActivities",
    "kitchenOrKitchinette",
    "petsAllowed",
    "pool",
    "restaurantOnsite",
    "spaOnsite",
    "whirlPoolBathAvailable"
})
public class Amenities {

    protected boolean businessCenter;
    protected boolean fitnessCenter;
    protected boolean hotTubOnsite;
    protected boolean interAccessAvailable;
    protected boolean childrensActivities;
    protected boolean kitchenOrKitchinette;
    protected boolean petsAllowed;
    protected boolean pool;
    protected boolean restaurantOnsite;
    protected boolean spaOnsite;
    protected boolean whirlPoolBathAvailable;

    /**
     * Gets the value of the businessCenter property.
     * 
     */
    public boolean isBusinessCenter() {
        return businessCenter;
    }

    /**
     * Sets the value of the businessCenter property.
     * 
     */
    public void setBusinessCenter(boolean value) {
        this.businessCenter = value;
    }

    /**
     * Gets the value of the fitnessCenter property.
     * 
     */
    public boolean isFitnessCenter() {
        return fitnessCenter;
    }

    /**
     * Sets the value of the fitnessCenter property.
     * 
     */
    public void setFitnessCenter(boolean value) {
        this.fitnessCenter = value;
    }

    /**
     * Gets the value of the hotTubOnsite property.
     * 
     */
    public boolean isHotTubOnsite() {
        return hotTubOnsite;
    }

    /**
     * Sets the value of the hotTubOnsite property.
     * 
     */
    public void setHotTubOnsite(boolean value) {
        this.hotTubOnsite = value;
    }

    /**
     * Gets the value of the interAccessAvailable property.
     * 
     */
    public boolean isInterAccessAvailable() {
        return interAccessAvailable;
    }

    /**
     * Sets the value of the interAccessAvailable property.
     * 
     */
    public void setInterAccessAvailable(boolean value) {
        this.interAccessAvailable = value;
    }

    /**
     * Gets the value of the childrensActivities property.
     * 
     */
    public boolean isChildrensActivities() {
        return childrensActivities;
    }

    /**
     * Sets the value of the childrensActivities property.
     * 
     */
    public void setChildrensActivities(boolean value) {
        this.childrensActivities = value;
    }

    /**
     * Gets the value of the kitchenOrKitchinette property.
     * 
     */
    public boolean isKitchenOrKitchinette() {
        return kitchenOrKitchinette;
    }

    /**
     * Sets the value of the kitchenOrKitchinette property.
     * 
     */
    public void setKitchenOrKitchinette(boolean value) {
        this.kitchenOrKitchinette = value;
    }

    /**
     * Gets the value of the petsAllowed property.
     * 
     */
    public boolean isPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Sets the value of the petsAllowed property.
     * 
     */
    public void setPetsAllowed(boolean value) {
        this.petsAllowed = value;
    }

    /**
     * Gets the value of the pool property.
     * 
     */
    public boolean isPool() {
        return pool;
    }

    /**
     * Sets the value of the pool property.
     * 
     */
    public void setPool(boolean value) {
        this.pool = value;
    }

    /**
     * Gets the value of the restaurantOnsite property.
     * 
     */
    public boolean isRestaurantOnsite() {
        return restaurantOnsite;
    }

    /**
     * Sets the value of the restaurantOnsite property.
     * 
     */
    public void setRestaurantOnsite(boolean value) {
        this.restaurantOnsite = value;
    }

    /**
     * Gets the value of the spaOnsite property.
     * 
     */
    public boolean isSpaOnsite() {
        return spaOnsite;
    }

    /**
     * Sets the value of the spaOnsite property.
     * 
     */
    public void setSpaOnsite(boolean value) {
        this.spaOnsite = value;
    }

    /**
     * Gets the value of the whirlPoolBathAvailable property.
     * 
     */
    public boolean isWhirlPoolBathAvailable() {
        return whirlPoolBathAvailable;
    }

    /**
     * Sets the value of the whirlPoolBathAvailable property.
     * 
     */
    public void setWhirlPoolBathAvailable(boolean value) {
        this.whirlPoolBathAvailable = value;
    }

}
