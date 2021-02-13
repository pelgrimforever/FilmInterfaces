/*
 * IArt_groupPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class Art_groupPK for entity class Art_group
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IArt_groupPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

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
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param art_groupPK2: Art_groupPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArt_groupPK art_groupPK2);

}
