
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelItineraryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelItineraryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateConfirmationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliateCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItineraryQuery" type="{http://v3.hotel.wsapi.ean.com/}ItineraryQuery" minOccurs="0"/>
 *         &lt;element name="confirmationExtras" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supplierConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelItineraryRequest", propOrder = {
    "itineraryId",
    "lastName",
    "email",
    "affiliateConfirmationId",
    "affiliateCustomerId",
    "creditCardNumber",
    "itineraryQuery",
    "confirmationExtras",
    "supplierConfirmationNumber"
})
public class HotelItineraryRequest
    extends HotelBaseRequest
{

    protected Long itineraryId;
    protected String lastName;
    protected String email;
    protected String affiliateConfirmationId;
    protected String affiliateCustomerId;
    protected String creditCardNumber;
    @XmlElement(name = "ItineraryQuery")
    protected ItineraryQuery itineraryQuery;
    protected List<String> confirmationExtras;
    protected String supplierConfirmationNumber;

    /**
     * Gets the value of the itineraryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItineraryId() {
        return itineraryId;
    }

    /**
     * Sets the value of the itineraryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItineraryId(Long value) {
        this.itineraryId = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the affiliateConfirmationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffiliateConfirmationId() {
        return affiliateConfirmationId;
    }

    /**
     * Sets the value of the affiliateConfirmationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliateConfirmationId(String value) {
        this.affiliateConfirmationId = value;
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
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the itineraryQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryQuery }
     *     
     */
    public ItineraryQuery getItineraryQuery() {
        return itineraryQuery;
    }

    /**
     * Sets the value of the itineraryQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryQuery }
     *     
     */
    public void setItineraryQuery(ItineraryQuery value) {
        this.itineraryQuery = value;
    }

    /**
     * Gets the value of the confirmationExtras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmationExtras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfirmationExtras().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConfirmationExtras() {
        if (confirmationExtras == null) {
            confirmationExtras = new ArrayList<String>();
        }
        return this.confirmationExtras;
    }

    /**
     * Gets the value of the supplierConfirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierConfirmationNumber() {
        return supplierConfirmationNumber;
    }

    /**
     * Sets the value of the supplierConfirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierConfirmationNumber(String value) {
        this.supplierConfirmationNumber = value;
    }

}
