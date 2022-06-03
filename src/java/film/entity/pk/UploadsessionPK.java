/*
 * UploadsessionPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IUploadsession;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class UploadsessionPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class UploadsessionPK implements IUploadsessionPK {

    private java.lang.String filename;
  
    /** 
     * Constructor
     * Creates an empty UploadsessionPK
     */
    public UploadsessionPK() {
    }

    /**
     * Constructor
     * build an empty UploadsessionPK with initialized field values
     */
    public UploadsessionPK(java.lang.String filename) {
        this.filename = filename;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"uploadsession.filename", filename}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IUploadsession.FILENAME, filename}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return filename value
     */
    public java.lang.String getFilename() {
        return this.filename;
    }

    /**
     * set filename value
     * @param filename: new value
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getFilename()!=null) key += getFilename().length() + "_" + getFilename();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return UploadsessionPK constructed from keystring
     */
    public static UploadsessionPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String filename = keys.substring(0, keylength);
            return new UploadsessionPK(filename);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param uploadsessionPK2: UploadsessionPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IUploadsessionPK uploadsessionPK2) {
        boolean isequal = uploadsessionPK2!=null;
        if(isequal) {
            isequal = isequal && this.filename.equals(uploadsessionPK2.getFilename());
        }
        return isequal;
    }
}
