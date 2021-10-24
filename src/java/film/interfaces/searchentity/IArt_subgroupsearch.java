/*
 * IArt_subgroupsearch.java
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
 * Search Interface for Art_subgroup table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IArt_subgroupsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param art_subgroupPK: Art_subgroup primery key
     */
    public void addPrimarykey(IArt_subgroupPK art_subgroupPK);

	/**
	 * add Numeric search values for field subgroupid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void subgroupid(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field subgroupid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void subgroupid(long[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field subgroupname, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void subgroupname(String[] values);
	
	/**
	 * add String search values for field subgroupname
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void subgroupname(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field lastseqno, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void lastseqno(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field lastseqno
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void lastseqno(Double[] values, byte[] operators, byte andor);
	
	/**
	* set subsearch art_group tablesearch
	* @param art_groupsearch: IArt_groupsearch
	*/
	public void art_group(IArt_groupsearch art_groupsearch);
	
}
