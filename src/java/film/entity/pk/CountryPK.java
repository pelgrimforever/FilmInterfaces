/*
 * CountryPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ICountry;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class CountryPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class CountryPK implements ICountryPK {

    private java.lang.String code;
  
    /** 
     * Constructor
     * Creates an empty CountryPK
     */
    public CountryPK() {
    }

    /**
     * Constructor
     * build an empty CountryPK with initialized field values
     */
    public CountryPK(java.lang.String code) {
        this.code = code;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"country.code", code}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ICountry.CODE, code}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return code value
     */
    public java.lang.String getCode() {
        return this.code;
    }

    /**
     * set code value
     * @param code: new value
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getCode()!=null) key += getCode().length() + "_" + getCode();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return CountryPK constructed from keystring
     */
    public static CountryPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String code = keys.substring(0, keylength);
            return new CountryPK(code);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param countryPK2: CountryPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ICountryPK countryPK2) {
        boolean isequal = countryPK2!=null;
        if(isequal) {
            isequal = isequal && this.code.equals(countryPK2.getCode());
        }
        return isequal;
    }
}
