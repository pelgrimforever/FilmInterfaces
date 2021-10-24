/*
 * IRaster_overviews.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
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
 * View Interface IRaster_overviews
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IRaster_overviews extends View {

    public static byte O_TABLE_CATALOG = 1;
    public static byte O_TABLE_SCHEMA = 2;
    public static byte O_TABLE_NAME = 3;
    public static byte O_RASTER_COLUMN = 4;
    public static byte R_TABLE_CATALOG = 5;
    public static byte R_TABLE_SCHEMA = 6;
    public static byte R_TABLE_NAME = 7;
    public static byte R_RASTER_COLUMN = 8;
    public static byte OVERVIEW_FACTOR = 9;

    public static final int SIZE_O_TABLE_CATALOG = 2147483647;
    public static final int SIZE_O_TABLE_SCHEMA = 2147483647;
    public static final int SIZE_O_TABLE_NAME = 2147483647;
    public static final int SIZE_O_RASTER_COLUMN = 2147483647;
    public static final int SIZE_R_TABLE_CATALOG = 2147483647;
    public static final int SIZE_R_TABLE_SCHEMA = 2147483647;
    public static final int SIZE_R_TABLE_NAME = 2147483647;
    public static final int SIZE_R_RASTER_COLUMN = 2147483647;
    public static final int SIZE_OVERVIEW_FACTOR = 10;
    public static final String[] fieldnames = { "o_table_catalog", "o_table_schema", "o_table_name", "o_raster_column", "r_table_catalog", "r_table_schema", "r_table_name", "r_raster_column", "overview_factor" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return o_table_catalog value
     */
    public java.lang.String getO_table_catalog();

    /**
     * 
     * @return o_table_schema value
     */
    public java.lang.String getO_table_schema();

    /**
     * 
     * @return o_table_name value
     */
    public java.lang.String getO_table_name();

    /**
     * 
     * @return o_raster_column value
     */
    public java.lang.String getO_raster_column();

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
     * @return overview_factor value
     */
    public int getOverview_factor();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
