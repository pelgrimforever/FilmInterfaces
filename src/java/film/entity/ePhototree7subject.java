/*
 * ePhototree7subject.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
import film.interfaces.logicentity.IPhototree7subject;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Phototree7subject
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Phototree7subject Entity
 * 
 * @author Franky Laseure
 */
public class ePhototree7subject extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Phototree7subjectPK phototree7subjectPK;
	  
    public static final String table = "phototree7subject";
	  
    public String getFieldname(short fieldconstant) {
        return IPhototree7subject.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhototree7subject.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return ePhototree7subject.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return ePhototree7subject.connectionpool;
    }
    
    /**
     * 
     * @return table name for Phototree7subject
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Phototree7subject class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Phototree7subject entity
     */
    public ePhototree7subject() {
    }

    /**
     * Constructor
     * build an empty Phototree7subject entity with initialized field values
     */
    public ePhototree7subject(java.lang.String film, int id, long subjectid) {
        this.phototree7subjectPK = new Phototree7subjectPK(film, id, subjectid);
    }
  
    /**
     * Constructor
     * build an empty Phototree7subject entity with initialized Primarykey parameter
     * @param phototree7subjectPK: Phototree7subject Primarykey
     */
    public ePhototree7subject(Phototree7subjectPK phototree7subjectPK) {
        this.phototree7subjectPK = phototree7subjectPK;
    }

    /**
     * @return is Phototree7subject Empty ?
     */
    public boolean isEmpty() {
        return this.phototree7subjectPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.phototree7subjectPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.phototree7subjectPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    /**
     * @return Phototree7subjectPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Phototree7subjectPK
     */
    @Override
    public Phototree7subjectPK getPrimaryKey() {
        return this.phototree7subjectPK;
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
