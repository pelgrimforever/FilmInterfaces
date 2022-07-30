/*
 * MenuitemPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IMenuitem;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class MenuitemPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class MenuitemPK implements IMenuitemPK {

    private IMenuPK menuPK = new MenuPK();
    private java.lang.String menuitem;
  
    /** 
     * Constructor
     * Creates an empty MenuitemPK
     */
    public MenuitemPK() {
    }

    /**
     * Constructor
     * build an empty MenuitemPK with initialized field values
     */
    public MenuitemPK(java.lang.String mainmenu, java.lang.String menu, java.lang.String menuitem) {
        this.menuPK = new MenuPK(mainmenu, menu);
        this.menuitem = menuitem;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"menuitem.mainmenu", menuPK.getMainmenu()}, 
            {"menuitem.menu", menuPK.getMenu()}, 
            {"menuitem.menuitem", menuitem}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IMenuitem.MAINMENU, menuPK.getMainmenu()}, 
            {IMenuitem.MENU, menuPK.getMenu()}, 
            {IMenuitem.MENUITEM, menuitem}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return foreign key menuPK, instance of IMenuPK
     */
    public IMenuPK getMenuPK() {
        return this.menuPK;
    }

    /**
     * set foreign key menuPK
     * @param menuPK: instance of IMenuPK
     */
    public void setMenuPK(IMenuPK menuPK) {
        this.menuPK = menuPK;
    }

    /**
     * 
     * @return mainmenu value
     */
    public java.lang.String getMainmenu() {
        return this.menuPK.getMainmenu();
    }

    /**
     * set mainmenu value
     * @param mainmenu: new value
     */
    public void setMainmenu(java.lang.String mainmenu) {
        this.menuPK.setMainmenu(mainmenu);
    }

    /**
     * 
     * @return menu value
     */
    public java.lang.String getMenu() {
        return this.menuPK.getMenu();
    }

    /**
     * set menu value
     * @param menu: new value
     */
    public void setMenu(java.lang.String menu) {
        this.menuPK.setMenu(menu);
    }

    /**
     * 
     * @return menuitem value
     */
    public java.lang.String getMenuitem() {
        return this.menuitem;
    }

    /**
     * set menuitem value
     * @param menuitem: new value
     */
    public void setMenuitem(java.lang.String menuitem) {
        this.menuitem = menuitem;
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
        key += "_";

        if(getMenuitem()!=null) key += getMenuitem().length() + "_" + getMenuitem();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return MenuitemPK constructed from keystring
     */
    public static MenuitemPK getKey(String keystring) {
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
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String menuitem = keys.substring(0, keylength);
            return new MenuitemPK(mainmenu, menu, menuitem);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param menuitemPK2: MenuitemPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IMenuitemPK menuitemPK2) {
        boolean isequal = menuitemPK2!=null;
        if(isequal) {
            isequal = isequal && this.menuPK.equals(menuitemPK2.getMenuPK());
            isequal = isequal && this.menuitem.equals(menuitemPK2.getMenuitem());
        }
        return isequal;
    }
}
