//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.06 at 12:45:09 AM EDT 
//


package org.cxml.catalog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
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
    "status",
    "punchOutOrderMessage"
})
@XmlRootElement(name = "Message")
public class Message {

    @XmlAttribute(name = "deploymentMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deploymentMode;
    @XmlAttribute(name = "inReplyTo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inReplyTo;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "PunchOutOrderMessage", required = true)
    protected PunchOutOrderMessage punchOutOrderMessage;

    /**
     * Gets the value of the deploymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentMode() {
        if (deploymentMode == null) {
            return "production";
        } else {
            return deploymentMode;
        }
    }

    /**
     * Sets the value of the deploymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentMode(String value) {
        this.deploymentMode = value;
    }

    /**
     * Gets the value of the inReplyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInReplyTo() {
        return inReplyTo;
    }

    /**
     * Sets the value of the inReplyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInReplyTo(String value) {
        this.inReplyTo = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the punchOutOrderMessage property.
     * 
     * @return
     *     possible object is
     *     {@link PunchOutOrderMessage }
     *     
     */
    public PunchOutOrderMessage getPunchOutOrderMessage() {
        return punchOutOrderMessage;
    }

    /**
     * Sets the value of the punchOutOrderMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PunchOutOrderMessage }
     *     
     */
    public void setPunchOutOrderMessage(PunchOutOrderMessage value) {
        this.punchOutOrderMessage = value;
    }

}
