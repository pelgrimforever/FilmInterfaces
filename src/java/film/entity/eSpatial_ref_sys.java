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
import film.interfaces.logicentity.ISpatial_ref_sys;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eSpatial_ref_sys extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Spatial_ref_sysPK spatial_ref_sysPK;
    private java.lang.String auth_name;
    private int auth_srid;
    private java.lang.String srtext;
    private java.lang.String proj4text;
	  
    public static final String table = "spatial_ref_sys";
	  
    public String getFieldname(short fieldconstant) {
        return ISpatial_ref_sys.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISpatial_ref_sys.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eSpatial_ref_sys.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSpatial_ref_sys.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSpatial_ref_sys() {
    }

    public eSpatial_ref_sys(int srid) {
        this.spatial_ref_sysPK = new Spatial_ref_sysPK(srid);
    }
  
    public eSpatial_ref_sys(Spatial_ref_sysPK spatial_ref_sysPK) {
        this.spatial_ref_sysPK = spatial_ref_sysPK;
    }

    public boolean isEmpty() {
        return this.spatial_ref_sysPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.spatial_ref_sysPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.spatial_ref_sysPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISpatial_ref_sys.AUTH_NAME, auth_name);
        updates.put(ISpatial_ref_sys.AUTH_SRID, auth_srid);
        updates.put(ISpatial_ref_sys.SRTEXT, srtext);
        updates.put(ISpatial_ref_sys.PROJ4TEXT, proj4text);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Spatial_ref_sysPK getPrimaryKey() {
        return this.spatial_ref_sysPK;
    }

    public java.lang.String getAuth_name() {
        return this.auth_name;
    }

    public void initAuth_name(java.lang.String auth_name) {
        this.auth_name = auth_name;
    }

    public void setAuth_name(java.lang.String auth_name) {
	if(auth_name==null && auth_name!=this.auth_name || auth_name!=null && !auth_name.equals(this.auth_name)) {
            updates.put(ISpatial_ref_sys.AUTH_NAME, auth_name);
        }
        this.auth_name = auth_name;
    }

    public int getAuth_srid() {
        return this.auth_srid;
    }

    public void initAuth_srid(int auth_srid) {
        this.auth_srid = auth_srid;
    }

    public void setAuth_srid(int auth_srid) {
        updates.put(ISpatial_ref_sys.AUTH_SRID, auth_srid);
        this.auth_srid = auth_srid;
    }

    public java.lang.String getSrtext() {
        return this.srtext;
    }

    public void initSrtext(java.lang.String srtext) {
        this.srtext = srtext;
    }

    public void setSrtext(java.lang.String srtext) {
	if(srtext==null && srtext!=this.srtext || srtext!=null && !srtext.equals(this.srtext)) {
            updates.put(ISpatial_ref_sys.SRTEXT, srtext);
        }
        this.srtext = srtext;
    }

    public java.lang.String getProj4text() {
        return this.proj4text;
    }

    public void initProj4text(java.lang.String proj4text) {
        this.proj4text = proj4text;
    }

    public void setProj4text(java.lang.String proj4text) {
	if(proj4text==null && proj4text!=this.proj4text || proj4text!=null && !proj4text.equals(this.proj4text)) {
            updates.put(ISpatial_ref_sys.PROJ4TEXT, proj4text);
        }
        this.proj4text = proj4text;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
