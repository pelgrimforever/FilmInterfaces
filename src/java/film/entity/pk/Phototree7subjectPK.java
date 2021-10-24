/*
 * Phototree7subjectPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPhototree7subject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Phototree7subjectPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Phototree7subjectPK implements IPhototree7subjectPK {

    private ITree7subjectPK tree7subjectPK = new Tree7subjectPK();
    private IPhotoPK photoPK = new PhotoPK();
  
    /** 
     * Constructor
     * Creates an empty Phototree7subjectPK
     */
    public Phototree7subjectPK() {
    }

    /**
     * Constructor
     * build an empty Phototree7subjectPK with initialized field values
     */
    public Phototree7subjectPK(java.lang.String film, int id, long subjectid) {
        this.tree7subjectPK = new Tree7subjectPK(subjectid);
        this.photoPK = new PhotoPK(film, id);
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"phototree7subject.film", photoPK.getFilm()}, 
            {"phototree7subject.id", photoPK.getId()}, 
            {"phototree7subject.subjectid", tree7subjectPK.getSubjectid()}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IPhototree7subject.FILM, photoPK.getFilm()}, 
            {IPhototree7subject.ID, photoPK.getId()}, 
            {IPhototree7subject.SUBJECTID, tree7subjectPK.getSubjectid()}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key tree7subjectPK, instance of ITree7subjectPK
     */
    public ITree7subjectPK getTree7subjectPK() {
        return this.tree7subjectPK;
    }

    /**
     * set foreign key tree7subjectPK
     * @param tree7subjectPK: instance of ITree7subjectPK
     */
    public void setTree7subjectPK(ITree7subjectPK tree7subjectPK) {
        this.tree7subjectPK = tree7subjectPK;
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
     * @return subjectid value
     */
    public long getSubjectid() {
        return this.tree7subjectPK.getSubjectid();
    }

    /**
     * set subjectid value
     * @param subjectid: new value
     */
    public void setSubjectid(long subjectid) {
        this.tree7subjectPK.setSubjectid(subjectid);
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

        key += getSubjectid();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Phototree7subjectPK constructed from keystring
     */
    public static Phototree7subjectPK getKey(String keystring) {
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

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long subjectid = Long.valueOf(keys.substring(0, keylength));
            return new Phototree7subjectPK(film, id, subjectid);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param phototree7subjectPK2: Phototree7subjectPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IPhototree7subjectPK phototree7subjectPK2) {
        boolean isequal = phototree7subjectPK2!=null;
        if(isequal) {
            isequal = isequal && this.tree7subjectPK.equals(phototree7subjectPK2.getTree7subjectPK());
            isequal = isequal && this.photoPK.equals(phototree7subjectPK2.getPhotoPK());
        }
        return isequal;
    }
}
