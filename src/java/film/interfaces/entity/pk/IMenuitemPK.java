/*
 * IMenuitemPK.java
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
 * Primary Key class MenuitemPK for entity class Menuitem
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IMenuitemPK extends EntityPK, Serializable {

    /**
     * 
     * @return foreign key menuPK, instance of IMenuPK
     */
    public IMenuPK getMenuPK();
    /**
     * set foreign key MenuPK
     * @param menuPK: instance of IMenuPK
     */
    public void setMenuPK(IMenuPK menuPK);

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
     * 
     * @return menu value
     */
    public java.lang.String getMenu();

    /**
     * set menu value
     * @param menu: new value
     */
    public void setMenu(java.lang.String menu);

    /**
     * 
     * @return menuitem value
     */
    public java.lang.String getMenuitem();

    /**
     * set menuitem value
     * @param menuitem: new value
     */
    public void setMenuitem(java.lang.String menuitem);


    /**
     * compare this primary key with second primary key
     * @param menuitemPK2: MenuitemPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IMenuitemPK menuitemPK2);

}
