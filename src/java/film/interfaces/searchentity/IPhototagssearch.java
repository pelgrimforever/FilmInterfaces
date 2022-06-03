/*
 * IPhototagssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
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
 * Search Interface for Phototags table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IPhototagssearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param phototagsPK: Phototags primery key
     */
    public void addPrimarykey(IPhototagsPK phototagsPK);

	/**
	 * add String search values for field tag, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void tag(String[] values);
	
	/**
	 * add String search values for field tag
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void tag(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field tagformat, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void tagformat(String[] values);
	
	/**
	 * add String search values for field tagformat
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void tagformat(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field tagvalue, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void tagvalue(String[] values);
	
	/**
	 * add String search values for field tagvalue
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void tagvalue(String[] values, byte compare, byte andor);
	
	/**
   * foreign key
	 * set subsearch photo tablesearch
	 * @param photosearch: IPhotosearch
	 */
	public void photo(IPhotosearch photosearch);
	
}
