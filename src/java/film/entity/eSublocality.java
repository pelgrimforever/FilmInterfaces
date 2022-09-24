/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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
import film.interfaces.logicentity.ISublocality;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eSublocality extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected SublocalityPK sublocalityPK;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
	  
    public static final String table = "sublocality";
	  
    public String getFieldname(short fieldconstant) {
        return ISublocality.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ISublocality.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eSublocality.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eSublocality.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eSublocality() {
    }

    public eSublocality(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality) {
        this.sublocalityPK = new SublocalityPK(countrycode, postalcode, locality, sublocality);
    }
  
    public eSublocality(SublocalityPK sublocalityPK) {
        this.sublocalityPK = sublocalityPK;
    }

    public boolean isEmpty() {
        return this.sublocalityPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.sublocalityPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.sublocalityPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ISublocality.LOCATION, location);
        updates.put(ISublocality.BOUNDS, bounds);
        updates.put(ISublocality.VIEWPORT, viewport);
        updates.put(ISublocality.APPROXIMATE, approximate);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public SublocalityPK getPrimaryKey() {
        return this.sublocalityPK;
    }

    public piShape getLocation() {
        return this.location;
    }

    public void initLocation(piShape location) {
        this.location = location;
    }

    public void setLocation(piShape location) {
	if(location==null && location!=this.location || location!=null && !location.equals(this.location)) {
            updates.put(ISublocality.LOCATION, location);
        }
        this.location = location;
    }

    public piShape getBounds() {
        return this.bounds;
    }

    public void initBounds(piShape bounds) {
        this.bounds = bounds;
    }

    public void setBounds(piShape bounds) {
	if(bounds==null && bounds!=this.bounds || bounds!=null && !bounds.equals(this.bounds)) {
            updates.put(ISublocality.BOUNDS, bounds);
        }
        this.bounds = bounds;
    }

    public piShape getViewport() {
        return this.viewport;
    }

    public void initViewport(piShape viewport) {
        this.viewport = viewport;
    }

    public void setViewport(piShape viewport) {
	if(viewport==null && viewport!=this.viewport || viewport!=null && !viewport.equals(this.viewport)) {
            updates.put(ISublocality.VIEWPORT, viewport);
        }
        this.viewport = viewport;
    }

    public boolean getApproximate() {
        return this.approximate;
    }

    public void initApproximate(boolean approximate) {
        this.approximate = approximate;
    }

    public void setApproximate(boolean approximate) {
        updates.put(ISublocality.APPROXIMATE, approximate);
        this.approximate = approximate;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
