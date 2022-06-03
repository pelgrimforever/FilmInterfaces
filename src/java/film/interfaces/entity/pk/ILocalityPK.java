/*
 * ILocalityPK.java
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
 * Primary Key class LocalityPK for entity class Locality
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ILocalityPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key postalcodePK, instance of IPostalcodePK
     */
    public IPostalcodePK getPostalcodePK();
    /**
     * set foreign key PostalcodePK
     * @param postalcodePK: instance of IPostalcodePK
     */
    public void setPostalcodePK(IPostalcodePK postalcodePK);

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
     * 
     * @return locality value
     */
    public java.lang.String getLocality();

    /**
     * set locality value
     * @param locality: new value
     */
    public void setLocality(java.lang.String locality);


    /**
     * compare this primary key with second primary key
     * @param localityPK2: LocalityPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ILocalityPK localityPK2);

}
