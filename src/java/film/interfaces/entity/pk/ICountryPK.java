/*
 * ICountryPK.java
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
 * Primary Key class CountryPK for entity class Country
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ICountryPK extends EntityPK, Serializable {

    /**
     * 
     * @return code value
     */
    public java.lang.String getCode();

    /**
     * set code value
     * @param code: new value
     */
    public void setCode(java.lang.String code);


    /**
     * compare this primary key with second primary key
     * @param countryPK2: CountryPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ICountryPK countryPK2);

}
