package ru.bodrov.gallery.service.crud;

import org.jetbrains.annotations.Nullable;
import ru.bodrov.gallery.dao.TblPictureEntDAO;
import ru.bodrov.gallery.dto.PictureDTO;
import ru.bodrov.gallery.dto.ResultDTO;
import ru.bodrov.gallery.entity.TblPictureEnt;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.stream.Collectors;

@WebService
@Path("/PictureService")
public class PictureService {

    @Inject
    private TblPictureEntDAO pictureDAO;


    @GET
    @NotNull
    @WebMethod
    @Path("/ping")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO ping() {
        return new ResultDTO();
    }

    @GET
    @NotNull
    @Path("/getListPicture")
    @WebMethod(operationName = "getListPicture")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PictureDTO> getListPicture() {
        return pictureDAO.getPictures().stream().map(PictureDTO::new).collect(Collectors.toList());
    }

    @GET
    @NotNull
    @Path("/addNewPicture")
    @WebMethod(operationName = "addNewPicture")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO addNewPicture() {
        pictureDAO.persist(new TblPictureEnt());
        return new ResultDTO();
    }

    @GET
    @Nullable
    @Path("/getPictureById")
    @WebMethod(operationName = "getPictureById")
    @Produces(MediaType.APPLICATION_JSON)
    public PictureDTO getPictureById(
            @QueryParam(value = "id")
            @WebParam(name = "id", partName = "id")
            @Nullable final String id
    ) {
        @Nullable final TblPictureEnt pictureEnt = pictureDAO.getPicturesById(id);
        if (pictureEnt == null) return null;
        return new PictureDTO(pictureEnt);
    }

    @GET
    @Nullable
    @Path("/getPictureByName")
    @WebMethod(operationName = "getPictureByName")
    @Produces(MediaType.APPLICATION_JSON)
    public PictureDTO getPictureByName(
            @QueryParam(value = "title")
            @WebParam(name = "title", partName = "title")
            @Nullable final String title
    ) {
        @Nullable final TblPictureEnt pictureEnt = pictureDAO.getPictureByTitle(title);
        if (pictureEnt == null) return null;
        return new PictureDTO(pictureEnt);
    }

    @GET
    @Nullable
    @Path("/getPictureByTypeId")
    @WebMethod(operationName = "getPictureByTypeId")
    @Produces(MediaType.APPLICATION_JSON)
    public PictureDTO getPictureByTypeId(
            @QueryParam(value = "id")
            @WebParam(name = "id", partName = "id")
            @Nullable final String typeId
    ) {
        @Nullable final TblPictureEnt pictureEnt = pictureDAO.getPictureByTypeId(typeId);
        if (pictureEnt == null) return null;
        return new PictureDTO(pictureEnt);
    }

    @POST
    @NotNull
    @Path("/setPictureTitle")
    @WebMethod(operationName = "setPictureTitle")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO setPictureTitle(
            @FormParam(value = "id")
            @WebParam(name = "id", partName = "id")
            @Nullable final String id,

            @FormParam(value = "name")
            @WebParam(name = "name", partName = "name")
            @Nullable final String titlePicture
    ) {
        @Nullable TblPictureEnt pictureEnt= pictureDAO.getPicturesById(id);
        if (pictureEnt == null) return new ResultDTO(false);
        pictureEnt.setTitlePicture(titlePicture);
        pictureDAO.merge(pictureEnt);
        return new ResultDTO();
    }

    @POST
    @NotNull
    @Path("removePictureById")
    @WebMethod(operationName = "removePictureById")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO removePictureById(
            @FormParam(value = "id")
            @WebParam(name = "id", partName = "id")
            @Nullable final String id
    ) {
        try {
            pictureDAO.removePictureById(id);
            return new ResultDTO();
        } catch (@NotNull final Exception e) {
            return new ResultDTO(false, e.getMessage());
        }
    }


}
