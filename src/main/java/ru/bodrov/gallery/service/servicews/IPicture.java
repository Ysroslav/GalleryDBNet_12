package ru.bodrov.gallery.service.servicews;


import ru.bodrov.gallery.dto.PictureDTO;
import ru.bodrov.gallery.dto.ResultDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface IPicture {

    @WebMethod(operationName = "getNewPicture")
    ResultDTO addNewPicture();

    @WebMethod(operationName = "getPictureById")
    PictureDTO getPictureById(String id);

    @WebMethod(operationName = "getPictureByTypeId")
    PictureDTO getPictureByTypeId(String typeId);

    @WebMethod(operationName = "removePictureById")
    ResultDTO removePictureById(String id);

    @WebMethod(operationName = "getPictureByName")
    PictureDTO getPictureByTitle(String title);

    @WebMethod(operationName = "getListPicture")
    List<PictureDTO> getListPicture();
}
