package ru.bodrov.gallery.service.servicews;


import ru.bodrov.gallery.dao.TblPictureEntDAO;
import ru.bodrov.gallery.dto.PictureDTO;
import ru.bodrov.gallery.dto.ResultDTO;
import ru.bodrov.gallery.entity.TblPictureEnt;

import javax.jws.WebService;
import java.util.List;
import java.util.stream.Collectors;

@WebService(endpointInterface = "ru.bodrov.gallery.service.servicews.IPicture")
public class PictureWS implements IPicture {

    private TblPictureEntDAO pictureDAO;

    @Override
    public ResultDTO addNewPicture(){
        pictureDAO.persist(new TblPictureEnt());
        return new ResultDTO();
    }

    @Override
    public PictureDTO getPictureById(String id){
        final TblPictureEnt pictureEnt = pictureDAO.getPicturesById(id);
        if (pictureEnt == null) return null;
        return new PictureDTO(pictureEnt);
    }

    @Override
    public  PictureDTO getPictureByTypeId(String typeId
    ){
        final TblPictureEnt pictureEnt = pictureDAO.getPictureByTypeId(typeId);
        if (pictureEnt == null) return null;
        return new PictureDTO(pictureEnt);
    }

    @Override
    public  PictureDTO getPictureByTitle(String title){
        final TblPictureEnt pictureEnt = pictureDAO.getPictureByTitle(title);
        if (pictureEnt == null) return null;
        return new PictureDTO(pictureEnt);
    }

    @Override
    public ResultDTO removePictureById(String id){
        try {
        pictureDAO.removePictureById(id);
        return new ResultDTO();
    } catch (final Exception e) {
        return new ResultDTO(false, e.getMessage());
    }
    }

    @Override
    public List<PictureDTO> getListPicture(){
        return pictureDAO.getPictures().stream().map(PictureDTO::new).collect(Collectors.toList());
    }

}
