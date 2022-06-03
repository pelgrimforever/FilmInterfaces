/*
 * Raster_overviewssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IRaster_overviewssearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.Raster_overviews;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Raster_overviews table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Raster_overviewssearch extends Tablesearch implements IRaster_overviewssearch {

    Stringsearch o_table_catalog = new Stringsearch("raster_overviews.o_table_catalog");
    Stringsearch o_table_schema = new Stringsearch("raster_overviews.o_table_schema");
    Stringsearch o_table_name = new Stringsearch("raster_overviews.o_table_name");
    Stringsearch o_raster_column = new Stringsearch("raster_overviews.o_raster_column");
    Stringsearch r_table_catalog = new Stringsearch("raster_overviews.r_table_catalog");
    Stringsearch r_table_schema = new Stringsearch("raster_overviews.r_table_schema");
    Stringsearch r_table_name = new Stringsearch("raster_overviews.r_table_name");
    Stringsearch r_raster_column = new Stringsearch("raster_overviews.r_raster_column");
    Numbersearch overview_factor = new Numbersearch("raster_overviews.overview_factor");

    /**
     * @return viewname
     */
    public String getTable() {
        return Raster_overviews.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Raster_overviewssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Raster_overviewssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(o_table_catalog);
        addFieldsearcher(o_table_schema);
        addFieldsearcher(o_table_name);
        addFieldsearcher(o_raster_column);
        addFieldsearcher(r_table_catalog);
        addFieldsearcher(r_table_schema);
        addFieldsearcher(r_table_name);
        addFieldsearcher(r_raster_column);
        addFieldsearcher(overview_factor);
    }

    /**
     * add String search values for field o_table_catalog, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void o_table_catalog(String[] values) {
        addStringvalues(o_table_catalog, values);
    }
    
    /**
     * add String search values for field o_table_catalog
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void o_table_catalog(String[] values, byte compare, byte andor) {
        addStringvalues(o_table_catalog, values);
        o_table_catalog.setCompareoperator(compare);
        o_table_catalog.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field o_table_schema, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void o_table_schema(String[] values) {
        addStringvalues(o_table_schema, values);
    }
    
    /**
     * add String search values for field o_table_schema
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void o_table_schema(String[] values, byte compare, byte andor) {
        addStringvalues(o_table_schema, values);
        o_table_schema.setCompareoperator(compare);
        o_table_schema.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field o_table_name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void o_table_name(String[] values) {
        addStringvalues(o_table_name, values);
    }
    
    /**
     * add String search values for field o_table_name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void o_table_name(String[] values, byte compare, byte andor) {
        addStringvalues(o_table_name, values);
        o_table_name.setCompareoperator(compare);
        o_table_name.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field o_raster_column, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void o_raster_column(String[] values) {
        addStringvalues(o_raster_column, values);
    }
    
    /**
     * add String search values for field o_raster_column
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void o_raster_column(String[] values, byte compare, byte andor) {
        addStringvalues(o_raster_column, values);
        o_raster_column.setCompareoperator(compare);
        o_raster_column.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field r_table_catalog, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void r_table_catalog(String[] values) {
        addStringvalues(r_table_catalog, values);
    }
    
    /**
     * add String search values for field r_table_catalog
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void r_table_catalog(String[] values, byte compare, byte andor) {
        addStringvalues(r_table_catalog, values);
        r_table_catalog.setCompareoperator(compare);
        r_table_catalog.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field r_table_schema, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void r_table_schema(String[] values) {
        addStringvalues(r_table_schema, values);
    }
    
    /**
     * add String search values for field r_table_schema
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void r_table_schema(String[] values, byte compare, byte andor) {
        addStringvalues(r_table_schema, values);
        r_table_schema.setCompareoperator(compare);
        r_table_schema.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field r_table_name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void r_table_name(String[] values) {
        addStringvalues(r_table_name, values);
    }
    
    /**
     * add String search values for field r_table_name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void r_table_name(String[] values, byte compare, byte andor) {
        addStringvalues(r_table_name, values);
        r_table_name.setCompareoperator(compare);
        r_table_name.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field r_raster_column, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void r_raster_column(String[] values) {
        addStringvalues(r_raster_column, values);
    }
    
    /**
     * add String search values for field r_raster_column
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void r_raster_column(String[] values, byte compare, byte andor) {
        addStringvalues(r_raster_column, values);
        r_raster_column.setCompareoperator(compare);
        r_raster_column.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field overview_factor, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void overview_factor(Double[] values, byte[] operators) {
        addNumbervalues(overview_factor, values, operators);
    }
    
    /**
     * add Numeric search values for field overview_factor
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void overview_factor(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(overview_factor, values, operators);
        overview_factor.setAndoroperator(andor);
    }
    
}
