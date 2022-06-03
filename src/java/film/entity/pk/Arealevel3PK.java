/*
 * Arealevel3PK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IArealevel3;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class Arealevel3PK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Arealevel3PK implements IArealevel3PK {

    private IArealevel2PK arealevel2PK = new Arealevel2PK();
    private java.lang.String al3code;
  
    /** 
     * Constructor
     * Creates an empty Arealevel3PK
     */
    public Arealevel3PK() {
    }

    /**
     * Constructor
     * build an empty Arealevel3PK with initialized field values
     */
    public Arealevel3PK(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code, java.lang.String al3code) {
        this.arealevel2PK = new Arealevel2PK(countrycode, al1code, al2code);
        this.al3code = al3code;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"arealevel3.countrycode", arealevel2PK.getCountrycode()}, 
            {"arealevel3.al1code", arealevel2PK.getAl1code()}, 
            {"arealevel3.al2code", arealevel2PK.getAl2code()}, 
            {"arealevel3.al3code", al3code}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IArealevel3.COUNTRYCODE, arealevel2PK.getCountrycode()}, 
            {IArealevel3.AL1CODE, arealevel2PK.getAl1code()}, 
            {IArealevel3.AL2CODE, arealevel2PK.getAl2code()}, 
            {IArealevel3.AL3CODE, al3code}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key arealevel2PK, instance of IArealevel2PK
     */
    public IArealevel2PK getArealevel2PK() {
        return this.arealevel2PK;
    }

    /**
     * set foreign key arealevel2PK
     * @param arealevel2PK: instance of IArealevel2PK
     */
    public void setArealevel2PK(IArealevel2PK arealevel2PK) {
        this.arealevel2PK = arealevel2PK;
    }

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode() {
        return this.arealevel2PK.getCountrycode();
    }

    /**
     * set countrycode value
     * @param countrycode: new value
     */
    public void setCountrycode(java.lang.String countrycode) {
        this.arealevel2PK.setCountrycode(countrycode);
    }

    /**
     * 
     * @return al1code value
     */
    public java.lang.String getAl1code() {
        return this.arealevel2PK.getAl1code();
    }

    /**
     * set al1code value
     * @param al1code: new value
     */
    public void setAl1code(java.lang.String al1code) {
        this.arealevel2PK.setAl1code(al1code);
    }

    /**
     * 
     * @return al2code value
     */
    public java.lang.String getAl2code() {
        return this.arealevel2PK.getAl2code();
    }

    /**
     * set al2code value
     * @param al2code: new value
     */
    public void setAl2code(java.lang.String al2code) {
        this.arealevel2PK.setAl2code(al2code);
    }

    /**
     * 
     * @return al3code value
     */
    public java.lang.String getAl3code() {
        return this.al3code;
    }

    /**
     * set al3code value
     * @param al3code: new value
     */
    public void setAl3code(java.lang.String al3code) {
        this.al3code = al3code;
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
        key += "_";

        if(getAl3code()!=null) key += getAl3code().length() + "_" + getAl3code();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Arealevel3PK constructed from keystring
     */
    public static Arealevel3PK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String al3code = keys.substring(0, keylength);
            return new Arealevel3PK(countrycode, al1code, al2code, al3code);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param arealevel3PK2: Arealevel3PK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArealevel3PK arealevel3PK2) {
        boolean isequal = arealevel3PK2!=null;
        if(isequal) {
            isequal = isequal && this.arealevel2PK.equals(arealevel3PK2.getArealevel2PK());
            isequal = isequal && this.al3code.equals(arealevel3PK2.getAl3code());
        }
        return isequal;
    }
}
