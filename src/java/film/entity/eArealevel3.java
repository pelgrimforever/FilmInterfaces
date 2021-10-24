/*
 * eArealevel3.java
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
import film.interfaces.logicentity.IArealevel3;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Arealevel3
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Arealevel3 Entity
 * 
 * @author Franky Laseure
 */
public class eArealevel3 extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected Arealevel3PK arealevel3PK;
    private java.lang.String name;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
	  
    public static final String table = "arealevel3";
	  
    public String getFieldname(short fieldconstant) {
        return IArealevel3.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArealevel3.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eArealevel3.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eArealevel3.connectionpool;
    }
    
    /**
     * 
     * @return table name for Arealevel3
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Arealevel3 class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Arealevel3 entity
     */
    public eArealevel3() {
    }

    /**
     * Constructor
     * build an empty Arealevel3 entity with initialized field values
     */
    public eArealevel3(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code, java.lang.String al3code) {
        this.arealevel3PK = new Arealevel3PK(countrycode, al1code, al2code, al3code);
    }
  
    /**
     * Constructor
     * build an empty Arealevel3 entity with initialized Primarykey parameter
     * @param arealevel3PK: Arealevel3 Primarykey
     */
    public eArealevel3(Arealevel3PK arealevel3PK) {
        this.arealevel3PK = arealevel3PK;
    }

    /**
     * @return is Arealevel3 Empty ?
     */
    public boolean isEmpty() {
        return this.arealevel3PK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.arealevel3PK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.arealevel3PK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IArealevel3.NAME, name);
        updates.put(IArealevel3.LOCATION, location);
        updates.put(IArealevel3.BOUNDS, bounds);
        updates.put(IArealevel3.VIEWPORT, viewport);
        updates.put(IArealevel3.APPROXIMATE, approximate);
        return getAllFields();
    }
	
    /**
     * @return Arealevel3PK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Arealevel3PK
     */
    @Override
    public Arealevel3PK getPrimaryKey() {
        return this.arealevel3PK;
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
            updates.put(IArealevel3.NAME, name);
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
            updates.put(IArealevel3.LOCATION, location);
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
            updates.put(IArealevel3.BOUNDS, bounds);
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
            updates.put(IArealevel3.VIEWPORT, viewport);
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
        updates.put(IArealevel3.APPROXIMATE, approximate);
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
