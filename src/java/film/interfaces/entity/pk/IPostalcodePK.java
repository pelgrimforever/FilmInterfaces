/*
 * IPostalcodePK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class PostalcodePK for entity class Postalcode
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IPostalcodePK extends EntityPK, Serializable {

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode();

    /**
     * set countrycode value
     * @param countrycode: new value
     */
    public void setCountrycode(java.lang.String countrycode);

    /**
     * 
     * @return postalcode value
     */
    public java.lang.String getPostalcode();

    /**
     * set postalcode value
     * @param postalcode: new value
     */
    public void setPostalcode(java.lang.String postalcode);


    /**
     * compare this primary key with second primary key
     * @param postalcodePK2: PostalcodePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IPostalcodePK postalcodePK2);

}
