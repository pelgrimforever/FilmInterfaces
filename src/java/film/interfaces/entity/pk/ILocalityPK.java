/*
 * ILocalityPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class LocalityPK for entity class Locality
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ILocalityPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

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
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param localityPK2: LocalityPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ILocalityPK localityPK2);

}