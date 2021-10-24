/*
 * eGeometry_columns.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
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
 * View class Geometry_columns
 * 
 * Attributes: fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Geometry_columns Entity
 * 
 * @author Franky Laseure
 */
public class eGeometry_columns implements filmDatabaseproperties, EntityView {

    public static final String table = "geometry_columns";
    private java.lang.String f_table_catalog;
    private java.lang.String f_table_schema;
    private java.lang.String f_table_name;
    private java.lang.String f_geometry_column;
    private int coord_dimension;
    private int srid;
    private java.lang.String type;
	  
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eGeometry_columns.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eGeometry_columns.connectionpool;
    }
    
    /**
     * 
     * @return view name for Geometry_columns
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Geometry_columns class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Geometry_columns entity
     */
    public eGeometry_columns() {
    }

    /**
     * @return is Geometry_columns Empty ?
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 
     * @return f_table_catalog value
     */
    public java.lang.String getF_table_catalog() {
        return this.f_table_catalog;
    }

    /**
     * set f_table_catalog value
     * @param f_table_catalog: new value
     */
    public void setF_table_catalog(java.lang.String f_table_catalog) {
        this.f_table_catalog = f_table_catalog;
    }

    /**
     * 
     * @return f_table_schema value
     */
    public java.lang.String getF_table_schema() {
        return this.f_table_schema;
    }

    /**
     * set f_table_schema value
     * @param f_table_schema: new value
     */
    public void setF_table_schema(java.lang.String f_table_schema) {
        this.f_table_schema = f_table_schema;
    }

    /**
     * 
     * @return f_table_name value
     */
    public java.lang.String getF_table_name() {
        return this.f_table_name;
    }

    /**
     * set f_table_name value
     * @param f_table_name: new value
     */
    public void setF_table_name(java.lang.String f_table_name) {
        this.f_table_name = f_table_name;
    }

    /**
     * 
     * @return f_geometry_column value
     */
    public java.lang.String getF_geometry_column() {
        return this.f_geometry_column;
    }

    /**
     * set f_geometry_column value
     * @param f_geometry_column: new value
     */
    public void setF_geometry_column(java.lang.String f_geometry_column) {
        this.f_geometry_column = f_geometry_column;
    }

    /**
     * 
     * @return coord_dimension value
     */
    public int getCoord_dimension() {
        return this.coord_dimension;
    }

    /**
     * set coord_dimension value
     * @param coord_dimension: new value
     */
    public void setCoord_dimension(int coord_dimension) {
        this.coord_dimension = coord_dimension;
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
     * @return type value
     */
    public java.lang.String getType() {
        return this.type;
    }

    /**
     * set type value
     * @param type: new value
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

}
