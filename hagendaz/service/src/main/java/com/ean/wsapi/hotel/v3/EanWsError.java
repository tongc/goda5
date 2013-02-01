
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EanWsError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EanWsError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itineraryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="handling" type="{http://v3.hotel.wsapi.ean.com/}errorHandling" minOccurs="0"/>
 *         &lt;element name="category" type="{http://v3.hotel.wsapi.ean.com/}errorCategory" minOccurs="0"/>
 *         &lt;element name="exceptionConditionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorAttributes" type="{http://v3.hotel.wsapi.ean.com/}ErrorAttributes" minOccurs="0"/>
 *         &lt;element name="presentationMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="verboseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServerInfo" type="{http://v3.hotel.wsapi.ean.com/}ServerInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EanWsError", propOrder = {
    "itineraryId",
    "handling",
    "category",
    "exceptionConditionId",
    "errorAttributes",
    "presentationMessage",
    "verboseMessage",
    "serverInfo"
})
public class EanWsError {

    protected long itineraryId;
    protected ErrorHandling handling;
    protected ErrorCategory category;
    protected int exceptionConditionId;
    @XmlElement(name = "ErrorAttributes")
    protected ErrorAttributes errorAttributes;
    protected String presentationMessage;
    protected String verboseMessage;
    @XmlElement(name = "ServerInfo")
    protected ServerInfo serverInfo;

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
     * Gets the value of the handling property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling }
     *     
     */
    public ErrorHandling getHandling() {
        return handling;
    }

    /**
     * Sets the value of the handling property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling }
     *     
     */
    public void setHandling(ErrorHandling value) {
        this.handling = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCategory }
     *     
     */
    public ErrorCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCategory }
     *     
     */
    public void setCategory(ErrorCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the exceptionConditionId property.
     * 
     */
    public int getExceptionConditionId() {
        return exceptionConditionId;
    }

    /**
     * Sets the value of the exceptionConditionId property.
     * 
     */
    public void setExceptionConditionId(int value) {
        this.exceptionConditionId = value;
    }

    /**
     * Gets the value of the errorAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorAttributes }
     *     
     */
    public ErrorAttributes getErrorAttributes() {
        return errorAttributes;
    }

    /**
     * Sets the value of the errorAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorAttributes }
     *     
     */
    public void setErrorAttributes(ErrorAttributes value) {
        this.errorAttributes = value;
    }

    /**
     * Gets the value of the presentationMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationMessage() {
        return presentationMessage;
    }

    /**
     * Sets the value of the presentationMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationMessage(String value) {
        this.presentationMessage = value;
    }

    /**
     * Gets the value of the verboseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerboseMessage() {
        return verboseMessage;
    }

    /**
     * Sets the value of the verboseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerboseMessage(String value) {
        this.verboseMessage = value;
    }

    /**
     * Gets the value of the serverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServerInfo }
     *     
     */
    public ServerInfo getServerInfo() {
        return serverInfo;
    }

    /**
     * Sets the value of the serverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerInfo }
     *     
     */
    public void setServerInfo(ServerInfo value) {
        this.serverInfo = value;
    }

}
