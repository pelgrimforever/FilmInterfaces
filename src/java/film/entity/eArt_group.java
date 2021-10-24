/*
 * eArt_group.java
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
import film.interfaces.logicentity.IArt_group;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Art_group
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Art_group Entity
 * 
 * @author Franky Laseure
 */
public class eArt_group extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Art_groupPK art_groupPK;
    private java.lang.String groupname;
	  
    public static final String table = "art_group";
	  
    public String getFieldname(short fieldconstant) {
        return IArt_group.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArt_group.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eArt_group.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eArt_group.connectionpool;
    }
    
    /**
     * 
     * @return table name for Art_group
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Art_group class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Art_group entity
     */
    public eArt_group() {
    }

    /**
     * Constructor
     * build an empty Art_group entity with initialized field values
     */
    public eArt_group(long groupid) {
        this.art_groupPK = new Art_groupPK(groupid);
    }
  
    /**
     * Constructor
     * build an empty Art_group entity with initialized Primarykey parameter
     * @param art_groupPK: Art_group Primarykey
     */
    public eArt_group(Art_groupPK art_groupPK) {
        this.art_groupPK = art_groupPK;
    }

    /**
     * @return is Art_group Empty ?
     */
    public boolean isEmpty() {
        return this.art_groupPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.art_groupPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.art_groupPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IArt_group.GROUPNAME, groupname);
        return getAllFields();
    }
	
    /**
     * @return Art_groupPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Art_groupPK
     */
    @Override
    public Art_groupPK getPrimaryKey() {
        return this.art_groupPK;
    }

    /**
     * 
     * @return groupname value
     */
    public java.lang.String getGroupname() {
        return this.groupname;
    }

    /**
     * set groupname value
     * @param groupname: new value
     */
    public void initGroupname(java.lang.String groupname) {
        this.groupname = groupname;
    }

    /**
     * set groupname value
     * @param groupname: new value
     */
    public void setGroupname(java.lang.String groupname) {
	if(groupname==null && groupname!=this.groupname || groupname!=null && !groupname.equals(this.groupname)) {
            updates.put(IArt_group.GROUPNAME, groupname);
        }
        this.groupname = groupname;
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
