/*
 * IArt_photoPK.java
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
 * Primary Key class Art_photoPK for entity class Art_photo
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IArt_photoPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key photoPK, instance of IPhotoPK
     */
    public IPhotoPK getPhotoPK();
    /**
     * set foreign key PhotoPK
     * @param photoPK: instance of IPhotoPK
     */
    public void setPhotoPK(IPhotoPK photoPK);

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
     * @return photo value
     */
    public int getPhoto();

    /**
     * set photo value
     * @param photo: new value
     */
    public void setPhoto(int photo);


    /**
     * compare this primary key with second primary key
     * @param art_photoPK2: Art_photoPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArt_photoPK art_photoPK2);

}
