/*
 * eView_photo_firstlastdate.java
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
 * View class View_photo_firstlastdate
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_photo_firstlastdate Entity
 * 
 * @author Franky Laseure
 */
public class eView_photo_firstlastdate implements EntityViewInterface {

    private java.sql.Date minphotodate;
    private java.sql.Date maxphotodate;
	  
    public static final String table = "view_photo_firstlastdate";
    public static final String SQLSelectAll = "select view_photo_firstlastdate.* from view_photo_firstlastdate";
	  
    /**
     * 
     * @return view name for View_photo_firstlastdate
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_photo_firstlastdates
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
