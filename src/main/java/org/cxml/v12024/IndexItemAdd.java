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
    "itemID",
    "itemDetail",
    "indexItemDetail"
})
@XmlRootElement(name = "IndexItemAdd")
public class IndexItemAdd {

    @XmlElement(name = "ItemID", required = true)
    protected ItemID itemID;
    @XmlElement(name = "ItemDetail", required = true)
    protected ItemDetail itemDetail;
    @XmlElement(name = "IndexItemDetail", required = true)
    protected IndexItemDetail indexItemDetail;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemID }
     *     
     */
    public ItemID getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemID }
     *     
     */
    public void setItemID(ItemID value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the itemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDetail }
     *     
     */
    public ItemDetail getItemDetail() {
        return itemDetail;
    }

    /**
     * Sets the value of the itemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDetail }
     *     
     */
    public void setItemDetail(ItemDetail value) {
        this.itemDetail = value;
    }

    /**
     * Gets the value of the indexItemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link IndexItemDetail }
     *     
     */
    public IndexItemDetail getIndexItemDetail() {
        return indexItemDetail;
    }

    /**
     * Sets the value of the indexItemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexItemDetail }
     *     
     */
    public void setIndexItemDetail(IndexItemDetail value) {
        this.indexItemDetail = value;
    }

}
