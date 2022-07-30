/*
 * IArt_groupsearch.java
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
 * Search Interface for Art_group table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IArt_groupsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param art_groupPK: Art_group primery key
     */
    public void addPrimarykey(IArt_groupPK art_groupPK);

	/**
	 * add Numeric search values for field groupid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void groupid(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field groupid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void groupid(long[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field groupname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void groupname(String[] values);
	
	/**
	 * add String search values for field groupname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void groupname(String[] values, byte compare, byte andor);
	
}
