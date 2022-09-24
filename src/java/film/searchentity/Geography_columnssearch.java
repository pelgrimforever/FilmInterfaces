/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IGeography_columnssearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.Geography_columns;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Geography_columnssearch extends Tablesearch implements IGeography_columnssearch {

    Stringsearch f_table_catalog = new Stringsearch("geography_columns.f_table_catalog");
    Stringsearch f_table_schema = new Stringsearch("geography_columns.f_table_schema");
    Stringsearch f_table_name = new Stringsearch("geography_columns.f_table_name");
    Stringsearch f_geography_column = new Stringsearch("geography_columns.f_geography_column");
    Numbersearch coord_dimension = new Numbersearch("geography_columns.coord_dimension");
    Numbersearch srid = new Numbersearch("geography_columns.srid");
    Stringsearch type = new Stringsearch("geography_columns.type");

    public String getTable() {
        return Geography_columns.table;
    }

    public Geography_columnssearch() {
        setFieldsearchers();
    }

    public Geography_columnssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(f_table_catalog);
        addFieldsearcher(f_table_schema);
        addFieldsearcher(f_table_name);
        addFieldsearcher(f_geography_column);
        addFieldsearcher(coord_dimension);
        addFieldsearcher(srid);
        addFieldsearcher(type);
    }

    public void f_table_catalog(String[] values) {
        addStringvalues(f_table_catalog, values);
    }
    
    public void f_table_catalog(String[] values, byte compare, byte andor) {
        addStringvalues(f_table_catalog, values);
        f_table_catalog.setCompareoperator(compare);
        f_table_catalog.setAndoroperator(andor);
    }
    
    public void f_table_schema(String[] values) {
        addStringvalues(f_table_schema, values);
    }
    
    public void f_table_schema(String[] values, byte compare, byte andor) {
        addStringvalues(f_table_schema, values);
        f_table_schema.setCompareoperator(compare);
        f_table_schema.setAndoroperator(andor);
    }
    
    public void f_table_name(String[] values) {
        addStringvalues(f_table_name, values);
    }
    
    public void f_table_name(String[] values, byte compare, byte andor) {
        addStringvalues(f_table_name, values);
        f_table_name.setCompareoperator(compare);
        f_table_name.setAndoroperator(andor);
    }
    
    public void f_geography_column(String[] values) {
        addStringvalues(f_geography_column, values);
    }
    
    public void f_geography_column(String[] values, byte compare, byte andor) {
        addStringvalues(f_geography_column, values);
        f_geography_column.setCompareoperator(compare);
        f_geography_column.setAndoroperator(andor);
    }
    
    public void coord_dimension(Double[] values, byte[] operators) {
        addNumbervalues(coord_dimension, values, operators);
    }
    
    public void coord_dimension(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(coord_dimension, values, operators);
        coord_dimension.setAndoroperator(andor);
    }
    
    public void srid(Double[] values, byte[] operators) {
        addNumbervalues(srid, values, operators);
    }
    
    public void srid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(srid, values, operators);
        srid.setAndoroperator(andor);
    }
    
    public void type(String[] values) {
        addStringvalues(type, values);
    }
    
    public void type(String[] values, byte compare, byte andor) {
        addStringvalues(type, values);
        type.setCompareoperator(compare);
        type.setAndoroperator(andor);
    }
    
}
