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

public interface IRaster_overviewssearch extends Tablesearcher {

	public void o_table_catalog(String[] values);
	
	public void o_table_catalog(String[] values, byte compare, byte andor);
	
	public void o_table_schema(String[] values);
	
	public void o_table_schema(String[] values, byte compare, byte andor);
	
	public void o_table_name(String[] values);
	
	public void o_table_name(String[] values, byte compare, byte andor);
	
	public void o_raster_column(String[] values);
	
	public void o_raster_column(String[] values, byte compare, byte andor);
	
	public void r_table_catalog(String[] values);
	
	public void r_table_catalog(String[] values, byte compare, byte andor);
	
	public void r_table_schema(String[] values);
	
	public void r_table_schema(String[] values, byte compare, byte andor);
	
	public void r_table_name(String[] values);
	
	public void r_table_name(String[] values, byte compare, byte andor);
	
	public void r_raster_column(String[] values);
	
	public void r_raster_column(String[] values, byte compare, byte andor);
	
	public void overview_factor(Double[] values, byte[] operators);
	
	public void overview_factor(Double[] values, byte[] operators, byte andor);
	
}
