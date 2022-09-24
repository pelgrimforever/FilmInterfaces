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

public class eView_photodatespublic implements filmDatabaseproperties, EntityView {

    public static final String table = "view_photodatespublic";
    private java.sql.Date photodate;
    private long photos;
	  
    @Override
    public String getDbtool() {
        return eView_photodatespublic.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_photodatespublic.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_photodatespublic() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.sql.Date getPhotodate() {
        return this.photodate;
    }

    public void setPhotodate(java.sql.Date photodate) {
        this.photodate = photodate;
    }

    public long getPhotos() {
        return this.photos;
    }

    public void setPhotos(long photos) {
        this.photos = photos;
    }

}
