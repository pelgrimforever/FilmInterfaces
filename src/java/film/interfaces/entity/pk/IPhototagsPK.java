/*
 * IPhototagsPK.java
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
 * Primary Key class PhototagsPK for entity class Phototags
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IPhototagsPK extends EntityPK, Serializable {

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
     * @return id value
     */
    public int getId();

    /**
     * set id value
     * @param id: new value
     */
    public void setId(int id);

    /**
     * 
     * @return tag value
     */
    public java.lang.String getTag();

    /**
     * set tag value
     * @param tag: new value
     */
    public void setTag(java.lang.String tag);


    /**
     * compare this primary key with second primary key
     * @param phototagsPK2: PhototagsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IPhototagsPK phototagsPK2);

}
