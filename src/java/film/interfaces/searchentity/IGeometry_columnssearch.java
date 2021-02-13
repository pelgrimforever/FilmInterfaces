/*
 * IGeometry_columnssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.searchentity;

import data.interfaces.db.ITablesearch;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.searchentity.*;

/**
 * Search Interface for Geometry_columns table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IGeometry_columnssearch extends ITablesearch {

	/**
	 * add String search values for field f_table_catalog, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void f_table_catalog(String[] values);
	
	/**
	 * add String search values for field f_table_catalog
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void f_table_catalog(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field f_table_schema, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void f_table_schema(String[] values);
	
	/**
	 * add String search values for field f_table_schema
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void f_table_schema(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field f_table_name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void f_table_name(String[] values);
	
	/**
	 * add String search values for field f_table_name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void f_table_name(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field f_geometry_column, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void f_geometry_column(String[] values);
	
	/**
	 * add String search values for field f_geometry_column
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void f_geometry_column(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field coord_dimension, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void coord_dimension(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field coord_dimension
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void coord_dimension(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field srid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void srid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field srid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void srid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field type, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void type(String[] values);
	
	/**
	 * add String search values for field type
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void type(String[] values, byte compare, byte andor);
	
}
