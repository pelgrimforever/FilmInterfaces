/*
 * ISecurityprofilePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class SecurityprofilePK for entity class Securityprofile
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISecurityprofilePK extends EntityPK, Serializable {

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
     * compare this primary key with second primary key
     * @param securityprofilePK2: SecurityprofilePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISecurityprofilePK securityprofilePK2);

}
