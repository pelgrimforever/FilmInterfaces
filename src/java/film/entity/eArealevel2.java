/*
 * eArealevel2.java
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
import film.interfaces.logicentity.IArealevel2;
import film.interfaces.entity.pk.*;

/**
 * Entity class Arealevel2
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Arealevel2 Entity
 * 
 * @author Franky Laseure
 */
public class eArealevel2 extends AbstractEntity implements EntityInterface {

    protected Arealevel2PK arealevel2PK;
    private java.lang.String name;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
	  
    public static final String table = "arealevel2";
    public static final String SQLWhere1 = "countrycode = :arealevel2.countrycode: and al1code = :arealevel2.al1code: and al2code = :arealevel2.al2code:";
    public static final String SQLSelect1 = "select arealevel2.* from arealevel2 where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from arealevel2 where " + SQLWhere1;
    public static final String SQLSelectAll = "select arealevel2.* from arealevel2";
	  
    public String getFieldname(short fieldconstant) {
        return IArealevel2.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IArealevel2.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Arealevel2
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Arealevel2 (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Arealevel2 (=Primarykey)
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
     * @return SQL select statement for all Arealevel2s
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Arealevel2 class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Arealevel2 entity
     */
    public eArealevel2() {
    }

    /**
     * Constructor
     * build an empty Arealevel2 entity with initialized field values
     */
    public eArealevel2(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code) {
        this.arealevel2PK = new Arealevel2PK(countrycode, al1code, al2code);
    }
  
    /**
     * Constructor
     * build an empty Arealevel2 entity with initialized Primarykey parameter
     * @param arealevel2PK: Arealevel2 Primarykey
     */
    public eArealevel2(Arealevel2PK arealevel2PK) {
        this.arealevel2PK = arealevel2PK;
    }

    /**
     * @return is Arealevel2 Empty ?
     */
    public boolean isEmpty() {
        return this.arealevel2PK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.arealevel2PK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.arealevel2PK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IArealevel2.NAME, name);
        updates.put(IArealevel2.LOCATION, location);
        updates.put(IArealevel2.BOUNDS, bounds);
        updates.put(IArealevel2.VIEWPORT, viewport);
        updates.put(IArealevel2.APPROXIMATE, approximate);
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
    public Arealevel2PK getPrimaryKey() {
        return this.arealevel2PK;
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
            updates.put(IArealevel2.NAME, name);
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
            updates.put(IArealevel2.LOCATION, location);
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
            updates.put(IArealevel2.BOUNDS, bounds);
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
            updates.put(IArealevel2.VIEWPORT, viewport);
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
            updates.put(IArealevel2.APPROXIMATE, approximate);
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
