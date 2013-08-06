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
    "dsCanonicalizationMethod",
    "dsSignatureMethod",
    "dsReference"
})
@XmlRootElement(name = "ds:SignedInfo")
public class DsSignedInfo {

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "ds:CanonicalizationMethod", required = true)
    protected DsCanonicalizationMethod dsCanonicalizationMethod;
    @XmlElement(name = "ds:SignatureMethod", required = true)
    protected DsSignatureMethod dsSignatureMethod;
    @XmlElement(name = "ds:Reference", required = true)
    protected List<DsReference> dsReference;

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
     * Gets the value of the dsCanonicalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DsCanonicalizationMethod }
     *     
     */
    public DsCanonicalizationMethod getDsCanonicalizationMethod() {
        return dsCanonicalizationMethod;
    }

    /**
     * Sets the value of the dsCanonicalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsCanonicalizationMethod }
     *     
     */
    public void setDsCanonicalizationMethod(DsCanonicalizationMethod value) {
        this.dsCanonicalizationMethod = value;
    }

    /**
     * Gets the value of the dsSignatureMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DsSignatureMethod }
     *     
     */
    public DsSignatureMethod getDsSignatureMethod() {
        return dsSignatureMethod;
    }

    /**
     * Sets the value of the dsSignatureMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsSignatureMethod }
     *     
     */
    public void setDsSignatureMethod(DsSignatureMethod value) {
        this.dsSignatureMethod = value;
    }

    /**
     * Gets the value of the dsReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DsReference }
     * 
     * 
     */
    public List<DsReference> getDsReference() {
        if (dsReference == null) {
            dsReference = new ArrayList<DsReference>();
        }
        return this.dsReference;
    }

}
