//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.06 at 12:54:05 AM EDT 
//


package org.cxml.invoicedetail;

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
    "xadesOCSPIdentifier",
    "xadesDigestAlgAndValue"
})
@XmlRootElement(name = "xades:OCSPRef")
public class XadesOCSPRef {

    @XmlElement(name = "xades:OCSPIdentifier", required = true)
    protected XadesOCSPIdentifier xadesOCSPIdentifier;
    @XmlElement(name = "xades:DigestAlgAndValue")
    protected XadesDigestAlgAndValue xadesDigestAlgAndValue;

    /**
     * Gets the value of the xadesOCSPIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link XadesOCSPIdentifier }
     *     
     */
    public XadesOCSPIdentifier getXadesOCSPIdentifier() {
        return xadesOCSPIdentifier;
    }

    /**
     * Sets the value of the xadesOCSPIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesOCSPIdentifier }
     *     
     */
    public void setXadesOCSPIdentifier(XadesOCSPIdentifier value) {
        this.xadesOCSPIdentifier = value;
    }

    /**
     * Gets the value of the xadesDigestAlgAndValue property.
     * 
     * @return
     *     possible object is
     *     {@link XadesDigestAlgAndValue }
     *     
     */
    public XadesDigestAlgAndValue getXadesDigestAlgAndValue() {
        return xadesDigestAlgAndValue;
    }

    /**
     * Sets the value of the xadesDigestAlgAndValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesDigestAlgAndValue }
     *     
     */
    public void setXadesDigestAlgAndValue(XadesDigestAlgAndValue value) {
        this.xadesDigestAlgAndValue = value;
    }

}
