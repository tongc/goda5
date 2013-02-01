
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Itinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Itinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="affiliateId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itineraryStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itineraryEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://v3.hotel.wsapi.ean.com/}Customer" minOccurs="0"/>
 *         &lt;element name="HotelConfirmation" type="{http://v3.hotel.wsapi.ean.com/}HotelConfirmation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {
    "itineraryId",
    "affiliateId",
    "creationDate",
    "creationTime",
    "itineraryStartDate",
    "itineraryEndDate",
    "affiliateCustomerId",
    "customer",
    "hotelConfirmation"
})
public class Itinerary {

    protected long itineraryId;
    protected long affiliateId;
    protected String creationDate;
    protected String creationTime;
    protected String itineraryStartDate;
    protected String itineraryEndDate;
    protected String affiliateCustomerId;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "HotelConfirmation")
    protected List<HotelConfirmation> hotelConfirmation;

    /**
     * Gets the value of the itineraryId property.
     * 
     */
    public long getItineraryId() {
        return itineraryId;
    }

    /**
     * Sets the value of the itineraryId property.
     * 
     */
    public void setItineraryId(long value) {
        this.itineraryId = value;
    }

    /**
     * Gets the value of the affiliateId property.
     * 
     */
    public long getAffiliateId() {
        return affiliateId;
    }

    /**
     * Sets the value of the affiliateId property.
     * 
     */
    public void setAffiliateId(long value) {
        this.affiliateId = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTime(String value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the itineraryStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryStartDate() {
        return itineraryStartDate;
    }

    /**
     * Sets the value of the itineraryStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryStartDate(String value) {
        this.itineraryStartDate = value;
    }

    /**
     * Gets the value of the itineraryEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryEndDate() {
        return itineraryEndDate;
    }

    /**
     * Sets the value of the itineraryEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryEndDate(String value) {
        this.itineraryEndDate = value;
    }

    /**
     * Gets the value of the affiliateCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateCustomerId() {
        return affiliateCustomerId;
    }

    /**
     * Sets the value of the affiliateCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateCustomerId(String value) {
        this.affiliateCustomerId = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the hotelConfirmation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelConfirmation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelConfirmation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelConfirmation }
     * 
     * 
     */
    public List<HotelConfirmation> getHotelConfirmation() {
        if (hotelConfirmation == null) {
            hotelConfirmation = new ArrayList<HotelConfirmation>();
        }
        return this.hotelConfirmation;
    }

}
