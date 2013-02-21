
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CachedSupplierResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CachedSupplierResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *       &lt;/all>
 *       &lt;attribute name="supplierCacheTolerance" type="{http://v3.hotel.wsapi.ean.com/}SupplierCacheTolerance" />
 *       &lt;attribute name="cachedTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="cacheEntryHitNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cacheEntryMissNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cacheEntryExpiredNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="cacheRetrievalTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="supplierRequestNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="supplierResponseNum" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="supplierResponseTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="candidatePreptime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="otherOverheadTime" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="tpidUsed" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="matchedCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="matchedLocale" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="extrapolatedCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="extrapolatedLocale" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CachedSupplierResponse", propOrder = {

})
public class CachedSupplierResponse {

    @XmlAttribute(name = "supplierCacheTolerance")
    protected SupplierCacheTolerance supplierCacheTolerance;
    @XmlAttribute(name = "cachedTime")
    protected Long cachedTime;
    @XmlAttribute(name = "cacheEntryHitNum")
    protected Integer cacheEntryHitNum;
    @XmlAttribute(name = "cacheEntryMissNum")
    protected Integer cacheEntryMissNum;
    @XmlAttribute(name = "cacheEntryExpiredNum")
    protected Integer cacheEntryExpiredNum;
    @XmlAttribute(name = "cacheRetrievalTime")
    protected Long cacheRetrievalTime;
    @XmlAttribute(name = "supplierRequestNum")
    protected Integer supplierRequestNum;
    @XmlAttribute(name = "supplierResponseNum")
    protected Integer supplierResponseNum;
    @XmlAttribute(name = "supplierResponseTime")
    protected Long supplierResponseTime;
    @XmlAttribute(name = "candidatePreptime")
    protected Long candidatePreptime;
    @XmlAttribute(name = "otherOverheadTime")
    protected Long otherOverheadTime;
    @XmlAttribute(name = "tpidUsed")
    protected Integer tpidUsed;
    @XmlAttribute(name = "matchedCurrency")
    protected Boolean matchedCurrency;
    @XmlAttribute(name = "matchedLocale")
    protected Boolean matchedLocale;
    @XmlAttribute(name = "extrapolatedCurrency")
    protected Boolean extrapolatedCurrency;
    @XmlAttribute(name = "extrapolatedLocale")
    protected Boolean extrapolatedLocale;

    /**
     * Gets the value of the supplierCacheTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierCacheTolerance }
     *     
     */
    public SupplierCacheTolerance getSupplierCacheTolerance() {
        return supplierCacheTolerance;
    }

    /**
     * Sets the value of the supplierCacheTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierCacheTolerance }
     *     
     */
    public void setSupplierCacheTolerance(SupplierCacheTolerance value) {
        this.supplierCacheTolerance = value;
    }

    /**
     * Gets the value of the cachedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCachedTime() {
        return cachedTime;
    }

    /**
     * Sets the value of the cachedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCachedTime(Long value) {
        this.cachedTime = value;
    }

    /**
     * Gets the value of the cacheEntryHitNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCacheEntryHitNum() {
        return cacheEntryHitNum;
    }

    /**
     * Sets the value of the cacheEntryHitNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheEntryHitNum(Integer value) {
        this.cacheEntryHitNum = value;
    }

    /**
     * Gets the value of the cacheEntryMissNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCacheEntryMissNum() {
        return cacheEntryMissNum;
    }

    /**
     * Sets the value of the cacheEntryMissNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheEntryMissNum(Integer value) {
        this.cacheEntryMissNum = value;
    }

    /**
     * Gets the value of the cacheEntryExpiredNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCacheEntryExpiredNum() {
        return cacheEntryExpiredNum;
    }

    /**
     * Sets the value of the cacheEntryExpiredNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCacheEntryExpiredNum(Integer value) {
        this.cacheEntryExpiredNum = value;
    }

    /**
     * Gets the value of the cacheRetrievalTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCacheRetrievalTime() {
        return cacheRetrievalTime;
    }

    /**
     * Sets the value of the cacheRetrievalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCacheRetrievalTime(Long value) {
        this.cacheRetrievalTime = value;
    }

    /**
     * Gets the value of the supplierRequestNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierRequestNum() {
        return supplierRequestNum;
    }

    /**
     * Sets the value of the supplierRequestNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierRequestNum(Integer value) {
        this.supplierRequestNum = value;
    }

    /**
     * Gets the value of the supplierResponseNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSupplierResponseNum() {
        return supplierResponseNum;
    }

    /**
     * Sets the value of the supplierResponseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSupplierResponseNum(Integer value) {
        this.supplierResponseNum = value;
    }

    /**
     * Gets the value of the supplierResponseTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupplierResponseTime() {
        return supplierResponseTime;
    }

    /**
     * Sets the value of the supplierResponseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupplierResponseTime(Long value) {
        this.supplierResponseTime = value;
    }

    /**
     * Gets the value of the candidatePreptime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCandidatePreptime() {
        return candidatePreptime;
    }

    /**
     * Sets the value of the candidatePreptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCandidatePreptime(Long value) {
        this.candidatePreptime = value;
    }

    /**
     * Gets the value of the otherOverheadTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherOverheadTime() {
        return otherOverheadTime;
    }

    /**
     * Sets the value of the otherOverheadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherOverheadTime(Long value) {
        this.otherOverheadTime = value;
    }

    /**
     * Gets the value of the tpidUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTpidUsed() {
        return tpidUsed;
    }

    /**
     * Sets the value of the tpidUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTpidUsed(Integer value) {
        this.tpidUsed = value;
    }

    /**
     * Gets the value of the matchedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchedCurrency() {
        return matchedCurrency;
    }

    /**
     * Sets the value of the matchedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchedCurrency(Boolean value) {
        this.matchedCurrency = value;
    }

    /**
     * Gets the value of the matchedLocale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMatchedLocale() {
        return matchedLocale;
    }

    /**
     * Sets the value of the matchedLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMatchedLocale(Boolean value) {
        this.matchedLocale = value;
    }

    /**
     * Gets the value of the extrapolatedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtrapolatedCurrency() {
        return extrapolatedCurrency;
    }

    /**
     * Sets the value of the extrapolatedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrapolatedCurrency(Boolean value) {
        this.extrapolatedCurrency = value;
    }

    /**
     * Gets the value of the extrapolatedLocale property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtrapolatedLocale() {
        return extrapolatedLocale;
    }

    /**
     * Sets the value of the extrapolatedLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtrapolatedLocale(Boolean value) {
        this.extrapolatedLocale = value;
    }

}
