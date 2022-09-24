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

public interface IArt_subgroupsearch extends Tablesearcher {

    public void addPrimarykey(IArt_subgroupPK art_subgroupPK);

	public void subgroupid(long[] values, byte[] operators);
	
	public void subgroupid(long[] values, byte[] operators, byte andor);
	
	public void subgroupname(String[] values);
	
	public void subgroupname(String[] values, byte compare, byte andor);
	
	public void lastseqno(Double[] values, byte[] operators);
	
	public void lastseqno(Double[] values, byte[] operators, byte andor);
	
	public void art_group(IArt_groupsearch art_groupsearch);
	
}
