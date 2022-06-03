/*
 * eView_backupstatus.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 1.5.2022 20:24
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
 * View class View_backupstatus
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_backupstatus Entity
 * 
 * @author Franky Laseure
 */
public class eView_backupstatus implements filmDatabaseproperties, EntityView {

    public static final String table = "view_backupstatus";
    private java.lang.String id;
    private long photocount;
    private long backupcount;
    private long imagebackupcount;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_backupstatus.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_backupstatus.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_backupstatus
     */
    public String getTable() { return table; }

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
