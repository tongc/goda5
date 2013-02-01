
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PingRequest" type="{http://v3.hotel.wsapi.ean.com/}PingRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPing", propOrder = {
    "pingRequest"
})
public class GetPing {

    @XmlElement(name = "PingRequest")
    protected PingRequest pingRequest;

    /**
     * Gets the value of the pingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PingRequest }
     *     
     */
    public PingRequest getPingRequest() {
        return pingRequest;
    }

    /**
     * Sets the value of the pingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PingRequest }
     *     
     */
    public void setPingRequest(PingRequest value) {
        this.pingRequest = value;
    }

}
