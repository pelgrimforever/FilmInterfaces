/*
 * Art_subgroupPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArt_subgroup;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Art_subgroupPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Art_subgroupPK implements IArt_subgroupPK {

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"art_subgroup.subgroupid", subgroupid}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArt_subgroup.SUBGROUPID, subgroupid}
        };
        return new Entityvalues(keyfields);
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
