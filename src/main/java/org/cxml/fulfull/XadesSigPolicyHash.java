//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.06 at 12:52:04 AM EDT 
//


package org.cxml.fulfull;

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
    "dsDigestMethod",
    "dsDigestValue"
})
@XmlRootElement(name = "xades:SigPolicyHash")
public class XadesSigPolicyHash {

    @XmlElement(name = "ds:DigestMethod", required = true)
    protected DsDigestMethod dsDigestMethod;
    @XmlElement(name = "ds:DigestValue", required = true)
    protected String dsDigestValue;

    /**
     * Gets the value of the dsDigestMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DsDigestMethod }
     *     
     */
    public DsDigestMethod getDsDigestMethod() {
        return dsDigestMethod;
    }

    /**
     * Sets the value of the dsDigestMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsDigestMethod }
     *     
     */
    public void setDsDigestMethod(DsDigestMethod value) {
        this.dsDigestMethod = value;
    }

    /**
     * Gets the value of the dsDigestValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsDigestValue() {
        return dsDigestValue;
    }

    /**
     * Sets the value of the dsDigestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsDigestValue(String value) {
        this.dsDigestValue = value;
    }

}
