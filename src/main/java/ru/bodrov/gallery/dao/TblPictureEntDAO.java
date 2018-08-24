package ru.bodrov.gallery.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.bodrov.gallery.entity.TblClientEnt;
import ru.bodrov.gallery.entity.TblPictureEnt;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class TblPictureEntDAO extends AbstractDAO {

    public TblPictureEnt findOne(String id) {
        return em.find(TblPictureEnt.class, id);
    }

    @NotNull
    public List<TblPictureEnt> getPictures() {
        return em.createQuery("SELECT e FROM TblPictureEnt e ORDER BY e.dateInput DESC", TblPictureEnt.class).getResultList();
    }

    @Nullable
    public TblPictureEnt getPicturesById(@Nullable final String pictureId) {
        if (pictureId == null || pictureId.isEmpty()) return null;
        return getEntity(em.createQuery("SELECT e FROM TblPictureEnt e WHERE e.id = :id", TblPictureEnt.class)
                .setParameter("id", pictureId)
                .setMaxResults(1));
    }


    @Nullable
    public TblPictureEnt getPictureByTitle(@Nullable final String title) {
        if (title == null || title.isEmpty()) return null;
        return getEntity(em.createQuery("SELECT e FROM TblPictureEnt e WHERE e.titlePicture = :title", TblPictureEnt.class)
                .setParameter("title", title)
                .setMaxResults(1));
    }


    @Nullable
    public TblPictureEnt getPictureByTypeId(@Nullable final String typeId) {
        if (typeId == null || typeId.isEmpty()) return null;
        return getEntity(em.createQuery("SELECT e FROM TblPictureEnt e WHERE e.pictureType = :id", TblPictureEnt.class)
                .setParameter("id", typeId)
                .setMaxResults(1));
    }

    @Nullable
    public TblPictureEnt persist(@Nullable final TblPictureEnt picture) {
        if (picture == null) return null;
        em.persist(picture);
        return picture;
    }

    @Nullable
    public TblPictureEnt merge(@Nullable final TblPictureEnt picture) {
        if (picture == null) return null;
        return em.merge(picture);
    }

    public void removePictureById(@Nullable final String pictureId) {
        @Nullable
        final TblPictureEnt pictureEntity = getPicturesById(pictureId);
        if (pictureEntity == null) return;
        em.remove(pictureEntity);
    }

}
