/*
 * IRoutePK.java
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
 * Primary Key class RoutePK for entity class Route
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IRoutePK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key sublocalityPK, instance of ISublocalityPK
     */
    public ISublocalityPK getSublocalityPK();
    /**
     * set foreign key SublocalityPK
     * @param sublocalityPK: instance of ISublocalityPK
     */
    public void setSublocalityPK(ISublocalityPK sublocalityPK);

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
     * @return routecode value
     */
    public java.lang.String getRoutecode();

    /**
     * set routecode value
     * @param routecode: new value
     */
    public void setRoutecode(java.lang.String routecode);


    /**
     * compare this primary key with second primary key
     * @param routePK2: RoutePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IRoutePK routePK2);

}
