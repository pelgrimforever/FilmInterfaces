/*
 * IGeometry_columns.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
 * View Interface IGeometry_columns
 *
 * extended attributes and methods possibility:
 * view level programming is done here
 *
 * @author Franky Laseure
 */
public interface IGeometry_columns extends View {

    public static byte F_TABLE_CATALOG = 1;
    public static byte F_TABLE_SCHEMA = 2;
    public static byte F_TABLE_NAME = 3;
    public static byte F_GEOMETRY_COLUMN = 4;
    public static byte COORD_DIMENSION = 5;
    public static byte SRID = 6;
    public static byte TYPE = 7;

    public static final int SIZE_F_TABLE_CATALOG = 256;
    public static final int SIZE_F_TABLE_SCHEMA = 2147483647;
    public static final int SIZE_F_TABLE_NAME = 2147483647;
    public static final int SIZE_F_GEOMETRY_COLUMN = 2147483647;
    public static final int SIZE_COORD_DIMENSION = 10;
    public static final int SIZE_SRID = 10;
    public static final int SIZE_TYPE = 30;
    public static final String[] fieldnames = { "f_table_catalog", "f_table_schema", "f_table_name", "f_geometry_column", "coord_dimension", "srid", "type" };

//Custom code, do not change this line
//Put custom variables here
//Custom code, do not change this line

    /**
     * 
     * @return f_table_catalog value
     */
    public java.lang.String getF_table_catalog();

    /**
     * 
     * @return f_table_schema value
     */
    public java.lang.String getF_table_schema();

    /**
     * 
     * @return f_table_name value
     */
    public java.lang.String getF_table_name();

    /**
     * 
     * @return f_geometry_column value
     */
    public java.lang.String getF_geometry_column();

    /**
     * 
     * @return coord_dimension value
     */
    public int getCoord_dimension();

    /**
     * 
     * @return srid value
     */
    public int getSrid();

    /**
     * 
     * @return type value
     */
    public java.lang.String getType();

    
//Custom code, do not change this line
//Put custom functions here

//Custom code, do not change this line
}
