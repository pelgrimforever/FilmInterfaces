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

public class eView_publiccountryphotocount implements filmDatabaseproperties, EntityView {

    public static final String table = "view_publiccountryphotocount";
    private java.lang.String code;
    private java.lang.String name;
    private long photocount;
	  
    @Override
    public String getDbtool() {
        return eView_publiccountryphotocount.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_publiccountryphotocount.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_publiccountryphotocount() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public long getPhotocount() {
        return this.photocount;
    }

    public void setPhotocount(long photocount) {
        this.photocount = photocount;
    }

}
