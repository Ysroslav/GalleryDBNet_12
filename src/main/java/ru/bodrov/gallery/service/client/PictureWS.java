
package ru.bodrov.gallery.service.client;

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
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PictureWS", targetNamespace = "http://servicews.service.gallery.bodrov.ru", wsdlLocation = "file:/C:/Users/Yaroslav/Desktop/GalleryDBNet_12/src/main/java/ru/bodrov/gallery/service/servicews/PictureWS.wsdl")
public class PictureWS
    extends Service
{

    private final static URL PICTUREWS_WSDL_LOCATION;
    private final static WebServiceException PICTUREWS_EXCEPTION;
    private final static QName PICTUREWS_QNAME = new QName("http://servicews.service.gallery.bodrov.ru", "PictureWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Yaroslav/Desktop/GalleryDBNet_12/src/main/java/ru/bodrov/gallery/service/servicews/PictureWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PICTUREWS_WSDL_LOCATION = url;
        PICTUREWS_EXCEPTION = e;
    }

    public PictureWS() {
        super(__getWsdlLocation(), PICTUREWS_QNAME);
    }

    public PictureWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), PICTUREWS_QNAME, features);
    }

    public PictureWS(URL wsdlLocation) {
        super(wsdlLocation, PICTUREWS_QNAME);
    }

    public PictureWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PICTUREWS_QNAME, features);
    }

    public PictureWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PictureWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IPicture
     */
    @WebEndpoint(name = "PictureWS")
    public IPicture getPictureWS() {
        return super.getPort(new QName("http://servicews.service.gallery.bodrov.ru", "PictureWS"), IPicture.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPicture
     */
    @WebEndpoint(name = "PictureWS")
    public IPicture getPictureWS(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicews.service.gallery.bodrov.ru", "PictureWS"), IPicture.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PICTUREWS_EXCEPTION!= null) {
            throw PICTUREWS_EXCEPTION;
        }
        return PICTUREWS_WSDL_LOCATION;
    }

}
