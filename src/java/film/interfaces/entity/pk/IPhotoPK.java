/*
 * IPhotoPK.java
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
 * Primary Key class PhotoPK for entity class Photo
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IPhotoPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key filmPK, instance of IFilmPK
     */
    public IFilmPK getFilmPK();
    /**
     * set foreign key FilmPK
     * @param filmPK: instance of IFilmPK
     */
    public void setFilmPK(IFilmPK filmPK);

    /**
     * 
     * @return film value
     */
    public java.lang.String getFilm();

    /**
     * set film value
     * @param film: new value
     */
    public void setFilm(java.lang.String film);

    /**
     * 
     * @return id value
     */
    public int getId();

    /**
     * set id value
     * @param id: new value
     */
    public void setId(int id);


    /**
     * compare this primary key with second primary key
     * @param photoPK2: PhotoPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IPhotoPK photoPK2);

}
