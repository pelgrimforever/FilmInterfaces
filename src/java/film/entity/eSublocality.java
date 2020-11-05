/*
 * eSublocality.java
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
import film.interfaces.logicentity.ISublocality;
import film.interfaces.entity.pk.*;

/**
 * Entity class Sublocality
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Sublocality Entity
 * 
 * @author Franky Laseure
 */
public class eSublocality extends AbstractEntity implements EntityInterface {

    protected SublocalityPK sublocalityPK;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
	  
    public static final String table = "sublocality";
    public static final String SQLWhere1 = "countrycode = :sublocality.countrycode: and postalcode = :sublocality.postalcode: and locality = :sublocality.locality: and sublocality = :sublocality.sublocality:";
    public static final String SQLSelect1 = "select sublocality.* from sublocality where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from sublocality where " + SQLWhere1;
    public static final String SQLSelectAll = "select sublocality.* from sublocality";
	  
    public String getFieldname(short fieldconstant) {
        return ISublocality.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISublocality.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Sublocality
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Sublocality (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Sublocality (=Primarykey)
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
     * @return SQL select statement for all Sublocalitys
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Sublocality class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Sublocality entity
     */
    public eSublocality() {
    }

    /**
     * Constructor
     * build an empty Sublocality entity with initialized field values
     */
    public eSublocality(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality) {
        this.sublocalityPK = new SublocalityPK(countrycode, postalcode, locality, sublocality);
    }
  
    /**
     * Constructor
     * build an empty Sublocality entity with initialized Primarykey parameter
     * @param sublocalityPK: Sublocality Primarykey
     */
    public eSublocality(SublocalityPK sublocalityPK) {
        this.sublocalityPK = sublocalityPK;
    }

    /**
     * @return is Sublocality Empty ?
     */
    public boolean isEmpty() {
        return this.sublocalityPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.sublocalityPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.sublocalityPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ISublocality.LOCATION, location);
        updates.put(ISublocality.BOUNDS, bounds);
        updates.put(ISublocality.VIEWPORT, viewport);
        updates.put(ISublocality.APPROXIMATE, approximate);
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
    public SublocalityPK getPrimaryKey() {
        return this.sublocalityPK;
    }

    /**
     * 
     * @return location value
     */
    public piShape getLocation() {
        return this.location;
    }

    /**
     * set location value
     * @param location: new value
     */
    public void initLocation(piShape location) {
        this.location = location;
    }

    /**
     * set location value
     * @param location: new value
     */
    public void setLocation(piShape location) {
	if(location==null && location!=this.location || location!=null && !location.equals(this.location)) {
            updates.put(ISublocality.LOCATION, location);
        }
        this.location = location;
    }

    /**
     * 
     * @return bounds value
     */
    public piShape getBounds() {
        return this.bounds;
    }

    /**
     * set bounds value
     * @param bounds: new value
     */
    public void initBounds(piShape bounds) {
        this.bounds = bounds;
    }

    /**
     * set bounds value
     * @param bounds: new value
     */
    public void setBounds(piShape bounds) {
	if(bounds==null && bounds!=this.bounds || bounds!=null && !bounds.equals(this.bounds)) {
            updates.put(ISublocality.BOUNDS, bounds);
        }
        this.bounds = bounds;
    }

    /**
     * 
     * @return viewport value
     */
    public piShape getViewport() {
        return this.viewport;
    }

    /**
     * set viewport value
     * @param viewport: new value
     */
    public void initViewport(piShape viewport) {
        this.viewport = viewport;
    }

    /**
     * set viewport value
     * @param viewport: new value
     */
    public void setViewport(piShape viewport) {
	if(viewport==null && viewport!=this.viewport || viewport!=null && !viewport.equals(this.viewport)) {
            updates.put(ISublocality.VIEWPORT, viewport);
        }
        this.viewport = viewport;
    }

    /**
     * 
     * @return approximate value
     */
    public boolean getApproximate() {
        return this.approximate;
    }

    /**
     * set approximate value
     * @param approximate: new value
     */
    public void initApproximate(boolean approximate) {
        this.approximate = approximate;
    }

    /**
     * set approximate value
     * @param approximate: new value
     */
    public void setApproximate(boolean approximate) {
	if(approximate!=this.approximate) {
            updates.put(ISublocality.APPROXIMATE, approximate);
        }
        this.approximate = approximate;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
