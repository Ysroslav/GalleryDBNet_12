package ru.bodrov.gallery.dto;

import org.jetbrains.annotations.Nullable;
import ru.bodrov.gallery.api.WBS;
import ru.bodrov.gallery.entity.DictTypepictureEnt;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class TypeDTO implements WBS {

    @Nullable
    private String id;
    @Nullable
    private String nameType;
    @Nullable
    private String shortName;
    @Nullable
    private Date dateLoad;

    public TypeDTO(){}

    public TypeDTO(@Nullable DictTypepictureEnt type){
        if(type==null) return;
        id = type.getId();
        nameType = type.getNameType();
        shortName = type.getShortName();
        dateLoad = type.getDateLoad();
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
    public String getNameType(){return nameType;}
    @Nullable
    public String getShortName(){return shortName;}
    @Nullable
    public Date getDateLoad(){return dateLoad;}

    public void setNameType(@Nullable String nameType){this.nameType = nameType;}
    public void setShortName(@Nullable String shortName){this.shortName = shortName;}
    public void setDateLoad(@Nullable Date dateLoad){this.dateLoad = dateLoad;}



}
