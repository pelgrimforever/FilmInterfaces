/*
 * Tree7subjectPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ITree7subject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class Tree7subjectPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class Tree7subjectPK implements EntityPKInterface, ITree7subjectPK {

    private long subjectid;
  
    /** 
     * Constructor
     * Creates an empty Tree7subjectPK
     */
    public Tree7subjectPK() {
    }

    /**
     * Constructor
     * build an empty Tree7subjectPK with initialized field values
     */
    public Tree7subjectPK(long subjectid) {
        this.subjectid = subjectid;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"tree7subject.subjectid", subjectid}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ITree7subject.SUBJECTID, subjectid}
        };
        return keyfields;
    }

    /**
     * 
     * @return subjectid value
     */
    public long getSubjectid() {
        return this.subjectid;
    }

    /**
     * set subjectid value
     * @param subjectid: new value
     */
    public void setSubjectid(long subjectid) {
        this.subjectid = subjectid;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        key += getSubjectid();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return Tree7subjectPK constructed from keystring
     */
    public static Tree7subjectPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            long subjectid = Long.valueOf(keys.substring(0, keylength));
            return new Tree7subjectPK(subjectid);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param tree7subjectPK2: Tree7subjectPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ITree7subjectPK tree7subjectPK2) {
        boolean isequal = tree7subjectPK2!=null;
        if(isequal) {
            isequal = isequal && this.subjectid == tree7subjectPK2.getSubjectid();
        }
        return isequal;
    }
}