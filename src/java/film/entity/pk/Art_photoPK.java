/*
 * Art_photoPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArt_photo;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Art_photoPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Art_photoPK implements IArt_photoPK {

    private IPhotoPK photoPK = new PhotoPK();
  
    /** 
     * Constructor
     * Creates an empty Art_photoPK
     */
    public Art_photoPK() {
    }

    /**
     * Constructor
     * build an empty Art_photoPK with initialized field values
     */
    public Art_photoPK(java.lang.String film, int photo) {
        this.photoPK = new PhotoPK(film, photo);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"art_photo.film", photoPK.getFilm()}, 
            {"art_photo.photo", photoPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArt_photo.FILM, photoPK.getFilm()}, 
            {IArt_photo.PHOTO, photoPK.getId()}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key photoPK, instance of IPhotoPK
     */
    public IPhotoPK getPhotoPK() {
        return this.photoPK;
    }

    /**
     * set foreign key photoPK
     * @param photoPK: instance of IPhotoPK
     */
    public void setPhotoPK(IPhotoPK photoPK) {
        this.photoPK = photoPK;
    }

    /**
     * 
     * @return film value
     */
    public java.lang.String getFilm() {
        return this.photoPK.getFilm();
    }

    /**
     * set film value
     * @param film: new value
     */
    public void setFilm(java.lang.String film) {
        this.photoPK.setFilm(film);
    }

    /**
     * 
     * @return photo value
     */
    public int getPhoto() {
        return this.photoPK.getId();
    }

    /**
     * set photo value
     * @param photo: new value
     */
    public void setPhoto(int photo) {
        this.photoPK.setId(photo);
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getFilm()!=null) key += getFilm().length() + "_" + getFilm();
        key += "_";

        key += getPhoto();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Art_photoPK constructed from keystring
     */
    public static Art_photoPK getKey(String keystring) {
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
            int photo = Integer.valueOf(keys.substring(0, keylength));
            return new Art_photoPK(film, photo);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param art_photoPK2: Art_photoPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArt_photoPK art_photoPK2) {
        boolean isequal = art_photoPK2!=null;
        if(isequal) {
            isequal = isequal && this.photoPK.equals(art_photoPK2.getPhotoPK());
        }
        return isequal;
    }
}
