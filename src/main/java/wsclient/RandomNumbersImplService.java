
package wsclient;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RandomNumbersImplService", targetNamespace = "http://ws.training/", wsdlLocation = "http://localhost:8081/soap/random?wsdl")
public class RandomNumbersImplService
    extends Service
{

    private final static URL RANDOMNUMBERSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException RANDOMNUMBERSIMPLSERVICE_EXCEPTION;
    private final static QName RANDOMNUMBERSIMPLSERVICE_QNAME = new QName("http://ws.training/", "RandomNumbersImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/soap/random?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RANDOMNUMBERSIMPLSERVICE_WSDL_LOCATION = url;
        RANDOMNUMBERSIMPLSERVICE_EXCEPTION = e;
    }

    public RandomNumbersImplService() {
        super(__getWsdlLocation(), RANDOMNUMBERSIMPLSERVICE_QNAME);
    }

    public RandomNumbersImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RANDOMNUMBERSIMPLSERVICE_QNAME, features);
    }

    public RandomNumbersImplService(URL wsdlLocation) {
        super(wsdlLocation, RANDOMNUMBERSIMPLSERVICE_QNAME);
    }

    public RandomNumbersImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RANDOMNUMBERSIMPLSERVICE_QNAME, features);
    }

    public RandomNumbersImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RandomNumbersImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RandomNumbersImpl
     */
    @WebEndpoint(name = "RandomNumbersImplPort")
    public RandomNumbersImpl getRandomNumbersImplPort() {
        return super.getPort(new QName("http://ws.training/", "RandomNumbersImplPort"), RandomNumbersImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RandomNumbersImpl
     */
    @WebEndpoint(name = "RandomNumbersImplPort")
    public RandomNumbersImpl getRandomNumbersImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.training/", "RandomNumbersImplPort"), RandomNumbersImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RANDOMNUMBERSIMPLSERVICE_EXCEPTION!= null) {
            throw RANDOMNUMBERSIMPLSERVICE_EXCEPTION;
        }
        return RANDOMNUMBERSIMPLSERVICE_WSDL_LOCATION;
    }

}
