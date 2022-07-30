/*
 * LocalityPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ILocality;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class LocalityPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class LocalityPK implements ILocalityPK {

    private IPostalcodePK postalcodePK = new PostalcodePK();
    private java.lang.String locality;
  
    /** 
     * Constructor
     * Creates an empty LocalityPK
     */
    public LocalityPK() {
    }

    /**
     * Constructor
     * build an empty LocalityPK with initialized field values
     */
    public LocalityPK(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality) {
        this.postalcodePK = new PostalcodePK(countrycode, postalcode);
        this.locality = locality;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"locality.countrycode", postalcodePK.getCountrycode()}, 
            {"locality.postalcode", postalcodePK.getPostalcode()}, 
            {"locality.locality", locality}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ILocality.COUNTRYCODE, postalcodePK.getCountrycode()}, 
            {ILocality.POSTALCODE, postalcodePK.getPostalcode()}, 
            {ILocality.LOCALITY, locality}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key postalcodePK, instance of IPostalcodePK
     */
    public IPostalcodePK getPostalcodePK() {
        return this.postalcodePK;
    }

    /**
     * set foreign key postalcodePK
     * @param postalcodePK: instance of IPostalcodePK
     */
    public void setPostalcodePK(IPostalcodePK postalcodePK) {
        this.postalcodePK = postalcodePK;
    }

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode() {
        return this.postalcodePK.getCountrycode();
    }

    /**
     * set countrycode value
     * @param countrycode: new value
     */
    public void setCountrycode(java.lang.String countrycode) {
        this.postalcodePK.setCountrycode(countrycode);
    }

    /**
     * 
     * @return postalcode value
     */
    public java.lang.String getPostalcode() {
        return this.postalcodePK.getPostalcode();
    }

    /**
     * set postalcode value
     * @param postalcode: new value
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.postalcodePK.setPostalcode(postalcode);
    }

    /**
     * 
     * @return locality value
     */
    public java.lang.String getLocality() {
        return this.locality;
    }

    /**
     * set locality value
     * @param locality: new value
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
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
        key += "_";

        if(getLocality()!=null) key += getLocality().length() + "_" + getLocality();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return LocalityPK constructed from keystring
     */
    public static LocalityPK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String locality = keys.substring(0, keylength);
            return new LocalityPK(countrycode, postalcode, locality);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param localityPK2: LocalityPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ILocalityPK localityPK2) {
        boolean isequal = localityPK2!=null;
        if(isequal) {
            isequal = isequal && this.postalcodePK.equals(localityPK2.getPostalcodePK());
            isequal = isequal && this.locality.equals(localityPK2.getLocality());
        }
        return isequal;
    }
}
