/*
 * IFilmsearch.java
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
 * Search Interface for Film table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IFilmsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param filmPK: Film primery key
     */
    public void addPrimarykey(IFilmPK filmPK);

	/**
	 * add String search values for field id, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void id(String[] values);
	
	/**
	 * add String search values for field id
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void id(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field iso, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void iso(String[] values);
	
	/**
	 * add String search values for field iso
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void iso(String[] values, byte compare, byte andor);
	
	/**
	 * add Date search values for field startdate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void startdate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field startdate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void startdate(Date[] values, byte[] operators, byte andor);
	
	/**
	 * add Date search values for field enddate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void enddate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field enddate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void enddate(Date[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field owner, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void owner(String[] values);
	
	/**
	 * add String search values for field owner
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void owner(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field cd, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void cd(String[] values);
	
	/**
	 * add String search values for field cd
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void cd(String[] values, byte compare, byte andor);
	
	/**
	 * add Boolean search values for field public
	 * @param value: true or false
	 */
	public void publicf_(Boolean value);
	
	/**
	 * add Boolean search values for field backup
	 * @param value: true or false
	 */
	public void backup(Boolean value);
	
	/**
	* set subsearch filmtype tablesearch
	* @param filmtypesearch: IFilmtypesearch
	*/
	public void filmtype(IFilmtypesearch filmtypesearch);
	
    /**
     * set subsearch filmsubjects tablesearch
     * @param filmsubjectssearch: IFilmsubjectssearch
     */
    public void filmsubjects(IFilmsubjectssearch filmsubjectssearch);
    
    /**
     * set relational subsearch subject tablesearch
     * @param subjectsearch: ISubjectsearch
     */
    public void subject(ISubjectsearch subjectsearch);
    
    /**
     * set subsearch photo tablesearch
     * @param photosearch: IPhotosearch
     */
    public void photo(IPhotosearch photosearch);
    
}
