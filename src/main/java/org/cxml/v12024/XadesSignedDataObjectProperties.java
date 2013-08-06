//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.05 at 11:46:51 PM EDT 
//


package org.cxml.v12024;

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
    "xadesDataObjectFormat",
    "xadesCommitmentTypeIndication",
    "xadesAllDataObjectsTimeStamp",
    "xadesIndividualDataObjectsTimeStamp"
})
@XmlRootElement(name = "xades:SignedDataObjectProperties")
public class XadesSignedDataObjectProperties {

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElement(name = "xades:DataObjectFormat")
    protected List<XadesDataObjectFormat> xadesDataObjectFormat;
    @XmlElement(name = "xades:CommitmentTypeIndication")
    protected List<XadesCommitmentTypeIndication> xadesCommitmentTypeIndication;
    @XmlElement(name = "xades:AllDataObjectsTimeStamp")
    protected List<XadesAllDataObjectsTimeStamp> xadesAllDataObjectsTimeStamp;
    @XmlElement(name = "xades:IndividualDataObjectsTimeStamp")
    protected List<XadesIndividualDataObjectsTimeStamp> xadesIndividualDataObjectsTimeStamp;

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
     * Gets the value of the xadesDataObjectFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesDataObjectFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesDataObjectFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesDataObjectFormat }
     * 
     * 
     */
    public List<XadesDataObjectFormat> getXadesDataObjectFormat() {
        if (xadesDataObjectFormat == null) {
            xadesDataObjectFormat = new ArrayList<XadesDataObjectFormat>();
        }
        return this.xadesDataObjectFormat;
    }

    /**
     * Gets the value of the xadesCommitmentTypeIndication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesCommitmentTypeIndication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesCommitmentTypeIndication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesCommitmentTypeIndication }
     * 
     * 
     */
    public List<XadesCommitmentTypeIndication> getXadesCommitmentTypeIndication() {
        if (xadesCommitmentTypeIndication == null) {
            xadesCommitmentTypeIndication = new ArrayList<XadesCommitmentTypeIndication>();
        }
        return this.xadesCommitmentTypeIndication;
    }

    /**
     * Gets the value of the xadesAllDataObjectsTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesAllDataObjectsTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesAllDataObjectsTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesAllDataObjectsTimeStamp }
     * 
     * 
     */
    public List<XadesAllDataObjectsTimeStamp> getXadesAllDataObjectsTimeStamp() {
        if (xadesAllDataObjectsTimeStamp == null) {
            xadesAllDataObjectsTimeStamp = new ArrayList<XadesAllDataObjectsTimeStamp>();
        }
        return this.xadesAllDataObjectsTimeStamp;
    }

    /**
     * Gets the value of the xadesIndividualDataObjectsTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesIndividualDataObjectsTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesIndividualDataObjectsTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesIndividualDataObjectsTimeStamp }
     * 
     * 
     */
    public List<XadesIndividualDataObjectsTimeStamp> getXadesIndividualDataObjectsTimeStamp() {
        if (xadesIndividualDataObjectsTimeStamp == null) {
            xadesIndividualDataObjectsTimeStamp = new ArrayList<XadesIndividualDataObjectsTimeStamp>();
        }
        return this.xadesIndividualDataObjectsTimeStamp;
    }

}
