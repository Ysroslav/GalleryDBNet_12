
package ru.bodrov.gallery.service.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.bodrov.gallery.service.client package. 
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

    private final static QName _GetPictureByTitle_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "getPictureByTitle");
    private final static QName _GetPictureByIdResponse_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "getPictureByIdResponse");
    private final static QName _GetPictureByTypeId_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "getPictureByTypeId");
    private final static QName _GetListPictureResponse_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "getListPictureResponse");
    private final static QName _RemovePictureById_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "removePictureById");
    private final static QName _GetPictureById_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "getPictureById");
    private final static QName _AddNewPicture_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "addNewPicture");
    private final static QName _GetListPicture_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "getListPicture");
    private final static QName _GetPictureByTypeIdResponse_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "getPictureByTypeIdResponse");
    private final static QName _PictureDTO_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "pictureDTO");
    private final static QName _GetPictureByTitleResponse_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "getPictureByTitleResponse");
    private final static QName _AddNewPictureResponse_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "addNewPictureResponse");
    private final static QName _RemovePictureByIdResponse_QNAME = new QName("http://servicews.service.gallery.bodrov.ru/", "removePictureByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.bodrov.gallery.service.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPictureByTitle }
     * 
     */
    public GetPictureByTitle createGetPictureByTitle() {
        return new GetPictureByTitle();
    }

    /**
     * Create an instance of {@link GetPictureByIdResponse }
     * 
     */
    public GetPictureByIdResponse createGetPictureByIdResponse() {
        return new GetPictureByIdResponse();
    }

    /**
     * Create an instance of {@link GetPictureByTypeId }
     * 
     */
    public GetPictureByTypeId createGetPictureByTypeId() {
        return new GetPictureByTypeId();
    }

    /**
     * Create an instance of {@link RemovePictureById }
     * 
     */
    public RemovePictureById createRemovePictureById() {
        return new RemovePictureById();
    }

    /**
     * Create an instance of {@link GetListPictureResponse }
     * 
     */
    public GetListPictureResponse createGetListPictureResponse() {
        return new GetListPictureResponse();
    }

    /**
     * Create an instance of {@link GetPictureById }
     * 
     */
    public GetPictureById createGetPictureById() {
        return new GetPictureById();
    }

    /**
     * Create an instance of {@link GetListPicture }
     * 
     */
    public GetListPicture createGetListPicture() {
        return new GetListPicture();
    }

    /**
     * Create an instance of {@link AddNewPicture }
     * 
     */
    public AddNewPicture createAddNewPicture() {
        return new AddNewPicture();
    }

    /**
     * Create an instance of {@link GetPictureByTypeIdResponse }
     * 
     */
    public GetPictureByTypeIdResponse createGetPictureByTypeIdResponse() {
        return new GetPictureByTypeIdResponse();
    }

    /**
     * Create an instance of {@link PictureDTO }
     * 
     */
    public PictureDTO createPictureDTO() {
        return new PictureDTO();
    }

    /**
     * Create an instance of {@link GetPictureByTitleResponse }
     * 
     */
    public GetPictureByTitleResponse createGetPictureByTitleResponse() {
        return new GetPictureByTitleResponse();
    }

    /**
     * Create an instance of {@link AddNewPictureResponse }
     * 
     */
    public AddNewPictureResponse createAddNewPictureResponse() {
        return new AddNewPictureResponse();
    }

    /**
     * Create an instance of {@link RemovePictureByIdResponse }
     * 
     */
    public RemovePictureByIdResponse createRemovePictureByIdResponse() {
        return new RemovePictureByIdResponse();
    }

    /**
     * Create an instance of {@link ResultDTO }
     * 
     */
    public ResultDTO createResultDTO() {
        return new ResultDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPictureByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "getPictureByTitle")
    public JAXBElement<GetPictureByTitle> createGetPictureByTitle(GetPictureByTitle value) {
        return new JAXBElement<GetPictureByTitle>(_GetPictureByTitle_QNAME, GetPictureByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPictureByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "getPictureByIdResponse")
    public JAXBElement<GetPictureByIdResponse> createGetPictureByIdResponse(GetPictureByIdResponse value) {
        return new JAXBElement<GetPictureByIdResponse>(_GetPictureByIdResponse_QNAME, GetPictureByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPictureByTypeId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "getPictureByTypeId")
    public JAXBElement<GetPictureByTypeId> createGetPictureByTypeId(GetPictureByTypeId value) {
        return new JAXBElement<GetPictureByTypeId>(_GetPictureByTypeId_QNAME, GetPictureByTypeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPictureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "getListPictureResponse")
    public JAXBElement<GetListPictureResponse> createGetListPictureResponse(GetListPictureResponse value) {
        return new JAXBElement<GetListPictureResponse>(_GetListPictureResponse_QNAME, GetListPictureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePictureById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "removePictureById")
    public JAXBElement<RemovePictureById> createRemovePictureById(RemovePictureById value) {
        return new JAXBElement<RemovePictureById>(_RemovePictureById_QNAME, RemovePictureById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPictureById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "getPictureById")
    public JAXBElement<GetPictureById> createGetPictureById(GetPictureById value) {
        return new JAXBElement<GetPictureById>(_GetPictureById_QNAME, GetPictureById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewPicture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "addNewPicture")
    public JAXBElement<AddNewPicture> createAddNewPicture(AddNewPicture value) {
        return new JAXBElement<AddNewPicture>(_AddNewPicture_QNAME, AddNewPicture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListPicture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "getListPicture")
    public JAXBElement<GetListPicture> createGetListPicture(GetListPicture value) {
        return new JAXBElement<GetListPicture>(_GetListPicture_QNAME, GetListPicture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPictureByTypeIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "getPictureByTypeIdResponse")
    public JAXBElement<GetPictureByTypeIdResponse> createGetPictureByTypeIdResponse(GetPictureByTypeIdResponse value) {
        return new JAXBElement<GetPictureByTypeIdResponse>(_GetPictureByTypeIdResponse_QNAME, GetPictureByTypeIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PictureDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "pictureDTO")
    public JAXBElement<PictureDTO> createPictureDTO(PictureDTO value) {
        return new JAXBElement<PictureDTO>(_PictureDTO_QNAME, PictureDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPictureByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "getPictureByTitleResponse")
    public JAXBElement<GetPictureByTitleResponse> createGetPictureByTitleResponse(GetPictureByTitleResponse value) {
        return new JAXBElement<GetPictureByTitleResponse>(_GetPictureByTitleResponse_QNAME, GetPictureByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewPictureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "addNewPictureResponse")
    public JAXBElement<AddNewPictureResponse> createAddNewPictureResponse(AddNewPictureResponse value) {
        return new JAXBElement<AddNewPictureResponse>(_AddNewPictureResponse_QNAME, AddNewPictureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePictureByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicews.service.gallery.bodrov.ru/", name = "removePictureByIdResponse")
    public JAXBElement<RemovePictureByIdResponse> createRemovePictureByIdResponse(RemovePictureByIdResponse value) {
        return new JAXBElement<RemovePictureByIdResponse>(_RemovePictureByIdResponse_QNAME, RemovePictureByIdResponse.class, null, value);
    }

}
