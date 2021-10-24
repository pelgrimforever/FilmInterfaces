/*
 * ILocalitysearch.java
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
import film.interfaces.entity.pk.*;
import film.interfaces.searchentity.*;

/**
 * Search Interface for Locality table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ILocalitysearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param localityPK: Locality primery key
     */
    public void addPrimarykey(ILocalityPK localityPK);

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
	 * add Boolean search values for field hassublocality
	 * @param value: true or false
	 */
	public void hassublocality(Boolean value);
	
	/**
	* set subsearch postalcode tablesearch
	* @param postalcodesearch: IPostalcodesearch
	*/
	public void postalcode(IPostalcodesearch postalcodesearch);
	
    /**
     * set subsearch sublocality tablesearch
     * @param sublocalitysearch: ISublocalitysearch
     */
    public void sublocality(ISublocalitysearch sublocalitysearch);
    
}
