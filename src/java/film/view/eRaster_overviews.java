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
	  
    @Override
    public String getDbtool() {
        return eRaster_overviews.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eRaster_overviews.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eRaster_overviews() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getO_table_catalog() {
        return this.o_table_catalog;
    }

    public void setO_table_catalog(java.lang.String o_table_catalog) {
        this.o_table_catalog = o_table_catalog;
    }

    public java.lang.String getO_table_schema() {
        return this.o_table_schema;
    }

    public void setO_table_schema(java.lang.String o_table_schema) {
        this.o_table_schema = o_table_schema;
    }

    public java.lang.String getO_table_name() {
        return this.o_table_name;
    }

    public void setO_table_name(java.lang.String o_table_name) {
        this.o_table_name = o_table_name;
    }

    public java.lang.String getO_raster_column() {
        return this.o_raster_column;
    }

    public void setO_raster_column(java.lang.String o_raster_column) {
        this.o_raster_column = o_raster_column;
    }

    public java.lang.String getR_table_catalog() {
        return this.r_table_catalog;
    }

    public void setR_table_catalog(java.lang.String r_table_catalog) {
        this.r_table_catalog = r_table_catalog;
    }

    public java.lang.String getR_table_schema() {
        return this.r_table_schema;
    }

    public void setR_table_schema(java.lang.String r_table_schema) {
        this.r_table_schema = r_table_schema;
    }

    public java.lang.String getR_table_name() {
        return this.r_table_name;
    }

    public void setR_table_name(java.lang.String r_table_name) {
        this.r_table_name = r_table_name;
    }

    public java.lang.String getR_raster_column() {
        return this.r_raster_column;
    }

    public void setR_raster_column(java.lang.String r_raster_column) {
        this.r_raster_column = r_raster_column;
    }

    public int getOverview_factor() {
        return this.overview_factor;
    }

    public void setOverview_factor(int overview_factor) {
        this.overview_factor = overview_factor;
    }

}
