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
import film.interfaces.logicentity.IArealevel3;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eArealevel3.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eArealevel3.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eArealevel3() {
    }

    public eArealevel3(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code, java.lang.String al3code) {
        this.arealevel3PK = new Arealevel3PK(countrycode, al1code, al2code, al3code);
    }
  
    public eArealevel3(Arealevel3PK arealevel3PK) {
        this.arealevel3PK = arealevel3PK;
    }

    public boolean isEmpty() {
        return this.arealevel3PK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.arealevel3PK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.arealevel3PK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IArealevel3.NAME, name);
        updates.put(IArealevel3.LOCATION, location);
        updates.put(IArealevel3.BOUNDS, bounds);
        updates.put(IArealevel3.VIEWPORT, viewport);
        updates.put(IArealevel3.APPROXIMATE, approximate);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public Arealevel3PK getPrimaryKey() {
        return this.arealevel3PK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(IArealevel3.NAME, name);
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
            updates.put(IArealevel3.LOCATION, location);
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
            updates.put(IArealevel3.BOUNDS, bounds);
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
            updates.put(IArealevel3.VIEWPORT, viewport);
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
        updates.put(IArealevel3.APPROXIMATE, approximate);
        this.approximate = approximate;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
