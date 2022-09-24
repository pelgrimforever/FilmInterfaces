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
import film.interfaces.logicentity.IArt_group;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eArt_group.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eArt_group.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eArt_group() {
    }

    public eArt_group(long groupid) {
        this.art_groupPK = new Art_groupPK(groupid);
    }
  
    public eArt_group(Art_groupPK art_groupPK) {
        this.art_groupPK = art_groupPK;
    }

    public boolean isEmpty() {
        return this.art_groupPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.art_groupPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.art_groupPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IArt_group.GROUPNAME, groupname);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Art_groupPK getPrimaryKey() {
        return this.art_groupPK;
    }

    public java.lang.String getGroupname() {
        return this.groupname;
    }

    public void initGroupname(java.lang.String groupname) {
        this.groupname = groupname;
    }

    public void setGroupname(java.lang.String groupname) {
	if(groupname==null && groupname!=this.groupname || groupname!=null && !groupname.equals(this.groupname)) {
            updates.put(IArt_group.GROUPNAME, groupname);
        }
        this.groupname = groupname;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
