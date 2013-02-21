
package com.ean.wsapi.hotel.v3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseRateInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseRateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Discounts" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfoDiscounts" minOccurs="0"/>
 *         &lt;element name="NightlyRatesPerRoom" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfoNightlyRatesPerRoom" minOccurs="0"/>
 *         &lt;element name="promoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Surcharges" type="{http://v3.hotel.wsapi.ean.com/}baseRateInfoSurcharges" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="averageBaseRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="averageRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="commissionableUsdTotal" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="discountTotal" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="eanCompensationOffline" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="eanCompensationOnline" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maxNightlyRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="nightlyRateTotal" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="grossProfitOffline" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="grossProfitOnline" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="surchargeTotal" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseRateInfo", propOrder = {
    "discounts",
    "nightlyRatesPerRoom",
    "promoDescription",
    "surcharges"
})
public class BaseRateInfo {

    @XmlElement(name = "Discounts")
    protected BaseRateInfoDiscounts discounts;
    @XmlElement(name = "NightlyRatesPerRoom")
    protected BaseRateInfoNightlyRatesPerRoom nightlyRatesPerRoom;
    protected String promoDescription;
    @XmlElement(name = "Surcharges")
    protected BaseRateInfoSurcharges surcharges;
    @XmlAttribute(name = "averageBaseRate")
    protected Float averageBaseRate;
    @XmlAttribute(name = "averageRate")
    protected Float averageRate;
    @XmlAttribute(name = "commissionableUsdTotal")
    protected Float commissionableUsdTotal;
    @XmlAttribute(name = "currencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "discountTotal")
    protected Float discountTotal;
    @XmlAttribute(name = "eanCompensationOffline")
    protected BigDecimal eanCompensationOffline;
    @XmlAttribute(name = "eanCompensationOnline")
    protected BigDecimal eanCompensationOnline;
    @XmlAttribute(name = "maxNightlyRate")
    protected Float maxNightlyRate;
    @XmlAttribute(name = "nightlyRateTotal")
    protected Float nightlyRateTotal;
    @XmlAttribute(name = "grossProfitOffline")
    protected BigDecimal grossProfitOffline;
    @XmlAttribute(name = "grossProfitOnline")
    protected BigDecimal grossProfitOnline;
    @XmlAttribute(name = "surchargeTotal")
    protected Float surchargeTotal;
    @XmlAttribute(name = "total")
    protected Float total;

    /**
     * Gets the value of the discounts property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfoDiscounts }
     *     
     */
    public BaseRateInfoDiscounts getDiscounts() {
        return discounts;
    }

    /**
     * Sets the value of the discounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfoDiscounts }
     *     
     */
    public void setDiscounts(BaseRateInfoDiscounts value) {
        this.discounts = value;
    }

    /**
     * Gets the value of the nightlyRatesPerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfoNightlyRatesPerRoom }
     *     
     */
    public BaseRateInfoNightlyRatesPerRoom getNightlyRatesPerRoom() {
        return nightlyRatesPerRoom;
    }

    /**
     * Sets the value of the nightlyRatesPerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfoNightlyRatesPerRoom }
     *     
     */
    public void setNightlyRatesPerRoom(BaseRateInfoNightlyRatesPerRoom value) {
        this.nightlyRatesPerRoom = value;
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
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateInfoSurcharges }
     *     
     */
    public BaseRateInfoSurcharges getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateInfoSurcharges }
     *     
     */
    public void setSurcharges(BaseRateInfoSurcharges value) {
        this.surcharges = value;
    }

    /**
     * Gets the value of the averageBaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageBaseRate() {
        return averageBaseRate;
    }

    /**
     * Sets the value of the averageBaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageBaseRate(Float value) {
        this.averageBaseRate = value;
    }

    /**
     * Gets the value of the averageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageRate() {
        return averageRate;
    }

    /**
     * Sets the value of the averageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageRate(Float value) {
        this.averageRate = value;
    }

    /**
     * Gets the value of the commissionableUsdTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCommissionableUsdTotal() {
        return commissionableUsdTotal;
    }

    /**
     * Sets the value of the commissionableUsdTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCommissionableUsdTotal(Float value) {
        this.commissionableUsdTotal = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the discountTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiscountTotal() {
        return discountTotal;
    }

    /**
     * Sets the value of the discountTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiscountTotal(Float value) {
        this.discountTotal = value;
    }

    /**
     * Gets the value of the eanCompensationOffline property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEanCompensationOffline() {
        return eanCompensationOffline;
    }

    /**
     * Sets the value of the eanCompensationOffline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEanCompensationOffline(BigDecimal value) {
        this.eanCompensationOffline = value;
    }

    /**
     * Gets the value of the eanCompensationOnline property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEanCompensationOnline() {
        return eanCompensationOnline;
    }

    /**
     * Sets the value of the eanCompensationOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEanCompensationOnline(BigDecimal value) {
        this.eanCompensationOnline = value;
    }

    /**
     * Gets the value of the maxNightlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxNightlyRate() {
        return maxNightlyRate;
    }

    /**
     * Sets the value of the maxNightlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxNightlyRate(Float value) {
        this.maxNightlyRate = value;
    }

    /**
     * Gets the value of the nightlyRateTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNightlyRateTotal() {
        return nightlyRateTotal;
    }

    /**
     * Sets the value of the nightlyRateTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNightlyRateTotal(Float value) {
        this.nightlyRateTotal = value;
    }

    /**
     * Gets the value of the grossProfitOffline property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossProfitOffline() {
        return grossProfitOffline;
    }

    /**
     * Sets the value of the grossProfitOffline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossProfitOffline(BigDecimal value) {
        this.grossProfitOffline = value;
    }

    /**
     * Gets the value of the grossProfitOnline property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossProfitOnline() {
        return grossProfitOnline;
    }

    /**
     * Sets the value of the grossProfitOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossProfitOnline(BigDecimal value) {
        this.grossProfitOnline = value;
    }

    /**
     * Gets the value of the surchargeTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSurchargeTotal() {
        return surchargeTotal;
    }

    /**
     * Sets the value of the surchargeTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSurchargeTotal(Float value) {
        this.surchargeTotal = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotal(Float value) {
        this.total = value;
    }

}
