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

public interface ISubjectcatsearch extends Tablesearcher {

    public void addPrimarykey(ISubjectcatPK subjectcatPK);

	public void cat(String[] values);
	
	public void cat(String[] values, byte compare, byte andor);
	
	public void catno(Double[] values, byte[] operators);
	
	public void catno(Double[] values, byte[] operators, byte andor);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
    public void subjectCat1(ISubjectsearch subjectsearch);
    
    public void subjectCat2(ISubjectsearch subjectsearch);
    
}
