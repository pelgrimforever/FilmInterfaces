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

public interface IArt_groupsearch extends Tablesearcher {

    public void addPrimarykey(IArt_groupPK art_groupPK);

	public void groupid(long[] values, byte[] operators);
	
	public void groupid(long[] values, byte[] operators, byte andor);
	
	public void groupname(String[] values);
	
	public void groupname(String[] values, byte compare, byte andor);
	
}
