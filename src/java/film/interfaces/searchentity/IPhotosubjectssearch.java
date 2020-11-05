/*
 * IPhotosubjectssearch.java
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
 * Search Interface for Photosubjects table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IPhotosubjectssearch extends ITablesearch {

    /**
     * add a primary key instance to search for
     * @param photosubjectsPK: Photosubjects primery key
     */
    public void addPrimarykey(IPhotosubjectsPK photosubjectsPK);

	/**
	* set subsearch photo tablesearch
	* @param photosearch: IPhotosearch
	*/
	public void photo(IPhotosearch photosearch);
	
	/**
	* set subsearch subject tablesearch
	* @param subjectsearch: ISubjectsearch
	*/
	public void subject(ISubjectsearch subjectsearch);
	
}
