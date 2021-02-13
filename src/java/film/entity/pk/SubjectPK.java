/*
 * SubjectPK.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.entity.pk;

import data.interfaces.db.EntityPKInterface;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.ISubject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Primarykey class SubjectPK
 * 
 * Attributes: primary key fields and foreign keys
 * Methods: conversion to and from string for use in GUI
 * @author Franky Laseure
 */
public class SubjectPK implements EntityPKInterface, ISubjectPK {

    private ISubjectcatPK subjectcatCat1PK = new SubjectcatPK();
    private ISubjectcatPK subjectcatCat2PK = new SubjectcatPK();
    private int id;
  
    /** 
     * Constructor
     * Creates an empty SubjectPK
     */
    public SubjectPK() {
    }

    /**
     * Constructor
     * build an empty SubjectPK with initialized field values
     */
    public SubjectPK(java.lang.String cat1, java.lang.String cat2, int id) {
        this.subjectcatCat1PK = new SubjectcatPK(cat1);
        this.subjectcatCat2PK = new SubjectcatPK(cat2);
        this.id = id;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    public Object[][] getKeyFields() {
        Object[][] keyfields = { 
            {"subject.cat1", subjectcatCat1PK.getCat()}, 
            {"subject.cat2", subjectcatCat2PK.getCat()}, 
            {"subject.id", id}
        };
        return keyfields;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value) for sql insert statement
     */
    public Object[][] getInsertKeyFields() {
        Object[][] keyfields = { 
            {ISubject.CAT1, subjectcatCat1PK.getCat()}, 
            {ISubject.CAT2, subjectcatCat2PK.getCat()}, 
            {ISubject.ID, id}
        };
        return keyfields;
    }

    /**
     * 
     * @return foreign key subjectcatPK1, instance of ISubjectcatPK
     */
    public ISubjectcatPK getSubjectcatcat1PK() {
        return this.subjectcatCat1PK;
    }

    /**
     * set foreign key subjectcatCat1PK
     * @param subjectcatPK: instance of ISubjectcatPK
     */
    public void setSubjectcatcat1PK(ISubjectcatPK subjectcatPK) {
        this.subjectcatCat1PK = subjectcatPK;
    }

    /**
     * 
     * @return foreign key subjectcatPK, instance of ISubjectcatPK
     */
    public ISubjectcatPK getSubjectcatcat2PK() {
        return this.subjectcatCat2PK;
    }

    /**
     * set foreign key subjectcatCat2PK
     * @param subjectcatPK: instance of ISubjectcatPK
     */
    public void setSubjectcatcat2PK(ISubjectcatPK subjectcatPK) {
        this.subjectcatCat2PK = subjectcatPK;
    }

    /**
     * 
     * @return cat1 value
     */
    public java.lang.String getCat1() {
        return this.subjectcatCat1PK.getCat();
    }

    /**
     * set cat1 value
     * @param cat1: new value
     */
    public void setCat1(java.lang.String cat1) {
        this.subjectcatCat1PK.setCat(cat1);
    }

    /**
     * 
     * @return cat2 value
     */
    public java.lang.String getCat2() {
        return this.subjectcatCat2PK.getCat();
    }

    /**
     * set cat2 value
     * @param cat2: new value
     */
    public void setCat2(java.lang.String cat2) {
        this.subjectcatCat2PK.setCat(cat2);
    }

    /**
     * 
     * @return id value
     */
    public int getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return primary key in one formatted string
     */
    public String getKeystring() {
        String key = "";
        if(getCat1()!=null) key += getCat1().length() + "_" + getCat1();
        key += "_";

        if(getCat2()!=null) key += getCat2().length() + "_" + getCat2();
        key += "_";

        key += getId();
        return key;
    }

    /**
     * 
     * @param keystring: formated string from getKeystring() method
     * @return SubjectPK constructed from keystring
     */
    public static SubjectPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String cat1 = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String cat2 = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            if(keys.indexOf("_")==-1) {
                keylength = keys.length();
            } else {
                keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")).length());
            }
            int id = Integer.valueOf(keys.substring(0, keylength));
            return new SubjectPK(cat1, cat2, id);
        }
    }

    /**
     * compare this primary key with second primary key
     * @param subjectPK2: SubjectPK instance
     * @return true if all fields and foreign keys are equal
     */
    public boolean equals(ISubjectPK subjectPK2) {
        boolean isequal = subjectPK2!=null;
        if(isequal) {
            isequal = isequal && this.subjectcatCat1PK.equals(subjectPK2.getSubjectcatcat1PK());
            isequal = isequal && this.subjectcatCat2PK.equals(subjectPK2.getSubjectcatcat2PK());
            isequal = isequal && this.id == subjectPK2.getId();
        }
        return isequal;
    }
}
