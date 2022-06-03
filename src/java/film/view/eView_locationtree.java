/*
 * eView_locationtree.java
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
 * View class View_locationtree
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> View_locationtree Entity
 * 
 * @author Franky Laseure
 */
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
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eView_locationtree.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eView_locationtree.connectionpool;
    }
    
    /**
     * 
     * @return view name for View_locationtree
     */
    public String getTable() { return table; }

    /**
     * 
     * @return View_locationtree class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty View_locationtree entity
     */
    public eView_locationtree() {
    }

    /**
     * @return is View_locationtree Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return countrycode value
     */
    public java.lang.String getCountrycode() {
        return this.countrycode;
    }

    /**
     * set countrycode value
     * @param countrycode: new value
     */
    public void setCountrycode(java.lang.String countrycode) {
        this.countrycode = countrycode;
    }

    /**
     * 
     * @return countryname value
     */
    public java.lang.String getCountryname() {
        return this.countryname;
    }

    /**
     * set countryname value
     * @param countryname: new value
     */
    public void setCountryname(java.lang.String countryname) {
        this.countryname = countryname;
    }

    /**
     * 
     * @return postalcode value
     */
    public java.lang.String getPostalcode() {
        return this.postalcode;
    }

    /**
     * set postalcode value
     * @param postalcode: new value
     */
    public void setPostalcode(java.lang.String postalcode) {
        this.postalcode = postalcode;
    }

    /**
     * 
     * @return al1code value
     */
    public java.lang.String getAl1code() {
        return this.al1code;
    }

    /**
     * set al1code value
     * @param al1code: new value
     */
    public void setAl1code(java.lang.String al1code) {
        this.al1code = al1code;
    }

    /**
     * 
     * @return al1name value
     */
    public java.lang.String getAl1name() {
        return this.al1name;
    }

    /**
     * set al1name value
     * @param al1name: new value
     */
    public void setAl1name(java.lang.String al1name) {
        this.al1name = al1name;
    }

    /**
     * 
     * @return al2code value
     */
    public java.lang.String getAl2code() {
        return this.al2code;
    }

    /**
     * set al2code value
     * @param al2code: new value
     */
    public void setAl2code(java.lang.String al2code) {
        this.al2code = al2code;
    }

    /**
     * 
     * @return al2name value
     */
    public java.lang.String getAl2name() {
        return this.al2name;
    }

    /**
     * set al2name value
     * @param al2name: new value
     */
    public void setAl2name(java.lang.String al2name) {
        this.al2name = al2name;
    }

    /**
     * 
     * @return al3code value
     */
    public java.lang.String getAl3code() {
        return this.al3code;
    }

    /**
     * set al3code value
     * @param al3code: new value
     */
    public void setAl3code(java.lang.String al3code) {
        this.al3code = al3code;
    }

    /**
     * 
     * @return al3name value
     */
    public java.lang.String getAl3name() {
        return this.al3name;
    }

    /**
     * set al3name value
     * @param al3name: new value
     */
    public void setAl3name(java.lang.String al3name) {
        this.al3name = al3name;
    }

    /**
     * 
     * @return locality value
     */
    public java.lang.String getLocality() {
        return this.locality;
    }

    /**
     * set locality value
     * @param locality: new value
     */
    public void setLocality(java.lang.String locality) {
        this.locality = locality;
    }

    /**
     * 
     * @return hassublocality value
     */
    public boolean getHassublocality() {
        return this.hassublocality;
    }

    /**
     * set hassublocality value
     * @param hassublocality: new value
     */
    public void setHassublocality(boolean hassublocality) {
        this.hassublocality = hassublocality;
    }

    /**
     * 
     * @return sublocality value
     */
    public java.lang.String getSublocality() {
        return this.sublocality;
    }

    /**
     * set sublocality value
     * @param sublocality: new value
     */
    public void setSublocality(java.lang.String sublocality) {
        this.sublocality = sublocality;
    }

    /**
     * 
     * @return routecode value
     */
    public java.lang.String getRoutecode() {
        return this.routecode;
    }

    /**
     * set routecode value
     * @param routecode: new value
     */
    public void setRoutecode(java.lang.String routecode) {
        this.routecode = routecode;
    }

    /**
     * 
     * @return routename value
     */
    public java.lang.String getRoutename() {
        return this.routename;
    }

    /**
     * set routename value
     * @param routename: new value
     */
    public void setRoutename(java.lang.String routename) {
        this.routename = routename;
    }

}
