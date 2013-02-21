
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelPolicyInfoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelPolicyInfoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelPolicyInfo" type="{http://v3.hotel.wsapi.ean.com/}CancelPolicyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelPolicyInfoList", propOrder = {
    "cancelPolicyInfo"
})
public class CancelPolicyInfoList {

    @XmlElement(name = "CancelPolicyInfo")
    protected List<CancelPolicyInfo> cancelPolicyInfo;

    /**
     * Gets the value of the cancelPolicyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelPolicyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelPolicyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelPolicyInfo }
     * 
     * 
     */
    public List<CancelPolicyInfo> getCancelPolicyInfo() {
        if (cancelPolicyInfo == null) {
            cancelPolicyInfo = new ArrayList<CancelPolicyInfo>();
        }
        return this.cancelPolicyInfo;
    }

}
