/*
 * eView_localityphotocount.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
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
 * View class View_localityphotocount
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_localityphotocount Entity
 * 
 * @author Franky Laseure
 */
public class eView_localityphotocount implements EntityViewInterface {

    private java.lang.String countrycode;
    private java.lang.String locality;
    private piShape location;
    private long photocount;
	  
    public static final String table = "view_localityphotocount";
    public static final String SQLSelectAll = "select view_localityphotocount.* from view_localityphotocount";
	  
    /**
     * 
     * @return view name for View_localityphotocount
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_localityphotocounts
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_localityphotocount class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_localityphotocount entity
     */
    public eView_localityphotocount() {
    }

    /**
     * @return is View_localityphotocount Empty ?
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

    /**
     * 
     * @return photocount value
     */
    public long getPhotocount() {
        return this.photocount;
    }

    /**
     * set photocount value
     * @param photocount: new value
     */
    public void setPhotocount(long photocount) {
        this.photocount = photocount;
    }

}
