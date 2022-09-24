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

public interface IView_publicphotolocationssearch extends Tablesearcher {

	public void location(String[] values);
	
	public void location(String[] values, byte compare, byte andor);
	
	public void exactlocation(Boolean value);
	
	public void locationradius(Double[] values, byte[] operators);
	
	public void locationradius(Double[] values, byte[] operators, byte andor);
	
	public void countrycode(String[] values);
	
	public void countrycode(String[] values, byte compare, byte andor);
	
	public void postalcode(String[] values);
	
	public void postalcode(String[] values, byte compare, byte andor);
	
	public void locality(String[] values);
	
	public void locality(String[] values, byte compare, byte andor);
	
	public void sublocality(String[] values);
	
	public void sublocality(String[] values, byte compare, byte andor);
	
	public void routecode(String[] values);
	
	public void routecode(String[] values, byte compare, byte andor);
	
	public void streetnumber(String[] values);
	
	public void streetnumber(String[] values, byte compare, byte andor);
	
	public void locationcount(Double[] values, byte[] operators);
	
	public void locationcount(Double[] values, byte[] operators, byte andor);
	
}
