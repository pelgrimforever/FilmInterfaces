/*
 * IArt_photosearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
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
 * Search Interface for Art_photo table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IArt_photosearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param art_photoPK: Art_photo primery key
     */
    public void addPrimarykey(IArt_photoPK art_photoPK);

	/**
	 * add Boolean search values for field selection
	 * @param value: true or false
	 */
	public void selection(Boolean value);
	
	/**
	 * add Numeric search values for field width, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void width(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field width
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void width(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field height, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void height(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field height
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void height(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field comment, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void comment(String[] values);
	
	/**
	 * add String search values for field comment
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void comment(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field seqno, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void seqno(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field seqno
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void seqno(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field archive
	 * @param value: true or false
	 */
	public void archive(Boolean value);
	
	/**
	 * add Boolean search values for field surround
	 * @param value: true or false
	 */
	public void surround(Boolean value);
	
	/**
	 * add String search values for field surrounddir, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void surrounddir(String[] values);
	
	/**
	 * add String search values for field surrounddir
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void surrounddir(String[] values, byte compare, byte andor);
	
	/**
	* set subsearch photo tablesearch
	* @param photosearch: IPhotosearch
	*/
	public void photo(IPhotosearch photosearch);
	
	/**
	* set subsearch art_subgroup tablesearch
	* @param art_subgroupsearch: IArt_subgroupsearch
	*/
	public void art_subgroup(IArt_subgroupsearch art_subgroupsearch);
	
	/**
	* set subsearch art_academy tablesearch
	* @param art_academysearch: IArt_academysearch
	*/
	public void art_academy(IArt_academysearch art_academysearch);
	
	/**
	* set subsearch art_group tablesearch
	* @param art_groupsearch: IArt_groupsearch
	*/
	public void art_group(IArt_groupsearch art_groupsearch);
	
}
