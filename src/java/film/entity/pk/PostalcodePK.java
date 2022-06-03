/*
 * PostalcodePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IPostalcode;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class PostalcodePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class PostalcodePK implements IPostalcodePK {

    private java.lang.String countrycode;
    private java.lang.String postalcode;
  
    /** 
     * Constructor
     * Creates an empty PostalcodePK
     */
    public PostalcodePK() {
    }

    /**
     * Constructor
     * build an empty PostalcodePK with initialized field values
     */
    public PostalcodePK(java.lang.String countrycode, java.lang.String postalcode) {
        this.countrycode = countrycode;
        this.postalcode = postalcode;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"postalcode.countrycode", countrycode}, 
            {"postalcode.postalcode", postalcode}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IPostalcode.COUNTRYCODE, countrycode}, 
            {IPostalcode.POSTALCODE, postalcode}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode() {
        return this.countrycode;
    }

    /**
     * set countrycode value
     * @param countrycode: new value
     */
    public void setCountrycode(java.lang.String countrycode) {
        this.countrycode = countrycode;
    }

    /**
     * 
     * @return postalcode value
     */
    public java.lang.String getPostalcode() {
        return this.postalcode;
    }

    /**
     * set postalcode value
     * @param postalcode: new value
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getCountrycode()!=null) key += getCountrycode().length() + "_" + getCountrycode();
        key += "_";

        if(getPostalcode()!=null) key += getPostalcode().length() + "_" + getPostalcode();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return PostalcodePK constructed from keystring
     */
    public static PostalcodePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String countrycode = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String postalcode = keys.substring(0, keylength);
            return new PostalcodePK(countrycode, postalcode);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param postalcodePK2: PostalcodePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IPostalcodePK postalcodePK2) {
        boolean isequal = postalcodePK2!=null;
        if(isequal) {
            isequal = isequal && this.countrycode.equals(postalcodePK2.getCountrycode());
            isequal = isequal && this.postalcode.equals(postalcodePK2.getPostalcode());
        }
        return isequal;
    }
}
