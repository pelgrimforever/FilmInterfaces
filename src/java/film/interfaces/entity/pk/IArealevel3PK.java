/*
 * IArealevel3PK.java
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
 * Primary Key class Arealevel3PK for entity class Arealevel3
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IArealevel3PK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key arealevel2PK, instance of IArealevel2PK
     */
    public IArealevel2PK getArealevel2PK();
    /**
     * set foreign key Arealevel2PK
     * @param arealevel2PK: instance of IArealevel2PK
     */
    public void setArealevel2PK(IArealevel2PK arealevel2PK);

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
     * @return al2code value
     */
    public java.lang.String getAl2code();

    /**
     * set al2code value
     * @param al2code: new value
     */
    public void setAl2code(java.lang.String al2code);

    /**
     * 
     * @return al3code value
     */
    public java.lang.String getAl3code();

    /**
     * set al3code value
     * @param al3code: new value
     */
    public void setAl3code(java.lang.String al3code);


    /**
     * compare this primary key with second primary key
     * @param arealevel3PK2: Arealevel3PK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArealevel3PK arealevel3PK2);

}
