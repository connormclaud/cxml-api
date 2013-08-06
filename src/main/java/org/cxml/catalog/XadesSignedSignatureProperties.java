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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xadesSigningTime",
    "xadesSigningCertificate",
    "xadesSignaturePolicyIdentifier",
    "xadesSignatureProductionPlace",
    "xadesSignerRole"
})
@XmlRootElement(name = "xades:SignedSignatureProperties")
public class XadesSignedSignatureProperties {

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "xades:SigningTime")
    protected String xadesSigningTime;
    @XmlElement(name = "xades:SigningCertificate")
    protected XadesSigningCertificate xadesSigningCertificate;
    @XmlElement(name = "xades:SignaturePolicyIdentifier")
    protected XadesSignaturePolicyIdentifier xadesSignaturePolicyIdentifier;
    @XmlElement(name = "xades:SignatureProductionPlace")
    protected XadesSignatureProductionPlace xadesSignatureProductionPlace;
    @XmlElement(name = "xades:SignerRole")
    protected XadesSignerRole xadesSignerRole;

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
     * Gets the value of the xadesSigningTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXadesSigningTime() {
        return xadesSigningTime;
    }

    /**
     * Sets the value of the xadesSigningTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXadesSigningTime(String value) {
        this.xadesSigningTime = value;
    }

    /**
     * Gets the value of the xadesSigningCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link XadesSigningCertificate }
     *     
     */
    public XadesSigningCertificate getXadesSigningCertificate() {
        return xadesSigningCertificate;
    }

    /**
     * Sets the value of the xadesSigningCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesSigningCertificate }
     *     
     */
    public void setXadesSigningCertificate(XadesSigningCertificate value) {
        this.xadesSigningCertificate = value;
    }

    /**
     * Gets the value of the xadesSignaturePolicyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link XadesSignaturePolicyIdentifier }
     *     
     */
    public XadesSignaturePolicyIdentifier getXadesSignaturePolicyIdentifier() {
        return xadesSignaturePolicyIdentifier;
    }

    /**
     * Sets the value of the xadesSignaturePolicyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesSignaturePolicyIdentifier }
     *     
     */
    public void setXadesSignaturePolicyIdentifier(XadesSignaturePolicyIdentifier value) {
        this.xadesSignaturePolicyIdentifier = value;
    }

    /**
     * Gets the value of the xadesSignatureProductionPlace property.
     * 
     * @return
     *     possible object is
     *     {@link XadesSignatureProductionPlace }
     *     
     */
    public XadesSignatureProductionPlace getXadesSignatureProductionPlace() {
        return xadesSignatureProductionPlace;
    }

    /**
     * Sets the value of the xadesSignatureProductionPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesSignatureProductionPlace }
     *     
     */
    public void setXadesSignatureProductionPlace(XadesSignatureProductionPlace value) {
        this.xadesSignatureProductionPlace = value;
    }

    /**
     * Gets the value of the xadesSignerRole property.
     * 
     * @return
     *     possible object is
     *     {@link XadesSignerRole }
     *     
     */
    public XadesSignerRole getXadesSignerRole() {
        return xadesSignerRole;
    }

    /**
     * Sets the value of the xadesSignerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesSignerRole }
     *     
     */
    public void setXadesSignerRole(XadesSignerRole value) {
        this.xadesSignerRole = value;
    }

}
