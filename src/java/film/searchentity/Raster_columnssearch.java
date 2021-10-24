/*
 * Raster_columnssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IRaster_columnssearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.Raster_columns;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Raster_columns table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Raster_columnssearch extends Tablesearch implements IRaster_columnssearch {

    Stringsearch r_table_catalog = new Stringsearch("raster_columns.r_table_catalog");
    Stringsearch r_table_schema = new Stringsearch("raster_columns.r_table_schema");
    Stringsearch r_table_name = new Stringsearch("raster_columns.r_table_name");
    Stringsearch r_raster_column = new Stringsearch("raster_columns.r_raster_column");
    Numbersearch srid = new Numbersearch("raster_columns.srid");
    Numbersearch scale_x = new Numbersearch("raster_columns.scale_x");
    Numbersearch scale_y = new Numbersearch("raster_columns.scale_y");
    Numbersearch blocksize_x = new Numbersearch("raster_columns.blocksize_x");
    Numbersearch blocksize_y = new Numbersearch("raster_columns.blocksize_y");
    Booleansearch same_alignment = new Booleansearch("raster_columns.same_alignment");
    Booleansearch regular_blocking = new Booleansearch("raster_columns.regular_blocking");
    Numbersearch num_bands = new Numbersearch("raster_columns.num_bands");
    Stringsearch pixel_types = new Stringsearch("raster_columns.pixel_types");
    Stringsearch nodata_values = new Stringsearch("raster_columns.nodata_values");
    Stringsearch out_db = new Stringsearch("raster_columns.out_db");
    Stringsearch extent = new Stringsearch("raster_columns.extent");
    Booleansearch spatial_index = new Booleansearch("raster_columns.spatial_index");

    /**
     * @return viewname
     */
    public String getTable() {
        return Raster_columns.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Raster_columnssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Raster_columnssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(r_table_catalog);
        addFieldsearcher(r_table_schema);
        addFieldsearcher(r_table_name);
        addFieldsearcher(r_raster_column);
        addFieldsearcher(srid);
        addFieldsearcher(scale_x);
        addFieldsearcher(scale_y);
        addFieldsearcher(blocksize_x);
        addFieldsearcher(blocksize_y);
        addFieldsearcher(same_alignment);
        addFieldsearcher(regular_blocking);
        addFieldsearcher(num_bands);
        addFieldsearcher(pixel_types);
        addFieldsearcher(nodata_values);
        addFieldsearcher(out_db);
        addFieldsearcher(extent);
        addFieldsearcher(spatial_index);
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
     * add Numeric search values for field scale_x, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void scale_x(Double[] values, byte[] operators) {
        addNumbervalues(scale_x, values, operators);
    }
    
    /**
     * add Numeric search values for field scale_x
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void scale_x(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(scale_x, values, operators);
        scale_x.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field scale_y, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void scale_y(Double[] values, byte[] operators) {
        addNumbervalues(scale_y, values, operators);
    }
    
    /**
     * add Numeric search values for field scale_y
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void scale_y(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(scale_y, values, operators);
        scale_y.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field blocksize_x, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void blocksize_x(Double[] values, byte[] operators) {
        addNumbervalues(blocksize_x, values, operators);
    }
    
    /**
     * add Numeric search values for field blocksize_x
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void blocksize_x(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(blocksize_x, values, operators);
        blocksize_x.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field blocksize_y, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void blocksize_y(Double[] values, byte[] operators) {
        addNumbervalues(blocksize_y, values, operators);
    }
    
    /**
     * add Numeric search values for field blocksize_y
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void blocksize_y(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(blocksize_y, values, operators);
        blocksize_y.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field same_alignment
     * @param value: true or false
     */
    public void same_alignment(Boolean value) {
        addBooleanvalue(same_alignment, value);
    }
    
    /**
     * add Boolean search values for field regular_blocking
     * @param value: true or false
     */
    public void regular_blocking(Boolean value) {
        addBooleanvalue(regular_blocking, value);
    }
    
    /**
     * add Numeric search values for field num_bands, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void num_bands(Double[] values, byte[] operators) {
        addNumbervalues(num_bands, values, operators);
    }
    
    /**
     * add Numeric search values for field num_bands
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void num_bands(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(num_bands, values, operators);
        num_bands.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field pixel_types, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void pixel_types(String[] values) {
        addStringvalues(pixel_types, values);
    }
    
    /**
     * add String search values for field pixel_types
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void pixel_types(String[] values, byte compare, byte andor) {
        addStringvalues(pixel_types, values);
        pixel_types.setCompareoperator(compare);
        pixel_types.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field nodata_values, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void nodata_values(String[] values) {
        addStringvalues(nodata_values, values);
    }
    
    /**
     * add String search values for field nodata_values
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void nodata_values(String[] values, byte compare, byte andor) {
        addStringvalues(nodata_values, values);
        nodata_values.setCompareoperator(compare);
        nodata_values.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field out_db, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void out_db(String[] values) {
        addStringvalues(out_db, values);
    }
    
    /**
     * add String search values for field out_db
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void out_db(String[] values, byte compare, byte andor) {
        addStringvalues(out_db, values);
        out_db.setCompareoperator(compare);
        out_db.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field extent, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void extent(String[] values) {
        addStringvalues(extent, values);
    }
    
    /**
     * add String search values for field extent
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void extent(String[] values, byte compare, byte andor) {
        addStringvalues(extent, values);
        extent.setCompareoperator(compare);
        extent.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field spatial_index
     * @param value: true or false
     */
    public void spatial_index(Boolean value) {
        addBooleanvalue(spatial_index, value);
    }
    
}
