/*
 * PhotoPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPhoto;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class PhotoPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class PhotoPK implements EntityPKInterface, IPhotoPK {

    private IFilmPK filmPK = new FilmPK();
    private int id;
  
    /** 
     * Constructor
     * Creates an empty PhotoPK
     */
    public PhotoPK() {
    }

    /**
     * Constructor
     * build an empty PhotoPK with initialized field values
     */
    public PhotoPK(java.lang.String film, int id) {
        this.filmPK = new FilmPK(film);
        this.id = id;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"photo.film", filmPK.getId()}, 
            {"photo.id", id}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IPhoto.FILM, filmPK.getId()}, 
            {IPhoto.ID, id}
        };
        return keyfields;
    }

    /**
     * 
     * @return foreign key filmPK, instance of IFilmPK
     */
    public IFilmPK getFilmPK() {
        return this.filmPK;
    }

    /**
     * set foreign key filmPK
     * @param filmPK: instance of IFilmPK
     */
    public void setFilmPK(IFilmPK filmPK) {
        this.filmPK = filmPK;
    }

    /**
     * 
     * @return film value
     */
    public java.lang.String getFilm() {
        return this.filmPK.getId();
    }

    /**
     * set film value
     * @param film: new value
     */
    public void setFilm(java.lang.String film) {
        this.filmPK.setId(film);
    }

    /**
     * 
     * @return id value
     */
    public int getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getFilm()!=null) key += getFilm().length() + "_" + getFilm();
        key += "_";

        key += getId();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return PhotoPK constructed from keystring
     */
    public static PhotoPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String film = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int id = Integer.valueOf(keys.substring(0, keylength));
            return new PhotoPK(film, id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param photoPK2: PhotoPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IPhotoPK photoPK2) {
        boolean isequal = photoPK2!=null;
        if(isequal) {
            isequal = isequal && this.filmPK.equals(photoPK2.getFilmPK());
            isequal = isequal && this.id == photoPK2.getId();
        }
        return isequal;
    }
}
