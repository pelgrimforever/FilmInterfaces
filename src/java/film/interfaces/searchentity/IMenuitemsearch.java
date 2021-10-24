/*
 * IMenuitemsearch.java
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
 * Search Interface for Menuitem table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IMenuitemsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param menuitemPK: Menuitem primery key
     */
    public void addPrimarykey(IMenuitemPK menuitemPK);

	/**
	 * add String search values for field menuitem, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void menuitem(String[] values);
	
	/**
	 * add String search values for field menuitem
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void menuitem(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field tabpanel, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void tabpanel(String[] values);
	
	/**
	 * add String search values for field tabpanel
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void tabpanel(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field editpanel, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void editpanel(String[] values);
	
	/**
	 * add String search values for field editpanel
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void editpanel(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field servlet, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void servlet(String[] values);
	
	/**
	 * add String search values for field servlet
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void servlet(String[] values, byte compare, byte andor);
	
	/**
	* set subsearch menu tablesearch
	* @param menusearch: IMenusearch
	*/
	public void menu(IMenusearch menusearch);
	
}
