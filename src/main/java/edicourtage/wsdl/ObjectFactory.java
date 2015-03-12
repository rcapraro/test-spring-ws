//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.12 à 09:54:53 PM CET 
//


package edicourtage.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edicourtage.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WsListeAdherents_QNAME = new QName("http://www.axway.com", "ws_liste_adherents");
    private final static QName _WsListeAdherentsRetour_QNAME = new QName("http://www.axway.com", "ws_liste_adherents_retour");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edicourtage.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsListeAdherentsComplexType }
     *
     */
    public WsListeAdherentsComplexType createWsListeAdherentsComplexType() {
        return new WsListeAdherentsComplexType();
    }

    /**
     * Create an instance of {@link WsListeAdherentsRetourComplexType }
     *
     */
    public WsListeAdherentsRetourComplexType createWsListeAdherentsRetourComplexType() {
        return new WsListeAdherentsRetourComplexType();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link WsListeAdherentsComplexType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.axway.com", name = "ws_liste_adherents")
    public JAXBElement<WsListeAdherentsComplexType> createWsListeAdherents(WsListeAdherentsComplexType value) {
        return new JAXBElement<WsListeAdherentsComplexType>(_WsListeAdherents_QNAME, WsListeAdherentsComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link WsListeAdherentsRetourComplexType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.axway.com", name = "ws_liste_adherents_retour")
    public JAXBElement<WsListeAdherentsRetourComplexType> createWsListeAdherentsRetour(WsListeAdherentsRetourComplexType value) {
        return new JAXBElement<WsListeAdherentsRetourComplexType>(_WsListeAdherentsRetour_QNAME, WsListeAdherentsRetourComplexType.class, null, value);
    }

}
