/*
 * SecurityprofilePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISecurityprofile;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class SecurityprofilePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class SecurityprofilePK implements ISecurityprofilePK {

    private java.lang.String userprofile;
  
    /** 
     * Constructor
     * Creates an empty SecurityprofilePK
     */
    public SecurityprofilePK() {
    }

    /**
     * Constructor
     * build an empty SecurityprofilePK with initialized field values
     */
    public SecurityprofilePK(java.lang.String userprofile) {
        this.userprofile = userprofile;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"securityprofile.userprofile", userprofile}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISecurityprofile.USERPROFILE, userprofile}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return userprofile value
     */
    public java.lang.String getUserprofile() {
        return this.userprofile;
    }

    /**
     * set userprofile value
     * @param userprofile: new value
     */
    public void setUserprofile(java.lang.String userprofile) {
        this.userprofile = userprofile;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getUserprofile()!=null) key += getUserprofile().length() + "_" + getUserprofile();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return SecurityprofilePK constructed from keystring
     */
    public static SecurityprofilePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String userprofile = keys.substring(0, keylength);
            return new SecurityprofilePK(userprofile);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param securityprofilePK2: SecurityprofilePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISecurityprofilePK securityprofilePK2) {
        boolean isequal = securityprofilePK2!=null;
        if(isequal) {
            isequal = isequal && this.userprofile.equals(securityprofilePK2.getUserprofile());
        }
        return isequal;
    }
}
