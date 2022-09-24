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

public interface IView_publiccountryphotocountsearch extends Tablesearcher {

	public void code(String[] values);
	
	public void code(String[] values, byte compare, byte andor);
	
	public void name(String[] values);
	
	public void name(String[] values, byte compare, byte andor);
	
	public void photocount(Double[] values, byte[] operators);
	
	public void photocount(Double[] values, byte[] operators, byte andor);
	
}
