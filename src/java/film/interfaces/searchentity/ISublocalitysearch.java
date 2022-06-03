/*
 * ISublocalitysearch.java
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
import film.interfaces.entity.pk.*;
import film.interfaces.searchentity.*;

/**
 * Search Interface for Sublocality table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISublocalitysearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param sublocalityPK: Sublocality primery key
     */
    public void addPrimarykey(ISublocalityPK sublocalityPK);

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
   * foreign key
	 * set subsearch locality tablesearch
	 * @param localitysearch: ILocalitysearch
	 */
	public void locality(ILocalitysearch localitysearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch route tablesearch
     * @param routesearch: IRoutesearch
     */
    public void route(IRoutesearch routesearch);
    
}
