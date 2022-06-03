/*
 * eCreator.java
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
import film.interfaces.logicentity.ICreator;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Creator
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Creator Entity
 * 
 * @author Franky Laseure
 */
public class eCreator extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected CreatorPK creatorPK;
    private java.lang.String name;
    private java.lang.String surname;
	  
    public static final String table = "creator";
	  
    public String getFieldname(short fieldconstant) {
        return ICreator.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ICreator.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eCreator.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eCreator.connectionpool;
    }
    
    /**
     * 
     * @return table name for Creator
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.creatorPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.creatorPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ICreator.NAME, name);
        updates.put(ICreator.SURNAME, surname);
        return getAllFields();
    }
	
    /**
     * @return CreatorPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return CreatorPK
     */
    @Override
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
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
