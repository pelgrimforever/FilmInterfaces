/*
 * eLocality.java
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
import film.interfaces.logicentity.ILocality;
import film.interfaces.entity.pk.*;

/**
 * Entity class Locality
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Locality Entity
 * 
 * @author Franky Laseure
 */
public class eLocality extends AbstractEntity implements EntityInterface {

    protected LocalityPK localityPK;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
    private boolean hassublocality;
	  
    public static final String table = "locality";
    public static final String SQLWhere1 = "countrycode = :locality.countrycode: and postalcode = :locality.postalcode: and locality = :locality.locality:";
    public static final String SQLSelect1 = "select locality.* from locality where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from locality where " + SQLWhere1;
    public static final String SQLSelectAll = "select locality.* from locality";
	  
    public String getFieldname(short fieldconstant) {
        return ILocality.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ILocality.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Locality
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Locality (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Locality (=Primarykey)
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
     * @return SQL select statement for all Localitys
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Locality class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Locality entity
     */
    public eLocality() {
    }

    /**
     * Constructor
     * build an empty Locality entity with initialized field values
     */
    public eLocality(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality) {
        this.localityPK = new LocalityPK(countrycode, postalcode, locality);
    }
  
    /**
     * Constructor
     * build an empty Locality entity with initialized Primarykey parameter
     * @param localityPK: Locality Primarykey
     */
    public eLocality(LocalityPK localityPK) {
        this.localityPK = localityPK;
    }

    /**
     * @return is Locality Empty ?
     */
    public boolean isEmpty() {
        return this.localityPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.localityPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.localityPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ILocality.LOCATION, location);
        updates.put(ILocality.BOUNDS, bounds);
        updates.put(ILocality.VIEWPORT, viewport);
        updates.put(ILocality.APPROXIMATE, approximate);
        updates.put(ILocality.HASSUBLOCALITY, hassublocality);
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
    public LocalityPK getPrimaryKey() {
        return this.localityPK;
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
            updates.put(ILocality.LOCATION, location);
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
            updates.put(ILocality.BOUNDS, bounds);
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
            updates.put(ILocality.VIEWPORT, viewport);
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
            updates.put(ILocality.APPROXIMATE, approximate);
        }
        this.approximate = approximate;
    }

    /**
     * 
     * @return hassublocality value
     */
    public boolean getHassublocality() {
        return this.hassublocality;
    }

    /**
     * set hassublocality value
     * @param hassublocality: new value
     */
    public void initHassublocality(boolean hassublocality) {
        this.hassublocality = hassublocality;
    }

    /**
     * set hassublocality value
     * @param hassublocality: new value
     */
    public void setHassublocality(boolean hassublocality) {
	if(hassublocality!=this.hassublocality) {
            updates.put(ILocality.HASSUBLOCALITY, hassublocality);
        }
        this.hassublocality = hassublocality;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
