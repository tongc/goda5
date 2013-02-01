
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PingResponse" type="{http://v3.hotel.wsapi.ean.com/}PingResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPingResponse", propOrder = {
    "pingResponse"
})
public class GetPingResponse {

    @XmlElement(name = "PingResponse")
    protected PingResponse pingResponse;

    /**
     * Gets the value of the pingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PingResponse }
     *     
     */
    public PingResponse getPingResponse() {
        return pingResponse;
    }

    /**
     * Sets the value of the pingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PingResponse }
     *     
     */
    public void setPingResponse(PingResponse value) {
        this.pingResponse = value;
    }

}
