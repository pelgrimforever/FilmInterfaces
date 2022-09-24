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

public interface IView_locality_photolocationssearch extends Tablesearcher {

	public void countrycode(String[] values);
	
	public void countrycode(String[] values, byte compare, byte andor);
	
	public void locality(String[] values);
	
	public void locality(String[] values, byte compare, byte andor);
	
	public void location(String[] values);
	
	public void location(String[] values, byte compare, byte andor);
	
}
