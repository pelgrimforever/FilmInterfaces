/*
 * IView_photo_firstlastdatesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.searchentity;

import data.interfaces.db.ITablesearch;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.searchentity.*;

/**
 * Search Interface for View_photo_firstlastdate table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_photo_firstlastdatesearch extends ITablesearch {

	/**
	 * add Date search values for field minphotodate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void minphotodate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field minphotodate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void minphotodate(Date[] values, byte[] operators, byte andor);
	
	/**
	 * add Date search values for field maxphotodate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void maxphotodate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field maxphotodate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void maxphotodate(Date[] values, byte[] operators, byte andor);
	
}
