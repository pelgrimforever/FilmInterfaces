/*
 * ePhototags.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
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
import film.interfaces.logicentity.IPhototags;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Phototags
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Phototags Entity
 * 
 * @author Franky Laseure
 */
public class ePhototags extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected PhototagsPK phototagsPK;
    private java.lang.String tagformat;
    private java.lang.String tagvalue;
	  
    public static final String table = "phototags";
	  
    public String getFieldname(short fieldconstant) {
        return IPhototags.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhototags.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return ePhototags.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return ePhototags.connectionpool;
    }
    
    /**
     * 
     * @return table name for Phototags
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Phototags class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Phototags entity
     */
    public ePhototags() {
    }

    /**
     * Constructor
     * build an empty Phototags entity with initialized field values
     */
    public ePhototags(java.lang.String film, int id, java.lang.String tag) {
        this.phototagsPK = new PhototagsPK(film, id, tag);
    }
  
    /**
     * Constructor
     * build an empty Phototags entity with initialized Primarykey parameter
     * @param phototagsPK: Phototags Primarykey
     */
    public ePhototags(PhototagsPK phototagsPK) {
        this.phototagsPK = phototagsPK;
    }

    /**
     * @return is Phototags Empty ?
     */
    public boolean isEmpty() {
        return this.phototagsPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.phototagsPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.phototagsPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IPhototags.TAGFORMAT, tagformat);
        updates.put(IPhototags.TAGVALUE, tagvalue);
        return getAllFields();
    }
	
    /**
     * @return PhototagsPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return PhototagsPK
     */
    @Override
    public PhototagsPK getPrimaryKey() {
        return this.phototagsPK;
    }

    /**
     * 
     * @return tagformat value
     */
    public java.lang.String getTagformat() {
        return this.tagformat;
    }

    /**
     * set tagformat value
     * @param tagformat: new value
     */
    public void initTagformat(java.lang.String tagformat) {
        this.tagformat = tagformat;
    }

    /**
     * set tagformat value
     * @param tagformat: new value
     */
    public void setTagformat(java.lang.String tagformat) {
	if(tagformat==null && tagformat!=this.tagformat || tagformat!=null && !tagformat.equals(this.tagformat)) {
            updates.put(IPhototags.TAGFORMAT, tagformat);
        }
        this.tagformat = tagformat;
    }

    /**
     * 
     * @return tagvalue value
     */
    public java.lang.String getTagvalue() {
        return this.tagvalue;
    }

    /**
     * set tagvalue value
     * @param tagvalue: new value
     */
    public void initTagvalue(java.lang.String tagvalue) {
        this.tagvalue = tagvalue;
    }

    /**
     * set tagvalue value
     * @param tagvalue: new value
     */
    public void setTagvalue(java.lang.String tagvalue) {
	if(tagvalue==null && tagvalue!=this.tagvalue || tagvalue!=null && !tagvalue.equals(this.tagvalue)) {
            updates.put(IPhototags.TAGVALUE, tagvalue);
        }
        this.tagvalue = tagvalue;
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
