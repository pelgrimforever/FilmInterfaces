/*
 * ISubjectsearch.java
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
 * Search Interface for Subject table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISubjectsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param subjectPK: Subject primery key
     */
    public void addPrimarykey(ISubjectPK subjectPK);

	/**
	 * add Numeric search values for field id, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void id(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field id
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void id(long[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field subject, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void subject(String[] values);
	
	/**
	 * add String search values for field subject
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void subject(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field description, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void description(String[] values);
	
	/**
	 * add String search values for field description
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void description(String[] values, byte compare, byte andor);
	
	/**
   * foreign key
	 * set subsearch subjectcatCat1 tablesearch
	 * @param subjectcatsearch: ISubjectcatsearch
	 */
	public void subjectcatCat1(ISubjectcatsearch subjectcatsearch);
	
	/**
   * foreign key
	 * set subsearch tree7subject tablesearch
	 * @param tree7subjectsearch: ITree7subjectsearch
	 */
	public void tree7subject(ITree7subjectsearch tree7subjectsearch);
	
	/**
   * foreign key
	 * set subsearch subjectcatCat2 tablesearch
	 * @param subjectcatsearch: ISubjectcatsearch
	 */
	public void subjectcatCat2(ISubjectcatsearch subjectcatsearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch filmsubjects tablesearch
     * @param filmsubjectssearch: IFilmsubjectssearch
     */
    public void filmsubjects(IFilmsubjectssearch filmsubjectssearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch film tablesearch
     * @param filmsearch: IFilmsearch
     */
    public void relfilm(IFilmsearch filmsearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch photosubjects tablesearch
     * @param photosubjectssearch: IPhotosubjectssearch
     */
    public void photosubjects(IPhotosubjectssearch photosubjectssearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch photo tablesearch
     * @param photosearch: IPhotosearch
     */
    public void relphoto(IPhotosearch photosearch);
    
}
