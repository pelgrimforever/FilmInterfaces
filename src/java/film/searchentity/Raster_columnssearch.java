/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

    public String getTable() {
        return Raster_columns.table;
    }

    public Raster_columnssearch() {
        setFieldsearchers();
    }

    public Raster_columnssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void r_table_catalog(String[] values) {
        addStringvalues(r_table_catalog, values);
    }
    
    public void r_table_catalog(String[] values, byte compare, byte andor) {
        addStringvalues(r_table_catalog, values);
        r_table_catalog.setCompareoperator(compare);
        r_table_catalog.setAndoroperator(andor);
    }
    
    public void r_table_schema(String[] values) {
        addStringvalues(r_table_schema, values);
    }
    
    public void r_table_schema(String[] values, byte compare, byte andor) {
        addStringvalues(r_table_schema, values);
        r_table_schema.setCompareoperator(compare);
        r_table_schema.setAndoroperator(andor);
    }
    
    public void r_table_name(String[] values) {
        addStringvalues(r_table_name, values);
    }
    
    public void r_table_name(String[] values, byte compare, byte andor) {
        addStringvalues(r_table_name, values);
        r_table_name.setCompareoperator(compare);
        r_table_name.setAndoroperator(andor);
    }
    
    public void r_raster_column(String[] values) {
        addStringvalues(r_raster_column, values);
    }
    
    public void r_raster_column(String[] values, byte compare, byte andor) {
        addStringvalues(r_raster_column, values);
        r_raster_column.setCompareoperator(compare);
        r_raster_column.setAndoroperator(andor);
    }
    
    public void srid(Double[] values, byte[] operators) {
        addNumbervalues(srid, values, operators);
    }
    
    public void srid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(srid, values, operators);
        srid.setAndoroperator(andor);
    }
    
    public void scale_x(Double[] values, byte[] operators) {
        addNumbervalues(scale_x, values, operators);
    }
    
    public void scale_x(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(scale_x, values, operators);
        scale_x.setAndoroperator(andor);
    }
    
    public void scale_y(Double[] values, byte[] operators) {
        addNumbervalues(scale_y, values, operators);
    }
    
    public void scale_y(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(scale_y, values, operators);
        scale_y.setAndoroperator(andor);
    }
    
    public void blocksize_x(Double[] values, byte[] operators) {
        addNumbervalues(blocksize_x, values, operators);
    }
    
    public void blocksize_x(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(blocksize_x, values, operators);
        blocksize_x.setAndoroperator(andor);
    }
    
    public void blocksize_y(Double[] values, byte[] operators) {
        addNumbervalues(blocksize_y, values, operators);
    }
    
    public void blocksize_y(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(blocksize_y, values, operators);
        blocksize_y.setAndoroperator(andor);
    }
    
    public void same_alignment(Boolean value) {
        addBooleanvalue(same_alignment, value);
    }
    
    public void regular_blocking(Boolean value) {
        addBooleanvalue(regular_blocking, value);
    }
    
    public void num_bands(Double[] values, byte[] operators) {
        addNumbervalues(num_bands, values, operators);
    }
    
    public void num_bands(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(num_bands, values, operators);
        num_bands.setAndoroperator(andor);
    }
    
    public void pixel_types(String[] values) {
        addStringvalues(pixel_types, values);
    }
    
    public void pixel_types(String[] values, byte compare, byte andor) {
        addStringvalues(pixel_types, values);
        pixel_types.setCompareoperator(compare);
        pixel_types.setAndoroperator(andor);
    }
    
    public void nodata_values(String[] values) {
        addStringvalues(nodata_values, values);
    }
    
    public void nodata_values(String[] values, byte compare, byte andor) {
        addStringvalues(nodata_values, values);
        nodata_values.setCompareoperator(compare);
        nodata_values.setAndoroperator(andor);
    }
    
    public void out_db(String[] values) {
        addStringvalues(out_db, values);
    }
    
    public void out_db(String[] values, byte compare, byte andor) {
        addStringvalues(out_db, values);
        out_db.setCompareoperator(compare);
        out_db.setAndoroperator(andor);
    }
    
    public void extent(String[] values) {
        addStringvalues(extent, values);
    }
    
    public void extent(String[] values, byte compare, byte andor) {
        addStringvalues(extent, values);
        extent.setCompareoperator(compare);
        extent.setAndoroperator(andor);
    }
    
    public void spatial_index(Boolean value) {
        addBooleanvalue(spatial_index, value);
    }
    
}
