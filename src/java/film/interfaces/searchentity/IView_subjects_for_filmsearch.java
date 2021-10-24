/*
 * IView_subjects_for_filmsearch.java
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
import film.interfaces.searchentity.*;

/**
 * Search Interface for View_subjects_for_film table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IView_subjects_for_filmsearch extends Tablesearcher {

	/**
	 * add String search values for field film, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void film(String[] values);
	
	/**
	 * add String search values for field film
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void film(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field cat1, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void cat1(String[] values);
	
	/**
	 * add String search values for field cat1
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void cat1(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field cat2, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void cat2(String[] values);
	
	/**
	 * add String search values for field cat2
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void cat2(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void id(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void id(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field subject, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void subject(String[] values);
	
	/**
	 * add String search values for field subject
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void subject(String[] values, byte compare, byte andor);
	
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
