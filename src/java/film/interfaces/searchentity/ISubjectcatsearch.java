/*
 * ISubjectcatsearch.java
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
 * Search Interface for Subjectcat table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface ISubjectcatsearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param subjectcatPK: Subjectcat primery key
     */
    public void addPrimarykey(ISubjectcatPK subjectcatPK);

	/**
	 * add String search values for field cat, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void cat(String[] values);
	
	/**
	 * add String search values for field cat
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void cat(String[] values, byte compare, byte andor);
	
	/**
	 * add Numeric search values for field catno, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void catno(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field catno
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void catno(Double[] values, byte[] operators, byte andor);
	
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
     * external foreign key - foreign key
     * set subsearch subject tablesearch
     * @param subjectsearch: ISubjectsearch
     */
    public void subjectCat1(ISubjectsearch subjectsearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch subject tablesearch
     * @param subjectsearch: ISubjectsearch
     */
    public void subjectCat2(ISubjectsearch subjectsearch);
    
}
