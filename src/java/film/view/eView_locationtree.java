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

public class eView_locationtree implements filmDatabaseproperties, EntityView {

    public static final String table = "view_locationtree";
    private java.lang.String countrycode;
    private java.lang.String countryname;
    private java.lang.String postalcode;
    private java.lang.String al1code;
    private java.lang.String al1name;
    private java.lang.String al2code;
    private java.lang.String al2name;
    private java.lang.String al3code;
    private java.lang.String al3name;
    private java.lang.String locality;
    private boolean hassublocality;
    private java.lang.String sublocality;
    private java.lang.String routecode;
    private java.lang.String routename;
	  
    @Override
    public String getDbtool() {
        return eView_locationtree.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eView_locationtree.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eView_locationtree() {
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

    public java.lang.String getCountryname() {
        return this.countryname;
    }

    public void setCountryname(java.lang.String countryname) {
        this.countryname = countryname;
    }

    public java.lang.String getPostalcode() {
        return this.postalcode;
    }

    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }

    public java.lang.String getAl1code() {
        return this.al1code;
    }

    public void setAl1code(java.lang.String al1code) {
        this.al1code = al1code;
    }

    public java.lang.String getAl1name() {
        return this.al1name;
    }

    public void setAl1name(java.lang.String al1name) {
        this.al1name = al1name;
    }

    public java.lang.String getAl2code() {
        return this.al2code;
    }

    public void setAl2code(java.lang.String al2code) {
        this.al2code = al2code;
    }

    public java.lang.String getAl2name() {
        return this.al2name;
    }

    public void setAl2name(java.lang.String al2name) {
        this.al2name = al2name;
    }

    public java.lang.String getAl3code() {
        return this.al3code;
    }

    public void setAl3code(java.lang.String al3code) {
        this.al3code = al3code;
    }

    public java.lang.String getAl3name() {
        return this.al3name;
    }

    public void setAl3name(java.lang.String al3name) {
        this.al3name = al3name;
    }

    public java.lang.String getLocality() {
        return this.locality;
    }

    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }

    public boolean getHassublocality() {
        return this.hassublocality;
    }

    public void setHassublocality(boolean hassublocality) {
        this.hassublocality = hassublocality;
    }

    public java.lang.String getSublocality() {
        return this.sublocality;
    }

    public void setSublocality(java.lang.String sublocality) {
        this.sublocality = sublocality;
    }

    public java.lang.String getRoutecode() {
        return this.routecode;
    }

    public void setRoutecode(java.lang.String routecode) {
        this.routecode = routecode;
    }

    public java.lang.String getRoutename() {
        return this.routename;
    }

    public void setRoutename(java.lang.String routename) {
        this.routename = routename;
    }

}
