/*
 * eSubjectcat.java
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
import film.interfaces.logicentity.ISubjectcat;
import film.interfaces.entity.pk.*;

/**
 * Entity class Subjectcat
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Subjectcat Entity
 * 
 * @author Franky Laseure
 */
public class eSubjectcat extends AbstractEntity implements EntityInterface {

    protected SubjectcatPK subjectcatPK;
    private int catno;
    private java.lang.String description;
	  
    public static final String table = "subjectcat";
    public static final String SQLWhere1 = "cat = :subjectcat.cat:";
    public static final String SQLSelect1 = "select subjectcat.* from subjectcat where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from subjectcat where " + SQLWhere1;
    public static final String SQLSelectAll = "select subjectcat.* from subjectcat";
	  
    public String getFieldname(short fieldconstant) {
        return ISubjectcat.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISubjectcat.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Subjectcat
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Subjectcat (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Subjectcat (=Primarykey)
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
     * @return SQL select statement for all Subjectcats
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Subjectcat class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Subjectcat entity
     */
    public eSubjectcat() {
    }

    /**
     * Constructor
     * build an empty Subjectcat entity with initialized field values
     */
    public eSubjectcat(java.lang.String cat) {
        this.subjectcatPK = new SubjectcatPK(cat);
    }
  
    /**
     * Constructor
     * build an empty Subjectcat entity with initialized Primarykey parameter
     * @param subjectcatPK: Subjectcat Primarykey
     */
    public eSubjectcat(SubjectcatPK subjectcatPK) {
        this.subjectcatPK = subjectcatPK;
    }

    /**
     * @return is Subjectcat Empty ?
     */
    public boolean isEmpty() {
        return this.subjectcatPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.subjectcatPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.subjectcatPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ISubjectcat.CATNO, catno);
        updates.put(ISubjectcat.DESCRIPTION, description);
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
    public SubjectcatPK getPrimaryKey() {
        return this.subjectcatPK;
    }

    /**
     * 
     * @return catno value
     */
    public int getCatno() {
        return this.catno;
    }

    /**
     * set catno value
     * @param catno: new value
     */
    public void initCatno(int catno) {
        this.catno = catno;
    }

    /**
     * set catno value
     * @param catno: new value
     */
    public void setCatno(int catno) {
	if(catno!=this.catno) {
            updates.put(ISubjectcat.CATNO, catno);
        }
        this.catno = catno;
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
            updates.put(ISubjectcat.DESCRIPTION, description);
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
