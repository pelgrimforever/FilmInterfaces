/*
 * IMenusearch.java
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
 * Search Interface for Menu table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IMenusearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param menuPK: Menu primery key
     */
    public void addPrimarykey(IMenuPK menuPK);

	/**
	 * add String search values for field menu, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void menu(String[] values);
	
	/**
	 * add String search values for field menu
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void menu(String[] values, byte compare, byte andor);
	
	/**
	* set subsearch mainmenu tablesearch
	* @param mainmenusearch: IMainmenusearch
	*/
	public void mainmenu(IMainmenusearch mainmenusearch);
	
    /**
     * set subsearch menuitem tablesearch
     * @param menuitemsearch: IMenuitemsearch
     */
    public void menuitem(IMenuitemsearch menuitemsearch);
    
}
