/*
 * IUploadsessionsearch.java
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
 * Search Interface for Uploadsession table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IUploadsessionsearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param uploadsessionPK: Uploadsession primery key
     */
    public void addPrimarykey(IUploadsessionPK uploadsessionPK);

	/**
	 * add String search values for field filename, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void filename(String[] values);
	
	/**
	 * add String search values for field filename
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void filename(String[] values, byte compare, byte andor);
	
	/**
	 * add Boolean search values for field upload
	 * @param value: true or false
	 */
	public void upload(Boolean value);
	
	/**
	 * add Numeric search values for field rotation, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void rotation(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field rotation
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void rotation(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field filmgroupid, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void filmgroupid(String[] values);
	
	/**
	 * add String search values for field filmgroupid
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void filmgroupid(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field photosubjects, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void photosubjects(String[] values);
	
	/**
	 * add String search values for field photosubjects
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void photosubjects(String[] values, byte compare, byte andor);
	
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
	
	/**
	* set subsearch creator tablesearch
	* @param creatorsearch: ICreatorsearch
	*/
	public void creator(ICreatorsearch creatorsearch);
	
}
