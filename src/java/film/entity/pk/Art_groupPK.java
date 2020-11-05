/*
 * Art_groupPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArt_group;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Art_groupPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Art_groupPK implements EntityPKInterface, IArt_groupPK {

    private long groupid;
  
    /** 
     * Constructor
     * Creates an empty Art_groupPK
     */
    public Art_groupPK() {
    }

    /**
     * Constructor
     * build an empty Art_groupPK with initialized field values
     */
    public Art_groupPK(long groupid) {
        this.groupid = groupid;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"art_group.groupid", groupid}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IArt_group.GROUPID, groupid}
        };
        return keyfields;
    }

    /**
     * 
     * @return groupid value
     */
    public long getGroupid() {
        return this.groupid;
    }

    /**
     * set groupid value
     * @param groupid: new value
     */
    public void setGroupid(long groupid) {
        this.groupid = groupid;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getGroupid();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Art_groupPK constructed from keystring
     */
    public static Art_groupPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long groupid = Long.valueOf(keys.substring(0, keylength));
            return new Art_groupPK(groupid);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param art_groupPK2: Art_groupPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArt_groupPK art_groupPK2) {
        boolean isequal = art_groupPK2!=null;
        if(isequal) {
            isequal = isequal && this.groupid == art_groupPK2.getGroupid();
        }
        return isequal;
    }
}