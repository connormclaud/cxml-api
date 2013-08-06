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
import javax.xml.bind.annotation.XmlElements;
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
    "xadesCounterSignatureOrXadesSignatureTimeStampOrXadesCompleteCertificateRefsOrXadesCompleteRevocationRefsOrXadesAttributeCertificateRefsOrXadesAttributeRevocationRefsOrXadesSigAndRefsTimeStampOrXadesRefsOnlyTimeStampOrXadesCertificateValuesOrXadesRevocationValuesOrXadesAttrAuthoritiesCertValuesOrXadesAttributeRevocationValuesOrXadesArchiveTimeStamp"
})
@XmlRootElement(name = "xades:UnsignedSignatureProperties")
public class XadesUnsignedSignatureProperties {

    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlElements({
        @XmlElement(name = "xades:CounterSignature", required = true, type = XadesCounterSignature.class),
        @XmlElement(name = "xades:SignatureTimeStamp", required = true, type = XadesSignatureTimeStamp.class),
        @XmlElement(name = "xades:CompleteCertificateRefs", required = true, type = XadesCompleteCertificateRefs.class),
        @XmlElement(name = "xades:CompleteRevocationRefs", required = true, type = XadesCompleteRevocationRefs.class),
        @XmlElement(name = "xades:AttributeCertificateRefs", required = true, type = XadesAttributeCertificateRefs.class),
        @XmlElement(name = "xades:AttributeRevocationRefs", required = true, type = XadesAttributeRevocationRefs.class),
        @XmlElement(name = "xades:SigAndRefsTimeStamp", required = true, type = XadesSigAndRefsTimeStamp.class),
        @XmlElement(name = "xades:RefsOnlyTimeStamp", required = true, type = XadesRefsOnlyTimeStamp.class),
        @XmlElement(name = "xades:CertificateValues", required = true, type = XadesCertificateValues.class),
        @XmlElement(name = "xades:RevocationValues", required = true, type = XadesRevocationValues.class),
        @XmlElement(name = "xades:AttrAuthoritiesCertValues", required = true, type = XadesAttrAuthoritiesCertValues.class),
        @XmlElement(name = "xades:AttributeRevocationValues", required = true, type = XadesAttributeRevocationValues.class),
        @XmlElement(name = "xades:ArchiveTimeStamp", required = true, type = XadesArchiveTimeStamp.class)
    })
    protected List<Object> xadesCounterSignatureOrXadesSignatureTimeStampOrXadesCompleteCertificateRefsOrXadesCompleteRevocationRefsOrXadesAttributeCertificateRefsOrXadesAttributeRevocationRefsOrXadesSigAndRefsTimeStampOrXadesRefsOnlyTimeStampOrXadesCertificateValuesOrXadesRevocationValuesOrXadesAttrAuthoritiesCertValuesOrXadesAttributeRevocationValuesOrXadesArchiveTimeStamp;

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
     * Gets the value of the xadesCounterSignatureOrXadesSignatureTimeStampOrXadesCompleteCertificateRefsOrXadesCompleteRevocationRefsOrXadesAttributeCertificateRefsOrXadesAttributeRevocationRefsOrXadesSigAndRefsTimeStampOrXadesRefsOnlyTimeStampOrXadesCertificateValuesOrXadesRevocationValuesOrXadesAttrAuthoritiesCertValuesOrXadesAttributeRevocationValuesOrXadesArchiveTimeStamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xadesCounterSignatureOrXadesSignatureTimeStampOrXadesCompleteCertificateRefsOrXadesCompleteRevocationRefsOrXadesAttributeCertificateRefsOrXadesAttributeRevocationRefsOrXadesSigAndRefsTimeStampOrXadesRefsOnlyTimeStampOrXadesCertificateValuesOrXadesRevocationValuesOrXadesAttrAuthoritiesCertValuesOrXadesAttributeRevocationValuesOrXadesArchiveTimeStamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXadesCounterSignatureOrXadesSignatureTimeStampOrXadesCompleteCertificateRefsOrXadesCompleteRevocationRefsOrXadesAttributeCertificateRefsOrXadesAttributeRevocationRefsOrXadesSigAndRefsTimeStampOrXadesRefsOnlyTimeStampOrXadesCertificateValuesOrXadesRevocationValuesOrXadesAttrAuthoritiesCertValuesOrXadesAttributeRevocationValuesOrXadesArchiveTimeStamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XadesCounterSignature }
     * {@link XadesSignatureTimeStamp }
     * {@link XadesCompleteCertificateRefs }
     * {@link XadesCompleteRevocationRefs }
     * {@link XadesAttributeCertificateRefs }
     * {@link XadesAttributeRevocationRefs }
     * {@link XadesSigAndRefsTimeStamp }
     * {@link XadesRefsOnlyTimeStamp }
     * {@link XadesCertificateValues }
     * {@link XadesRevocationValues }
     * {@link XadesAttrAuthoritiesCertValues }
     * {@link XadesAttributeRevocationValues }
     * {@link XadesArchiveTimeStamp }
     * 
     * 
     */
    public List<Object> getXadesCounterSignatureOrXadesSignatureTimeStampOrXadesCompleteCertificateRefsOrXadesCompleteRevocationRefsOrXadesAttributeCertificateRefsOrXadesAttributeRevocationRefsOrXadesSigAndRefsTimeStampOrXadesRefsOnlyTimeStampOrXadesCertificateValuesOrXadesRevocationValuesOrXadesAttrAuthoritiesCertValuesOrXadesAttributeRevocationValuesOrXadesArchiveTimeStamp() {
        if (xadesCounterSignatureOrXadesSignatureTimeStampOrXadesCompleteCertificateRefsOrXadesCompleteRevocationRefsOrXadesAttributeCertificateRefsOrXadesAttributeRevocationRefsOrXadesSigAndRefsTimeStampOrXadesRefsOnlyTimeStampOrXadesCertificateValuesOrXadesRevocationValuesOrXadesAttrAuthoritiesCertValuesOrXadesAttributeRevocationValuesOrXadesArchiveTimeStamp == null) {
            xadesCounterSignatureOrXadesSignatureTimeStampOrXadesCompleteCertificateRefsOrXadesCompleteRevocationRefsOrXadesAttributeCertificateRefsOrXadesAttributeRevocationRefsOrXadesSigAndRefsTimeStampOrXadesRefsOnlyTimeStampOrXadesCertificateValuesOrXadesRevocationValuesOrXadesAttrAuthoritiesCertValuesOrXadesAttributeRevocationValuesOrXadesArchiveTimeStamp = new ArrayList<Object>();
        }
        return this.xadesCounterSignatureOrXadesSignatureTimeStampOrXadesCompleteCertificateRefsOrXadesCompleteRevocationRefsOrXadesAttributeCertificateRefsOrXadesAttributeRevocationRefsOrXadesSigAndRefsTimeStampOrXadesRefsOnlyTimeStampOrXadesCertificateValuesOrXadesRevocationValuesOrXadesAttrAuthoritiesCertValuesOrXadesAttributeRevocationValuesOrXadesArchiveTimeStamp;
    }

}
