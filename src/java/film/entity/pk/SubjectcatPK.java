/*
 * SubjectcatPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISubjectcat;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class SubjectcatPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class SubjectcatPK implements EntityPKInterface, ISubjectcatPK {

    private java.lang.String cat;
  
    /** 
     * Constructor
     * Creates an empty SubjectcatPK
     */
    public SubjectcatPK() {
    }

    /**
     * Constructor
     * build an empty SubjectcatPK with initialized field values
     */
    public SubjectcatPK(java.lang.String cat) {
        this.cat = cat;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"subjectcat.cat", cat}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ISubjectcat.CAT, cat}
        };
        return keyfields;
    }

    /**
     * 
     * @return cat value
     */
    public java.lang.String getCat() {
        return this.cat;
    }

    /**
     * set cat value
     * @param cat: new value
     */
    public void setCat(java.lang.String cat) {
        this.cat = cat;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getCat()!=null) key += getCat().length() + "_" + getCat();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return SubjectcatPK constructed from keystring
     */
    public static SubjectcatPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String cat = keys.substring(0, keylength);
            return new SubjectcatPK(cat);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param subjectcatPK2: SubjectcatPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISubjectcatPK subjectcatPK2) {
        boolean isequal = subjectcatPK2!=null;
        if(isequal) {
            isequal = isequal && this.cat.equals(subjectcatPK2.getCat());
        }
        return isequal;
    }
}
