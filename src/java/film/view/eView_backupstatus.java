/*
 * eView_backupstatus.java
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
 * View class View_backupstatus
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_backupstatus Entity
 * 
 * @author Franky Laseure
 */
public class eView_backupstatus implements EntityViewInterface {

    private java.lang.String id;
    private long photocount;
    private long backupcount;
    private long imagebackupcount;
	  
    public static final String table = "view_backupstatus";
    public static final String SQLSelectAll = "select view_backupstatus.* from view_backupstatus";
	  
    /**
     * 
     * @return view name for View_backupstatus
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL select statement for all View_backupstatuss
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return View_backupstatus class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_backupstatus entity
     */
    public eView_backupstatus() {
    }

    /**
     * @return is View_backupstatus Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return id value
     */
    public java.lang.String getId() {
        return this.id;
    }

    /**
     * set id value
     * @param id: new value
     */
    public void setId(java.lang.String id) {
        this.id = id;
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

    /**
     * 
     * @return backupcount value
     */
    public long getBackupcount() {
        return this.backupcount;
    }

    /**
     * set backupcount value
     * @param backupcount: new value
     */
    public void setBackupcount(long backupcount) {
        this.backupcount = backupcount;
    }

    /**
     * 
     * @return imagebackupcount value
     */
    public long getImagebackupcount() {
        return this.imagebackupcount;
    }

    /**
     * set imagebackupcount value
     * @param imagebackupcount: new value
     */
    public void setImagebackupcount(long imagebackupcount) {
        this.imagebackupcount = imagebackupcount;
    }

}
