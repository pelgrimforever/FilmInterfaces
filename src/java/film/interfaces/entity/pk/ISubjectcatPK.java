/*
 * ISubjectcatPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class SubjectcatPK for entity class Subjectcat
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISubjectcatPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

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
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param subjectcatPK2: SubjectcatPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISubjectcatPK subjectcatPK2);

}
