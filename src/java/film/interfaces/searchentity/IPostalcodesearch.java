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

public interface IPostalcodesearch extends Tablesearcher {

    public void addPrimarykey(IPostalcodePK postalcodePK);

	public void countrycode(String[] values);
	
	public void countrycode(String[] values, byte compare, byte andor);
	
	public void postalcode(String[] values);
	
	public void postalcode(String[] values, byte compare, byte andor);
	
	public void location(String[] values);
	
	public void location(String[] values, byte compare, byte andor);
	
	public void bounds(String[] values);
	
	public void bounds(String[] values, byte compare, byte andor);
	
	public void viewport(String[] values);
	
	public void viewport(String[] values, byte compare, byte andor);
	
	public void approximate(Boolean value);
	
	public void arealevel3(IArealevel3search arealevel3search);
	
    public void locality(ILocalitysearch localitysearch);
    
}
