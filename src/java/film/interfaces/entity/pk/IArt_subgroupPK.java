/*
 * IArt_subgroupPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class Art_subgroupPK for entity class Art_subgroup
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IArt_subgroupPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return subgroupid value
     */
    public int getSubgroupid();

    /**
     * set subgroupid value
     * @param subgroupid: new value
     */
    public void setSubgroupid(int subgroupid);

    /**
     *
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param art_subgroupPK2: Art_subgroupPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IArt_subgroupPK art_subgroupPK2);

}
