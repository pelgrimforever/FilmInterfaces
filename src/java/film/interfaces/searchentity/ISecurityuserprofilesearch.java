/*
 * ISecurityuserprofilesearch.java
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
 * Search Interface for Securityuserprofile table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISecurityuserprofilesearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param securityuserprofilePK: Securityuserprofile primery key
     */
    public void addPrimarykey(ISecurityuserprofilePK securityuserprofilePK);

	/**
	 * add String search values for field siteusername, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void siteusername(String[] values);
	
	/**
	 * add String search values for field siteusername
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void siteusername(String[] values, byte compare, byte andor);
	
	/**
	* set subsearch securityprofile tablesearch
	* @param securityprofilesearch: ISecurityprofilesearch
	*/
	public void securityprofile(ISecurityprofilesearch securityprofilesearch);
	
}