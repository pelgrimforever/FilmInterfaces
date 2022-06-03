/*
 * Spatial_ref_sysPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISpatial_ref_sys;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Spatial_ref_sysPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Spatial_ref_sysPK implements ISpatial_ref_sysPK {

    private int srid;
  
    /** 
     * Constructor
     * Creates an empty Spatial_ref_sysPK
     */
    public Spatial_ref_sysPK() {
    }

    /**
     * Constructor
     * build an empty Spatial_ref_sysPK with initialized field values
     */
    public Spatial_ref_sysPK(int srid) {
        this.srid = srid;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"spatial_ref_sys.srid", srid}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISpatial_ref_sys.SRID, srid}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return srid value
     */
    public int getSrid() {
        return this.srid;
    }

    /**
     * set srid value
     * @param srid: new value
     */
    public void setSrid(int srid) {
        this.srid = srid;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getSrid();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Spatial_ref_sysPK constructed from keystring
     */
    public static Spatial_ref_sysPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int srid = Integer.valueOf(keys.substring(0, keylength));
            return new Spatial_ref_sysPK(srid);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param spatial_ref_sysPK2: Spatial_ref_sysPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISpatial_ref_sysPK spatial_ref_sysPK2) {
        boolean isequal = spatial_ref_sysPK2!=null;
        if(isequal) {
            isequal = isequal && this.srid == spatial_ref_sysPK2.getSrid();
        }
        return isequal;
    }
}
