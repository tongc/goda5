
package com.ean.wsapi.hotel.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAlternateProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAlternateProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternatePropertyListRequest" type="{http://v3.hotel.wsapi.ean.com/}AlternatePropertyListRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlternateProperties", propOrder = {
    "alternatePropertyListRequest"
})
public class GetAlternateProperties {

    @XmlElement(name = "AlternatePropertyListRequest")
    protected AlternatePropertyListRequest alternatePropertyListRequest;

    /**
     * Gets the value of the alternatePropertyListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePropertyListRequest }
     *     
     */
    public AlternatePropertyListRequest getAlternatePropertyListRequest() {
        return alternatePropertyListRequest;
    }

    /**
     * Sets the value of the alternatePropertyListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePropertyListRequest }
     *     
     */
    public void setAlternatePropertyListRequest(AlternatePropertyListRequest value) {
        this.alternatePropertyListRequest = value;
    }

}
