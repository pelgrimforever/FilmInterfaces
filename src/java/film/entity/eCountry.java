/*
 * eCountry.java
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
import film.interfaces.logicentity.ICountry;
import film.interfaces.entity.pk.*;

/**
 * Entity class Country
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Country Entity
 * 
 * @author Franky Laseure
 */
public class eCountry extends AbstractEntity implements EntityInterface {

    protected CountryPK countryPK;
    private java.lang.String name;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
    private boolean hasarealevel1;
    private boolean hasarealevel2;
    private boolean hasarealevel3;
	  
    public static final String table = "country";
    public static final String SQLWhere1 = "code = :country.code:";
    public static final String SQLSelect1 = "select country.* from country where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from country where " + SQLWhere1;
    public static final String SQLSelectAll = "select country.* from country";
	  
    public String getFieldname(short fieldconstant) {
        return ICountry.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ICountry.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Country
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Country (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Country (=Primarykey)
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
     * @return SQL select statement for all Countrys
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Country class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Country entity
     */
    public eCountry() {
    }

    /**
     * Constructor
     * build an empty Country entity with initialized field values
     */
    public eCountry(java.lang.String code) {
        this.countryPK = new CountryPK(code);
    }
  
    /**
     * Constructor
     * build an empty Country entity with initialized Primarykey parameter
     * @param countryPK: Country Primarykey
     */
    public eCountry(CountryPK countryPK) {
        this.countryPK = countryPK;
    }

    /**
     * @return is Country Empty ?
     */
    public boolean isEmpty() {
        return this.countryPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.countryPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.countryPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(ICountry.NAME, name);
        updates.put(ICountry.LOCATION, location);
        updates.put(ICountry.BOUNDS, bounds);
        updates.put(ICountry.VIEWPORT, viewport);
        updates.put(ICountry.APPROXIMATE, approximate);
        updates.put(ICountry.HASAREALEVEL1, hasarealevel1);
        updates.put(ICountry.HASAREALEVEL2, hasarealevel2);
        updates.put(ICountry.HASAREALEVEL3, hasarealevel3);
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
    public CountryPK getPrimaryKey() {
        return this.countryPK;
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
            updates.put(ICountry.NAME, name);
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
            updates.put(ICountry.LOCATION, location);
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
            updates.put(ICountry.BOUNDS, bounds);
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
            updates.put(ICountry.VIEWPORT, viewport);
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
            updates.put(ICountry.APPROXIMATE, approximate);
        }
        this.approximate = approximate;
    }

    /**
     * 
     * @return hasarealevel1 value
     */
    public boolean getHasarealevel1() {
        return this.hasarealevel1;
    }

    /**
     * set hasarealevel1 value
     * @param hasarealevel1: new value
     */
    public void initHasarealevel1(boolean hasarealevel1) {
        this.hasarealevel1 = hasarealevel1;
    }

    /**
     * set hasarealevel1 value
     * @param hasarealevel1: new value
     */
    public void setHasarealevel1(boolean hasarealevel1) {
	if(hasarealevel1!=this.hasarealevel1) {
            updates.put(ICountry.HASAREALEVEL1, hasarealevel1);
        }
        this.hasarealevel1 = hasarealevel1;
    }

    /**
     * 
     * @return hasarealevel2 value
     */
    public boolean getHasarealevel2() {
        return this.hasarealevel2;
    }

    /**
     * set hasarealevel2 value
     * @param hasarealevel2: new value
     */
    public void initHasarealevel2(boolean hasarealevel2) {
        this.hasarealevel2 = hasarealevel2;
    }

    /**
     * set hasarealevel2 value
     * @param hasarealevel2: new value
     */
    public void setHasarealevel2(boolean hasarealevel2) {
	if(hasarealevel2!=this.hasarealevel2) {
            updates.put(ICountry.HASAREALEVEL2, hasarealevel2);
        }
        this.hasarealevel2 = hasarealevel2;
    }

    /**
     * 
     * @return hasarealevel3 value
     */
    public boolean getHasarealevel3() {
        return this.hasarealevel3;
    }

    /**
     * set hasarealevel3 value
     * @param hasarealevel3: new value
     */
    public void initHasarealevel3(boolean hasarealevel3) {
        this.hasarealevel3 = hasarealevel3;
    }

    /**
     * set hasarealevel3 value
     * @param hasarealevel3: new value
     */
    public void setHasarealevel3(boolean hasarealevel3) {
	if(hasarealevel3!=this.hasarealevel3) {
            updates.put(ICountry.HASAREALEVEL3, hasarealevel3);
        }
        this.hasarealevel3 = hasarealevel3;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
