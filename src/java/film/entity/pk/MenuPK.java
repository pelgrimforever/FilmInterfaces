/*
 * MenuPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IMenu;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class MenuPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class MenuPK implements IMenuPK {

    private IMainmenuPK mainmenuPK = new MainmenuPK();
    private java.lang.String menu;
  
    /** 
     * Constructor
     * Creates an empty MenuPK
     */
    public MenuPK() {
    }

    /**
     * Constructor
     * build an empty MenuPK with initialized field values
     */
    public MenuPK(java.lang.String mainmenu, java.lang.String menu) {
        this.mainmenuPK = new MainmenuPK(mainmenu);
        this.menu = menu;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"menu.mainmenu", mainmenuPK.getMainmenu()}, 
            {"menu.menu", menu}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IMenu.MAINMENU, mainmenuPK.getMainmenu()}, 
            {IMenu.MENU, menu}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key mainmenuPK, instance of IMainmenuPK
     */
    public IMainmenuPK getMainmenuPK() {
        return this.mainmenuPK;
    }

    /**
     * set foreign key mainmenuPK
     * @param mainmenuPK: instance of IMainmenuPK
     */
    public void setMainmenuPK(IMainmenuPK mainmenuPK) {
        this.mainmenuPK = mainmenuPK;
    }

    /**
     * 
     * @return mainmenu value
     */
    public java.lang.String getMainmenu() {
        return this.mainmenuPK.getMainmenu();
    }

    /**
     * set mainmenu value
     * @param mainmenu: new value
     */
    public void setMainmenu(java.lang.String mainmenu) {
        this.mainmenuPK.setMainmenu(mainmenu);
    }

    /**
     * 
     * @return menu value
     */
    public java.lang.String getMenu() {
        return this.menu;
    }

    /**
     * set menu value
     * @param menu: new value
     */
    public void setMenu(java.lang.String menu) {
        this.menu = menu;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getMainmenu()!=null) key += getMainmenu().length() + "_" + getMainmenu();
        key += "_";

        if(getMenu()!=null) key += getMenu().length() + "_" + getMenu();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return MenuPK constructed from keystring
     */
    public static MenuPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String mainmenu = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String menu = keys.substring(0, keylength);
            return new MenuPK(mainmenu, menu);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param menuPK2: MenuPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IMenuPK menuPK2) {
        boolean isequal = menuPK2!=null;
        if(isequal) {
            isequal = isequal && this.mainmenuPK.equals(menuPK2.getMainmenuPK());
            isequal = isequal && this.menu.equals(menuPK2.getMenu());
        }
        return isequal;
    }
}
