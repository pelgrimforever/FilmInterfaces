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

public class eView_publiclocalityphotocount implements filmDatabaseproperties, EntityView {

    public static final String table = "view_publiclocalityphotocount";
    private java.lang.String countrycode;
    private java.lang.String locality;
    private piShape location;
    private long photocount;
	  
    @Override
    public String getDbtool() {
        return eView_publiclocalityphotocount.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_publiclocalityphotocount.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_publiclocalityphotocount() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getCountrycode() {
        return this.countrycode;
    }

    public void setCountrycode(java.lang.String countrycode) {
        this.countrycode = countrycode;
    }

    public java.lang.String getLocality() {
        return this.locality;
    }

    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }

    public piShape getLocation() {
        return this.location;
    }

    public void setLocation(piShape location) {
        this.location = location;
    }

    public long getPhotocount() {
        return this.photocount;
    }

    public void setPhotocount(long photocount) {
        this.photocount = photocount;
    }

}
