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
import film.interfaces.logicentity.ICountry;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class eCountry extends AbstractEntity implements filmDatabaseproperties, Entity {

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
	  
    public String getFieldname(short fieldconstant) {
        return ICountry.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return ICountry.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eCountry.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eCountry.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eCountry() {
    }

    public eCountry(java.lang.String code) {
        this.countryPK = new CountryPK(code);
    }
  
    public eCountry(CountryPK countryPK) {
        this.countryPK = countryPK;
    }

    public boolean isEmpty() {
        return this.countryPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.countryPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.countryPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public CountryPK getPrimaryKey() {
        return this.countryPK;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void initName(java.lang.String name) {
        this.name = name;
    }

    public void setName(java.lang.String name) {
	if(name==null && name!=this.name || name!=null && !name.equals(this.name)) {
            updates.put(ICountry.NAME, name);
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
            updates.put(ICountry.LOCATION, location);
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
            updates.put(ICountry.BOUNDS, bounds);
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
            updates.put(ICountry.VIEWPORT, viewport);
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
        updates.put(ICountry.APPROXIMATE, approximate);
        this.approximate = approximate;
    }

    public boolean getHasarealevel1() {
        return this.hasarealevel1;
    }

    public void initHasarealevel1(boolean hasarealevel1) {
        this.hasarealevel1 = hasarealevel1;
    }

    public void setHasarealevel1(boolean hasarealevel1) {
        updates.put(ICountry.HASAREALEVEL1, hasarealevel1);
        this.hasarealevel1 = hasarealevel1;
    }

    public boolean getHasarealevel2() {
        return this.hasarealevel2;
    }

    public void initHasarealevel2(boolean hasarealevel2) {
        this.hasarealevel2 = hasarealevel2;
    }

    public void setHasarealevel2(boolean hasarealevel2) {
        updates.put(ICountry.HASAREALEVEL2, hasarealevel2);
        this.hasarealevel2 = hasarealevel2;
    }

    public boolean getHasarealevel3() {
        return this.hasarealevel3;
    }

    public void initHasarealevel3(boolean hasarealevel3) {
        this.hasarealevel3 = hasarealevel3;
    }

    public void setHasarealevel3(boolean hasarealevel3) {
        updates.put(ICountry.HASAREALEVEL3, hasarealevel3);
        this.hasarealevel3 = hasarealevel3;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
