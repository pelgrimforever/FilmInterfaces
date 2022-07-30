/*
 * ISpatial_ref_sysPK.java
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
 * Primary Key class Spatial_ref_sysPK for entity class Spatial_ref_sys
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface ISpatial_ref_sysPK extends EntityPK, Serializable {

    /**
     * 
     * @return srid value
     */
    public int getSrid();

    /**
     * set srid value
     * @param srid: new value
     */
    public void setSrid(int srid);


    /**
     * compare this primary key with second primary key
     * @param spatial_ref_sysPK2: Spatial_ref_sysPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISpatial_ref_sysPK spatial_ref_sysPK2);

}
