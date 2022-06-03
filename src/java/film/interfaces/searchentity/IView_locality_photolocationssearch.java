/*
 * IView_locality_photolocationssearch.java
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
 * Search Interface for View_locality_photolocations table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_locality_photolocationssearch extends Tablesearcher {

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
	
}
