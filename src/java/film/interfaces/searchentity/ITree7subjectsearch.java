/*
 * ITree7subjectsearch.java
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
 * Search Interface for Tree7subject table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ITree7subjectsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param tree7subjectPK: Tree7subject primery key
     */
    public void addPrimarykey(ITree7subjectPK tree7subjectPK);

	/**
	 * add Numeric search values for field subjectid, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void subjectid(long[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field subjectid
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void subjectid(long[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field tree7id, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void tree7id(String[] values);
	
	/**
	 * add String search values for field tree7id
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void tree7id(String[] values, byte compare, byte andor);
	
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
	 * add Numeric search values for field treestep, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void treestep(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field treestep
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void treestep(Double[] values, byte[] operators, byte andor);
	
	/**
   * foreign key
	 * set subsearch tree7subjectParentsubjectid tablesearch
	 * @param tree7subjectsearch: ITree7subjectsearch
	 */
	public void tree7subjectParentsubjectid(ITree7subjectsearch tree7subjectsearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch phototree7subject tablesearch
     * @param phototree7subjectsearch: IPhototree7subjectsearch
     */
    public void phototree7subject(IPhototree7subjectsearch phototree7subjectsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch photo tablesearch
     * @param photosearch: IPhotosearch
     */
    public void relphoto(IPhotosearch photosearch);
    
}
