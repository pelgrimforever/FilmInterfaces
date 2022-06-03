/*
 * ICreatorPK.java
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
 * Primary Key class CreatorPK for entity class Creator
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ICreatorPK extends EntityPK, Serializable {

    /**
     * 
     * @return creatorid value
     */
    public java.lang.String getCreatorid();

    /**
     * set creatorid value
     * @param creatorid: new value
     */
    public void setCreatorid(java.lang.String creatorid);


    /**
     * compare this primary key with second primary key
     * @param creatorPK2: CreatorPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ICreatorPK creatorPK2);

}
