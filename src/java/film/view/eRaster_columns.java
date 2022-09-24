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
	  
    @Override
    public String getDbtool() {
        return eRaster_columns.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eRaster_columns.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eRaster_columns() {
    }

    public boolean isEmpty() {
        return false;
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

    public int getSrid() {
        return this.srid;
    }

    public void setSrid(int srid) {
        this.srid = srid;
    }

    public double getScale_x() {
        return this.scale_x;
    }

    public void setScale_x(double scale_x) {
        this.scale_x = scale_x;
    }

    public double getScale_y() {
        return this.scale_y;
    }

    public void setScale_y(double scale_y) {
        this.scale_y = scale_y;
    }

    public int getBlocksize_x() {
        return this.blocksize_x;
    }

    public void setBlocksize_x(int blocksize_x) {
        this.blocksize_x = blocksize_x;
    }

    public int getBlocksize_y() {
        return this.blocksize_y;
    }

    public void setBlocksize_y(int blocksize_y) {
        this.blocksize_y = blocksize_y;
    }

    public boolean getSame_alignment() {
        return this.same_alignment;
    }

    public void setSame_alignment(boolean same_alignment) {
        this.same_alignment = same_alignment;
    }

    public boolean getRegular_blocking() {
        return this.regular_blocking;
    }

    public void setRegular_blocking(boolean regular_blocking) {
        this.regular_blocking = regular_blocking;
    }

    public int getNum_bands() {
        return this.num_bands;
    }

    public void setNum_bands(int num_bands) {
        this.num_bands = num_bands;
    }

    public java.sql.Array getPixel_types() {
        return this.pixel_types;
    }

    public void setPixel_types(java.sql.Array pixel_types) {
        this.pixel_types = pixel_types;
    }

    public java.sql.Array getNodata_values() {
        return this.nodata_values;
    }

    public void setNodata_values(java.sql.Array nodata_values) {
        this.nodata_values = nodata_values;
    }

    public java.sql.Array getOut_db() {
        return this.out_db;
    }

    public void setOut_db(java.sql.Array out_db) {
        this.out_db = out_db;
    }

    public piShape getExtent() {
        return this.extent;
    }

    public void setExtent(piShape extent) {
        this.extent = extent;
    }

    public boolean getSpatial_index() {
        return this.spatial_index;
    }

    public void setSpatial_index(boolean spatial_index) {
        this.spatial_index = spatial_index;
    }

}
