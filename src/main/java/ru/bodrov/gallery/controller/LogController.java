package ru.bodrov.gallery.controller;

import ru.bodrov.gallery.dao.LogDAO;
import ru.bodrov.gallery.entity.TblEntityEnt;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.naming.NamingException;


@ViewScoped
@ManagedBean
public class LogController {

    @Inject
    private LogDAO logDAO;


    public void testRollbackRTE() throws NamingException {
        logDAO.testRollbackRTE();
    }

    public void testRollbackCatchRTE() {
        logDAO.testRollbackCatchRTE();
    }

    public void save(TblEntityEnt entity){logDAO.save(entity);}
    public void remove(TblEntityEnt entity){logDAO.remove(entity);}

}
