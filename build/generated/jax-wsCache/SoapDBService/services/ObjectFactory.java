
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _FindCovidDatabyseq_QNAME = new QName("http://services/", "findCovidDatabyseq");
    private final static QName _FindCovidDatabyseqResponse_QNAME = new QName("http://services/", "findCovidDatabyseqResponse");
    private final static QName _Covidweek_QNAME = new QName("http://services/", "covidweek");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCovidDatabyseq }
     * 
     */
    public FindCovidDatabyseq createFindCovidDatabyseq() {
        return new FindCovidDatabyseq();
    }

    /**
     * Create an instance of {@link FindCovidDatabyseqResponse }
     * 
     */
    public FindCovidDatabyseqResponse createFindCovidDatabyseqResponse() {
        return new FindCovidDatabyseqResponse();
    }

    /**
     * Create an instance of {@link Covidweek }
     * 
     */
    public Covidweek createCovidweek() {
        return new Covidweek();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidDatabyseq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidDatabyseq")
    public JAXBElement<FindCovidDatabyseq> createFindCovidDatabyseq(FindCovidDatabyseq value) {
        return new JAXBElement<FindCovidDatabyseq>(_FindCovidDatabyseq_QNAME, FindCovidDatabyseq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCovidDatabyseqResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findCovidDatabyseqResponse")
    public JAXBElement<FindCovidDatabyseqResponse> createFindCovidDatabyseqResponse(FindCovidDatabyseqResponse value) {
        return new JAXBElement<FindCovidDatabyseqResponse>(_FindCovidDatabyseqResponse_QNAME, FindCovidDatabyseqResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidweek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidweek")
    public JAXBElement<Covidweek> createCovidweek(Covidweek value) {
        return new JAXBElement<Covidweek>(_Covidweek_QNAME, Covidweek.class, null, value);
    }

}
