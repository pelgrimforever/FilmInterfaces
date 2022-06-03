/*
 * IFilmPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

/**
 * Primary Key class FilmPK for entity class Film
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IFilmPK extends EntityPK, Serializable {

    /**
     * 
     * @return id value
     */
    public java.lang.String getId();

    /**
     * set id value
     * @param id: new value
     */
    public void setId(java.lang.String id);


    /**
     * compare this primary key with second primary key
     * @param filmPK2: FilmPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IFilmPK filmPK2);

}
