/*
 * IRaster_columnssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.searchentity.*;

/**
 * Search Interface for Raster_columns table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRaster_columnssearch extends Tablesearcher {

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
	 * add Numeric search values for field scale_x, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void scale_x(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field scale_x
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void scale_x(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field scale_y, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void scale_y(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field scale_y
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void scale_y(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field blocksize_x, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void blocksize_x(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field blocksize_x
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void blocksize_x(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field blocksize_y, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void blocksize_y(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field blocksize_y
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void blocksize_y(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field same_alignment
	 * @param value: true or false
	 */
	public void same_alignment(Boolean value);
	
	/**
	 * add Boolean search values for field regular_blocking
	 * @param value: true or false
	 */
	public void regular_blocking(Boolean value);
	
	/**
	 * add Numeric search values for field num_bands, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void num_bands(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field num_bands
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void num_bands(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field pixel_types, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void pixel_types(String[] values);
	
	/**
	 * add String search values for field pixel_types
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void pixel_types(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field nodata_values, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void nodata_values(String[] values);
	
	/**
	 * add String search values for field nodata_values
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void nodata_values(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field out_db, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void out_db(String[] values);
	
	/**
	 * add String search values for field out_db
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void out_db(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field extent, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void extent(String[] values);
	
	/**
	 * add String search values for field extent
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void extent(String[] values, byte compare, byte andor);
	
	/**
	 * add Boolean search values for field spatial_index
	 * @param value: true or false
	 */
	public void spatial_index(Boolean value);
	
}
