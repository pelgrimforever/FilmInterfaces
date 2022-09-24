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

public interface IRaster_columnssearch extends Tablesearcher {

	public void r_table_catalog(String[] values);
	
	public void r_table_catalog(String[] values, byte compare, byte andor);
	
	public void r_table_schema(String[] values);
	
	public void r_table_schema(String[] values, byte compare, byte andor);
	
	public void r_table_name(String[] values);
	
	public void r_table_name(String[] values, byte compare, byte andor);
	
	public void r_raster_column(String[] values);
	
	public void r_raster_column(String[] values, byte compare, byte andor);
	
	public void srid(Double[] values, byte[] operators);
	
	public void srid(Double[] values, byte[] operators, byte andor);
	
	public void scale_x(Double[] values, byte[] operators);
	
	public void scale_x(Double[] values, byte[] operators, byte andor);
	
	public void scale_y(Double[] values, byte[] operators);
	
	public void scale_y(Double[] values, byte[] operators, byte andor);
	
	public void blocksize_x(Double[] values, byte[] operators);
	
	public void blocksize_x(Double[] values, byte[] operators, byte andor);
	
	public void blocksize_y(Double[] values, byte[] operators);
	
	public void blocksize_y(Double[] values, byte[] operators, byte andor);
	
	public void same_alignment(Boolean value);
	
	public void regular_blocking(Boolean value);
	
	public void num_bands(Double[] values, byte[] operators);
	
	public void num_bands(Double[] values, byte[] operators, byte andor);
	
	public void pixel_types(String[] values);
	
	public void pixel_types(String[] values, byte compare, byte andor);
	
	public void nodata_values(String[] values);
	
	public void nodata_values(String[] values, byte compare, byte andor);
	
	public void out_db(String[] values);
	
	public void out_db(String[] values, byte compare, byte andor);
	
	public void extent(String[] values);
	
	public void extent(String[] values, byte compare, byte andor);
	
	public void spatial_index(Boolean value);
	
}
