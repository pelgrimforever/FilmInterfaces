/*
 * eFilmtype.java
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
import film.interfaces.logicentity.IFilmtype;
import film.interfaces.entity.pk.*;

/**
 * Entity class Filmtype
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Filmtype Entity
 * 
 * @author Franky Laseure
 */
public class eFilmtype extends AbstractEntity implements EntityInterface {

    protected FilmtypePK filmtypePK;
    private java.lang.String description;
	  
    public static final String table = "filmtype";
    public static final String SQLWhere1 = "type = :filmtype.type:";
    public static final String SQLSelect1 = "select filmtype.* from filmtype where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from filmtype where " + SQLWhere1;
    public static final String SQLSelectAll = "select filmtype.* from filmtype";
	  
    public String getFieldname(short fieldconstant) {
        return IFilmtype.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IFilmtype.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Filmtype
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Filmtype (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Filmtype (=Primarykey)
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
     * @return SQL select statement for all Filmtypes
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.filmtypePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.filmtypePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IFilmtype.DESCRIPTION, description);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
