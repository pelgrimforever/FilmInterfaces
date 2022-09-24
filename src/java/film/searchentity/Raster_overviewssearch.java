/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

    public String getTable() {
        return Raster_overviews.table;
    }

    public Raster_overviewssearch() {
        setFieldsearchers();
    }

    public Raster_overviewssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void o_table_catalog(String[] values) {
        addStringvalues(o_table_catalog, values);
    }
    
    public void o_table_catalog(String[] values, byte compare, byte andor) {
        addStringvalues(o_table_catalog, values);
        o_table_catalog.setCompareoperator(compare);
        o_table_catalog.setAndoroperator(andor);
    }
    
    public void o_table_schema(String[] values) {
        addStringvalues(o_table_schema, values);
    }
    
    public void o_table_schema(String[] values, byte compare, byte andor) {
        addStringvalues(o_table_schema, values);
        o_table_schema.setCompareoperator(compare);
        o_table_schema.setAndoroperator(andor);
    }
    
    public void o_table_name(String[] values) {
        addStringvalues(o_table_name, values);
    }
    
    public void o_table_name(String[] values, byte compare, byte andor) {
        addStringvalues(o_table_name, values);
        o_table_name.setCompareoperator(compare);
        o_table_name.setAndoroperator(andor);
    }
    
    public void o_raster_column(String[] values) {
        addStringvalues(o_raster_column, values);
    }
    
    public void o_raster_column(String[] values, byte compare, byte andor) {
        addStringvalues(o_raster_column, values);
        o_raster_column.setCompareoperator(compare);
        o_raster_column.setAndoroperator(andor);
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
    
    public void overview_factor(Double[] values, byte[] operators) {
        addNumbervalues(overview_factor, values, operators);
    }
    
    public void overview_factor(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(overview_factor, values, operators);
        overview_factor.setAndoroperator(andor);
    }
    
}
