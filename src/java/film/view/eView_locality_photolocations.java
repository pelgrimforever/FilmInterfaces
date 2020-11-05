/*
 * eView_locality_photolocations.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.view;

import data.interfaces.db.EntityViewInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;

/**
 * View class View_locality_photolocations
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_locality_photolocations Entity
 * 
 * @author Franky Laseure
 */
public class eView_locality_photolocations implements EntityViewInterface {

    private java.lang.String countrycode;
    private java.lang.String locality;
    private piShape location;
	  
    public static final String table = "view_locality_photolocations";
    public static final String SQLSelectAll = "select view_locality_photolocations.* from view_locality_photolocations";
	  
    /**
     * 
     * @return view name for View_locality_photolocations
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_locality_photolocationss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_locality_photolocations class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_locality_photolocations entity
     */
    public eView_locality_photolocations() {
    }

    /**
     * @return is View_locality_photolocations Empty ?
     */
    public boolean isEmpty() {
        return false;
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

}
