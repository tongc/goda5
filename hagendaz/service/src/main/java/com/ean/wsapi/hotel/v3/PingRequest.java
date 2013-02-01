
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PingRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v3.hotel.wsapi.ean.com/}HotelBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="echo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PingRequest", propOrder = {
    "echo"
})
public class PingRequest
    extends HotelBaseRequest
{

    protected String echo;

    /**
     * Gets the value of the echo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcho() {
        return echo;
    }

    /**
     * Sets the value of the echo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcho(String value) {
        this.echo = value;
    }

}
