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

public interface ISecurityuserprofilesearch extends Tablesearcher {

    public void addPrimarykey(ISecurityuserprofilePK securityuserprofilePK);

	public void siteusername(String[] values);
	
	public void siteusername(String[] values, byte compare, byte andor);
	
	public void securityprofile(ISecurityprofilesearch securityprofilesearch);
	
}
