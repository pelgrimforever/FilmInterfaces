/*
 * IFilmtypesearch.java
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
 * Search Interface for Filmtype table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IFilmtypesearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param filmtypePK: Filmtype primery key
     */
    public void addPrimarykey(IFilmtypePK filmtypePK);

	/**
	 * add String search values for field type, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void type(String[] values);
	
	/**
	 * add String search values for field type
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void type(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field description, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void description(String[] values);
	
	/**
	 * add String search values for field description
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void description(String[] values, byte compare, byte andor);
	
}
