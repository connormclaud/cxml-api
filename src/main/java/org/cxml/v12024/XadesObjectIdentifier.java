//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.05 at 11:46:51 PM EDT 
//


package org.cxml.v12024;

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
    "xadesIdentifier",
    "xadesDescription",
    "xadesDocumentationReferences"
})
@XmlRootElement(name = "xades:ObjectIdentifier")
public class XadesObjectIdentifier {

    @XmlElement(name = "xades:Identifier", required = true)
    protected XadesIdentifier xadesIdentifier;
    @XmlElement(name = "xades:Description")
    protected String xadesDescription;
    @XmlElement(name = "xades:DocumentationReferences")
    protected XadesDocumentationReferences xadesDocumentationReferences;

    /**
     * Gets the value of the xadesIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link XadesIdentifier }
     *     
     */
    public XadesIdentifier getXadesIdentifier() {
        return xadesIdentifier;
    }

    /**
     * Sets the value of the xadesIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesIdentifier }
     *     
     */
    public void setXadesIdentifier(XadesIdentifier value) {
        this.xadesIdentifier = value;
    }

    /**
     * Gets the value of the xadesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXadesDescription() {
        return xadesDescription;
    }

    /**
     * Sets the value of the xadesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXadesDescription(String value) {
        this.xadesDescription = value;
    }

    /**
     * Gets the value of the xadesDocumentationReferences property.
     * 
     * @return
     *     possible object is
     *     {@link XadesDocumentationReferences }
     *     
     */
    public XadesDocumentationReferences getXadesDocumentationReferences() {
        return xadesDocumentationReferences;
    }

    /**
     * Sets the value of the xadesDocumentationReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesDocumentationReferences }
     *     
     */
    public void setXadesDocumentationReferences(XadesDocumentationReferences value) {
        this.xadesDocumentationReferences = value;
    }

}
