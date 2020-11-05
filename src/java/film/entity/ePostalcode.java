/*
 * ePostalcode.java
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
import film.interfaces.logicentity.IPostalcode;
import film.interfaces.entity.pk.*;

/**
 * Entity class Postalcode
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Postalcode Entity
 * 
 * @author Franky Laseure
 */
public class ePostalcode extends AbstractEntity implements EntityInterface {

    protected PostalcodePK postalcodePK;
    private Arealevel3PK arealevel3PK;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
	  
    public static final String table = "postalcode";
    public static final String SQLWhere1 = "countrycode = :postalcode.countrycode: and postalcode = :postalcode.postalcode:";
    public static final String SQLSelect1 = "select postalcode.* from postalcode where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from postalcode where " + SQLWhere1;
    public static final String SQLSelectAll = "select postalcode.* from postalcode";
	  
    public String getFieldname(short fieldconstant) {
        return IPostalcode.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPostalcode.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Postalcode
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Postalcode (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Postalcode (=Primarykey)
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
     * @return SQL select statement for all Postalcodes
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Postalcode class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Postalcode entity
     */
    public ePostalcode() {
    }

    /**
     * Constructor
     * build an empty Postalcode entity with initialized field values
     */
    public ePostalcode(java.lang.String countrycode, java.lang.String postalcode) {
        this.postalcodePK = new PostalcodePK(countrycode, postalcode);
    }
  
    /**
     * Constructor
     * build an empty Postalcode entity with initialized Primarykey parameter
     * @param postalcodePK: Postalcode Primarykey
     */
    public ePostalcode(PostalcodePK postalcodePK) {
        this.postalcodePK = postalcodePK;
    }

    /**
     * @return is Postalcode Empty ?
     */
    public boolean isEmpty() {
        return this.postalcodePK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.postalcodePK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.postalcodePK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IPostalcode.COUNTRYCODE, this.arealevel3PK.getCountrycode());
        updates.put(IPostalcode.AL1CODE, this.arealevel3PK.getAl1code());
        updates.put(IPostalcode.AL2CODE, this.arealevel3PK.getAl2code());
        updates.put(IPostalcode.AL3CODE, this.arealevel3PK.getAl3code());

        updates.put(IPostalcode.LOCATION, location);
        updates.put(IPostalcode.BOUNDS, bounds);
        updates.put(IPostalcode.VIEWPORT, viewport);
        updates.put(IPostalcode.APPROXIMATE, approximate);
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
    public PostalcodePK getPrimaryKey() {
        return this.postalcodePK;
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
            updates.put(IPostalcode.LOCATION, location);
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
            updates.put(IPostalcode.BOUNDS, bounds);
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
            updates.put(IPostalcode.VIEWPORT, viewport);
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
            updates.put(IPostalcode.APPROXIMATE, approximate);
        }
        this.approximate = approximate;
    }

    /**
     * 
     * @return foreign key arealevel3PK, instance of Arealevel3PK
     */
    public Arealevel3PK getArealevel3PK() {
        return this.arealevel3PK;
    }

    /**
     * set foreign key arealevel3
     * @param arealevel3PK: instance of Arealevel3PK
     */
    public void initArealevel3PK(IArealevel3PK arealevel3PK) {
        this.arealevel3PK = (Arealevel3PK)arealevel3PK;
    }

    /**
     * set foreign key arealevel3
     * @param arealevel3PK: instance of Arealevel3PK
     */
    public void setArealevel3PK(IArealevel3PK arealevel3PK) {
	if(arealevel3PK==null && arealevel3PK!=this.arealevel3PK || arealevel3PK!=null) {
            if(arealevel3PK==null) {
                updates.put(IPostalcode.COUNTRYCODE, null);
                updates.put(IPostalcode.AL1CODE, null);
                updates.put(IPostalcode.AL2CODE, null);
                updates.put(IPostalcode.AL3CODE, null);
            } else {
                updates.put(IPostalcode.COUNTRYCODE, arealevel3PK.getCountrycode());
                updates.put(IPostalcode.AL1CODE, arealevel3PK.getAl1code());
                updates.put(IPostalcode.AL2CODE, arealevel3PK.getAl2code());
                updates.put(IPostalcode.AL3CODE, arealevel3PK.getAl3code());
            }
        }
        this.arealevel3PK = (Arealevel3PK)arealevel3PK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
