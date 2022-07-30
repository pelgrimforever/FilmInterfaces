/*
 * MainmenuPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IMainmenu;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

/**
 * Primarykey class MainmenuPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class MainmenuPK implements IMainmenuPK {

    private java.lang.String mainmenu;
  
    /** 
     * Constructor
     * Creates an empty MainmenuPK
     */
    public MainmenuPK() {
    }

    /**
     * Constructor
     * build an empty MainmenuPK with initialized field values
     */
    public MainmenuPK(java.lang.String mainmenu) {
        this.mainmenu = mainmenu;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"mainmenu.mainmenu", mainmenu}
        };
        return new SQLparameters(keyfields);
    }

    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IMainmenu.MAINMENU, mainmenu}
        };
        return new Entityvalues(keyfields);
    }

    /**
     * 
     * @return mainmenu value
     */
    public java.lang.String getMainmenu() {
        return this.mainmenu;
    }

    /**
     * set mainmenu value
     * @param mainmenu: new value
     */
    public void setMainmenu(java.lang.String mainmenu) {
        this.mainmenu = mainmenu;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getMainmenu()!=null) key += getMainmenu().length() + "_" + getMainmenu();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return MainmenuPK constructed from keystring
     */
    public static MainmenuPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String mainmenu = keys.substring(0, keylength);
            return new MainmenuPK(mainmenu);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param mainmenuPK2: MainmenuPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IMainmenuPK mainmenuPK2) {
        boolean isequal = mainmenuPK2!=null;
        if(isequal) {
            isequal = isequal && this.mainmenu.equals(mainmenuPK2.getMainmenu());
        }
        return isequal;
    }
}
