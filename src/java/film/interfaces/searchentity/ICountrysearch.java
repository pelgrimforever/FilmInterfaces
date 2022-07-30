/*
 * ICountrysearch.java
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
 * Search Interface for Country table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ICountrysearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param countryPK: Country primery key
     */
    public void addPrimarykey(ICountryPK countryPK);

	/**
	 * add String search values for field code, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void code(String[] values);
	
	/**
	 * add String search values for field code
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void code(String[] values, byte compare, byte andor);
	
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
	 * add Boolean search values for field hasarealevel1
	 * @param value: true or false
	 */
	public void hasarealevel1(Boolean value);
	
	/**
	 * add Boolean search values for field hasarealevel2
	 * @param value: true or false
	 */
	public void hasarealevel2(Boolean value);
	
	/**
	 * add Boolean search values for field hasarealevel3
	 * @param value: true or false
	 */
	public void hasarealevel3(Boolean value);
	
    /**
     * external foreign key - foreign key
     * set subsearch arealevel1 tablesearch
     * @param arealevel1search: IArealevel1search
     */
    public void arealevel1(IArealevel1search arealevel1search);
    
}
