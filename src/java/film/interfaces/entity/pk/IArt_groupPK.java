/*
 * IArt_groupPK.java
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
 * Primary Key class Art_groupPK for entity class Art_group
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IArt_groupPK extends EntityPK, Serializable {

    /**
     * 
     * @return groupid value
     */
    public long getGroupid();

    /**
     * set groupid value
     * @param groupid: new value
     */
    public void setGroupid(long groupid);


    /**
     * compare this primary key with second primary key
     * @param art_groupPK2: Art_groupPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArt_groupPK art_groupPK2);

}
