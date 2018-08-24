package ru.bodrov.gallery.dao;

import ru.bodrov.gallery.entity.TblEntityEnt;
import ru.bodrov.gallery.entity.TblLogEnt;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class LogDAO extends AbstractDAO{

    public void start() {
        em.persist(new TblLogEnt("APP STARTED"));
    }

    public void save(TblEntityEnt entity){em.persist(new TblLogEnt("SAVE - " + entity.getId() + " - " + entity.getCreated()));}
    public void remove(TblEntityEnt entity){em.persist(new TblLogEnt("REMOVE - " + entity.getId() + " - " + entity.getCreated()));}

    public void stopped() {
        em.persist(new TblLogEnt("APP STOPPED"));
    }

    public void testRollbackRTE() {
        em.persist(new TblLogEnt("testRollbackRTE"));
        throw new RuntimeException("testRollbackRTE");
    }

    public void testRollbackCatchRTE() {
        em.persist(new TblLogEnt("testRollbackCatchRTE"));
        try {
            throw new RuntimeException("testRollbackCatchRTE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
