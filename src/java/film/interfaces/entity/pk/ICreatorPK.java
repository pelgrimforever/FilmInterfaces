/*
 * ICreatorPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class CreatorPK for entity class Creator
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ICreatorPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

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
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param creatorPK2: CreatorPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ICreatorPK creatorPK2);

}
