/*
 * eSubjectcat.java
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
import film.interfaces.logicentity.ISubjectcat;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Subjectcat
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Subjectcat Entity
 * 
 * @author Franky Laseure
 */
public class eSubjectcat extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected SubjectcatPK subjectcatPK;
    private int catno;
    private java.lang.String description;
	  
    public static final String table = "subjectcat";
	  
    public String getFieldname(short fieldconstant) {
        return ISubjectcat.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISubjectcat.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSubjectcat.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSubjectcat.connectionpool;
    }
    
    /**
     * 
     * @return table name for Subjectcat
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.subjectcatPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.subjectcatPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISubjectcat.CATNO, catno);
        updates.put(ISubjectcat.DESCRIPTION, description);
        return getAllFields();
    }
	
    /**
     * @return SubjectcatPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return SubjectcatPK
     */
    @Override
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
        updates.put(ISubjectcat.CATNO, catno);
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
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
