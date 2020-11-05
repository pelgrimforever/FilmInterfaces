/*
 * Art_subgroupPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArt_subgroup;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Art_subgroupPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Art_subgroupPK implements EntityPKInterface, IArt_subgroupPK {

    private int subgroupid;
  
    /** 
     * Constructor
     * Creates an empty Art_subgroupPK
     */
    public Art_subgroupPK() {
    }

    /**
     * Constructor
     * build an empty Art_subgroupPK with initialized field values
     */
    public Art_subgroupPK(int subgroupid) {
        this.subgroupid = subgroupid;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"art_subgroup.subgroupid", subgroupid}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IArt_subgroup.SUBGROUPID, subgroupid}
        };
        return keyfields;
    }

    /**
     * 
     * @return subgroupid value
     */
    public int getSubgroupid() {
        return this.subgroupid;
    }

    /**
     * set subgroupid value
     * @param subgroupid: new value
     */
    public void setSubgroupid(int subgroupid) {
        this.subgroupid = subgroupid;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getSubgroupid();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Art_subgroupPK constructed from keystring
     */
    public static Art_subgroupPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int subgroupid = Integer.valueOf(keys.substring(0, keylength));
            return new Art_subgroupPK(subgroupid);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param art_subgroupPK2: Art_subgroupPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArt_subgroupPK art_subgroupPK2) {
        boolean isequal = art_subgroupPK2!=null;
        if(isequal) {
            isequal = isequal && this.subgroupid == art_subgroupPK2.getSubgroupid();
        }
        return isequal;
    }
}