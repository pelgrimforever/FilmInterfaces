/*
 * eView_countryphotocount.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
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
 * View class View_countryphotocount
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_countryphotocount Entity
 * 
 * @author Franky Laseure
 */
public class eView_countryphotocount implements filmDatabaseproperties, EntityView {

    public static final String table = "view_countryphotocount";
    private java.lang.String code;
    private java.lang.String name;
    private long photocount;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_countryphotocount.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_countryphotocount.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_countryphotocount
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_countryphotocount class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_countryphotocount entity
     */
    public eView_countryphotocount() {
    }

    /**
     * @return is View_countryphotocount Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return code value
     */
    public java.lang.String getCode() {
        return this.code;
    }

    /**
     * set code value
     * @param code: new value
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    /**
     * 
     * @return name value
     */
    public java.lang.String getName() {
        return this.name;
    }

    /**
     * set name value
     * @param name: new value
     */
    public void setName(java.lang.String name) {
        this.name = name;
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
