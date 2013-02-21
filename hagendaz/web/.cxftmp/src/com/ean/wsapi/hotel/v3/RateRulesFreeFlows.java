
package com.ean.wsapi.hotel.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateRulesFreeFlows complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateRulesFreeFlows">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateRulesFreeFlow" type="{http://v3.hotel.wsapi.ean.com/}RateRulesFreeFlow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateRulesFreeFlows", propOrder = {
    "rateRulesFreeFlow"
})
public class RateRulesFreeFlows {

    protected List<RateRulesFreeFlow> rateRulesFreeFlow;
    @XmlAttribute(name = "size", required = true)
    protected int size;

    /**
     * Gets the value of the rateRulesFreeFlow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateRulesFreeFlow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateRulesFreeFlow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateRulesFreeFlow }
     * 
     * 
     */
    public List<RateRulesFreeFlow> getRateRulesFreeFlow() {
        if (rateRulesFreeFlow == null) {
            rateRulesFreeFlow = new ArrayList<RateRulesFreeFlow>();
        }
        return this.rateRulesFreeFlow;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

}
