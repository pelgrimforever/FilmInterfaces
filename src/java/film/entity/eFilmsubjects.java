/*
 * eFilmsubjects.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
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
import film.interfaces.logicentity.IFilmsubjects;
import film.interfaces.entity.pk.*;

/**
 * Entity class Filmsubjects
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Filmsubjects Entity
 * 
 * @author Franky Laseure
 */
public class eFilmsubjects extends AbstractEntity implements EntityInterface {

    protected FilmsubjectsPK filmsubjectsPK;
	  
    public static final String table = "filmsubjects";
    public static final String SQLWhere1 = "film = :filmsubjects.film: and cat1 = :filmsubjects.cat1: and cat2 = :filmsubjects.cat2: and subject = :filmsubjects.subject:";
    public static final String SQLSelect1 = "select filmsubjects.* from filmsubjects where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from filmsubjects where " + SQLWhere1;
    public static final String SQLSelectAll = "select filmsubjects.* from filmsubjects";
	  
    public String getFieldname(short fieldconstant) {
        return IFilmsubjects.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFilmsubjects.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Filmsubjects
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Filmsubjects (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Filmsubjects (=Primarykey)
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
     * @return SQL select statement for all Filmsubjectss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.filmsubjectsPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.filmsubjectsPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
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
    public FilmsubjectsPK getPrimaryKey() {
        return this.filmsubjectsPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
