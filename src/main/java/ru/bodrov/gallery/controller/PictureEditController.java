package ru.bodrov.gallery.controller;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.gallery.dao.TblClientEntDAO;
import ru.bodrov.gallery.dao.TblPictureEntDAO;
import ru.bodrov.gallery.entity.TblClientEnt;
import ru.bodrov.gallery.entity.TblPictureEnt;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class PictureEditController {

    @Inject
    private TblPictureEntDAO pictureDAO;

    @Nullable
    private String id;

    @NotNull
    private TblPictureEnt pictureEnt = new TblPictureEnt();

    public void init() {
        @Nullable final TblPictureEnt pictureEnt = pictureDAO.getPicturesById(id);
        if (pictureEnt != null) this.pictureEnt = pictureEnt;
    }

    @NotNull
    public String save() {
        pictureDAO.merge(pictureEnt);
        return "picture-list";
    }

    @NotNull
    public TblPictureEnt getPictureEnt() {
        return pictureEnt;
    }

    public void setPictureEnt(@NotNull final TblPictureEnt pictureEnt) {
        this.pictureEnt = pictureEnt;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(@Nullable final String id) {
        this.id = id;
    }
}
