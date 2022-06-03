/*
 * IPhototree7subjectsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
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
 * Search Interface for Phototree7subject table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IPhototree7subjectsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param phototree7subjectPK: Phototree7subject primery key
     */
    public void addPrimarykey(IPhototree7subjectPK phototree7subjectPK);

	/**
   * foreign key
	 * set subsearch tree7subject tablesearch
	 * @param tree7subjectsearch: ITree7subjectsearch
	 */
	public void tree7subject(ITree7subjectsearch tree7subjectsearch);
	
	/**
   * foreign key
	 * set subsearch photo tablesearch
	 * @param photosearch: IPhotosearch
	 */
	public void photo(IPhotosearch photosearch);
	
}
