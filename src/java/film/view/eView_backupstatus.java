/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

public class eView_backupstatus implements filmDatabaseproperties, EntityView {

    public static final String table = "view_backupstatus";
    private java.lang.String id;
    private long photocount;
    private long backupcount;
    private long imagebackupcount;
	  
    @Override
    public String getDbtool() {
        return eView_backupstatus.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_backupstatus.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_backupstatus() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public long getPhotocount() {
        return this.photocount;
    }

    public void setPhotocount(long photocount) {
        this.photocount = photocount;
    }

    public long getBackupcount() {
        return this.backupcount;
    }

    public void setBackupcount(long backupcount) {
        this.backupcount = backupcount;
    }

    public long getImagebackupcount() {
        return this.imagebackupcount;
    }

    public void setImagebackupcount(long imagebackupcount) {
        this.imagebackupcount = imagebackupcount;
    }

}
