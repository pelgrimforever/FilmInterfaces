/*
 * ITree7subjectPK.java
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
 * Primary Key class Tree7subjectPK for entity class Tree7subject
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ITree7subjectPK extends EntityPK, Serializable {

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
     * @param tree7subjectPK2: Tree7subjectPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ITree7subjectPK tree7subjectPK2);

}
