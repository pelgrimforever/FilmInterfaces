/*
 * IRaster_columns.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.logicview;

import data.gis.shape.*;
import data.interfaces.db.View;
import data.interfaces.db.LogicEntity;
import data.interfaces.db.Filedata;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * View Interface IRaster_columns
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IRaster_columns extends View {

    public static byte R_TABLE_CATALOG = 1;
    public static byte R_TABLE_SCHEMA = 2;
    public static byte R_TABLE_NAME = 3;
    public static byte R_RASTER_COLUMN = 4;
    public static byte SRID = 5;
    public static byte SCALE_X = 6;
    public static byte SCALE_Y = 7;
    public static byte BLOCKSIZE_X = 8;
    public static byte BLOCKSIZE_Y = 9;
    public static byte SAME_ALIGNMENT = 10;
    public static byte REGULAR_BLOCKING = 11;
    public static byte NUM_BANDS = 12;
    public static byte PIXEL_TYPES = 13;
    public static byte NODATA_VALUES = 14;
    public static byte OUT_DB = 15;
    public static byte EXTENT = 16;
    public static byte SPATIAL_INDEX = 17;

    public static final int SIZE_R_TABLE_CATALOG = 2147483647;
    public static final int SIZE_R_TABLE_SCHEMA = 2147483647;
    public static final int SIZE_R_TABLE_NAME = 2147483647;
    public static final int SIZE_R_RASTER_COLUMN = 2147483647;
    public static final int SIZE_SRID = 10;
    public static final int SIZE_SCALE_X = 17;
    public static final int SIZE_SCALE_Y = 17;
    public static final int SIZE_BLOCKSIZE_X = 10;
    public static final int SIZE_BLOCKSIZE_Y = 10;
    public static final int SIZE_SAME_ALIGNMENT = 1;
    public static final int SIZE_REGULAR_BLOCKING = 1;
    public static final int SIZE_NUM_BANDS = 10;
    public static final int SIZE_PIXEL_TYPES = 2147483647;
    public static final int SIZE_NODATA_VALUES = 17;
    public static final int SIZE_OUT_DB = 1;
    public static final int SIZE_EXTENT = 2147483647;
    public static final int SIZE_SPATIAL_INDEX = 1;
    public static final String[] fieldnames = { "r_table_catalog", "r_table_schema", "r_table_name", "r_raster_column", "srid", "scale_x", "scale_y", "blocksize_x", "blocksize_y", "same_alignment", "regular_blocking", "num_bands", "pixel_types", "nodata_values", "out_db", "extent", "spatial_index" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return r_table_catalog value
     */
    public java.lang.String getR_table_catalog();

    /**
     * 
     * @return r_table_schema value
     */
    public java.lang.String getR_table_schema();

    /**
     * 
     * @return r_table_name value
     */
    public java.lang.String getR_table_name();

    /**
     * 
     * @return r_raster_column value
     */
    public java.lang.String getR_raster_column();

    /**
     * 
     * @return srid value
     */
    public int getSrid();

    /**
     * 
     * @return scale_x value
     */
    public double getScale_x();

    /**
     * 
     * @return scale_y value
     */
    public double getScale_y();

    /**
     * 
     * @return blocksize_x value
     */
    public int getBlocksize_x();

    /**
     * 
     * @return blocksize_y value
     */
    public int getBlocksize_y();

    /**
     * 
     * @return same_alignment value
     */
    public boolean getSame_alignment();

    /**
     * 
     * @return regular_blocking value
     */
    public boolean getRegular_blocking();

    /**
     * 
     * @return num_bands value
     */
    public int getNum_bands();

    /**
     * 
     * @return pixel_types value
     */
    public java.sql.Array getPixel_types();

    /**
     * 
     * @return nodata_values value
     */
    public java.sql.Array getNodata_values();

    /**
     * 
     * @return out_db value
     */
    public java.sql.Array getOut_db();

    /**
     * 
     * @return extent value
     */
    public piShape getExtent();

    /**
     * 
     * @return spatial_index value
     */
    public boolean getSpatial_index();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
