/*
 * PhotosubjectsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPhotosubjects;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class PhotosubjectsPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class PhotosubjectsPK implements IPhotosubjectsPK {

    private IPhotoPK photoPK = new PhotoPK();
    private ISubjectPK subjectPK = new SubjectPK();
  
    /** 
     * Constructor
     * Creates an empty PhotosubjectsPK
     */
    public PhotosubjectsPK() {
    }

    /**
     * Constructor
     * build an empty PhotosubjectsPK with initialized field values
     */
    public PhotosubjectsPK(java.lang.String film, int id, java.lang.String cat1, java.lang.String cat2, int subject) {
        this.photoPK = new PhotoPK(film, id);
        this.subjectPK = new SubjectPK(cat1, cat2, subject);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"photosubjects.film", photoPK.getFilm()}, 
            {"photosubjects.id", photoPK.getId()}, 
            {"photosubjects.cat1", subjectPK.getCat1()}, 
            {"photosubjects.cat2", subjectPK.getCat2()}, 
            {"photosubjects.subject", subjectPK.getId()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IPhotosubjects.FILM, photoPK.getFilm()}, 
            {IPhotosubjects.ID, photoPK.getId()}, 
            {IPhotosubjects.CAT1, subjectPK.getCat1()}, 
            {IPhotosubjects.CAT2, subjectPK.getCat2()}, 
            {IPhotosubjects.SUBJECT, subjectPK.getId()}
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
     * @return foreign key subjectPK, instance of ISubjectPK
     */
    public ISubjectPK getSubjectPK() {
        return this.subjectPK;
    }

    /**
     * set foreign key subjectPK
     * @param subjectPK: instance of ISubjectPK
     */
    public void setSubjectPK(ISubjectPK subjectPK) {
        this.subjectPK = subjectPK;
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
     * @return cat1 value
     */
    public java.lang.String getCat1() {
        return this.subjectPK.getCat1();
    }

    /**
     * set cat1 value
     * @param cat1: new value
     */
    public void setCat1(java.lang.String cat1) {
        this.subjectPK.setCat1(cat1);
    }

    /**
     * 
     * @return cat2 value
     */
    public java.lang.String getCat2() {
        return this.subjectPK.getCat2();
    }

    /**
     * set cat2 value
     * @param cat2: new value
     */
    public void setCat2(java.lang.String cat2) {
        this.subjectPK.setCat2(cat2);
    }

    /**
     * 
     * @return subject value
     */
    public int getSubject() {
        return this.subjectPK.getId();
    }

    /**
     * set subject value
     * @param subject: new value
     */
    public void setSubject(int subject) {
        this.subjectPK.setId(subject);
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

        if(getCat1()!=null) key += getCat1().length() + "_" + getCat1();
        key += "_";

        if(getCat2()!=null) key += getCat2().length() + "_" + getCat2();
        key += "_";

        key += getSubject();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return PhotosubjectsPK constructed from keystring
     */
    public static PhotosubjectsPK getKey(String keystring) {
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
            String cat1 = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String cat2 = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int subject = Integer.valueOf(keys.substring(0, keylength));
            return new PhotosubjectsPK(film, id, cat1, cat2, subject);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param photosubjectsPK2: PhotosubjectsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IPhotosubjectsPK photosubjectsPK2) {
        boolean isequal = photosubjectsPK2!=null;
        if(isequal) {
            isequal = isequal && this.photoPK.equals(photosubjectsPK2.getPhotoPK());
            isequal = isequal && this.subjectPK.equals(photosubjectsPK2.getSubjectPK());
        }
        return isequal;
    }
}
