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

public interface IPhotosubjectssearch extends Tablesearcher {

    public void addPrimarykey(IPhotosubjectsPK photosubjectsPK);

	public void photo(IPhotosearch photosearch);
	
	public void subject(ISubjectsearch subjectsearch);
	
}
