/*
 * RoutePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IRoute;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class RoutePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class RoutePK implements IRoutePK {

    private ISublocalityPK sublocalityPK = new SublocalityPK();
    private java.lang.String routecode;
  
    /** 
     * Constructor
     * Creates an empty RoutePK
     */
    public RoutePK() {
    }

    /**
     * Constructor
     * build an empty RoutePK with initialized field values
     */
    public RoutePK(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality, java.lang.String routecode) {
        this.sublocalityPK = new SublocalityPK(countrycode, postalcode, locality, sublocality);
        this.routecode = routecode;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"route.countrycode", sublocalityPK.getCountrycode()}, 
            {"route.postalcode", sublocalityPK.getPostalcode()}, 
            {"route.locality", sublocalityPK.getLocality()}, 
            {"route.sublocality", sublocalityPK.getSublocality()}, 
            {"route.routecode", routecode}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IRoute.COUNTRYCODE, sublocalityPK.getCountrycode()}, 
            {IRoute.POSTALCODE, sublocalityPK.getPostalcode()}, 
            {IRoute.LOCALITY, sublocalityPK.getLocality()}, 
            {IRoute.SUBLOCALITY, sublocalityPK.getSublocality()}, 
            {IRoute.ROUTECODE, routecode}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key sublocalityPK, instance of ISublocalityPK
     */
    public ISublocalityPK getSublocalityPK() {
        return this.sublocalityPK;
    }

    /**
     * set foreign key sublocalityPK
     * @param sublocalityPK: instance of ISublocalityPK
     */
    public void setSublocalityPK(ISublocalityPK sublocalityPK) {
        this.sublocalityPK = sublocalityPK;
    }

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode() {
        return this.sublocalityPK.getCountrycode();
    }

    /**
     * set countrycode value
     * @param countrycode: new value
     */
    public void setCountrycode(java.lang.String countrycode) {
        this.sublocalityPK.setCountrycode(countrycode);
    }

    /**
     * 
     * @return postalcode value
     */
    public java.lang.String getPostalcode() {
        return this.sublocalityPK.getPostalcode();
    }

    /**
     * set postalcode value
     * @param postalcode: new value
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.sublocalityPK.setPostalcode(postalcode);
    }

    /**
     * 
     * @return locality value
     */
    public java.lang.String getLocality() {
        return this.sublocalityPK.getLocality();
    }

    /**
     * set locality value
     * @param locality: new value
     */
    public void setLocality(java.lang.String locality) {
        this.sublocalityPK.setLocality(locality);
    }

    /**
     * 
     * @return sublocality value
     */
    public java.lang.String getSublocality() {
        return this.sublocalityPK.getSublocality();
    }

    /**
     * set sublocality value
     * @param sublocality: new value
     */
    public void setSublocality(java.lang.String sublocality) {
        this.sublocalityPK.setSublocality(sublocality);
    }

    /**
     * 
     * @return routecode value
     */
    public java.lang.String getRoutecode() {
        return this.routecode;
    }

    /**
     * set routecode value
     * @param routecode: new value
     */
    public void setRoutecode(java.lang.String routecode) {
        this.routecode = routecode;
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
        key += "_";

        if(getRoutecode()!=null) key += getRoutecode().length() + "_" + getRoutecode();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return RoutePK constructed from keystring
     */
    public static RoutePK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String routecode = keys.substring(0, keylength);
            return new RoutePK(countrycode, postalcode, locality, sublocality, routecode);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param routePK2: RoutePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IRoutePK routePK2) {
        boolean isequal = routePK2!=null;
        if(isequal) {
            isequal = isequal && this.sublocalityPK.equals(routePK2.getSublocalityPK());
            isequal = isequal && this.routecode.equals(routePK2.getRoutecode());
        }
        return isequal;
    }
}
