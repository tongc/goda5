
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDateStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeChildAffiliates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryQuery", propOrder = {
    "creationDateStart",
    "creationDateEnd",
    "departureDateStart",
    "departureDateEnd",
    "includeChildAffiliates"
})
public class ItineraryQuery {

    protected String creationDateStart;
    protected String creationDateEnd;
    protected String departureDateStart;
    protected String departureDateEnd;
    protected Boolean includeChildAffiliates;

    /**
     * Gets the value of the creationDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateStart() {
        return creationDateStart;
    }

    /**
     * Sets the value of the creationDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateStart(String value) {
        this.creationDateStart = value;
    }

    /**
     * Gets the value of the creationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateEnd() {
        return creationDateEnd;
    }

    /**
     * Sets the value of the creationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateEnd(String value) {
        this.creationDateEnd = value;
    }

    /**
     * Gets the value of the departureDateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateStart() {
        return departureDateStart;
    }

    /**
     * Sets the value of the departureDateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateStart(String value) {
        this.departureDateStart = value;
    }

    /**
     * Gets the value of the departureDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDateEnd() {
        return departureDateEnd;
    }

    /**
     * Sets the value of the departureDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDateEnd(String value) {
        this.departureDateEnd = value;
    }

    /**
     * Gets the value of the includeChildAffiliates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeChildAffiliates() {
        return includeChildAffiliates;
    }

    /**
     * Sets the value of the includeChildAffiliates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeChildAffiliates(Boolean value) {
        this.includeChildAffiliates = value;
    }

}
