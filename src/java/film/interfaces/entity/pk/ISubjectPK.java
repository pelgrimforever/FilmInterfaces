/*
 * ISubjectPK.java
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
 * Primary Key class SubjectPK for entity class Subject
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISubjectPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key subjectcatPK, instance of ISubjectcatPK
     */
    public ISubjectcatPK getSubjectcatcat1PK();
    /**
     * set foreign key SubjectcatPK
     * @param subjectcatPK: instance of ISubjectcatPK
     */
    public void setSubjectcatcat1PK(ISubjectcatPK subjectcatPK);

    /**
     * 
     * @return foreign key subjectcatPK, instance of ISubjectcatPK
     */
    public ISubjectcatPK getSubjectcatcat2PK();
    /**
     * set foreign key SubjectcatPK
     * @param subjectcatPK: instance of ISubjectcatPK
     */
    public void setSubjectcatcat2PK(ISubjectcatPK subjectcatPK);

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
     * @param subjectPK2: SubjectPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISubjectPK subjectPK2);

}
