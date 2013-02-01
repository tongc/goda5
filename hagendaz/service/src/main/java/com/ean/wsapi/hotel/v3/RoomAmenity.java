
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomAmenity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomAmenity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amenity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="amenityId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomAmenity", propOrder = {
    "amenity"
})
public class RoomAmenity {

    @XmlElement(required = true)
    protected String amenity;
    @XmlAttribute(name = "amenityId", required = true)
    protected long amenityId;

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

}
