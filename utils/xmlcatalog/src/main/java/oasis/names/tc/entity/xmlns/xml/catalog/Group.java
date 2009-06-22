//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.22 at 02:08:40 PM CEST 
//


package oasis.names.tc.entity.xmlns.xml.catalog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * <p>Java class for group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;any/>
 *         &lt;element name="public" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}public" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="system" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}system" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uri" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}uri" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rewriteSystem" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}rewriteSystem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rewriteURI" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}rewriteURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="delegatePublic" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}delegatePublic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="delegateSystem" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}delegateSystem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="delegateURI" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}delegateURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nextCatalog" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}nextCatalog" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="prefer" type="{urn:oasis:names:tc:entity:xmlns:xml:catalog}systemOrPublic" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "group", propOrder = {
    "aniesAndPublicsAndSystems"
})
public class Group {

    @XmlElementRefs({
        @XmlElementRef(name = "rewriteURI", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class),
        @XmlElementRef(name = "delegateSystem", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class),
        @XmlElementRef(name = "nextCatalog", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class),
        @XmlElementRef(name = "delegatePublic", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class),
        @XmlElementRef(name = "uri", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class),
        @XmlElementRef(name = "rewriteSystem", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class),
        @XmlElementRef(name = "system", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class),
        @XmlElementRef(name = "delegateURI", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class),
        @XmlElementRef(name = "public", namespace = "urn:oasis:names:tc:entity:xmlns:xml:catalog", type = JAXBElement.class)
    })
    @XmlAnyElement
    protected List<Object> aniesAndPublicsAndSystems;
    @XmlAttribute
    protected SystemOrPublic prefer;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the aniesAndPublicsAndSystems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aniesAndPublicsAndSystems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAniesAndPublicsAndSystems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link RewriteURI }{@code >}
     * {@link JAXBElement }{@code <}{@link DelegateSystem }{@code >}
     * {@link JAXBElement }{@code <}{@link NextCatalog }{@code >}
     * {@link JAXBElement }{@code <}{@link DelegatePublic }{@code >}
     * {@link JAXBElement }{@code <}{@link Uri }{@code >}
     * {@link JAXBElement }{@code <}{@link RewriteSystem }{@code >}
     * {@link JAXBElement }{@code <}{@link DelegateURI }{@code >}
     * {@link JAXBElement }{@code <}{@link System }{@code >}
     * {@link JAXBElement }{@code <}{@link Public }{@code >}
     * 
     * 
     */
    public List<Object> getAniesAndPublicsAndSystems() {
        if (aniesAndPublicsAndSystems == null) {
            aniesAndPublicsAndSystems = new ArrayList<Object>();
        }
        return this.aniesAndPublicsAndSystems;
    }

    /**
     * Gets the value of the prefer property.
     * 
     * @return
     *     possible object is
     *     {@link SystemOrPublic }
     *     
     */
    public SystemOrPublic getPrefer() {
        return prefer;
    }

    /**
     * Sets the value of the prefer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemOrPublic }
     *     
     */
    public void setPrefer(SystemOrPublic value) {
        this.prefer = value;
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
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
