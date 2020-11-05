/*
 * IView_locationtreesearch.java
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
 * Search Interface for View_locationtree table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_locationtreesearch extends ITablesearch {

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
	 * add String search values for field countryname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void countryname(String[] values);
	
	/**
	 * add String search values for field countryname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void countryname(String[] values, byte compare, byte andor);
	
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
	 * add String search values for field al1code, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void al1code(String[] values);
	
	/**
	 * add String search values for field al1code
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void al1code(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field al1name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void al1name(String[] values);
	
	/**
	 * add String search values for field al1name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void al1name(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field al2code, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void al2code(String[] values);
	
	/**
	 * add String search values for field al2code
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void al2code(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field al2name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void al2name(String[] values);
	
	/**
	 * add String search values for field al2name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void al2name(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field al3code, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void al3code(String[] values);
	
	/**
	 * add String search values for field al3code
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void al3code(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field al3name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void al3name(String[] values);
	
	/**
	 * add String search values for field al3name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void al3name(String[] values, byte compare, byte andor);
	
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
	 * add Boolean search values for field hassublocality
	 * @param value: true or false
	 */
	public void hassublocality(Boolean value);
	
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
	 * add String search values for field routename, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void routename(String[] values);
	
	/**
	 * add String search values for field routename
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void routename(String[] values, byte compare, byte andor);
	
}
