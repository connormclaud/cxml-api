//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.05 at 11:46:51 PM EDT 
//


package org.cxml.v12024;

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
    "xadesCRLValues",
    "xadesOCSPValues",
    "xadesOtherValues"
})
@XmlRootElement(name = "xades:AttributeRevocationValues")
public class XadesAttributeRevocationValues {

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "xades:CRLValues")
    protected XadesCRLValues xadesCRLValues;
    @XmlElement(name = "xades:OCSPValues")
    protected XadesOCSPValues xadesOCSPValues;
    @XmlElement(name = "xades:OtherValues")
    protected XadesOtherValues xadesOtherValues;

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
     * Gets the value of the xadesCRLValues property.
     * 
     * @return
     *     possible object is
     *     {@link XadesCRLValues }
     *     
     */
    public XadesCRLValues getXadesCRLValues() {
        return xadesCRLValues;
    }

    /**
     * Sets the value of the xadesCRLValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesCRLValues }
     *     
     */
    public void setXadesCRLValues(XadesCRLValues value) {
        this.xadesCRLValues = value;
    }

    /**
     * Gets the value of the xadesOCSPValues property.
     * 
     * @return
     *     possible object is
     *     {@link XadesOCSPValues }
     *     
     */
    public XadesOCSPValues getXadesOCSPValues() {
        return xadesOCSPValues;
    }

    /**
     * Sets the value of the xadesOCSPValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesOCSPValues }
     *     
     */
    public void setXadesOCSPValues(XadesOCSPValues value) {
        this.xadesOCSPValues = value;
    }

    /**
     * Gets the value of the xadesOtherValues property.
     * 
     * @return
     *     possible object is
     *     {@link XadesOtherValues }
     *     
     */
    public XadesOtherValues getXadesOtherValues() {
        return xadesOtherValues;
    }

    /**
     * Sets the value of the xadesOtherValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesOtherValues }
     *     
     */
    public void setXadesOtherValues(XadesOtherValues value) {
        this.xadesOtherValues = value;
    }

}
