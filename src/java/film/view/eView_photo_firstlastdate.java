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

public class eView_photo_firstlastdate implements filmDatabaseproperties, EntityView {

    public static final String table = "view_photo_firstlastdate";
    private java.sql.Date minphotodate;
    private java.sql.Date maxphotodate;
	  
    @Override
    public String getDbtool() {
        return eView_photo_firstlastdate.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_photo_firstlastdate.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_photo_firstlastdate() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.sql.Date getMinphotodate() {
        return this.minphotodate;
    }

    public void setMinphotodate(java.sql.Date minphotodate) {
        this.minphotodate = minphotodate;
    }

    public java.sql.Date getMaxphotodate() {
        return this.maxphotodate;
    }

    public void setMaxphotodate(java.sql.Date maxphotodate) {
        this.maxphotodate = maxphotodate;
    }

}
