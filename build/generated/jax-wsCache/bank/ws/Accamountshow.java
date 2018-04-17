
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accamountshow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accamountshow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Useriteration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accamountshow", propOrder = {
    "useriteration"
})
public class Accamountshow {

    @XmlElement(name = "Useriteration")
    protected int useriteration;

    /**
     * Gets the value of the useriteration property.
     * 
     */
    public int getUseriteration() {
        return useriteration;
    }

    /**
     * Sets the value of the useriteration property.
     * 
     */
    public void setUseriteration(int value) {
        this.useriteration = value;
    }

}
