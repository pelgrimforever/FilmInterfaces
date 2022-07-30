/*
 * IPostalcodesearch.java
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
import film.interfaces.entity.pk.*;
import film.interfaces.searchentity.*;

/**
 * Search Interface for Postalcode table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IPostalcodesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param postalcodePK: Postalcode primery key
     */
    public void addPrimarykey(IPostalcodePK postalcodePK);

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
	 * set subsearch arealevel3 tablesearch
	 * @param arealevel3search: IArealevel3search
	 */
	public void arealevel3(IArealevel3search arealevel3search);
	
    /**
     * external foreign key - foreign key
     * set subsearch locality tablesearch
     * @param localitysearch: ILocalitysearch
     */
    public void locality(ILocalitysearch localitysearch);
    
}
