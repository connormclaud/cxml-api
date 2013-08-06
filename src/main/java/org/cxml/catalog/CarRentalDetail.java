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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vendor",
    "carRentalPickup",
    "carRentalDropoff",
    "bookingClassCode",
    "carRentalFee",
    "limitedMileage",
    "availablePrice"
})
@XmlRootElement(name = "CarRentalDetail")
public class CarRentalDetail {

    @XmlAttribute(name = "travelSegment", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String travelSegment;
    @XmlAttribute(name = "pickupTime", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String pickupTime;
    @XmlAttribute(name = "dropoffTime", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dropoffTime;
    @XmlElement(name = "Vendor", required = true)
    protected Vendor vendor;
    @XmlElement(name = "CarRentalPickup", required = true)
    protected CarRentalPickup carRentalPickup;
    @XmlElement(name = "CarRentalDropoff", required = true)
    protected CarRentalDropoff carRentalDropoff;
    @XmlElement(name = "BookingClassCode")
    protected BookingClassCode bookingClassCode;
    @XmlElement(name = "CarRentalFee", required = true)
    protected List<CarRentalFee> carRentalFee;
    @XmlElement(name = "LimitedMileage")
    protected LimitedMileage limitedMileage;
    @XmlElement(name = "AvailablePrice")
    protected List<AvailablePrice> availablePrice;

    /**
     * Gets the value of the travelSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelSegment() {
        return travelSegment;
    }

    /**
     * Sets the value of the travelSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelSegment(String value) {
        this.travelSegment = value;
    }

    /**
     * Gets the value of the pickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupTime() {
        return pickupTime;
    }

    /**
     * Sets the value of the pickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupTime(String value) {
        this.pickupTime = value;
    }

    /**
     * Gets the value of the dropoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropoffTime() {
        return dropoffTime;
    }

    /**
     * Sets the value of the dropoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropoffTime(String value) {
        this.dropoffTime = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the carRentalPickup property.
     * 
     * @return
     *     possible object is
     *     {@link CarRentalPickup }
     *     
     */
    public CarRentalPickup getCarRentalPickup() {
        return carRentalPickup;
    }

    /**
     * Sets the value of the carRentalPickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRentalPickup }
     *     
     */
    public void setCarRentalPickup(CarRentalPickup value) {
        this.carRentalPickup = value;
    }

    /**
     * Gets the value of the carRentalDropoff property.
     * 
     * @return
     *     possible object is
     *     {@link CarRentalDropoff }
     *     
     */
    public CarRentalDropoff getCarRentalDropoff() {
        return carRentalDropoff;
    }

    /**
     * Sets the value of the carRentalDropoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRentalDropoff }
     *     
     */
    public void setCarRentalDropoff(CarRentalDropoff value) {
        this.carRentalDropoff = value;
    }

    /**
     * Gets the value of the bookingClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassCode }
     *     
     */
    public BookingClassCode getBookingClassCode() {
        return bookingClassCode;
    }

    /**
     * Sets the value of the bookingClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassCode }
     *     
     */
    public void setBookingClassCode(BookingClassCode value) {
        this.bookingClassCode = value;
    }

    /**
     * Gets the value of the carRentalFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carRentalFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarRentalFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarRentalFee }
     * 
     * 
     */
    public List<CarRentalFee> getCarRentalFee() {
        if (carRentalFee == null) {
            carRentalFee = new ArrayList<CarRentalFee>();
        }
        return this.carRentalFee;
    }

    /**
     * Gets the value of the limitedMileage property.
     * 
     * @return
     *     possible object is
     *     {@link LimitedMileage }
     *     
     */
    public LimitedMileage getLimitedMileage() {
        return limitedMileage;
    }

    /**
     * Sets the value of the limitedMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitedMileage }
     *     
     */
    public void setLimitedMileage(LimitedMileage value) {
        this.limitedMileage = value;
    }

    /**
     * Gets the value of the availablePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availablePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailablePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailablePrice }
     * 
     * 
     */
    public List<AvailablePrice> getAvailablePrice() {
        if (availablePrice == null) {
            availablePrice = new ArrayList<AvailablePrice>();
        }
        return this.availablePrice;
    }

}
