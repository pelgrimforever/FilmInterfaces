/*
 * eView_photodates.java
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
 * View class View_photodates
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_photodates Entity
 * 
 * @author Franky Laseure
 */
public class eView_photodates implements filmDatabaseproperties, EntityView {

    public static final String table = "view_photodates";
    private java.sql.Date photodate;
    private long photos;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_photodates.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_photodates.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_photodates
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_photodates class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_photodates entity
     */
    public eView_photodates() {
    }

    /**
     * @return is View_photodates Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return photodate value
     */
    public java.sql.Date getPhotodate() {
        return this.photodate;
    }

    /**
     * set photodate value
     * @param photodate: new value
     */
    public void setPhotodate(java.sql.Date photodate) {
        this.photodate = photodate;
    }

    /**
     * 
     * @return photos value
     */
    public long getPhotos() {
        return this.photos;
    }

    /**
     * set photos value
     * @param photos: new value
     */
    public void setPhotos(long photos) {
        this.photos = photos;
    }

}
