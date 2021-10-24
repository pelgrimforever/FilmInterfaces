/*
 * PhototagsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPhototags;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class PhototagsPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class PhototagsPK implements IPhototagsPK {

    private IPhotoPK photoPK = new PhotoPK();
    private java.lang.String tag;
  
    /** 
     * Constructor
     * Creates an empty PhototagsPK
     */
    public PhototagsPK() {
    }

    /**
     * Constructor
     * build an empty PhototagsPK with initialized field values
     */
    public PhototagsPK(java.lang.String film, int id, java.lang.String tag) {
        this.photoPK = new PhotoPK(film, id);
        this.tag = tag;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"phototags.film", photoPK.getFilm()}, 
            {"phototags.id", photoPK.getId()}, 
            {"phototags.tag", tag}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IPhototags.FILM, photoPK.getFilm()}, 
            {IPhototags.ID, photoPK.getId()}, 
            {IPhototags.TAG, tag}
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
     * @return id value
     */
    public int getId() {
        return this.photoPK.getId();
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(int id) {
        this.photoPK.setId(id);
    }

    /**
     * 
     * @return tag value
     */
    public java.lang.String getTag() {
        return this.tag;
    }

    /**
     * set tag value
     * @param tag: new value
     */
    public void setTag(java.lang.String tag) {
        this.tag = tag;
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
        key += "_";

        if(getTag()!=null) key += getTag().length() + "_" + getTag();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return PhototagsPK constructed from keystring
     */
    public static PhototagsPK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String tag = keys.substring(0, keylength);
            return new PhototagsPK(film, id, tag);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param phototagsPK2: PhototagsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IPhototagsPK phototagsPK2) {
        boolean isequal = phototagsPK2!=null;
        if(isequal) {
            isequal = isequal && this.photoPK.equals(phototagsPK2.getPhotoPK());
            isequal = isequal && this.tag.equals(phototagsPK2.getTag());
        }
        return isequal;
    }
}
