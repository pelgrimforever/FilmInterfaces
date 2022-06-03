/*
 * IPhotosearch.java
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
 * Search Interface for Photo table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public interface IPhotosearch extends Tablesearcher {

    /**
     * add a primary key instance to search for
     * @param photoPK: Photo primery key
     */
    public void addPrimarykey(IPhotoPK photoPK);

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
	 * add String search values for field format, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void format(String[] values);
	
	/**
	 * add String search values for field format
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void format(String[] values, byte compare, byte andor);
	
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
	 * add Date search values for field photodate, default OR operator is used
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void photodate(Date[] values, byte[] operators);
	
	/**
	 * add Date search values for field photodate
	 * @param values: Array of date search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void photodate(Date[] values, byte[] operators, byte andor);
	
	/**
	 * add Time search values for field phototime, default OR operator is used
	 * @param values: Array of time search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void phototime(Time[] values, byte[] operators);
	
	/**
	 * add Time search values for field phototime
	 * @param values: Array of time search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void phototime(Time[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field public
	 * @param value: true or false
	 */
	public void publicf_(Boolean value);
	
	/**
	 * add Boolean search values for field composition
	 * @param value: true or false
	 */
	public void composition(Boolean value);
	
	/**
	 * add Numeric search values for field rotation, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void rotation(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field rotation
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void rotation(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add Boolean search values for field backup
	 * @param value: true or false
	 */
	public void backup(Boolean value);
	
	/**
	 * add Boolean search values for field imagebackup
	 * @param value: true or false
	 */
	public void imagebackup(Boolean value);
	
	/**
	 * add String search values for field location, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void location(String[] values);
	
	/**
	 * add String search values for field location
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void location(String[] values, byte compare, byte andor);
	
	/**
	 * add Boolean search values for field exactlocation
	 * @param value: true or false
	 */
	public void exactlocation(Boolean value);
	
	/**
	 * add Numeric search values for field locationradius, default OR operator is used
	 * @param values: Array of numeric search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 */
	public void locationradius(Double[] values, byte[] operators);
	
	/**
	 * add Numeric search values for field locationradius
	 * @param values: Array of String search values
	 * @param operators: Array of byte contants for comparison (= < <= > >=)
	 * @param andor; AND/OR constant
	 */
	public void locationradius(Double[] values, byte[] operators, byte andor);
	
	/**
	 * add String search values for field reversegeocode, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void reversegeocode(String[] values);
	
	/**
	 * add String search values for field reversegeocode
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void reversegeocode(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field streetnumber, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void streetnumber(String[] values);
	
	/**
	 * add String search values for field streetnumber
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void streetnumber(String[] values, byte compare, byte andor);
	
	/**
	 * add String search values for field formattedaddress, default OR and LIKE operators are used
	 * @param values: Array of String search values
	 */
	public void formattedaddress(String[] values);
	
	/**
	 * add String search values for field formattedaddress
	 * @param values: Array of String search values
	 * @param andor; AND/OR constant
	 * @param compare: EQUAL/LIKE constant
	 */
	public void formattedaddress(String[] values, byte compare, byte andor);
	
	/**
   * foreign key
	 * set subsearch route tablesearch
	 * @param routesearch: IRoutesearch
	 */
	public void route(IRoutesearch routesearch);
	
	/**
   * foreign key
	 * set subsearch creator tablesearch
	 * @param creatorsearch: ICreatorsearch
	 */
	public void creator(ICreatorsearch creatorsearch);
	
	/**
   * foreign key
	 * set subsearch film tablesearch
	 * @param filmsearch: IFilmsearch
	 */
	public void film(IFilmsearch filmsearch);
	
    /**
     * external foreign key - foreign key
     * set subsearch phototree7subject tablesearch
     * @param phototree7subjectsearch: IPhototree7subjectsearch
     */
    public void phototree7subject(IPhototree7subjectsearch phototree7subjectsearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch tree7subject tablesearch
     * @param tree7subjectsearch: ITree7subjectsearch
     */
    public void reltree7subject(ITree7subjectsearch tree7subjectsearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch art_photo tablesearch
     * @param art_photosearch: IArt_photosearch
     */
    public void art_photo(IArt_photosearch art_photosearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch photosubjects tablesearch
     * @param photosubjectssearch: IPhotosubjectssearch
     */
    public void photosubjects(IPhotosubjectssearch photosubjectssearch);
    
    /**
     * external foreign key - relational key
     * set relational subsearch subject tablesearch
     * @param subjectsearch: ISubjectsearch
     */
    public void relsubject(ISubjectsearch subjectsearch);
    
    /**
     * external foreign key - foreign key
     * set subsearch phototags tablesearch
     * @param phototagssearch: IPhototagssearch
     */
    public void phototags(IPhototagssearch phototagssearch);
    
}
