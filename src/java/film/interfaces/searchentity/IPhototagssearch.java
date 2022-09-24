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

public interface IPhototagssearch extends Tablesearcher {

    public void addPrimarykey(IPhototagsPK phototagsPK);

	public void tag(String[] values);
	
	public void tag(String[] values, byte compare, byte andor);
	
	public void tagformat(String[] values);
	
	public void tagformat(String[] values, byte compare, byte andor);
	
	public void tagvalue(String[] values);
	
	public void tagvalue(String[] values, byte compare, byte andor);
	
	public void photo(IPhotosearch photosearch);
	
}
