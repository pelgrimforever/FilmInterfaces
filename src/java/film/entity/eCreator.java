/*
 * eCreator.java
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
import film.interfaces.logicentity.ICreator;
import film.interfaces.entity.pk.*;

/**
 * Entity class Creator
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Creator Entity
 * 
 * @author Franky Laseure
 */
public class eCreator extends AbstractEntity implements EntityInterface {

    protected CreatorPK creatorPK;
    private java.lang.String name;
    private java.lang.String surname;
	  
    public static final String table = "creator";
    public static final String SQLWhere1 = "creatorid = :creator.creatorid:";
    public static final String SQLSelect1 = "select creator.* from creator where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from creator where " + SQLWhere1;
    public static final String SQLSelectAll = "select creator.* from creator";
	  
    public String getFieldname(short fieldconstant) {
        return ICreator.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ICreator.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Creator
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Creator (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Creator (=Primarykey)
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
     * @return SQL select statement for all Creators
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Creator class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Creator entity
     */
    public eCreator() {
    }

    /**
     * Constructor
     * build an empty Creator entity with initialized field values
     */
    public eCreator(java.lang.String creatorid) {
        this.creatorPK = new CreatorPK(creatorid);
    }
  
    /**
     * Constructor
     * build an empty Creator entity with initialized Primarykey parameter
     * @param creatorPK: Creator Primarykey
     */
    public eCreator(CreatorPK creatorPK) {
        this.creatorPK = creatorPK;
    }

    /**
     * @return is Creator Empty ?
     */
    public boolean isEmpty() {
        return this.creatorPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.creatorPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.creatorPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ICreator.NAME, name);
        updates.put(ICreator.SURNAME, surname);
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
    public CreatorPK getPrimaryKey() {
        return this.creatorPK;
    }

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void initName(java.lang.String name) {
        this.name = name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ICreator.NAME, name);
        }
        this.name = name;
    }

    /**
     * 
     * @return surname value
     */
    public java.lang.String getSurname() {
        return this.surname;
    }

    /**
     * set surname value
     * @param surname: new value
     */
    public void initSurname(java.lang.String surname) {
        this.surname = surname;
    }

    /**
     * set surname value
     * @param surname: new value
     */
    public void setSurname(java.lang.String surname) {
	if(surname==null && surname!=this.surname || surname!=null && !surname.equals(this.surname)) {
            updates.put(ICreator.SURNAME, surname);
        }
        this.surname = surname;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
