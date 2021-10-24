/*
 * IFilmtypePK.java
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
 * Primary Key class FilmtypePK for entity class Filmtype
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IFilmtypePK extends EntityPK, Serializable {

    /**
     * 
     * @return type value
     */
    public java.lang.String getType();

    /**
     * set type value
     * @param type: new value
     */
    public void setType(java.lang.String type);


    /**
     * compare this primary key with second primary key
     * @param filmtypePK2: FilmtypePK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IFilmtypePK filmtypePK2);

}
