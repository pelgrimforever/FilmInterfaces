/*
 * ePhototags.java
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
import film.interfaces.logicentity.IPhototags;
import film.interfaces.entity.pk.*;

/**
 * Entity class Phototags
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Phototags Entity
 * 
 * @author Franky Laseure
 */
public class ePhototags extends AbstractEntity implements EntityInterface {

    protected PhototagsPK phototagsPK;
    private java.lang.String tagformat;
    private java.lang.String tagvalue;
	  
    public static final String table = "phototags";
    public static final String SQLWhere1 = "film = :phototags.film: and id = :phototags.id: and tag = :phototags.tag:";
    public static final String SQLSelect1 = "select phototags.* from phototags where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from phototags where " + SQLWhere1;
    public static final String SQLSelectAll = "select phototags.* from phototags";
	  
    public String getFieldname(short fieldconstant) {
        return IPhototags.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPhototags.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Phototags
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Phototags (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Phototags (=Primarykey)
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
     * @return SQL select statement for all Phototagss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.phototagsPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.phototagsPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IPhototags.TAGFORMAT, tagformat);
        updates.put(IPhototags.TAGVALUE, tagvalue);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
