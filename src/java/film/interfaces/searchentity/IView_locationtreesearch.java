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

public interface IView_locationtreesearch extends Tablesearcher {

	public void countrycode(String[] values);
	
	public void countrycode(String[] values, byte compare, byte andor);
	
	public void countryname(String[] values);
	
	public void countryname(String[] values, byte compare, byte andor);
	
	public void postalcode(String[] values);
	
	public void postalcode(String[] values, byte compare, byte andor);
	
	public void al1code(String[] values);
	
	public void al1code(String[] values, byte compare, byte andor);
	
	public void al1name(String[] values);
	
	public void al1name(String[] values, byte compare, byte andor);
	
	public void al2code(String[] values);
	
	public void al2code(String[] values, byte compare, byte andor);
	
	public void al2name(String[] values);
	
	public void al2name(String[] values, byte compare, byte andor);
	
	public void al3code(String[] values);
	
	public void al3code(String[] values, byte compare, byte andor);
	
	public void al3name(String[] values);
	
	public void al3name(String[] values, byte compare, byte andor);
	
	public void locality(String[] values);
	
	public void locality(String[] values, byte compare, byte andor);
	
	public void hassublocality(Boolean value);
	
	public void sublocality(String[] values);
	
	public void sublocality(String[] values, byte compare, byte andor);
	
	public void routecode(String[] values);
	
	public void routecode(String[] values, byte compare, byte andor);
	
	public void routename(String[] values);
	
	public void routename(String[] values, byte compare, byte andor);
	
}
