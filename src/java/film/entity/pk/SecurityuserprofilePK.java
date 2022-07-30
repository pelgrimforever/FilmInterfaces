/*
 * SecurityuserprofilePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISecurityuserprofile;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class SecurityuserprofilePK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class SecurityuserprofilePK implements ISecurityuserprofilePK {

    private ISecurityprofilePK securityprofilePK = new SecurityprofilePK();
    private java.lang.String siteusername;
  
    /** 
     * Constructor
     * Creates an empty SecurityuserprofilePK
     */
    public SecurityuserprofilePK() {
    }

    /**
     * Constructor
     * build an empty SecurityuserprofilePK with initialized field values
     */
    public SecurityuserprofilePK(java.lang.String siteusername, java.lang.String userprofile) {
        this.securityprofilePK = new SecurityprofilePK(userprofile);
        this.siteusername = siteusername;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"securityuserprofile.userprofile", securityprofilePK.getUserprofile()}, 
            {"securityuserprofile.siteusername", siteusername}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {ISecurityuserprofile.USERPROFILE, securityprofilePK.getUserprofile()}, 
            {ISecurityuserprofile.SITEUSERNAME, siteusername}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key securityprofilePK, instance of ISecurityprofilePK
     */
    public ISecurityprofilePK getSecurityprofilePK() {
        return this.securityprofilePK;
    }

    /**
     * set foreign key securityprofilePK
     * @param securityprofilePK: instance of ISecurityprofilePK
     */
    public void setSecurityprofilePK(ISecurityprofilePK securityprofilePK) {
        this.securityprofilePK = securityprofilePK;
    }

    /**
     * 
     * @return userprofile value
     */
    public java.lang.String getUserprofile() {
        return this.securityprofilePK.getUserprofile();
    }

    /**
     * set userprofile value
     * @param userprofile: new value
     */
    public void setUserprofile(java.lang.String userprofile) {
        this.securityprofilePK.setUserprofile(userprofile);
    }

    /**
     * 
     * @return siteusername value
     */
    public java.lang.String getSiteusername() {
        return this.siteusername;
    }

    /**
     * set siteusername value
     * @param siteusername: new value
     */
    public void setSiteusername(java.lang.String siteusername) {
        this.siteusername = siteusername;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getSiteusername()!=null) key += getSiteusername().length() + "_" + getSiteusername();
        key += "_";

        if(getUserprofile()!=null) key += getUserprofile().length() + "_" + getUserprofile();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return SecurityuserprofilePK constructed from keystring
     */
    public static SecurityuserprofilePK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String siteusername = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String userprofile = keys.substring(0, keylength);
            return new SecurityuserprofilePK(siteusername, userprofile);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param securityuserprofilePK2: SecurityuserprofilePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISecurityuserprofilePK securityuserprofilePK2) {
        boolean isequal = securityuserprofilePK2!=null;
        if(isequal) {
            isequal = isequal && this.securityprofilePK.equals(securityuserprofilePK2.getSecurityprofilePK());
            isequal = isequal && this.siteusername.equals(securityuserprofilePK2.getSiteusername());
        }
        return isequal;
    }
}
