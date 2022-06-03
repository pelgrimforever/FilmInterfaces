/*
 * eArt_academy.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.entity;

import film.filmDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import film.entity.pk.*;
import film.interfaces.logicentity.IArt_academy;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Art_academy
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Art_academy Entity
 * 
 * @author Franky Laseure
 */
public class eArt_academy extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Art_academyPK art_academyPK;
    private java.lang.String academy;
    private java.lang.String academylocation;
	  
    public static final String table = "art_academy";
	  
    public String getFieldname(short fieldconstant) {
        return IArt_academy.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArt_academy.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eArt_academy.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eArt_academy.connectionpool;
    }
    
    /**
     * 
     * @return table name for Art_academy
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.art_academyPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.art_academyPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IArt_academy.ACADEMY, academy);
        updates.put(IArt_academy.ACADEMYLOCATION, academylocation);
        return getAllFields();
    }
	
    /**
     * @return Art_academyPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Art_academyPK
     */
    @Override
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
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
