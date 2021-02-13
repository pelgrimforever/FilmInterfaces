/*
 * ISecurityprofilesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
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
 * Search Interface for Securityprofile table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISecurityprofilesearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param securityprofilePK: Securityprofile primery key
     */
    public void addPrimarykey(ISecurityprofilePK securityprofilePK);

	/**
	 * add String search values for field userprofile, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void userprofile(String[] values);
	
	/**
	 * add String search values for field userprofile
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void userprofile(String[] values, byte compare, byte andor);
	
	/**
	 * add Boolean search values for field privateaccess
	 * @param value: true or false
	 */
	public void privateaccess(Boolean value);
	
    /**
     * set subsearch securityuserprofile tablesearch
     * @param securityuserprofilesearch: ISecurityuserprofilesearch
     */
    public void securityuserprofile(ISecurityuserprofilesearch securityuserprofilesearch);
    
}
