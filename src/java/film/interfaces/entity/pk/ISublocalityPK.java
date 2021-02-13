/*
 * ISublocalityPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class SublocalityPK for entity class Sublocality
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISublocalityPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return foreign key localityPK, instance of ILocalityPK
     */
    public ILocalityPK getLocalityPK();
    /**
     * set foreign key LocalityPK
     * @param localityPK: instance of ILocalityPK
     */
    public void setLocalityPK(ILocalityPK localityPK);

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
     * @return sublocality value
     */
    public java.lang.String getSublocality();

    /**
     * set sublocality value
     * @param sublocality: new value
     */
    public void setSublocality(java.lang.String sublocality);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param sublocalityPK2: SublocalityPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISublocalityPK sublocalityPK2);

}
