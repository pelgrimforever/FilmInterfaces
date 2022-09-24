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

public interface IFilmsearch extends Tablesearcher {

    public void addPrimarykey(IFilmPK filmPK);

	public void id(String[] values);
	
	public void id(String[] values, byte compare, byte andor);
	
	public void iso(String[] values);
	
	public void iso(String[] values, byte compare, byte andor);
	
	public void startdate(Date[] values, byte[] operators);
	
	public void startdate(Date[] values, byte[] operators, byte andor);
	
	public void enddate(Date[] values, byte[] operators);
	
	public void enddate(Date[] values, byte[] operators, byte andor);
	
	public void owner(String[] values);
	
	public void owner(String[] values, byte compare, byte andor);
	
	public void cd(String[] values);
	
	public void cd(String[] values, byte compare, byte andor);
	
	public void publicf_(Boolean value);
	
	public void backup(Boolean value);
	
	public void filmtype(IFilmtypesearch filmtypesearch);
	
    public void filmsubjects(IFilmsubjectssearch filmsubjectssearch);
    
    public void relsubject(ISubjectsearch subjectsearch);
    
    public void photo(IPhotosearch photosearch);
    
}
