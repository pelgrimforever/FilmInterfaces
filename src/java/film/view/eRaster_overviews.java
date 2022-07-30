/*
 * eRaster_overviews.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
 * View class Raster_overviews
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Raster_overviews Entity
 * 
 * @author Franky Laseure
 */
public class eRaster_overviews implements filmDatabaseproperties, EntityView {

    public static final String table = "raster_overviews";
    private java.lang.String o_table_catalog;
    private java.lang.String o_table_schema;
    private java.lang.String o_table_name;
    private java.lang.String o_raster_column;
    private java.lang.String r_table_catalog;
    private java.lang.String r_table_schema;
    private java.lang.String r_table_name;
    private java.lang.String r_raster_column;
    private int overview_factor;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eRaster_overviews.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eRaster_overviews.connectionpool;
    }
    
    /**
     * 
     * @return view name for Raster_overviews
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Raster_overviews class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Raster_overviews entity
     */
    public eRaster_overviews() {
    }

    /**
     * @return is Raster_overviews Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return o_table_catalog value
     */
    public java.lang.String getO_table_catalog() {
        return this.o_table_catalog;
    }

    /**
     * set o_table_catalog value
     * @param o_table_catalog: new value
     */
    public void setO_table_catalog(java.lang.String o_table_catalog) {
        this.o_table_catalog = o_table_catalog;
    }

    /**
     * 
     * @return o_table_schema value
     */
    public java.lang.String getO_table_schema() {
        return this.o_table_schema;
    }

    /**
     * set o_table_schema value
     * @param o_table_schema: new value
     */
    public void setO_table_schema(java.lang.String o_table_schema) {
        this.o_table_schema = o_table_schema;
    }

    /**
     * 
     * @return o_table_name value
     */
    public java.lang.String getO_table_name() {
        return this.o_table_name;
    }

    /**
     * set o_table_name value
     * @param o_table_name: new value
     */
    public void setO_table_name(java.lang.String o_table_name) {
        this.o_table_name = o_table_name;
    }

    /**
     * 
     * @return o_raster_column value
     */
    public java.lang.String getO_raster_column() {
        return this.o_raster_column;
    }

    /**
     * set o_raster_column value
     * @param o_raster_column: new value
     */
    public void setO_raster_column(java.lang.String o_raster_column) {
        this.o_raster_column = o_raster_column;
    }

    /**
     * 
     * @return r_table_catalog value
     */
    public java.lang.String getR_table_catalog() {
        return this.r_table_catalog;
    }

    /**
     * set r_table_catalog value
     * @param r_table_catalog: new value
     */
    public void setR_table_catalog(java.lang.String r_table_catalog) {
        this.r_table_catalog = r_table_catalog;
    }

    /**
     * 
     * @return r_table_schema value
     */
    public java.lang.String getR_table_schema() {
        return this.r_table_schema;
    }

    /**
     * set r_table_schema value
     * @param r_table_schema: new value
     */
    public void setR_table_schema(java.lang.String r_table_schema) {
        this.r_table_schema = r_table_schema;
    }

    /**
     * 
     * @return r_table_name value
     */
    public java.lang.String getR_table_name() {
        return this.r_table_name;
    }

    /**
     * set r_table_name value
     * @param r_table_name: new value
     */
    public void setR_table_name(java.lang.String r_table_name) {
        this.r_table_name = r_table_name;
    }

    /**
     * 
     * @return r_raster_column value
     */
    public java.lang.String getR_raster_column() {
        return this.r_raster_column;
    }

    /**
     * set r_raster_column value
     * @param r_raster_column: new value
     */
    public void setR_raster_column(java.lang.String r_raster_column) {
        this.r_raster_column = r_raster_column;
    }

    /**
     * 
     * @return overview_factor value
     */
    public int getOverview_factor() {
        return this.overview_factor;
    }

    /**
     * set overview_factor value
     * @param overview_factor: new value
     */
    public void setOverview_factor(int overview_factor) {
        this.overview_factor = overview_factor;
    }

}
