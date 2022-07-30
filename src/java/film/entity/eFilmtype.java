/*
 * eFilmtype.java
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
import film.interfaces.logicentity.IFilmtype;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Filmtype
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Filmtype Entity
 * 
 * @author Franky Laseure
 */
public class eFilmtype extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected FilmtypePK filmtypePK;
    private java.lang.String description;
	  
    public static final String table = "filmtype";
	  
    public String getFieldname(short fieldconstant) {
        return IFilmtype.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFilmtype.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eFilmtype.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eFilmtype.connectionpool;
    }
    
    /**
     * 
     * @return table name for Filmtype
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Filmtype class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Filmtype entity
     */
    public eFilmtype() {
    }

    /**
     * Constructor
     * build an empty Filmtype entity with initialized field values
     */
    public eFilmtype(java.lang.String type) {
        this.filmtypePK = new FilmtypePK(type);
    }
  
    /**
     * Constructor
     * build an empty Filmtype entity with initialized Primarykey parameter
     * @param filmtypePK: Filmtype Primarykey
     */
    public eFilmtype(FilmtypePK filmtypePK) {
        this.filmtypePK = filmtypePK;
    }

    /**
     * @return is Filmtype Empty ?
     */
    public boolean isEmpty() {
        return this.filmtypePK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.filmtypePK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.filmtypePK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IFilmtype.DESCRIPTION, description);
        return getAllFields();
    }
	
    /**
     * @return FilmtypePK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return FilmtypePK
     */
    @Override
    public FilmtypePK getPrimaryKey() {
        return this.filmtypePK;
    }

    /**
     * 
     * @return description value
     */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void initDescription(java.lang.String description) {
        this.description = description;
    }

    /**
     * set description value
     * @param description: new value
     */
    public void setDescription(java.lang.String description) {
	if(description==null && description!=this.description || description!=null && !description.equals(this.description)) {
            updates.put(IFilmtype.DESCRIPTION, description);
        }
        this.description = description;
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
