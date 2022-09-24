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
import film.interfaces.logicentity.IPostalcode;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

public class ePostalcode extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected PostalcodePK postalcodePK;
    private Arealevel3PK arealevel3PK;
    private piShape location;
    private piShape bounds;
    private piShape viewport;
    private boolean approximate;
	  
    public static final String table = "postalcode";
	  
    public String getFieldname(short fieldconstant) {
        return IPostalcode.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IPostalcode.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return ePostalcode.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return ePostalcode.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public ePostalcode() {
    }

    public ePostalcode(java.lang.String countrycode, java.lang.String postalcode) {
        this.postalcodePK = new PostalcodePK(countrycode, postalcode);
    }
  
    public ePostalcode(PostalcodePK postalcodePK) {
        this.postalcodePK = postalcodePK;
    }

    public boolean isEmpty() {
        return this.postalcodePK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.postalcodePK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.postalcodePK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public PostalcodePK getPrimaryKey() {
        return this.postalcodePK;
    }

    public piShape getLocation() {
        return this.location;
    }

    public void initLocation(piShape location) {
        this.location = location;
    }

    public void setLocation(piShape location) {
	if(location==null && location!=this.location || location!=null && !location.equals(this.location)) {
            updates.put(IPostalcode.LOCATION, location);
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
            updates.put(IPostalcode.BOUNDS, bounds);
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
            updates.put(IPostalcode.VIEWPORT, viewport);
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
        updates.put(IPostalcode.APPROXIMATE, approximate);
        this.approximate = approximate;
    }

    public Arealevel3PK getArealevel3PK() {
        return this.arealevel3PK;
    }

    public void initArealevel3PK(IArealevel3PK arealevel3PK) {
        this.arealevel3PK = (Arealevel3PK)arealevel3PK;
    }

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

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
