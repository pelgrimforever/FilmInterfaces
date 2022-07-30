/*
 * eView_photo_firstlastdate.java
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
 * View class View_photo_firstlastdate
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_photo_firstlastdate Entity
 * 
 * @author Franky Laseure
 */
public class eView_photo_firstlastdate implements filmDatabaseproperties, EntityView {

    public static final String table = "view_photo_firstlastdate";
    private java.sql.Date minphotodate;
    private java.sql.Date maxphotodate;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_photo_firstlastdate.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_photo_firstlastdate.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_photo_firstlastdate
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_photo_firstlastdate class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_photo_firstlastdate entity
     */
    public eView_photo_firstlastdate() {
    }

    /**
     * @return is View_photo_firstlastdate Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return minphotodate value
     */
    public java.sql.Date getMinphotodate() {
        return this.minphotodate;
    }

    /**
     * set minphotodate value
     * @param minphotodate: new value
     */
    public void setMinphotodate(java.sql.Date minphotodate) {
        this.minphotodate = minphotodate;
    }

    /**
     * 
     * @return maxphotodate value
     */
    public java.sql.Date getMaxphotodate() {
        return this.maxphotodate;
    }

    /**
     * set maxphotodate value
     * @param maxphotodate: new value
     */
    public void setMaxphotodate(java.sql.Date maxphotodate) {
        this.maxphotodate = maxphotodate;
    }

}
