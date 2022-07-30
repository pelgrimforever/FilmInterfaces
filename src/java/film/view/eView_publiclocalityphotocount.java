/*
 * eView_publiclocalityphotocount.java
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
 * View class View_publiclocalityphotocount
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_publiclocalityphotocount Entity
 * 
 * @author Franky Laseure
 */
public class eView_publiclocalityphotocount implements filmDatabaseproperties, EntityView {

    public static final String table = "view_publiclocalityphotocount";
    private java.lang.String countrycode;
    private java.lang.String locality;
    private piShape location;
    private long photocount;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_publiclocalityphotocount.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_publiclocalityphotocount.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_publiclocalityphotocount
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_publiclocalityphotocount class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_publiclocalityphotocount entity
     */
    public eView_publiclocalityphotocount() {
    }

    /**
     * @return is View_publiclocalityphotocount Empty ?
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
