package ru.bodrov.gallery.entity;

import javax.persistence.*;

@Entity
public class TblLogEnt extends TblEntityEnt{
    @Column
    private String message;

    public TblLogEnt(){}

    public TblLogEnt(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
