/*
 * Art_academyPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArt_academy;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Art_academyPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Art_academyPK implements EntityPKInterface, IArt_academyPK {

    private long academyid;
  
    /** 
     * Constructor
     * Creates an empty Art_academyPK
     */
    public Art_academyPK() {
    }

    /**
     * Constructor
     * build an empty Art_academyPK with initialized field values
     */
    public Art_academyPK(long academyid) {
        this.academyid = academyid;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"art_academy.academyid", academyid}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IArt_academy.ACADEMYID, academyid}
        };
        return keyfields;
    }

    /**
     * 
     * @return academyid value
     */
    public long getAcademyid() {
        return this.academyid;
    }

    /**
     * set academyid value
     * @param academyid: new value
     */
    public void setAcademyid(long academyid) {
        this.academyid = academyid;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getAcademyid();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Art_academyPK constructed from keystring
     */
    public static Art_academyPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long academyid = Long.valueOf(keys.substring(0, keylength));
            return new Art_academyPK(academyid);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param art_academyPK2: Art_academyPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArt_academyPK art_academyPK2) {
        boolean isequal = art_academyPK2!=null;
        if(isequal) {
            isequal = isequal && this.academyid == art_academyPK2.getAcademyid();
        }
        return isequal;
    }
}
