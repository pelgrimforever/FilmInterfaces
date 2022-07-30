/*
 * IView_publiccountryphotocountsearch.java
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
 * Search Interface for View_publiccountryphotocount table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_publiccountryphotocountsearch extends Tablesearcher {

	/**
	 * add String search values for field code, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void code(String[] values);
	
	/**
	 * add String search values for field code
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void code(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void name(String[] values);
	
	/**
	 * add String search values for field name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void name(String[] values, byte compare, byte andor);
	
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
