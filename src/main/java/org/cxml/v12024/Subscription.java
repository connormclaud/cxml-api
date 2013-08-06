//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.05 at 11:46:51 PM EDT 
//


package org.cxml.v12024;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "internalID",
    "subscriptionVersion",
    "name",
    "changetime",
    "supplierID",
    "format",
    "description"
})
@XmlRootElement(name = "Subscription")
public class Subscription {

    @XmlElement(name = "InternalID", required = true)
    protected InternalID internalID;
    @XmlElement(name = "SubscriptionVersion")
    protected SubscriptionVersion subscriptionVersion;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "Changetime", required = true)
    protected String changetime;
    @XmlElement(name = "SupplierID", required = true)
    protected List<SupplierID> supplierID;
    @XmlElement(name = "Format")
    protected Format format;
    @XmlElement(name = "Description")
    protected Description description;

    /**
     * Gets the value of the internalID property.
     * 
     * @return
     *     possible object is
     *     {@link InternalID }
     *     
     */
    public InternalID getInternalID() {
        return internalID;
    }

    /**
     * Sets the value of the internalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalID }
     *     
     */
    public void setInternalID(InternalID value) {
        this.internalID = value;
    }

    /**
     * Gets the value of the subscriptionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionVersion }
     *     
     */
    public SubscriptionVersion getSubscriptionVersion() {
        return subscriptionVersion;
    }

    /**
     * Sets the value of the subscriptionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionVersion }
     *     
     */
    public void setSubscriptionVersion(SubscriptionVersion value) {
        this.subscriptionVersion = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the changetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangetime() {
        return changetime;
    }

    /**
     * Sets the value of the changetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangetime(String value) {
        this.changetime = value;
    }

    /**
     * Gets the value of the supplierID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierID }
     * 
     * 
     */
    public List<SupplierID> getSupplierID() {
        if (supplierID == null) {
            supplierID = new ArrayList<SupplierID>();
        }
        return this.supplierID;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link Format }
     *     
     */
    public Format getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link Format }
     *     
     */
    public void setFormat(Format value) {
        this.format = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

}
