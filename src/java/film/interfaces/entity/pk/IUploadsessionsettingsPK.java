/*
 * IUploadsessionsettingsPK.java
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
 * Primary Key class UploadsessionsettingsPK for entity class Uploadsessionsettings
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IUploadsessionsettingsPK extends EntityPK, Serializable {

    /**
     * 
     * @return directory value
     */
    public java.lang.String getDirectory();

    /**
     * set directory value
     * @param directory: new value
     */
    public void setDirectory(java.lang.String directory);


    /**
     * compare this primary key with second primary key
     * @param uploadsessionsettingsPK2: UploadsessionsettingsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IUploadsessionsettingsPK uploadsessionsettingsPK2);

}
