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
import film.interfaces.logicentity.IArealevel1;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eArealevel1.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eArealevel1.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eArealevel1() {
    }

    public eArealevel1(java.lang.String countrycode, java.lang.String al1code) {
        this.arealevel1PK = new Arealevel1PK(countrycode, al1code);
    }
  
    public eArealevel1(Arealevel1PK arealevel1PK) {
        this.arealevel1PK = arealevel1PK;
    }

    public boolean isEmpty() {
        return this.arealevel1PK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.arealevel1PK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.arealevel1PK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IArealevel1.NAME, name);
        updates.put(IArealevel1.LOCATION, location);
        updates.put(IArealevel1.BOUNDS, bounds);
        updates.put(IArealevel1.VIEWPORT, viewport);
        updates.put(IArealevel1.APPROXIMATE, approximate);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Arealevel1PK getPrimaryKey() {
        return this.arealevel1PK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IArealevel1.NAME, name);
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
            updates.put(IArealevel1.LOCATION, location);
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
            updates.put(IArealevel1.BOUNDS, bounds);
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
            updates.put(IArealevel1.VIEWPORT, viewport);
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
        updates.put(IArealevel1.APPROXIMATE, approximate);
        this.approximate = approximate;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
