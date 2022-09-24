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

public class eGeometry_columns implements filmDatabaseproperties, EntityView {

    public static final String table = "geometry_columns";
    private java.lang.String f_table_catalog;
    private java.lang.String f_table_schema;
    private java.lang.String f_table_name;
    private java.lang.String f_geometry_column;
    private int coord_dimension;
    private int srid;
    private java.lang.String type;
	  
    @Override
    public String getDbtool() {
        return eGeometry_columns.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eGeometry_columns.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eGeometry_columns() {
    }

    public boolean isEmpty() {
        return false;
    }

    public java.lang.String getF_table_catalog() {
        return this.f_table_catalog;
    }

    public void setF_table_catalog(java.lang.String f_table_catalog) {
        this.f_table_catalog = f_table_catalog;
    }

    public java.lang.String getF_table_schema() {
        return this.f_table_schema;
    }

    public void setF_table_schema(java.lang.String f_table_schema) {
        this.f_table_schema = f_table_schema;
    }

    public java.lang.String getF_table_name() {
        return this.f_table_name;
    }

    public void setF_table_name(java.lang.String f_table_name) {
        this.f_table_name = f_table_name;
    }

    public java.lang.String getF_geometry_column() {
        return this.f_geometry_column;
    }

    public void setF_geometry_column(java.lang.String f_geometry_column) {
        this.f_geometry_column = f_geometry_column;
    }

    public int getCoord_dimension() {
        return this.coord_dimension;
    }

    public void setCoord_dimension(int coord_dimension) {
        this.coord_dimension = coord_dimension;
    }

    public int getSrid() {
        return this.srid;
    }

    public void setSrid(int srid) {
        this.srid = srid;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

}
