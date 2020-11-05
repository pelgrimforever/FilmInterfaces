/*
 * IArt_academyPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class Art_academyPK for entity class Art_academy
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IArt_academyPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return academyid value
     */
    public long getAcademyid();

    /**
     * set academyid value
     * @param academyid: new value
     */
    public void setAcademyid(long academyid);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param art_academyPK2: Art_academyPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArt_academyPK art_academyPK2);

}
