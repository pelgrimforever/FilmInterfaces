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

public interface IMainmenusearch extends Tablesearcher {

    public void addPrimarykey(IMainmenuPK mainmenuPK);

	public void mainmenu(String[] values);
	
	public void mainmenu(String[] values, byte compare, byte andor);
	
	public void popuplabel(String[] values);
	
	public void popuplabel(String[] values, byte compare, byte andor);
	
	public void icon(String[] values);
	
	public void icon(String[] values, byte compare, byte andor);
	
    public void menu(IMenusearch menusearch);
    
}
