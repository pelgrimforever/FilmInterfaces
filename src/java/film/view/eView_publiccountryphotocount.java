/*
 * eView_publiccountryphotocount.java
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
 * View class View_publiccountryphotocount
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_publiccountryphotocount Entity
 * 
 * @author Franky Laseure
 */
public class eView_publiccountryphotocount implements EntityViewInterface {

    private java.lang.String code;
    private java.lang.String name;
    private long photocount;
	  
    public static final String table = "view_publiccountryphotocount";
    public static final String SQLSelectAll = "select view_publiccountryphotocount.* from view_publiccountryphotocount";
	  
    /**
     * 
     * @return view name for View_publiccountryphotocount
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_publiccountryphotocounts
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_publiccountryphotocount class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_publiccountryphotocount entity
     */
    public eView_publiccountryphotocount() {
    }

    /**
     * @return is View_publiccountryphotocount Empty ?
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
