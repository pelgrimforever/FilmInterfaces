/*
 * eSpatial_ref_sys.java
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
import film.interfaces.logicentity.ISpatial_ref_sys;
import film.interfaces.entity.pk.*;

/**
 * Entity class Spatial_ref_sys
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Spatial_ref_sys Entity
 * 
 * @author Franky Laseure
 */
public class eSpatial_ref_sys extends AbstractEntity implements EntityInterface {

    protected Spatial_ref_sysPK spatial_ref_sysPK;
    private java.lang.String auth_name;
    private int auth_srid;
    private java.lang.String srtext;
    private java.lang.String proj4text;
	  
    public static final String table = "spatial_ref_sys";
    public static final String SQLWhere1 = "srid = :spatial_ref_sys.srid:";
    public static final String SQLSelect1 = "select spatial_ref_sys.* from spatial_ref_sys where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from spatial_ref_sys where " + SQLWhere1;
    public static final String SQLSelectAll = "select spatial_ref_sys.* from spatial_ref_sys";
	  
    public String getFieldname(short fieldconstant) {
        return ISpatial_ref_sys.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISpatial_ref_sys.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Spatial_ref_sys
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Spatial_ref_sys (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Spatial_ref_sys (=Primarykey)
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
     * @return SQL select statement for all Spatial_ref_syss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.spatial_ref_sysPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.spatial_ref_sysPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ISpatial_ref_sys.AUTH_NAME, auth_name);
        updates.put(ISpatial_ref_sys.AUTH_SRID, auth_srid);
        updates.put(ISpatial_ref_sys.SRTEXT, srtext);
        updates.put(ISpatial_ref_sys.PROJ4TEXT, proj4text);
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
	if(auth_srid!=this.auth_srid) {
            updates.put(ISpatial_ref_sys.AUTH_SRID, auth_srid);
        }
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
