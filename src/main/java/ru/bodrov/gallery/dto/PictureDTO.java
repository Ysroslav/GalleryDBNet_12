package ru.bodrov.gallery.dto;

import org.jetbrains.annotations.Nullable;
import ru.bodrov.gallery.api.WBS;
import ru.bodrov.gallery.entity.DictTypepictureEnt;
import ru.bodrov.gallery.entity.TblClientEnt;
import ru.bodrov.gallery.entity.TblPictureEnt;

import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class PictureDTO implements WBS {

    @Nullable
    private String id;
    @Nullable
    private String titlePicture;
    @Nullable
    private Date dateInput;
    @Nullable
    private double valueBalance;
    @Nullable
    private String apostel;
    @Nullable
    private String athorId;
    @Nullable
    private String pictureType;

    public PictureDTO(){}

    public PictureDTO(@Nullable TblPictureEnt pictureEnt){
        if(pictureEnt == null) return;
        id = pictureEnt.getId();
        titlePicture = pictureEnt.getTitlePicture();
        dateInput = pictureEnt.getDateInput();
        valueBalance = pictureEnt.getValueBalance();
        apostel = pictureEnt.getApostel();

        @Nullable TblClientEnt author = pictureEnt.getTblClientEnt();
        if(author!=null)athorId = author.getId();

        @Nullable DictTypepictureEnt type = pictureEnt.getDictTypepictureEnt();
        if(type!=null)pictureType = type.getId();
    }

    @Override
    public void setId(@Nullable final String id) {
        this.id = id;
    }

    @Nullable
    @Override
    public String getId() {
        return id;
    }

    @Nullable
    public String getTitlePicture() {
        return titlePicture;
    }

    public void setTitlePicture( @Nullable String titlePicture) {
        this.titlePicture = titlePicture;
    }

    @Nullable
    public Date getDateInput() {
        return dateInput;
    }

    public void setDateInput( @Nullable Date dateInput) {
        this.dateInput = dateInput;
    }

    @Nullable
    public double getValueBalance() {
        return valueBalance;
    }

    public void setValueBalance( @Nullable double valueBalance) {
        this.valueBalance = valueBalance;
    }

    @Nullable
    public String getApostel() {
        return apostel;
    }

    public void setApostel( @Nullable String apostel) {
        this.apostel = apostel;
    }

    @Nullable
    public String getAthorId(){return athorId;}

    public void setAthorId(@Nullable String athorId){this.athorId = athorId;}

    @Nullable
    public String getPictureType(){return pictureType;}

    public void setPictureType(@Nullable String pictureType){this.pictureType = pictureType;}

}
