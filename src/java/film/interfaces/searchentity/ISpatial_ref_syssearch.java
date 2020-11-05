/*
 * ISpatial_ref_syssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.searchentity;

import data.interfaces.db.ITablesearch;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.entity.pk.*;
import film.interfaces.searchentity.*;

/**
 * Search Interface for Spatial_ref_sys table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISpatial_ref_syssearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param spatial_ref_sysPK: Spatial_ref_sys primery key
     */
    public void addPrimarykey(ISpatial_ref_sysPK spatial_ref_sysPK);

	/**
	 * add Numeric search values for field srid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void srid(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field srid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void srid(long[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field auth_name, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void auth_name(String[] values);
	
	/**
	 * add String search values for field auth_name
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void auth_name(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field auth_srid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void auth_srid(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field auth_srid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void auth_srid(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field srtext, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void srtext(String[] values);
	
	/**
	 * add String search values for field srtext
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void srtext(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field proj4text, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void proj4text(String[] values);
	
	/**
	 * add String search values for field proj4text
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void proj4text(String[] values, byte compare, byte andor);
	
}
