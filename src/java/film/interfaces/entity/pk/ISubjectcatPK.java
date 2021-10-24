/*
 * ISubjectcatPK.java
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
 * Primary Key class SubjectcatPK for entity class Subjectcat
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISubjectcatPK extends EntityPK, Serializable {

    /**
     * 
     * @return cat value
     */
    public java.lang.String getCat();

    /**
     * set cat value
     * @param cat: new value
     */
    public void setCat(java.lang.String cat);


    /**
     * compare this primary key with second primary key
     * @param subjectcatPK2: SubjectcatPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISubjectcatPK subjectcatPK2);

}
