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

public interface ITree7subjectsearch extends Tablesearcher {

    public void addPrimarykey(ITree7subjectPK tree7subjectPK);

	public void subjectid(long[] values, byte[] operators);
	
	public void subjectid(long[] values, byte[] operators, byte andor);
	
	public void tree7id(String[] values);
	
	public void tree7id(String[] values, byte compare, byte andor);
	
	public void subject(String[] values);
	
	public void subject(String[] values, byte compare, byte andor);
	
	public void treestep(Double[] values, byte[] operators);
	
	public void treestep(Double[] values, byte[] operators, byte andor);
	
	public void tree7subjectParentsubjectid(ITree7subjectsearch tree7subjectsearch);
	
    public void phototree7subject(IPhototree7subjectsearch phototree7subjectsearch);
    
    public void relphoto(IPhotosearch photosearch);
    
}
