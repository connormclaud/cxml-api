//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.06 at 12:45:09 AM EDT 
//


package org.cxml.catalog;

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
    "dsX509IssuerName",
    "dsX509SerialNumber"
})
@XmlRootElement(name = "xades:IssuerSerial")
public class XadesIssuerSerial {

    @XmlElement(name = "ds:X509IssuerName", required = true)
    protected String dsX509IssuerName;
    @XmlElement(name = "ds:X509SerialNumber", required = true)
    protected String dsX509SerialNumber;

    /**
     * Gets the value of the dsX509IssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsX509IssuerName() {
        return dsX509IssuerName;
    }

    /**
     * Sets the value of the dsX509IssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsX509IssuerName(String value) {
        this.dsX509IssuerName = value;
    }

    /**
     * Gets the value of the dsX509SerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsX509SerialNumber() {
        return dsX509SerialNumber;
    }

    /**
     * Sets the value of the dsX509SerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsX509SerialNumber(String value) {
        this.dsX509SerialNumber = value;
    }

}
