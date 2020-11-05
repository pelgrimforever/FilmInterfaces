/*
 * eArt_academy.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import film.entity.pk.*;
import film.interfaces.logicentity.IArt_academy;
import film.interfaces.entity.pk.*;

/**
 * Entity class Art_academy
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Art_academy Entity
 * 
 * @author Franky Laseure
 */
public class eArt_academy extends AbstractEntity implements EntityInterface {

    protected Art_academyPK art_academyPK;
    private java.lang.String academy;
    private java.lang.String academylocation;
	  
    public static final String table = "art_academy";
    public static final String SQLWhere1 = "academyid = :art_academy.academyid:";
    public static final String SQLSelect1 = "select art_academy.* from art_academy where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from art_academy where " + SQLWhere1;
    public static final String SQLSelectAll = "select art_academy.* from art_academy";
	  
    public String getFieldname(short fieldconstant) {
        return IArt_academy.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArt_academy.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Art_academy
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Art_academy (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Art_academy (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Art_academys
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Art_academy class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Art_academy entity
     */
    public eArt_academy() {
    }

    /**
     * Constructor
     * build an empty Art_academy entity with initialized field values
     */
    public eArt_academy(long academyid) {
        this.art_academyPK = new Art_academyPK(academyid);
    }
  
    /**
     * Constructor
     * build an empty Art_academy entity with initialized Primarykey parameter
     * @param art_academyPK: Art_academy Primarykey
     */
    public eArt_academy(Art_academyPK art_academyPK) {
        this.art_academyPK = art_academyPK;
    }

    /**
     * @return is Art_academy Empty ?
     */
    public boolean isEmpty() {
        return this.art_academyPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.art_academyPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.art_academyPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IArt_academy.ACADEMY, academy);
        updates.put(IArt_academy.ACADEMYLOCATION, academylocation);
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
    public Art_academyPK getPrimaryKey() {
        return this.art_academyPK;
    }

    /**
     * 
     * @return academy value
     */
    public java.lang.String getAcademy() {
        return this.academy;
    }

    /**
     * set academy value
     * @param academy: new value
     */
    public void initAcademy(java.lang.String academy) {
        this.academy = academy;
    }

    /**
     * set academy value
     * @param academy: new value
     */
    public void setAcademy(java.lang.String academy) {
	if(academy==null && academy!=this.academy || academy!=null && !academy.equals(this.academy)) {
            updates.put(IArt_academy.ACADEMY, academy);
        }
        this.academy = academy;
    }

    /**
     * 
     * @return academylocation value
     */
    public java.lang.String getAcademylocation() {
        return this.academylocation;
    }

    /**
     * set academylocation value
     * @param academylocation: new value
     */
    public void initAcademylocation(java.lang.String academylocation) {
        this.academylocation = academylocation;
    }

    /**
     * set academylocation value
     * @param academylocation: new value
     */
    public void setAcademylocation(java.lang.String academylocation) {
	if(academylocation==null && academylocation!=this.academylocation || academylocation!=null && !academylocation.equals(this.academylocation)) {
            updates.put(IArt_academy.ACADEMYLOCATION, academylocation);
        }
        this.academylocation = academylocation;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
