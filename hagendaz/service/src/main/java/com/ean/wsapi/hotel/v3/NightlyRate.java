
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NightlyRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NightlyRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="baseRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="rate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="promo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NightlyRate")
public class NightlyRate {

    @XmlAttribute(name = "baseRate")
    protected Float baseRate;
    @XmlAttribute(name = "rate")
    protected Float rate;
    @XmlAttribute(name = "promo")
    protected Boolean promo;

    /**
     * Gets the value of the baseRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBaseRate() {
        return baseRate;
    }

    /**
     * Sets the value of the baseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBaseRate(Float value) {
        this.baseRate = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRate(Float value) {
        this.rate = value;
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

}
