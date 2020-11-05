/*
 * ePhototree7subject.java
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
import film.interfaces.logicentity.IPhototree7subject;
import film.interfaces.entity.pk.*;

/**
 * Entity class Phototree7subject
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Phototree7subject Entity
 * 
 * @author Franky Laseure
 */
public class ePhototree7subject extends AbstractEntity implements EntityInterface {

    protected Phototree7subjectPK phototree7subjectPK;
	  
    public static final String table = "phototree7subject";
    public static final String SQLWhere1 = "film = :phototree7subject.film: and id = :phototree7subject.id: and subjectid = :phototree7subject.subjectid:";
    public static final String SQLSelect1 = "select phototree7subject.* from phototree7subject where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from phototree7subject where " + SQLWhere1;
    public static final String SQLSelectAll = "select phototree7subject.* from phototree7subject";
	  
    public String getFieldname(short fieldconstant) {
        return IPhototree7subject.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhototree7subject.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Phototree7subject
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Phototree7subject (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Phototree7subject (=Primarykey)
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
     * @return SQL select statement for all Phototree7subjects
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.phototree7subjectPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.phototree7subjectPK.getInsertKeyFields();	  
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
    public Phototree7subjectPK getPrimaryKey() {
        return this.phototree7subjectPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
