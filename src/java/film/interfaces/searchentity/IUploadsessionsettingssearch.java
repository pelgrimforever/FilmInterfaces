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

public interface IUploadsessionsettingssearch extends Tablesearcher {

    public void addPrimarykey(IUploadsessionsettingsPK uploadsessionsettingsPK);

	public void directory(String[] values);
	
	public void directory(String[] values, byte compare, byte andor);
	
	public void uploadtype(String[] values);
	
	public void uploadtype(String[] values, byte compare, byte andor);
	
	public void filmgroups(String[] values);
	
	public void filmgroups(String[] values, byte compare, byte andor);
	
	public void lastposition(Double[] values, byte[] operators);
	
	public void lastposition(Double[] values, byte[] operators, byte andor);
	
	public void copymode(String[] values);
	
	public void copymode(String[] values, byte compare, byte andor);
	
	public void uploadingposition(Double[] values, byte[] operators);
	
	public void uploadingposition(Double[] values, byte[] operators, byte andor);
	
}
