/*
 * IView_localityphotocountsearch.java
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
 * Search Interface for View_localityphotocount table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_localityphotocountsearch extends Tablesearcher {

	/**
	 * add String search values for field countrycode, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void countrycode(String[] values);
	
	/**
	 * add String search values for field countrycode
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void countrycode(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field locality, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void locality(String[] values);
	
	/**
	 * add String search values for field locality
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void locality(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field location, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void location(String[] values);
	
	/**
	 * add String search values for field location
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void location(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field photocount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void photocount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field photocount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void photocount(Double[] values, byte[] operators, byte andor);
	
}
