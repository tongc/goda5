
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyAmenity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyAmenity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amenityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="amenity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyAmenity", propOrder = {
    "amenityId",
    "amenity"
})
public class PropertyAmenity {

    protected long amenityId;
    protected String amenity;

    /**
     * Gets the value of the amenityId property.
     * 
     */
    public long getAmenityId() {
        return amenityId;
    }

    /**
     * Sets the value of the amenityId property.
     * 
     */
    public void setAmenityId(long value) {
        this.amenityId = value;
    }

    /**
     * Gets the value of the amenity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenity() {
        return amenity;
    }

    /**
     * Sets the value of the amenity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenity(String value) {
        this.amenity = value;
    }

}
