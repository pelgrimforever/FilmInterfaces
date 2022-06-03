/*
 * ISecurityuserprofilePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class SecurityuserprofilePK for entity class Securityuserprofile
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISecurityuserprofilePK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key securityprofilePK, instance of ISecurityprofilePK
     */
    public ISecurityprofilePK getSecurityprofilePK();
    /**
     * set foreign key SecurityprofilePK
     * @param securityprofilePK: instance of ISecurityprofilePK
     */
    public void setSecurityprofilePK(ISecurityprofilePK securityprofilePK);

    /**
     * 
     * @return userprofile value
     */
    public java.lang.String getUserprofile();

    /**
     * set userprofile value
     * @param userprofile: new value
     */
    public void setUserprofile(java.lang.String userprofile);

    /**
     * 
     * @return siteusername value
     */
    public java.lang.String getSiteusername();

    /**
     * set siteusername value
     * @param siteusername: new value
     */
    public void setSiteusername(java.lang.String siteusername);


    /**
     * compare this primary key with second primary key
     * @param securityuserprofilePK2: SecurityuserprofilePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISecurityuserprofilePK securityuserprofilePK2);

}
