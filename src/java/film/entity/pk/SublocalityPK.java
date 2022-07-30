/*
 * SublocalityPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISublocality;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class SublocalityPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class SublocalityPK implements ISublocalityPK {

    private ILocalityPK localityPK = new LocalityPK();
    private java.lang.String sublocality;
  
    /** 
     * Constructor
     * Creates an empty SublocalityPK
     */
    public SublocalityPK() {
    }

    /**
     * Constructor
     * build an empty SublocalityPK with initialized field values
     */
    public SublocalityPK(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality) {
        this.localityPK = new LocalityPK(countrycode, postalcode, locality);
        this.sublocality = sublocality;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"sublocality.countrycode", localityPK.getCountrycode()}, 
            {"sublocality.postalcode", localityPK.getPostalcode()}, 
            {"sublocality.locality", localityPK.getLocality()}, 
            {"sublocality.sublocality", sublocality}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISublocality.COUNTRYCODE, localityPK.getCountrycode()}, 
            {ISublocality.POSTALCODE, localityPK.getPostalcode()}, 
            {ISublocality.LOCALITY, localityPK.getLocality()}, 
            {ISublocality.SUBLOCALITY, sublocality}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key localityPK, instance of ILocalityPK
     */
    public ILocalityPK getLocalityPK() {
        return this.localityPK;
    }

    /**
     * set foreign key localityPK
     * @param localityPK: instance of ILocalityPK
     */
    public void setLocalityPK(ILocalityPK localityPK) {
        this.localityPK = localityPK;
    }

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode() {
        return this.localityPK.getCountrycode();
    }

    /**
     * set countrycode value
     * @param countrycode: new value
     */
    public void setCountrycode(java.lang.String countrycode) {
        this.localityPK.setCountrycode(countrycode);
    }

    /**
     * 
     * @return postalcode value
     */
    public java.lang.String getPostalcode() {
        return this.localityPK.getPostalcode();
    }

    /**
     * set postalcode value
     * @param postalcode: new value
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.localityPK.setPostalcode(postalcode);
    }

    /**
     * 
     * @return locality value
     */
    public java.lang.String getLocality() {
        return this.localityPK.getLocality();
    }

    /**
     * set locality value
     * @param locality: new value
     */
    public void setLocality(java.lang.String locality) {
        this.localityPK.setLocality(locality);
    }

    /**
     * 
     * @return sublocality value
     */
    public java.lang.String getSublocality() {
        return this.sublocality;
    }

    /**
     * set sublocality value
     * @param sublocality: new value
     */
    public void setSublocality(java.lang.String sublocality) {
        this.sublocality = sublocality;
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
        key += "_";

        if(getSublocality()!=null) key += getSublocality().length() + "_" + getSublocality();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return SublocalityPK constructed from keystring
     */
    public static SublocalityPK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String sublocality = keys.substring(0, keylength);
            return new SublocalityPK(countrycode, postalcode, locality, sublocality);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param sublocalityPK2: SublocalityPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISublocalityPK sublocalityPK2) {
        boolean isequal = sublocalityPK2!=null;
        if(isequal) {
            isequal = isequal && this.localityPK.equals(sublocalityPK2.getLocalityPK());
            isequal = isequal && this.sublocality.equals(sublocalityPK2.getSublocality());
        }
        return isequal;
    }
}
