/*
 * IFilmsubjectsPK.java
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
 * Primary Key class FilmsubjectsPK for entity class Filmsubjects
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IFilmsubjectsPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key subjectPK, instance of ISubjectPK
     */
    public ISubjectPK getSubjectPK();
    /**
     * set foreign key SubjectPK
     * @param subjectPK: instance of ISubjectPK
     */
    public void setSubjectPK(ISubjectPK subjectPK);

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
     * @return cat1 value
     */
    public java.lang.String getCat1();

    /**
     * set cat1 value
     * @param cat1: new value
     */
    public void setCat1(java.lang.String cat1);

    /**
     * 
     * @return cat2 value
     */
    public java.lang.String getCat2();

    /**
     * set cat2 value
     * @param cat2: new value
     */
    public void setCat2(java.lang.String cat2);

    /**
     * 
     * @return subject value
     */
    public int getSubject();

    /**
     * set subject value
     * @param subject: new value
     */
    public void setSubject(int subject);


    /**
     * compare this primary key with second primary key
     * @param filmsubjectsPK2: FilmsubjectsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IFilmsubjectsPK filmsubjectsPK2);

}
