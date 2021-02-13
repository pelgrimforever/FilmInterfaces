/*
 * UploadsessionsettingsPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IUploadsessionsettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class UploadsessionsettingsPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class UploadsessionsettingsPK implements EntityPKInterface, IUploadsessionsettingsPK {

    private java.lang.String directory;
  
    /** 
     * Constructor
     * Creates an empty UploadsessionsettingsPK
     */
    public UploadsessionsettingsPK() {
    }

    /**
     * Constructor
     * build an empty UploadsessionsettingsPK with initialized field values
     */
    public UploadsessionsettingsPK(java.lang.String directory) {
        this.directory = directory;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"uploadsessionsettings.directory", directory}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {IUploadsessionsettings.DIRECTORY, directory}
        };
        return keyfields;
    }

    /**
     * 
     * @return directory value
     */
    public java.lang.String getDirectory() {
        return this.directory;
    }

    /**
     * set directory value
     * @param directory: new value
     */
    public void setDirectory(java.lang.String directory) {
        this.directory = directory;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getDirectory()!=null) key += getDirectory().length() + "_" + getDirectory();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return UploadsessionsettingsPK constructed from keystring
     */
    public static UploadsessionsettingsPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String directory = keys.substring(0, keylength);
            return new UploadsessionsettingsPK(directory);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param uploadsessionsettingsPK2: UploadsessionsettingsPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(IUploadsessionsettingsPK uploadsessionsettingsPK2) {
        boolean isequal = uploadsessionsettingsPK2!=null;
        if(isequal) {
            isequal = isequal && this.directory.equals(uploadsessionsettingsPK2.getDirectory());
        }
        return isequal;
    }
}
