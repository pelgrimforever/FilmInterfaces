/*
 * IMenuPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.entity.pk;

import java.io.Serializable;

import data.interfaces.db.EntityPKInterface;

/**
 * Primary Key class MenuPK for entity class Menu
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public interface IMenuPK extends EntityPKInterface, Serializable {

    /**
     *
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields();

    /**
     * 
     * @return foreign key mainmenuPK, instance of IMainmenuPK
     */
    public IMainmenuPK getMainmenuPK();
    /**
     * set foreign key MainmenuPK
     * @param mainmenuPK: instance of IMainmenuPK
     */
    public void setMainmenuPK(IMainmenuPK mainmenuPK);

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
     * @return primary key in one formatted string
     */
    public String getKeystring();

    /**
     * compare this primary key with second primary key
     * @param menuPK2: MenuPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IMenuPK menuPK2);

}
