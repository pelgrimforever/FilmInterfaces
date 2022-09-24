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

public interface ISubjectsearch extends Tablesearcher {

    public void addPrimarykey(ISubjectPK subjectPK);

	public void id(long[] values, byte[] operators);
	
	public void id(long[] values, byte[] operators, byte andor);
	
	public void subject(String[] values);
	
	public void subject(String[] values, byte compare, byte andor);
	
	public void description(String[] values);
	
	public void description(String[] values, byte compare, byte andor);
	
	public void subjectcatCat1(ISubjectcatsearch subjectcatsearch);
	
	public void tree7subject(ITree7subjectsearch tree7subjectsearch);
	
	public void subjectcatCat2(ISubjectcatsearch subjectcatsearch);
	
    public void filmsubjects(IFilmsubjectssearch filmsubjectssearch);
    
    public void relfilm(IFilmsearch filmsearch);
    
    public void photosubjects(IPhotosubjectssearch photosubjectssearch);
    
    public void relphoto(IPhotosearch photosearch);
    
}
