
package com.ean.wsapi.hotel.v3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelPolicyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPolicyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cancelTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startWindowHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nightCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPolicyInfo", propOrder = {
    "versionId",
    "cancelTime",
    "startWindowHours",
    "nightCount",
    "percent",
    "amount",
    "currencyCode",
    "timeZoneDescription"
})
public class CancelPolicyInfo {

    protected int versionId;
    protected String cancelTime;
    protected String startWindowHours;
    protected int nightCount;
    protected String percent;
    protected BigDecimal amount;
    protected String currencyCode;
    protected String timeZoneDescription;

    /**
     * Gets the value of the versionId property.
     * 
     */
    public int getVersionId() {
        return versionId;
    }

    /**
     * Sets the value of the versionId property.
     * 
     */
    public void setVersionId(int value) {
        this.versionId = value;
    }

    /**
     * Gets the value of the cancelTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelTime() {
        return cancelTime;
    }

    /**
     * Sets the value of the cancelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelTime(String value) {
        this.cancelTime = value;
    }

    /**
     * Gets the value of the startWindowHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartWindowHours() {
        return startWindowHours;
    }

    /**
     * Sets the value of the startWindowHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartWindowHours(String value) {
        this.startWindowHours = value;
    }

    /**
     * Gets the value of the nightCount property.
     * 
     */
    public int getNightCount() {
        return nightCount;
    }

    /**
     * Sets the value of the nightCount property.
     * 
     */
    public void setNightCount(int value) {
        this.nightCount = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercent(String value) {
        this.percent = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
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
     * Gets the value of the timeZoneDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneDescription() {
        return timeZoneDescription;
    }

    /**
     * Sets the value of the timeZoneDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneDescription(String value) {
        this.timeZoneDescription = value;
    }

}
