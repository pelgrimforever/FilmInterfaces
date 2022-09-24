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

public interface ISpatial_ref_syssearch extends Tablesearcher {

    public void addPrimarykey(ISpatial_ref_sysPK spatial_ref_sysPK);

	public void srid(long[] values, byte[] operators);
	
	public void srid(long[] values, byte[] operators, byte andor);
	
	public void auth_name(String[] values);
	
	public void auth_name(String[] values, byte compare, byte andor);
	
	public void auth_srid(Double[] values, byte[] operators);
	
	public void auth_srid(Double[] values, byte[] operators, byte andor);
	
	public void srtext(String[] values);
	
	public void srtext(String[] values, byte compare, byte andor);
	
	public void proj4text(String[] values);
	
	public void proj4text(String[] values, byte compare, byte andor);
	
}
