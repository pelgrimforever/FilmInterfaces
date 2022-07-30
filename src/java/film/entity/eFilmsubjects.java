/*
 * eFilmsubjects.java
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
import film.interfaces.logicentity.IFilmsubjects;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Filmsubjects
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Filmsubjects Entity
 * 
 * @author Franky Laseure
 */
public class eFilmsubjects extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected FilmsubjectsPK filmsubjectsPK;
	  
    public static final String table = "filmsubjects";
	  
    public String getFieldname(short fieldconstant) {
        return IFilmsubjects.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFilmsubjects.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eFilmsubjects.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eFilmsubjects.connectionpool;
    }
    
    /**
     * 
     * @return table name for Filmsubjects
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Filmsubjects class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Filmsubjects entity
     */
    public eFilmsubjects() {
    }

    /**
     * Constructor
     * build an empty Filmsubjects entity with initialized field values
     */
    public eFilmsubjects(java.lang.String film, java.lang.String cat1, java.lang.String cat2, int subject) {
        this.filmsubjectsPK = new FilmsubjectsPK(film, cat1, cat2, subject);
    }
  
    /**
     * Constructor
     * build an empty Filmsubjects entity with initialized Primarykey parameter
     * @param filmsubjectsPK: Filmsubjects Primarykey
     */
    public eFilmsubjects(FilmsubjectsPK filmsubjectsPK) {
        this.filmsubjectsPK = filmsubjectsPK;
    }

    /**
     * @return is Filmsubjects Empty ?
     */
    public boolean isEmpty() {
        return this.filmsubjectsPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.filmsubjectsPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.filmsubjectsPK.getPrimarykeyvalues();	  
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
     * @return FilmsubjectsPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return FilmsubjectsPK
     */
    @Override
    public FilmsubjectsPK getPrimaryKey() {
        return this.filmsubjectsPK;
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
