package ru.bodrov.gallery.service.crud;

import org.jetbrains.annotations.NotNull;
import ru.bodrov.gallery.dao.DictTypepictureEntDAO;
import ru.bodrov.gallery.dao.TblPictureEntDAO;
import ru.bodrov.gallery.dto.ResultDTO;
import ru.bodrov.gallery.entity.DictTypepictureEnt;
import ru.bodrov.gallery.entity.TblPictureEnt;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService
@Path("/TypeService")
public class TypeService {

    @Inject
    private DictTypepictureEntDAO typeDAO;


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
    @Path("/addNewType")
    @WebMethod(operationName = "addNewType")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO addNewType() {
        typeDAO.persist(new DictTypepictureEnt());
        return new ResultDTO();
    }

}
