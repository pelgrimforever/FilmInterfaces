/*
 * IFilmsubjectssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.interfaces.searchentity;

import data.interfaces.db.Tablesearcher;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import film.interfaces.entity.pk.*;
import film.interfaces.searchentity.*;

/**
 * Search Interface for Filmsubjects table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IFilmsubjectssearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param filmsubjectsPK: Filmsubjects primery key
     */
    public void addPrimarykey(IFilmsubjectsPK filmsubjectsPK);

	/**
	* set subsearch subject tablesearch
	* @param subjectsearch: ISubjectsearch
	*/
	public void subject(ISubjectsearch subjectsearch);
	
	/**
	* set subsearch film tablesearch
	* @param filmsearch: IFilmsearch
	*/
	public void film(IFilmsearch filmsearch);
	
}
