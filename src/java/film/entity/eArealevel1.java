/*
 * eArealevel1.java
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
import film.interfaces.logicentity.IArealevel1;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Arealevel1
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Arealevel1 Entity
 * 
 * @author Franky Laseure
 */
public class eArealevel1 extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Arealevel1PK arealevel1PK;
    private java.lang.String name;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
	  
    public static final String table = "arealevel1";
	  
    public String getFieldname(short fieldconstant) {
        return IArealevel1.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArealevel1.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eArealevel1.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eArealevel1.connectionpool;
    }
    
    /**
     * 
     * @return table name for Arealevel1
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Arealevel1 class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Arealevel1 entity
     */
    public eArealevel1() {
    }

    /**
     * Constructor
     * build an empty Arealevel1 entity with initialized field values
     */
    public eArealevel1(java.lang.String countrycode, java.lang.String al1code) {
        this.arealevel1PK = new Arealevel1PK(countrycode, al1code);
    }
  
    /**
     * Constructor
     * build an empty Arealevel1 entity with initialized Primarykey parameter
     * @param arealevel1PK: Arealevel1 Primarykey
     */
    public eArealevel1(Arealevel1PK arealevel1PK) {
        this.arealevel1PK = arealevel1PK;
    }

    /**
     * @return is Arealevel1 Empty ?
     */
    public boolean isEmpty() {
        return this.arealevel1PK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.arealevel1PK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.arealevel1PK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IArealevel1.NAME, name);
        updates.put(IArealevel1.LOCATION, location);
        updates.put(IArealevel1.BOUNDS, bounds);
        updates.put(IArealevel1.VIEWPORT, viewport);
        updates.put(IArealevel1.APPROXIMATE, approximate);
        return getAllFields();
    }
	
    /**
     * @return Arealevel1PK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Arealevel1PK
     */
    @Override
    public Arealevel1PK getPrimaryKey() {
        return this.arealevel1PK;
    }

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void initName(java.lang.String name) {
        this.name = name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IArealevel1.NAME, name);
        }
        this.name = name;
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
            updates.put(IArealevel1.LOCATION, location);
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
            updates.put(IArealevel1.BOUNDS, bounds);
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
            updates.put(IArealevel1.VIEWPORT, viewport);
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
        updates.put(IArealevel1.APPROXIMATE, approximate);
        this.approximate = approximate;
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
