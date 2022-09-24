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

public interface IView_photo_firstlastdatesearch extends Tablesearcher {

	public void minphotodate(Date[] values, byte[] operators);
	
	public void minphotodate(Date[] values, byte[] operators, byte andor);
	
	public void maxphotodate(Date[] values, byte[] operators);
	
	public void maxphotodate(Date[] values, byte[] operators, byte andor);
	
}
