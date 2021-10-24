/*
 * IPhototree7subjectPK.java
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
 * Primary Key class Phototree7subjectPK for entity class Phototree7subject
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IPhototree7subjectPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key tree7subjectPK, instance of ITree7subjectPK
     */
    public ITree7subjectPK getTree7subjectPK();
    /**
     * set foreign key Tree7subjectPK
     * @param tree7subjectPK: instance of ITree7subjectPK
     */
    public void setTree7subjectPK(ITree7subjectPK tree7subjectPK);

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
     * @return subjectid value
     */
    public long getSubjectid();

    /**
     * set subjectid value
     * @param subjectid: new value
     */
    public void setSubjectid(long subjectid);


    /**
     * compare this primary key with second primary key
     * @param phototree7subjectPK2: Phototree7subjectPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IPhototree7subjectPK phototree7subjectPK2);

}
