/*
 * IMainmenuPK.java
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
 * Primary Key class MainmenuPK for entity class Mainmenu
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IMainmenuPK extends EntityPK, Serializable {

    /**
     * 
     * @return mainmenu value
     */
    public java.lang.String getMainmenu();

    /**
     * set mainmenu value
     * @param mainmenu: new value
     */
    public void setMainmenu(java.lang.String mainmenu);


    /**
     * compare this primary key with second primary key
     * @param mainmenuPK2: MainmenuPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IMainmenuPK mainmenuPK2);

}
