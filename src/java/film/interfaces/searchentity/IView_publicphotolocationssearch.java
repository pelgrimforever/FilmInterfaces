/*
 * IView_publicphotolocationssearch.java
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
 * Search Interface for View_publicphotolocations table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_publicphotolocationssearch extends Tablesearcher {

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
	 * add Boolean search values for field exactlocation
	 * @param value: true or false
	 */
	public void exactlocation(Boolean value);
	
	/**
	 * add Numeric search values for field locationradius, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void locationradius(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field locationradius
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void locationradius(Double[] values, byte[] operators, byte andor);
	
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
	 * add String search values for field postalcode, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void postalcode(String[] values);
	
	/**
	 * add String search values for field postalcode
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void postalcode(String[] values, byte compare, byte andor);
	
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
	 * add String search values for field sublocality, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void sublocality(String[] values);
	
	/**
	 * add String search values for field sublocality
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void sublocality(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field routecode, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void routecode(String[] values);
	
	/**
	 * add String search values for field routecode
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void routecode(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field streetnumber, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void streetnumber(String[] values);
	
	/**
	 * add String search values for field streetnumber
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void streetnumber(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field locationcount, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void locationcount(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field locationcount
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void locationcount(Double[] values, byte[] operators, byte andor);
	
}
