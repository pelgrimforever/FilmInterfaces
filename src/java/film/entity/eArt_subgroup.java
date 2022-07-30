/*
 * eArt_subgroup.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
import film.interfaces.logicentity.IArt_subgroup;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Art_subgroup
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Art_subgroup Entity
 * 
 * @author Franky Laseure
 */
public class eArt_subgroup extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Art_subgroupPK art_subgroupPK;
    private Art_groupPK art_groupPK;
    private java.lang.String subgroupname;
    private int lastseqno;
	  
    public static final String table = "art_subgroup";
	  
    public String getFieldname(short fieldconstant) {
        return IArt_subgroup.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArt_subgroup.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eArt_subgroup.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eArt_subgroup.connectionpool;
    }
    
    /**
     * 
     * @return table name for Art_subgroup
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Art_subgroup class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Art_subgroup entity
     */
    public eArt_subgroup() {
    }

    /**
     * Constructor
     * build an empty Art_subgroup entity with initialized field values
     */
    public eArt_subgroup(int subgroupid) {
        this.art_subgroupPK = new Art_subgroupPK(subgroupid);
    }
  
    /**
     * Constructor
     * build an empty Art_subgroup entity with initialized Primarykey parameter
     * @param art_subgroupPK: Art_subgroup Primarykey
     */
    public eArt_subgroup(Art_subgroupPK art_subgroupPK) {
        this.art_subgroupPK = art_subgroupPK;
    }

    /**
     * @return is Art_subgroup Empty ?
     */
    public boolean isEmpty() {
        return this.art_subgroupPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.art_subgroupPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.art_subgroupPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IArt_subgroup.GROUPID, this.art_groupPK.getGroupid());

        updates.put(IArt_subgroup.SUBGROUPNAME, subgroupname);
        updates.put(IArt_subgroup.LASTSEQNO, lastseqno);
        return getAllFields();
    }
	
    /**
     * @return Art_subgroupPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Art_subgroupPK
     */
    @Override
    public Art_subgroupPK getPrimaryKey() {
        return this.art_subgroupPK;
    }

    /**
     * 
     * @return subgroupname value
     */
    public java.lang.String getSubgroupname() {
        return this.subgroupname;
    }

    /**
     * set subgroupname value
     * @param subgroupname: new value
     */
    public void initSubgroupname(java.lang.String subgroupname) {
        this.subgroupname = subgroupname;
    }

    /**
     * set subgroupname value
     * @param subgroupname: new value
     */
    public void setSubgroupname(java.lang.String subgroupname) {
	if(subgroupname==null && subgroupname!=this.subgroupname || subgroupname!=null && !subgroupname.equals(this.subgroupname)) {
            updates.put(IArt_subgroup.SUBGROUPNAME, subgroupname);
        }
        this.subgroupname = subgroupname;
    }

    /**
     * 
     * @return lastseqno value
     */
    public int getLastseqno() {
        return this.lastseqno;
    }

    /**
     * set lastseqno value
     * @param lastseqno: new value
     */
    public void initLastseqno(int lastseqno) {
        this.lastseqno = lastseqno;
    }

    /**
     * set lastseqno value
     * @param lastseqno: new value
     */
    public void setLastseqno(int lastseqno) {
        updates.put(IArt_subgroup.LASTSEQNO, lastseqno);
        this.lastseqno = lastseqno;
    }

    /**
     * 
     * @return foreign key art_groupPK, instance of Art_groupPK
     */
    public Art_groupPK getArt_groupPK() {
        return this.art_groupPK;
    }

    /**
     * set foreign key art_group
     * @param art_groupPK: instance of Art_groupPK
     */
    public void initArt_groupPK(IArt_groupPK art_groupPK) {
        this.art_groupPK = (Art_groupPK)art_groupPK;
    }

    /**
     * set foreign key art_group
     * @param art_groupPK: instance of Art_groupPK
     */
    public void setArt_groupPK(IArt_groupPK art_groupPK) {
	if(art_groupPK==null && art_groupPK!=this.art_groupPK || art_groupPK!=null) {
            if(art_groupPK==null) {
                updates.put(IArt_subgroup.GROUPID, null);
            } else {
                updates.put(IArt_subgroup.GROUPID, art_groupPK.getGroupid());
            }
        }
        this.art_groupPK = (Art_groupPK)art_groupPK;
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
