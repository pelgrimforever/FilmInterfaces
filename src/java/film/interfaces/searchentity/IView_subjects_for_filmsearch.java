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

public interface IView_subjects_for_filmsearch extends Tablesearcher {

	public void film(String[] values);
	
	public void film(String[] values, byte compare, byte andor);
	
	public void cat1(String[] values);
	
	public void cat1(String[] values, byte compare, byte andor);
	
	public void cat2(String[] values);
	
	public void cat2(String[] values, byte compare, byte andor);
	
	public void id(Double[] values, byte[] operators);
	
	public void id(Double[] values, byte[] operators, byte andor);
	
	public void subject(String[] values);
	
	public void subject(String[] values, byte compare, byte andor);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
}
