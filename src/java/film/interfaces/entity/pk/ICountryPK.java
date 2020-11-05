/*
 * ICountryPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class CountryPK for entity class Country
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ICountryPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

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
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param countryPK2: CountryPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ICountryPK countryPK2);

}
