package ru.bodrov.gallery.entity;

import ru.bodrov.gallery.api.WBS;
import org.jetbrains.annotations.Nullable;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class DictTypepictureEnt extends TblEntityEnt implements WBS {
    @Nullable
    private String nameType = null;
    @Nullable
    private String shortName = null;
    @Nullable
    private Date dateLoad;


    public DictTypepictureEnt(){
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "dictTypepictureEnt", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TblPictureEnt> pictures = new ArrayList<TblPictureEnt>();

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
