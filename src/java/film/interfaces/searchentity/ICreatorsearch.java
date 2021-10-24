/*
 * ICreatorsearch.java
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
 * Search Interface for Creator table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ICreatorsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param creatorPK: Creator primery key
     */
    public void addPrimarykey(ICreatorPK creatorPK);

	/**
	 * add String search values for field creatorid, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void creatorid(String[] values);
	
	/**
	 * add String search values for field creatorid
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void creatorid(String[] values, byte compare, byte andor);
	
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
	 * add String search values for field surname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void surname(String[] values);
	
	/**
	 * add String search values for field surname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void surname(String[] values, byte compare, byte andor);
	
}
