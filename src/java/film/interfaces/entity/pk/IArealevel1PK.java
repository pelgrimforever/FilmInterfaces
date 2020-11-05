/*
 * IArealevel1PK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class Arealevel1PK for entity class Arealevel1
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IArealevel1PK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return foreign key countryPK, instance of ICountryPK
     */
    public ICountryPK getCountryPK();
    /**
     * set foreign key CountryPK
     * @param countryPK: instance of ICountryPK
     */
    public void setCountryPK(ICountryPK countryPK);

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
     * @return al1code value
     */
    public java.lang.String getAl1code();

    /**
     * set al1code value
     * @param al1code: new value
     */
    public void setAl1code(java.lang.String al1code);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param arealevel1PK2: Arealevel1PK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArealevel1PK arealevel1PK2);

}