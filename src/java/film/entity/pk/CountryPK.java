/*
 * CountryPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ICountry;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class CountryPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class CountryPK implements EntityPKInterface, ICountryPK {

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"country.code", code}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ICountry.CODE, code}
        };
        return keyfields;
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
