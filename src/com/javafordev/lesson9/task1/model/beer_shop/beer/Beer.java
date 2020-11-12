//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.10 at 01:52:00 PM MSK 
//


package com.javafordev.lesson9.task1.model.beer_shop.beer;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Beer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Beer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Light"/>
 *               &lt;enumeration value="Dark"/>
 *               &lt;enumeration value="Lager"/>
 *               &lt;enumeration value="Live"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Alcohol" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Manufacter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Alivaria"/>
 *               &lt;enumeration value="Lidskoe"/>
 *               &lt;enumeration value="Tuborg"/>
 *               &lt;enumeration value="Kozel"/>
 *               &lt;enumeration value="Holsten"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;sequence>
 *           &lt;element name="ingredient" type="{http://www.beer-shop/beer}Ingredient" maxOccurs="9" minOccurs="2"/>
 *         &lt;/sequence>
 *         &lt;element name="Char" type="{http://www.beer-shop/beer}Char"/>
 *       &lt;/sequence>
 *       &lt;attribute name="article" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Beer", propOrder = {
    "name",
    "type",
    "alcohol",
    "manufacter",
    "quantity",
    "ingredient",
    "_char"
})
public class Beer {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String type;
    @XmlElement()
    protected boolean alcohol;
    @XmlElement(required = true)
    protected String manufacter;
    @XmlElement(required = true)
    protected int quantity;
    @XmlElement(required = true)
    protected List<String> ingredient;
    @XmlElement(required = true)
    protected Char _char;
    @XmlAttribute(required = true)
    protected int article;


    public Beer(String name, String type, boolean alcohol, String manufacter, int quantity, List<String> ingredient, Char _char, int article) {
        this.name = name;
        this.type = type;
        this.alcohol = alcohol;
        this.manufacter = manufacter;
        this.quantity = quantity;
        this.ingredient = ingredient;
        this._char = _char;
        this.article = article;
    }

    public Beer() {
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the alcohol property.
     * 
     */
    public boolean isAlcohol() {
        return alcohol;
    }

    /**
     * Sets the value of the alcohol property.
     * 
     */
    public void setAlcohol(boolean value) {
        this.alcohol = value;
    }

    /**
     * Gets the value of the manufacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacter() {
        return manufacter;
    }

    /**
     * Sets the value of the manufacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacter(String value) {
        this.manufacter = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the ingredient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ingredient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIngredients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIngredients() {
        if (ingredient == null) {
            ingredient = new ArrayList<String>();
        }
        return this.ingredient;
    }

    public void setIngredient(List<String> ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link Char }
     *     
     */
    public com.javafordev.lesson9.task1.model.beer_shop.beer.Char getChar() {
        return _char;
    }

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link Char }
     *     
     */
    public void setChar(com.javafordev.lesson9.task1.model.beer_shop.beer.Char value) {
        this._char = value;
    }

    /**
     * Gets the value of the article property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public int getArticle() {
        return article;
    }

    /**
     * Sets the value of the article property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArticle(int value) {
        this.article = value;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", alcohol=" + alcohol +
                ", manufacter='" + manufacter + '\'' +
                ", quantity=" + quantity +
                ", ingredient=" + ingredient +
                ", _char=" + _char +
                ", article=" + article +
                '}';
    }
}