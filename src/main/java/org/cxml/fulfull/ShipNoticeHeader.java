//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.06 at 12:52:04 AM EDT 
//


package org.cxml.fulfull;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceLevel",
    "documentReference",
    "contact",
    "hazard",
    "comments",
    "termsOfDelivery",
    "extrinsic",
    "idReference"
})
@XmlRootElement(name = "ShipNoticeHeader")
public class ShipNoticeHeader {

    @XmlAttribute(name = "shipmentID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shipmentID;
    @XmlAttribute(name = "operation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operation;
    @XmlAttribute(name = "noticeDate", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String noticeDate;
    @XmlAttribute(name = "shipmentDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String shipmentDate;
    @XmlAttribute(name = "deliveryDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String deliveryDate;
    @XmlAttribute(name = "shipmentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipmentType;
    @XmlAttribute(name = "fulfillmentType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fulfillmentType;
    @XmlElement(name = "ServiceLevel")
    protected List<ServiceLevel> serviceLevel;
    @XmlElement(name = "DocumentReference")
    protected DocumentReference documentReference;
    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    @XmlElement(name = "Hazard")
    protected List<Hazard> hazard;
    @XmlElement(name = "Comments")
    protected List<Comments> comments;
    @XmlElement(name = "TermsOfDelivery")
    protected TermsOfDelivery termsOfDelivery;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;
    @XmlElement(name = "IdReference")
    protected List<IdReference> idReference;

    /**
     * Gets the value of the shipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentID() {
        return shipmentID;
    }

    /**
     * Sets the value of the shipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentID(String value) {
        this.shipmentID = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        if (operation == null) {
            return "new";
        } else {
            return operation;
        }
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the noticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoticeDate() {
        return noticeDate;
    }

    /**
     * Sets the value of the noticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoticeDate(String value) {
        this.noticeDate = value;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Sets the value of the shipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDate(String value) {
        this.shipmentDate = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDate(String value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the shipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentType(String value) {
        this.shipmentType = value;
    }

    /**
     * Gets the value of the fulfillmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * Sets the value of the fulfillmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentType(String value) {
        this.fulfillmentType = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLevel }
     * 
     * 
     */
    public List<ServiceLevel> getServiceLevel() {
        if (serviceLevel == null) {
            serviceLevel = new ArrayList<ServiceLevel>();
        }
        return this.serviceLevel;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReference }
     *     
     */
    public DocumentReference getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReference }
     *     
     */
    public void setDocumentReference(DocumentReference value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<Contact>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the hazard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hazard }
     * 
     * 
     */
    public List<Hazard> getHazard() {
        if (hazard == null) {
            hazard = new ArrayList<Hazard>();
        }
        return this.hazard;
    }

    /**
     * Gets the value of the comments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comments }
     * 
     * 
     */
    public List<Comments> getComments() {
        if (comments == null) {
            comments = new ArrayList<Comments>();
        }
        return this.comments;
    }

    /**
     * Gets the value of the termsOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link TermsOfDelivery }
     *     
     */
    public TermsOfDelivery getTermsOfDelivery() {
        return termsOfDelivery;
    }

    /**
     * Sets the value of the termsOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsOfDelivery }
     *     
     */
    public void setTermsOfDelivery(TermsOfDelivery value) {
        this.termsOfDelivery = value;
    }

    /**
     * Gets the value of the extrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrinsic }
     * 
     * 
     */
    public List<Extrinsic> getExtrinsic() {
        if (extrinsic == null) {
            extrinsic = new ArrayList<Extrinsic>();
        }
        return this.extrinsic;
    }

    /**
     * Gets the value of the idReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdReference }
     * 
     * 
     */
    public List<IdReference> getIdReference() {
        if (idReference == null) {
            idReference = new ArrayList<IdReference>();
        }
        return this.idReference;
    }

}
