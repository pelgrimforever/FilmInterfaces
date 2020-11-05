/*
 * IArt_academysearch.java
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
 * Search Interface for Art_academy table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IArt_academysearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param art_academyPK: Art_academy primery key
     */
    public void addPrimarykey(IArt_academyPK art_academyPK);

	/**
	 * add Numeric search values for field academyid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void academyid(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field academyid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void academyid(long[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field academy, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void academy(String[] values);
	
	/**
	 * add String search values for field academy
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void academy(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field academylocation, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void academylocation(String[] values);
	
	/**
	 * add String search values for field academylocation
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void academylocation(String[] values, byte compare, byte andor);
	
}
