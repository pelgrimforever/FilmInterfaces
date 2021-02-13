/*
 * ePhotosubjects.java
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
import film.interfaces.logicentity.IPhotosubjects;
import film.interfaces.entity.pk.*;

/**
 * Entity class Photosubjects
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Photosubjects Entity
 * 
 * @author Franky Laseure
 */
public class ePhotosubjects extends AbstractEntity implements EntityInterface {

    protected PhotosubjectsPK photosubjectsPK;
	  
    public static final String table = "photosubjects";
    public static final String SQLWhere1 = "film = :photosubjects.film: and id = :photosubjects.id: and cat1 = :photosubjects.cat1: and cat2 = :photosubjects.cat2: and subject = :photosubjects.subject:";
    public static final String SQLSelect1 = "select photosubjects.* from photosubjects where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from photosubjects where " + SQLWhere1;
    public static final String SQLSelectAll = "select photosubjects.* from photosubjects";
	  
    public String getFieldname(short fieldconstant) {
        return IPhotosubjects.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhotosubjects.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Photosubjects
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Photosubjects (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Photosubjects (=Primarykey)
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
     * @return SQL select statement for all Photosubjectss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.photosubjectsPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.photosubjectsPK.getInsertKeyFields();	  
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
    public PhotosubjectsPK getPrimaryKey() {
        return this.photosubjectsPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
