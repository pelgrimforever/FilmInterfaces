/*
 * IMainmenusearch.java
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
 * Search Interface for Mainmenu table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IMainmenusearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param mainmenuPK: Mainmenu primery key
     */
    public void addPrimarykey(IMainmenuPK mainmenuPK);

	/**
	 * add String search values for field mainmenu, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void mainmenu(String[] values);
	
	/**
	 * add String search values for field mainmenu
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void mainmenu(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field popuplabel, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void popuplabel(String[] values);
	
	/**
	 * add String search values for field popuplabel
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void popuplabel(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field icon, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void icon(String[] values);
	
	/**
	 * add String search values for field icon
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void icon(String[] values, byte compare, byte andor);
	
    /**
     * set subsearch menu tablesearch
     * @param menusearch: IMenusearch
     */
    public void menu(IMenusearch menusearch);
    
}
