/*
 * IRoutesearch.java
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
import film.interfaces.entity.pk.*;
import film.interfaces.searchentity.*;

/**
 * Search Interface for Route table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IRoutesearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param routePK: Route primery key
     */
    public void addPrimarykey(IRoutePK routePK);

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
	 * add String search values for field bounds, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void bounds(String[] values);
	
	/**
	 * add String search values for field bounds
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void bounds(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field viewport, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void viewport(String[] values);
	
	/**
	 * add String search values for field viewport
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void viewport(String[] values, byte compare, byte andor);
	
	/**
	 * add Boolean search values for field approximate
	 * @param value: true or false
	 */
	public void approximate(Boolean value);
	
	/**
	* set subsearch sublocality tablesearch
	* @param sublocalitysearch: ISublocalitysearch
	*/
	public void sublocality(ISublocalitysearch sublocalitysearch);
	
}
