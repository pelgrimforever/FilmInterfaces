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
import film.interfaces.logicentity.IRoute;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eRoute extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected RoutePK routePK;
    private java.lang.String name;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
	  
    public static final String table = "route";
	  
    public String getFieldname(short fieldconstant) {
        return IRoute.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IRoute.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eRoute.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eRoute.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eRoute() {
    }

    public eRoute(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality, java.lang.String routecode) {
        this.routePK = new RoutePK(countrycode, postalcode, locality, sublocality, routecode);
    }
  
    public eRoute(RoutePK routePK) {
        this.routePK = routePK;
    }

    public boolean isEmpty() {
        return this.routePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.routePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.routePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IRoute.NAME, name);
        updates.put(IRoute.LOCATION, location);
        updates.put(IRoute.BOUNDS, bounds);
        updates.put(IRoute.VIEWPORT, viewport);
        updates.put(IRoute.APPROXIMATE, approximate);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public RoutePK getPrimaryKey() {
        return this.routePK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IRoute.NAME, name);
        }
        this.name = name;
    }

    public piShape getLocation() {
        return this.location;
    }

    public void initLocation(piShape location) {
        this.location = location;
    }

    public void setLocation(piShape location) {
	if(location==null && location!=this.location || location!=null && !location.equals(this.location)) {
            updates.put(IRoute.LOCATION, location);
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
            updates.put(IRoute.BOUNDS, bounds);
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
            updates.put(IRoute.VIEWPORT, viewport);
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
        updates.put(IRoute.APPROXIMATE, approximate);
        this.approximate = approximate;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
