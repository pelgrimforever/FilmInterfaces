/*
 * eLocality.java
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
import film.interfaces.logicentity.ILocality;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Locality
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Locality Entity
 * 
 * @author Franky Laseure
 */
public class eLocality extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected LocalityPK localityPK;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
    private boolean hassublocality;
	  
    public static final String table = "locality";
	  
    public String getFieldname(short fieldconstant) {
        return ILocality.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ILocality.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eLocality.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eLocality.connectionpool;
    }
    
    /**
     * 
     * @return table name for Locality
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.localityPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.localityPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(ILocality.LOCATION, location);
        updates.put(ILocality.BOUNDS, bounds);
        updates.put(ILocality.VIEWPORT, viewport);
        updates.put(ILocality.APPROXIMATE, approximate);
        updates.put(ILocality.HASSUBLOCALITY, hassublocality);
        return getAllFields();
    }
	
    /**
     * @return LocalityPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return LocalityPK
     */
    @Override
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
        updates.put(ILocality.APPROXIMATE, approximate);
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
        updates.put(ILocality.HASSUBLOCALITY, hassublocality);
        this.hassublocality = hassublocality;
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
