/*
 * Arealevel2PK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArealevel2;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Arealevel2PK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Arealevel2PK implements IArealevel2PK {

    private IArealevel1PK arealevel1PK = new Arealevel1PK();
    private java.lang.String al2code;
  
    /** 
     * Constructor
     * Creates an empty Arealevel2PK
     */
    public Arealevel2PK() {
    }

    /**
     * Constructor
     * build an empty Arealevel2PK with initialized field values
     */
    public Arealevel2PK(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code) {
        this.arealevel1PK = new Arealevel1PK(countrycode, al1code);
        this.al2code = al2code;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"arealevel2.countrycode", arealevel1PK.getCountrycode()}, 
            {"arealevel2.al1code", arealevel1PK.getAl1code()}, 
            {"arealevel2.al2code", al2code}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArealevel2.COUNTRYCODE, arealevel1PK.getCountrycode()}, 
            {IArealevel2.AL1CODE, arealevel1PK.getAl1code()}, 
            {IArealevel2.AL2CODE, al2code}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key arealevel1PK, instance of IArealevel1PK
     */
    public IArealevel1PK getArealevel1PK() {
        return this.arealevel1PK;
    }

    /**
     * set foreign key arealevel1PK
     * @param arealevel1PK: instance of IArealevel1PK
     */
    public void setArealevel1PK(IArealevel1PK arealevel1PK) {
        this.arealevel1PK = arealevel1PK;
    }

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode() {
        return this.arealevel1PK.getCountrycode();
    }

    /**
     * set countrycode value
     * @param countrycode: new value
     */
    public void setCountrycode(java.lang.String countrycode) {
        this.arealevel1PK.setCountrycode(countrycode);
    }

    /**
     * 
     * @return al1code value
     */
    public java.lang.String getAl1code() {
        return this.arealevel1PK.getAl1code();
    }

    /**
     * set al1code value
     * @param al1code: new value
     */
    public void setAl1code(java.lang.String al1code) {
        this.arealevel1PK.setAl1code(al1code);
    }

    /**
     * 
     * @return al2code value
     */
    public java.lang.String getAl2code() {
        return this.al2code;
    }

    /**
     * set al2code value
     * @param al2code: new value
     */
    public void setAl2code(java.lang.String al2code) {
        this.al2code = al2code;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getCountrycode()!=null) key += getCountrycode().length() + "_" + getCountrycode();
        key += "_";

        if(getAl1code()!=null) key += getAl1code().length() + "_" + getAl1code();
        key += "_";

        if(getAl2code()!=null) key += getAl2code().length() + "_" + getAl2code();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Arealevel2PK constructed from keystring
     */
    public static Arealevel2PK getKey(String keystring) {
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
            String al1code = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String al2code = keys.substring(0, keylength);
            return new Arealevel2PK(countrycode, al1code, al2code);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param arealevel2PK2: Arealevel2PK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArealevel2PK arealevel2PK2) {
        boolean isequal = arealevel2PK2!=null;
        if(isequal) {
            isequal = isequal && this.arealevel1PK.equals(arealevel2PK2.getArealevel1PK());
            isequal = isequal && this.al2code.equals(arealevel2PK2.getAl2code());
        }
        return isequal;
    }
}
