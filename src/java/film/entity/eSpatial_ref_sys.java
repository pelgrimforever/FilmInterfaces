/*
 * eSpatial_ref_sys.java
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
import film.interfaces.logicentity.ISpatial_ref_sys;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Spatial_ref_sys
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Spatial_ref_sys Entity
 * 
 * @author Franky Laseure
 */
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
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eSpatial_ref_sys.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eSpatial_ref_sys.connectionpool;
    }
    
    /**
     * 
     * @return table name for Spatial_ref_sys
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Spatial_ref_sys class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Spatial_ref_sys entity
     */
    public eSpatial_ref_sys() {
    }

    /**
     * Constructor
     * build an empty Spatial_ref_sys entity with initialized field values
     */
    public eSpatial_ref_sys(int srid) {
        this.spatial_ref_sysPK = new Spatial_ref_sysPK(srid);
    }
  
    /**
     * Constructor
     * build an empty Spatial_ref_sys entity with initialized Primarykey parameter
     * @param spatial_ref_sysPK: Spatial_ref_sys Primarykey
     */
    public eSpatial_ref_sys(Spatial_ref_sysPK spatial_ref_sysPK) {
        this.spatial_ref_sysPK = spatial_ref_sysPK;
    }

    /**
     * @return is Spatial_ref_sys Empty ?
     */
    public boolean isEmpty() {
        return this.spatial_ref_sysPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.spatial_ref_sysPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.spatial_ref_sysPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ISpatial_ref_sys.AUTH_NAME, auth_name);
        updates.put(ISpatial_ref_sys.AUTH_SRID, auth_srid);
        updates.put(ISpatial_ref_sys.SRTEXT, srtext);
        updates.put(ISpatial_ref_sys.PROJ4TEXT, proj4text);
        return getAllFields();
    }
	
    /**
     * @return Spatial_ref_sysPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Spatial_ref_sysPK
     */
    @Override
    public Spatial_ref_sysPK getPrimaryKey() {
        return this.spatial_ref_sysPK;
    }

    /**
     * 
     * @return auth_name value
     */
    public java.lang.String getAuth_name() {
        return this.auth_name;
    }

    /**
     * set auth_name value
     * @param auth_name: new value
     */
    public void initAuth_name(java.lang.String auth_name) {
        this.auth_name = auth_name;
    }

    /**
     * set auth_name value
     * @param auth_name: new value
     */
    public void setAuth_name(java.lang.String auth_name) {
	if(auth_name==null && auth_name!=this.auth_name || auth_name!=null && !auth_name.equals(this.auth_name)) {
            updates.put(ISpatial_ref_sys.AUTH_NAME, auth_name);
        }
        this.auth_name = auth_name;
    }

    /**
     * 
     * @return auth_srid value
     */
    public int getAuth_srid() {
        return this.auth_srid;
    }

    /**
     * set auth_srid value
     * @param auth_srid: new value
     */
    public void initAuth_srid(int auth_srid) {
        this.auth_srid = auth_srid;
    }

    /**
     * set auth_srid value
     * @param auth_srid: new value
     */
    public void setAuth_srid(int auth_srid) {
        updates.put(ISpatial_ref_sys.AUTH_SRID, auth_srid);
        this.auth_srid = auth_srid;
    }

    /**
     * 
     * @return srtext value
     */
    public java.lang.String getSrtext() {
        return this.srtext;
    }

    /**
     * set srtext value
     * @param srtext: new value
     */
    public void initSrtext(java.lang.String srtext) {
        this.srtext = srtext;
    }

    /**
     * set srtext value
     * @param srtext: new value
     */
    public void setSrtext(java.lang.String srtext) {
	if(srtext==null && srtext!=this.srtext || srtext!=null && !srtext.equals(this.srtext)) {
            updates.put(ISpatial_ref_sys.SRTEXT, srtext);
        }
        this.srtext = srtext;
    }

    /**
     * 
     * @return proj4text value
     */
    public java.lang.String getProj4text() {
        return this.proj4text;
    }

    /**
     * set proj4text value
     * @param proj4text: new value
     */
    public void initProj4text(java.lang.String proj4text) {
        this.proj4text = proj4text;
    }

    /**
     * set proj4text value
     * @param proj4text: new value
     */
    public void setProj4text(java.lang.String proj4text) {
	if(proj4text==null && proj4text!=this.proj4text || proj4text!=null && !proj4text.equals(this.proj4text)) {
            updates.put(ISpatial_ref_sys.PROJ4TEXT, proj4text);
        }
        this.proj4text = proj4text;
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
