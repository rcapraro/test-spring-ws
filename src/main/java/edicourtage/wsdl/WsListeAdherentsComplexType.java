//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.03.12 à 09:54:53 PM CET 
//


package edicourtage.wsdl;

import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java pour ws_liste_adherents_ComplexType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ws_liste_adherents_ComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adherent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_liste_adherents_ComplexType", propOrder = {
    "adherent"
})
public class WsListeAdherentsComplexType {

    @XmlElement(required = true)
    protected String adherent;

    /**
     * Obtient la valeur de la propriété adherent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdherent() {
        return adherent;
    }

    /**
     * Définit la valeur de la propriété adherent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdherent(String value) {
        this.adherent = value;
    }

}
