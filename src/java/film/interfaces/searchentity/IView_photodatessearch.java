/*
 * IView_photodatessearch.java
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
import film.interfaces.searchentity.*;

/**
 * Search Interface for View_photodates table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_photodatessearch extends Tablesearcher {

	/**
	 * add Date search values for field photodate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void photodate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field photodate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void photodate(Date[] values, byte[] operators, byte andor);
	
	/**
	 * add Numeric search values for field photos, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void photos(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field photos
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void photos(Double[] values, byte[] operators, byte andor);
	
}
