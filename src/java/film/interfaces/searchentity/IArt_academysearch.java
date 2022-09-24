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

public interface IArt_academysearch extends Tablesearcher {

    public void addPrimarykey(IArt_academyPK art_academyPK);

	public void academyid(long[] values, byte[] operators);
	
	public void academyid(long[] values, byte[] operators, byte andor);
	
	public void academy(String[] values);
	
	public void academy(String[] values, byte compare, byte andor);
	
	public void academylocation(String[] values);
	
	public void academylocation(String[] values, byte compare, byte andor);
	
}
