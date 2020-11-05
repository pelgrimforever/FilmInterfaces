/*
 * CreatorPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ICreator;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class CreatorPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class CreatorPK implements EntityPKInterface, ICreatorPK {

    private java.lang.String creatorid;
  
    /** 
     * Constructor
     * Creates an empty CreatorPK
     */
    public CreatorPK() {
    }

    /**
     * Constructor
     * build an empty CreatorPK with initialized field values
     */
    public CreatorPK(java.lang.String creatorid) {
        this.creatorid = creatorid;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"creator.creatorid", creatorid}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ICreator.CREATORID, creatorid}
        };
        return keyfields;
    }

    /**
     * 
     * @return creatorid value
     */
    public java.lang.String getCreatorid() {
        return this.creatorid;
    }

    /**
     * set creatorid value
     * @param creatorid: new value
     */
    public void setCreatorid(java.lang.String creatorid) {
        this.creatorid = creatorid;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getCreatorid()!=null) key += getCreatorid().length() + "_" + getCreatorid();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return CreatorPK constructed from keystring
     */
    public static CreatorPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String creatorid = keys.substring(0, keylength);
            return new CreatorPK(creatorid);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param creatorPK2: CreatorPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ICreatorPK creatorPK2) {
        boolean isequal = creatorPK2!=null;
        if(isequal) {
            isequal = isequal && this.creatorid.equals(creatorPK2.getCreatorid());
        }
        return isequal;
    }
}