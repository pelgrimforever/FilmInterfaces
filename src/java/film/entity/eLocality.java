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
import film.interfaces.logicentity.ILocality;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eLocality.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eLocality.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eLocality() {
    }

    public eLocality(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality) {
        this.localityPK = new LocalityPK(countrycode, postalcode, locality);
    }
  
    public eLocality(LocalityPK localityPK) {
        this.localityPK = localityPK;
    }

    public boolean isEmpty() {
        return this.localityPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.localityPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.localityPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(ILocality.LOCATION, location);
        updates.put(ILocality.BOUNDS, bounds);
        updates.put(ILocality.VIEWPORT, viewport);
        updates.put(ILocality.APPROXIMATE, approximate);
        updates.put(ILocality.HASSUBLOCALITY, hassublocality);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public LocalityPK getPrimaryKey() {
        return this.localityPK;
    }

    public piShape getLocation() {
        return this.location;
    }

    public void initLocation(piShape location) {
        this.location = location;
    }

    public void setLocation(piShape location) {
	if(location==null && location!=this.location || location!=null && !location.equals(this.location)) {
            updates.put(ILocality.LOCATION, location);
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
            updates.put(ILocality.BOUNDS, bounds);
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
            updates.put(ILocality.VIEWPORT, viewport);
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
        updates.put(ILocality.APPROXIMATE, approximate);
        this.approximate = approximate;
    }

    public boolean getHassublocality() {
        return this.hassublocality;
    }

    public void initHassublocality(boolean hassublocality) {
        this.hassublocality = hassublocality;
    }

    public void setHassublocality(boolean hassublocality) {
        updates.put(ILocality.HASSUBLOCALITY, hassublocality);
        this.hassublocality = hassublocality;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
