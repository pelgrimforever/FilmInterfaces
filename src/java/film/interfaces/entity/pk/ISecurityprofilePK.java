/*
 * ISecurityprofilePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class SecurityprofilePK for entity class Securityprofile
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISecurityprofilePK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

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
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param securityprofilePK2: SecurityprofilePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISecurityprofilePK securityprofilePK2);

}
