//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.06 at 12:45:09 AM EDT 
//


package org.cxml.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unitRate",
    "period"
})
@XmlRootElement(name = "FeeDetail")
public class FeeDetail {

    @XmlAttribute(name = "isRecurring")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isRecurring;
    @XmlElement(name = "UnitRate", required = true)
    protected List<UnitRate> unitRate;
    @XmlElement(name = "Period")
    protected Period period;

    /**
     * Gets the value of the isRecurring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRecurring() {
        return isRecurring;
    }

    /**
     * Sets the value of the isRecurring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRecurring(String value) {
        this.isRecurring = value;
    }

    /**
     * Gets the value of the unitRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitRate }
     * 
     * 
     */
    public List<UnitRate> getUnitRate() {
        if (unitRate == null) {
            unitRate = new ArrayList<UnitRate>();
        }
        return this.unitRate;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

}
