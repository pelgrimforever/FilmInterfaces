/*
 * FilmPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IFilm;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class FilmPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class FilmPK implements EntityPKInterface, IFilmPK {

    private java.lang.String id;
  
    /** 
     * Constructor
     * Creates an empty FilmPK
     */
    public FilmPK() {
    }

    /**
     * Constructor
     * build an empty FilmPK with initialized field values
     */
    public FilmPK(java.lang.String id) {
        this.id = id;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"film.id", id}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IFilm.ID, id}
        };
        return keyfields;
    }

    /**
     * 
     * @return id value
     */
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getId()!=null) key += getId().length() + "_" + getId();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return FilmPK constructed from keystring
     */
    public static FilmPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String id = keys.substring(0, keylength);
            return new FilmPK(id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param filmPK2: FilmPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IFilmPK filmPK2) {
        boolean isequal = filmPK2!=null;
        if(isequal) {
            isequal = isequal && this.id.equals(filmPK2.getId());
        }
        return isequal;
    }
}