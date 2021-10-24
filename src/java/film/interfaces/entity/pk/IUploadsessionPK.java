/*
 * IUploadsessionPK.java
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
 * Primary Key class UploadsessionPK for entity class Uploadsession
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IUploadsessionPK extends EntityPK, Serializable {

    /**
     * 
     * @return filename value
     */
    public java.lang.String getFilename();

    /**
     * set filename value
     * @param filename: new value
     */
    public void setFilename(java.lang.String filename);


    /**
     * compare this primary key with second primary key
     * @param uploadsessionPK2: UploadsessionPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IUploadsessionPK uploadsessionPK2);

}
