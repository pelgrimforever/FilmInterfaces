/*
 * Geometry_columnssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IGeometry_columnssearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.Geometry_columns;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Geometry_columns table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Geometry_columnssearch extends Tablesearch implements IGeometry_columnssearch {

    Stringsearch f_table_catalog = new Stringsearch("geometry_columns.f_table_catalog");
    Stringsearch f_table_schema = new Stringsearch("geometry_columns.f_table_schema");
    Stringsearch f_table_name = new Stringsearch("geometry_columns.f_table_name");
    Stringsearch f_geometry_column = new Stringsearch("geometry_columns.f_geometry_column");
    Numbersearch coord_dimension = new Numbersearch("geometry_columns.coord_dimension");
    Numbersearch srid = new Numbersearch("geometry_columns.srid");
    Stringsearch type = new Stringsearch("geometry_columns.type");

    /**
     * @return viewname
     */
    public String getTable() {
        return Geometry_columns.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Geometry_columnssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Geometry_columnssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(f_table_catalog);
        addFieldsearcher(f_table_schema);
        addFieldsearcher(f_table_name);
        addFieldsearcher(f_geometry_column);
        addFieldsearcher(coord_dimension);
        addFieldsearcher(srid);
        addFieldsearcher(type);
    }

    /**
     * add String search values for field f_table_catalog, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void f_table_catalog(String[] values) {
        addStringvalues(f_table_catalog, values);
    }
    
    /**
     * add String search values for field f_table_catalog
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void f_table_catalog(String[] values, byte compare, byte andor) {
        addStringvalues(f_table_catalog, values);
        f_table_catalog.setCompareoperator(compare);
        f_table_catalog.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field f_table_schema, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void f_table_schema(String[] values) {
        addStringvalues(f_table_schema, values);
    }
    
    /**
     * add String search values for field f_table_schema
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void f_table_schema(String[] values, byte compare, byte andor) {
        addStringvalues(f_table_schema, values);
        f_table_schema.setCompareoperator(compare);
        f_table_schema.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field f_table_name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void f_table_name(String[] values) {
        addStringvalues(f_table_name, values);
    }
    
    /**
     * add String search values for field f_table_name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void f_table_name(String[] values, byte compare, byte andor) {
        addStringvalues(f_table_name, values);
        f_table_name.setCompareoperator(compare);
        f_table_name.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field f_geometry_column, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void f_geometry_column(String[] values) {
        addStringvalues(f_geometry_column, values);
    }
    
    /**
     * add String search values for field f_geometry_column
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void f_geometry_column(String[] values, byte compare, byte andor) {
        addStringvalues(f_geometry_column, values);
        f_geometry_column.setCompareoperator(compare);
        f_geometry_column.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field coord_dimension, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void coord_dimension(Double[] values, byte[] operators) {
        addNumbervalues(coord_dimension, values, operators);
    }
    
    /**
     * add Numeric search values for field coord_dimension
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void coord_dimension(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(coord_dimension, values, operators);
        coord_dimension.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field srid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void srid(Double[] values, byte[] operators) {
        addNumbervalues(srid, values, operators);
    }
    
    /**
     * add Numeric search values for field srid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void srid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(srid, values, operators);
        srid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field type, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void type(String[] values) {
        addStringvalues(type, values);
    }
    
    /**
     * add String search values for field type
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void type(String[] values, byte compare, byte andor) {
        addStringvalues(type, values);
        type.setCompareoperator(compare);
        type.setAndoroperator(andor);
    }
    
}
