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
    "xadesClaimedRoles",
    "xadesCertifiedRoles"
})
@XmlRootElement(name = "xades:SignerRole")
public class XadesSignerRole {

    @XmlElement(name = "xades:ClaimedRoles")
    protected XadesClaimedRoles xadesClaimedRoles;
    @XmlElement(name = "xades:CertifiedRoles")
    protected XadesCertifiedRoles xadesCertifiedRoles;

    /**
     * Gets the value of the xadesClaimedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link XadesClaimedRoles }
     *     
     */
    public XadesClaimedRoles getXadesClaimedRoles() {
        return xadesClaimedRoles;
    }

    /**
     * Sets the value of the xadesClaimedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesClaimedRoles }
     *     
     */
    public void setXadesClaimedRoles(XadesClaimedRoles value) {
        this.xadesClaimedRoles = value;
    }

    /**
     * Gets the value of the xadesCertifiedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link XadesCertifiedRoles }
     *     
     */
    public XadesCertifiedRoles getXadesCertifiedRoles() {
        return xadesCertifiedRoles;
    }

    /**
     * Sets the value of the xadesCertifiedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesCertifiedRoles }
     *     
     */
    public void setXadesCertifiedRoles(XadesCertifiedRoles value) {
        this.xadesCertifiedRoles = value;
    }

}
