/*
 * eView_photolocations.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
 *
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

/**
 * View class View_photolocations
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_photolocations Entity
 * 
 * @author Franky Laseure
 */
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
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_photolocations.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_photolocations.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_photolocations
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_photolocations class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_photolocations entity
     */
    public eView_photolocations() {
    }

    /**
     * @return is View_photolocations Empty ?
     */
    public boolean isEmpty() {
        return false;
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
    public void setLocation(piShape location) {
        this.location = location;
    }

    /**
     * 
     * @return exactlocation value
     */
    public boolean getExactlocation() {
        return this.exactlocation;
    }

    /**
     * set exactlocation value
     * @param exactlocation: new value
     */
    public void setExactlocation(boolean exactlocation) {
        this.exactlocation = exactlocation;
    }

    /**
     * 
     * @return locationradius value
     */
    public double getLocationradius() {
        return this.locationradius;
    }

    /**
     * set locationradius value
     * @param locationradius: new value
     */
    public void setLocationradius(double locationradius) {
        this.locationradius = locationradius;
    }

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode() {
        return this.countrycode;
    }

    /**
     * set countrycode value
     * @param countrycode: new value
     */
    public void setCountrycode(java.lang.String countrycode) {
        this.countrycode = countrycode;
    }

    /**
     * 
     * @return postalcode value
     */
    public java.lang.String getPostalcode() {
        return this.postalcode;
    }

    /**
     * set postalcode value
     * @param postalcode: new value
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }

    /**
     * 
     * @return locality value
     */
    public java.lang.String getLocality() {
        return this.locality;
    }

    /**
     * set locality value
     * @param locality: new value
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }

    /**
     * 
     * @return sublocality value
     */
    public java.lang.String getSublocality() {
        return this.sublocality;
    }

    /**
     * set sublocality value
     * @param sublocality: new value
     */
    public void setSublocality(java.lang.String sublocality) {
        this.sublocality = sublocality;
    }

    /**
     * 
     * @return routecode value
     */
    public java.lang.String getRoutecode() {
        return this.routecode;
    }

    /**
     * set routecode value
     * @param routecode: new value
     */
    public void setRoutecode(java.lang.String routecode) {
        this.routecode = routecode;
    }

    /**
     * 
     * @return streetnumber value
     */
    public java.lang.String getStreetnumber() {
        return this.streetnumber;
    }

    /**
     * set streetnumber value
     * @param streetnumber: new value
     */
    public void setStreetnumber(java.lang.String streetnumber) {
        this.streetnumber = streetnumber;
    }

    /**
     * 
     * @return locationcount value
     */
    public long getLocationcount() {
        return this.locationcount;
    }

    /**
     * set locationcount value
     * @param locationcount: new value
     */
    public void setLocationcount(long locationcount) {
        this.locationcount = locationcount;
    }

}
