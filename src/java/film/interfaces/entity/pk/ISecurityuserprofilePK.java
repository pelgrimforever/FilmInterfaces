/*
 * ISecurityuserprofilePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class SecurityuserprofilePK for entity class Securityuserprofile
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISecurityuserprofilePK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

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
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param securityuserprofilePK2: SecurityuserprofilePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISecurityuserprofilePK securityuserprofilePK2);

}
