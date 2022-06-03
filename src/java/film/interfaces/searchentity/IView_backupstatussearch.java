/*
 * IView_backupstatussearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.searchentity.*;

/**
 * Search Interface for View_backupstatus table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_backupstatussearch extends Tablesearcher {

	/**
	 * add String search values for field id, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void id(String[] values);
	
	/**
	 * add String search values for field id
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void id(String[] values, byte compare, byte andor);
	
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
	
	/**
	 * add Numeric search values for field backupcount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void backupcount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field backupcount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void backupcount(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field imagebackupcount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void imagebackupcount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field imagebackupcount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void imagebackupcount(Double[] values, byte[] operators, byte andor);
	
}
