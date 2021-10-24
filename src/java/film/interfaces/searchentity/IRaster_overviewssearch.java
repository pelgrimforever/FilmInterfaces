/*
 * IRaster_overviewssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.searchentity.*;

/**
 * Search Interface for Raster_overviews table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRaster_overviewssearch extends Tablesearcher {

	/**
	 * add String search values for field o_table_catalog, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void o_table_catalog(String[] values);
	
	/**
	 * add String search values for field o_table_catalog
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void o_table_catalog(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field o_table_schema, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void o_table_schema(String[] values);
	
	/**
	 * add String search values for field o_table_schema
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void o_table_schema(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field o_table_name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void o_table_name(String[] values);
	
	/**
	 * add String search values for field o_table_name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void o_table_name(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field o_raster_column, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void o_raster_column(String[] values);
	
	/**
	 * add String search values for field o_raster_column
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void o_raster_column(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field r_table_catalog, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void r_table_catalog(String[] values);
	
	/**
	 * add String search values for field r_table_catalog
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void r_table_catalog(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field r_table_schema, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void r_table_schema(String[] values);
	
	/**
	 * add String search values for field r_table_schema
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void r_table_schema(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field r_table_name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void r_table_name(String[] values);
	
	/**
	 * add String search values for field r_table_name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void r_table_name(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field r_raster_column, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void r_raster_column(String[] values);
	
	/**
	 * add String search values for field r_raster_column
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void r_raster_column(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field overview_factor, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void overview_factor(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field overview_factor
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void overview_factor(Double[] values, byte[] operators, byte andor);
	
}
