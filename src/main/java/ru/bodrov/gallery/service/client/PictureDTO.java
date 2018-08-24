
package ru.bodrov.gallery.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pictureDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pictureDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apostel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="athorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateInput" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pictureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titlePicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueBalance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pictureDTO", propOrder = {
    "apostel",
    "athorId",
    "dateInput",
    "id",
    "pictureType",
    "titlePicture",
    "valueBalance"
})
public class PictureDTO {

    protected String apostel;
    protected String athorId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateInput;
    protected String id;
    protected String pictureType;
    protected String titlePicture;
    protected double valueBalance;

    /**
     * Gets the value of the apostel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApostel() {
        return apostel;
    }

    /**
     * Sets the value of the apostel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApostel(String value) {
        this.apostel = value;
    }

    /**
     * Gets the value of the athorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAthorId() {
        return athorId;
    }

    /**
     * Sets the value of the athorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAthorId(String value) {
        this.athorId = value;
    }

    /**
     * Gets the value of the dateInput property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateInput() {
        return dateInput;
    }

    /**
     * Sets the value of the dateInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateInput(XMLGregorianCalendar value) {
        this.dateInput = value;
    }

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
     * Gets the value of the pictureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureType() {
        return pictureType;
    }

    /**
     * Sets the value of the pictureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureType(String value) {
        this.pictureType = value;
    }

    /**
     * Gets the value of the titlePicture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitlePicture() {
        return titlePicture;
    }

    /**
     * Sets the value of the titlePicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitlePicture(String value) {
        this.titlePicture = value;
    }

    /**
     * Gets the value of the valueBalance property.
     * 
     */
    public double getValueBalance() {
        return valueBalance;
    }

    /**
     * Sets the value of the valueBalance property.
     * 
     */
    public void setValueBalance(double value) {
        this.valueBalance = value;
    }

}
