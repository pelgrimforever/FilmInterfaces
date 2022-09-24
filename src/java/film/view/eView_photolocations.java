/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.view;

import film.filmDatabaseproperties;
import data.interfaces.db.EntityView;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

public class eView_photolocations implements filmDatabaseproperties, EntityView {

    public static final String table = "view_photolocations";
    private piShape location;
    private boolean exactlocation;
    private double locationradius;
    private java.lang.String countrycode;
    private java.lang.String postalcode;
    private java.lang.String locality;
    private java.lang.String sublocality;
    private java.lang.String routecode;
    private java.lang.String streetnumber;
    private long locationcount;
	  
    @Override
    public String getDbtool() {
        return eView_photolocations.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_photolocations.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_photolocations() {
    }

    public boolean isEmpty() {
        return false;
    }

    public piShape getLocation() {
        return this.location;
    }

    public void setLocation(piShape location) {
        this.location = location;
    }

    public boolean getExactlocation() {
        return this.exactlocation;
    }

    public void setExactlocation(boolean exactlocation) {
        this.exactlocation = exactlocation;
    }

    public double getLocationradius() {
        return this.locationradius;
    }

    public void setLocationradius(double locationradius) {
        this.locationradius = locationradius;
    }

    public java.lang.String getCountrycode() {
        return this.countrycode;
    }

    public void setCountrycode(java.lang.String countrycode) {
        this.countrycode = countrycode;
    }

    public java.lang.String getPostalcode() {
        return this.postalcode;
    }

    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }

    public java.lang.String getLocality() {
        return this.locality;
    }

    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }

    public java.lang.String getSublocality() {
        return this.sublocality;
    }

    public void setSublocality(java.lang.String sublocality) {
        this.sublocality = sublocality;
    }

    public java.lang.String getRoutecode() {
        return this.routecode;
    }

    public void setRoutecode(java.lang.String routecode) {
        this.routecode = routecode;
    }

    public java.lang.String getStreetnumber() {
        return this.streetnumber;
    }

    public void setStreetnumber(java.lang.String streetnumber) {
        this.streetnumber = streetnumber;
    }

    public long getLocationcount() {
        return this.locationcount;
    }

    public void setLocationcount(long locationcount) {
        this.locationcount = locationcount;
    }

}
