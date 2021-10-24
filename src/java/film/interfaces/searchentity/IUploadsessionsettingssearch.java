/*
 * IUploadsessionsettingssearch.java
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
 * Search Interface for Uploadsessionsettings table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IUploadsessionsettingssearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param uploadsessionsettingsPK: Uploadsessionsettings primery key
     */
    public void addPrimarykey(IUploadsessionsettingsPK uploadsessionsettingsPK);

	/**
	 * add String search values for field directory, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void directory(String[] values);
	
	/**
	 * add String search values for field directory
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void directory(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field uploadtype, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void uploadtype(String[] values);
	
	/**
	 * add String search values for field uploadtype
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void uploadtype(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field filmgroups, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void filmgroups(String[] values);
	
	/**
	 * add String search values for field filmgroups
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void filmgroups(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field lastposition, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void lastposition(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field lastposition
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void lastposition(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field copymode, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void copymode(String[] values);
	
	/**
	 * add String search values for field copymode
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void copymode(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field uploadingposition, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void uploadingposition(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field uploadingposition
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void uploadingposition(Double[] values, byte[] operators, byte andor);
	
}
