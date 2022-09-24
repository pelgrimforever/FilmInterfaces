/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

public class Geometry_columnssearch extends Tablesearch implements IGeometry_columnssearch {

    Stringsearch f_table_catalog = new Stringsearch("geometry_columns.f_table_catalog");
    Stringsearch f_table_schema = new Stringsearch("geometry_columns.f_table_schema");
    Stringsearch f_table_name = new Stringsearch("geometry_columns.f_table_name");
    Stringsearch f_geometry_column = new Stringsearch("geometry_columns.f_geometry_column");
    Numbersearch coord_dimension = new Numbersearch("geometry_columns.coord_dimension");
    Numbersearch srid = new Numbersearch("geometry_columns.srid");
    Stringsearch type = new Stringsearch("geometry_columns.type");

    public String getTable() {
        return Geometry_columns.table;
    }

    public Geometry_columnssearch() {
        setFieldsearchers();
    }

    public Geometry_columnssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(f_table_catalog);
        addFieldsearcher(f_table_schema);
        addFieldsearcher(f_table_name);
        addFieldsearcher(f_geometry_column);
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
    
    public void f_geometry_column(String[] values) {
        addStringvalues(f_geometry_column, values);
    }
    
    public void f_geometry_column(String[] values, byte compare, byte andor) {
        addStringvalues(f_geometry_column, values);
        f_geometry_column.setCompareoperator(compare);
        f_geometry_column.setAndoroperator(andor);
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
