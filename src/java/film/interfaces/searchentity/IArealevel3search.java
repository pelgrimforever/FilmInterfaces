/*
 * IArealevel3search.java
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
 * Search Interface for Arealevel3 table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IArealevel3search extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param arealevel3PK: Arealevel3 primery key
     */
    public void addPrimarykey(IArealevel3PK arealevel3PK);

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
   * foreign key
	 * set subsearch arealevel2 tablesearch
	 * @param arealevel2search: IArealevel2search
	 */
	public void arealevel2(IArealevel2search arealevel2search);
	
}
