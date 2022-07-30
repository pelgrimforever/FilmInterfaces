/*
 * eRaster_columns.java
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
 * View class Raster_columns
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Raster_columns Entity
 * 
 * @author Franky Laseure
 */
public class eRaster_columns implements filmDatabaseproperties, EntityView {

    public static final String table = "raster_columns";
    private java.lang.String r_table_catalog;
    private java.lang.String r_table_schema;
    private java.lang.String r_table_name;
    private java.lang.String r_raster_column;
    private int srid;
    private double scale_x;
    private double scale_y;
    private int blocksize_x;
    private int blocksize_y;
    private boolean same_alignment;
    private boolean regular_blocking;
    private int num_bands;
    private java.sql.Array pixel_types;
    private java.sql.Array nodata_values;
    private java.sql.Array out_db;
    private piShape extent;
    private boolean spatial_index;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eRaster_columns.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eRaster_columns.connectionpool;
    }
    
    /**
     * 
     * @return view name for Raster_columns
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Raster_columns class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Raster_columns entity
     */
    public eRaster_columns() {
    }

    /**
     * @return is Raster_columns Empty ?
     */
    public boolean isEmpty() {
        return false;
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
     * @return srid value
     */
    public int getSrid() {
        return this.srid;
    }

    /**
     * set srid value
     * @param srid: new value
     */
    public void setSrid(int srid) {
        this.srid = srid;
    }

    /**
     * 
     * @return scale_x value
     */
    public double getScale_x() {
        return this.scale_x;
    }

    /**
     * set scale_x value
     * @param scale_x: new value
     */
    public void setScale_x(double scale_x) {
        this.scale_x = scale_x;
    }

    /**
     * 
     * @return scale_y value
     */
    public double getScale_y() {
        return this.scale_y;
    }

    /**
     * set scale_y value
     * @param scale_y: new value
     */
    public void setScale_y(double scale_y) {
        this.scale_y = scale_y;
    }

    /**
     * 
     * @return blocksize_x value
     */
    public int getBlocksize_x() {
        return this.blocksize_x;
    }

    /**
     * set blocksize_x value
     * @param blocksize_x: new value
     */
    public void setBlocksize_x(int blocksize_x) {
        this.blocksize_x = blocksize_x;
    }

    /**
     * 
     * @return blocksize_y value
     */
    public int getBlocksize_y() {
        return this.blocksize_y;
    }

    /**
     * set blocksize_y value
     * @param blocksize_y: new value
     */
    public void setBlocksize_y(int blocksize_y) {
        this.blocksize_y = blocksize_y;
    }

    /**
     * 
     * @return same_alignment value
     */
    public boolean getSame_alignment() {
        return this.same_alignment;
    }

    /**
     * set same_alignment value
     * @param same_alignment: new value
     */
    public void setSame_alignment(boolean same_alignment) {
        this.same_alignment = same_alignment;
    }

    /**
     * 
     * @return regular_blocking value
     */
    public boolean getRegular_blocking() {
        return this.regular_blocking;
    }

    /**
     * set regular_blocking value
     * @param regular_blocking: new value
     */
    public void setRegular_blocking(boolean regular_blocking) {
        this.regular_blocking = regular_blocking;
    }

    /**
     * 
     * @return num_bands value
     */
    public int getNum_bands() {
        return this.num_bands;
    }

    /**
     * set num_bands value
     * @param num_bands: new value
     */
    public void setNum_bands(int num_bands) {
        this.num_bands = num_bands;
    }

    /**
     * 
     * @return pixel_types value
     */
    public java.sql.Array getPixel_types() {
        return this.pixel_types;
    }

    /**
     * set pixel_types value
     * @param pixel_types: new value
     */
    public void setPixel_types(java.sql.Array pixel_types) {
        this.pixel_types = pixel_types;
    }

    /**
     * 
     * @return nodata_values value
     */
    public java.sql.Array getNodata_values() {
        return this.nodata_values;
    }

    /**
     * set nodata_values value
     * @param nodata_values: new value
     */
    public void setNodata_values(java.sql.Array nodata_values) {
        this.nodata_values = nodata_values;
    }

    /**
     * 
     * @return out_db value
     */
    public java.sql.Array getOut_db() {
        return this.out_db;
    }

    /**
     * set out_db value
     * @param out_db: new value
     */
    public void setOut_db(java.sql.Array out_db) {
        this.out_db = out_db;
    }

    /**
     * 
     * @return extent value
     */
    public piShape getExtent() {
        return this.extent;
    }

    /**
     * set extent value
     * @param extent: new value
     */
    public void setExtent(piShape extent) {
        this.extent = extent;
    }

    /**
     * 
     * @return spatial_index value
     */
    public boolean getSpatial_index() {
        return this.spatial_index;
    }

    /**
     * set spatial_index value
     * @param spatial_index: new value
     */
    public void setSpatial_index(boolean spatial_index) {
        this.spatial_index = spatial_index;
    }

}
