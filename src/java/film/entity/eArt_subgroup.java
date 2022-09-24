/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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
        
    @Override
    public String getDbtool() {
        return eArt_subgroup.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eArt_subgroup.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eArt_subgroup() {
    }

    public eArt_subgroup(int subgroupid) {
        this.art_subgroupPK = new Art_subgroupPK(subgroupid);
    }
  
    public eArt_subgroup(Art_subgroupPK art_subgroupPK) {
        this.art_subgroupPK = art_subgroupPK;
    }

    public boolean isEmpty() {
        return this.art_subgroupPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.art_subgroupPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.art_subgroupPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IArt_subgroup.GROUPID, this.art_groupPK.getGroupid());

        updates.put(IArt_subgroup.SUBGROUPNAME, subgroupname);
        updates.put(IArt_subgroup.LASTSEQNO, lastseqno);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Art_subgroupPK getPrimaryKey() {
        return this.art_subgroupPK;
    }

    public java.lang.String getSubgroupname() {
        return this.subgroupname;
    }

    public void initSubgroupname(java.lang.String subgroupname) {
        this.subgroupname = subgroupname;
    }

    public void setSubgroupname(java.lang.String subgroupname) {
	if(subgroupname==null && subgroupname!=this.subgroupname || subgroupname!=null && !subgroupname.equals(this.subgroupname)) {
            updates.put(IArt_subgroup.SUBGROUPNAME, subgroupname);
        }
        this.subgroupname = subgroupname;
    }

    public int getLastseqno() {
        return this.lastseqno;
    }

    public void initLastseqno(int lastseqno) {
        this.lastseqno = lastseqno;
    }

    public void setLastseqno(int lastseqno) {
        updates.put(IArt_subgroup.LASTSEQNO, lastseqno);
        this.lastseqno = lastseqno;
    }

    public Art_groupPK getArt_groupPK() {
        return this.art_groupPK;
    }

    public void initArt_groupPK(IArt_groupPK art_groupPK) {
        this.art_groupPK = (Art_groupPK)art_groupPK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
