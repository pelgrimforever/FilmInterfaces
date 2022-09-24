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
import film.interfaces.searchentity.*;

public interface IView_backupstatussearch extends Tablesearcher {

	public void id(String[] values);
	
	public void id(String[] values, byte compare, byte andor);
	
	public void photocount(Double[] values, byte[] operators);
	
	public void photocount(Double[] values, byte[] operators, byte andor);
	
	public void backupcount(Double[] values, byte[] operators);
	
	public void backupcount(Double[] values, byte[] operators, byte andor);
	
	public void imagebackupcount(Double[] values, byte[] operators);
	
	public void imagebackupcount(Double[] values, byte[] operators, byte andor);
	
}
