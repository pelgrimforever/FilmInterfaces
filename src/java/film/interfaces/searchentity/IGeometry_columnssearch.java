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

public interface IGeometry_columnssearch extends Tablesearcher {

	public void f_table_catalog(String[] values);
	
	public void f_table_catalog(String[] values, byte compare, byte andor);
	
	public void f_table_schema(String[] values);
	
	public void f_table_schema(String[] values, byte compare, byte andor);
	
	public void f_table_name(String[] values);
	
	public void f_table_name(String[] values, byte compare, byte andor);
	
	public void f_geometry_column(String[] values);
	
	public void f_geometry_column(String[] values, byte compare, byte andor);
	
	public void coord_dimension(Double[] values, byte[] operators);
	
	public void coord_dimension(Double[] values, byte[] operators, byte andor);
	
	public void srid(Double[] values, byte[] operators);
	
	public void srid(Double[] values, byte[] operators, byte andor);
	
	public void type(String[] values);
	
	public void type(String[] values, byte compare, byte andor);
	
}
