/*
 * FilmtypePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IFilmtype;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class FilmtypePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class FilmtypePK implements EntityPKInterface, IFilmtypePK {

    private java.lang.String type;
  
    /** 
     * Constructor
     * Creates an empty FilmtypePK
     */
    public FilmtypePK() {
    }

    /**
     * Constructor
     * build an empty FilmtypePK with initialized field values
     */
    public FilmtypePK(java.lang.String type) {
        this.type = type;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"filmtype.type", type}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IFilmtype.TYPE, type}
        };
        return keyfields;
    }

    /**
     * 
     * @return type value
     */
    public java.lang.String getType() {
        return this.type;
    }

    /**
     * set type value
     * @param type: new value
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getType()!=null) key += getType().length() + "_" + getType();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return FilmtypePK constructed from keystring
     */
    public static FilmtypePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String type = keys.substring(0, keylength);
            return new FilmtypePK(type);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param filmtypePK2: FilmtypePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IFilmtypePK filmtypePK2) {
        boolean isequal = filmtypePK2!=null;
        if(isequal) {
            isequal = isequal && this.type.equals(filmtypePK2.getType());
        }
        return isequal;
    }
}
