/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.entity.pk.*;
import film.interfaces.searchentity.*;

public interface IMenuitemsearch extends Tablesearcher {

    public void addPrimarykey(IMenuitemPK menuitemPK);

	public void menuitem(String[] values);
	
	public void menuitem(String[] values, byte compare, byte andor);
	
	public void tabpanel(String[] values);
	
	public void tabpanel(String[] values, byte compare, byte andor);
	
	public void editpanel(String[] values);
	
	public void editpanel(String[] values, byte compare, byte andor);
	
	public void servlet(String[] values);
	
	public void servlet(String[] values, byte compare, byte andor);
	
	public void menu(IMenusearch menusearch);
	
}
