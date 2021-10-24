/*
 * ePhotosubjects.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
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
import film.interfaces.logicentity.IPhotosubjects;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Photosubjects
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Photosubjects Entity
 * 
 * @author Franky Laseure
 */
public class ePhotosubjects extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected PhotosubjectsPK photosubjectsPK;
	  
    public static final String table = "photosubjects";
	  
    public String getFieldname(short fieldconstant) {
        return IPhotosubjects.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhotosubjects.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return ePhotosubjects.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return ePhotosubjects.connectionpool;
    }
    
    /**
     * 
     * @return table name for Photosubjects
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Photosubjects class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Photosubjects entity
     */
    public ePhotosubjects() {
    }

    /**
     * Constructor
     * build an empty Photosubjects entity with initialized field values
     */
    public ePhotosubjects(java.lang.String film, int id, java.lang.String cat1, java.lang.String cat2, int subject) {
        this.photosubjectsPK = new PhotosubjectsPK(film, id, cat1, cat2, subject);
    }
  
    /**
     * Constructor
     * build an empty Photosubjects entity with initialized Primarykey parameter
     * @param photosubjectsPK: Photosubjects Primarykey
     */
    public ePhotosubjects(PhotosubjectsPK photosubjectsPK) {
        this.photosubjectsPK = photosubjectsPK;
    }

    /**
     * @return is Photosubjects Empty ?
     */
    public boolean isEmpty() {
        return this.photosubjectsPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.photosubjectsPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.photosubjectsPK.getPrimarykeyvalues();	  
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
     * @return PhotosubjectsPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return PhotosubjectsPK
     */
    @Override
    public PhotosubjectsPK getPrimaryKey() {
        return this.photosubjectsPK;
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
