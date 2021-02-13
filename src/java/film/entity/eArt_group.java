/*
 * eArt_group.java
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
import film.interfaces.logicentity.IArt_group;
import film.interfaces.entity.pk.*;

/**
 * Entity class Art_group
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Art_group Entity
 * 
 * @author Franky Laseure
 */
public class eArt_group extends AbstractEntity implements EntityInterface {

    protected Art_groupPK art_groupPK;
    private java.lang.String groupname;
	  
    public static final String table = "art_group";
    public static final String SQLWhere1 = "groupid = :art_group.groupid:";
    public static final String SQLSelect1 = "select art_group.* from art_group where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from art_group where " + SQLWhere1;
    public static final String SQLSelectAll = "select art_group.* from art_group";
	  
    public String getFieldname(short fieldconstant) {
        return IArt_group.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArt_group.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Art_group
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Art_group (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Art_group (=Primarykey)
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
     * @return SQL select statement for all Art_groups
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.art_groupPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.art_groupPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IArt_group.GROUPNAME, groupname);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
