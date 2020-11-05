/*
 * IBLsublocality.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ISublocality;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Sublocality
 * 
 * methods for manipulating data- and database objects
 * for Entity Sublocality and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsublocality extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Sublocality()
     * @return new empty ISublocality object
     */
    public ISublocality newSublocality();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Sublocality(primarykey fields)
     * @return new ISublocality object with initialized primary key
     */
    public ISublocality newSublocality(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Sublocality(ISublocalityPK sublocalityPK)
     * @param sublocalityPK: primary key
     * @return new ISublocality object with initialized primary key
     */
    public ISublocality newSublocality(ISublocalityPK sublocalityPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SublocalityPK()
     * @return new empty ISublocalityPK object
     */
    public ISublocalityPK newSublocalityPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SublocalityPK(primarykey fields)
     * @return new ISublocalityPK object with initialized primary key
     */
    public ISublocalityPK newSublocalityPK(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality, java.lang.String sublocality);

    /**
     * 
     * @return all Sublocality objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Sublocality objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSublocalitys() throws CustomException;

    /**
     * 
     * @param sublocalityPK: Sublocality primary key
     * @return Sublocality Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ISublocality getSublocality(ISublocalityPK sublocalityPK) throws CustomException;

    /**
     * Search sublocality in database for sublocalityPK:
     * @param sublocalityPK: Sublocality Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSublocalityExists(ISublocalityPK sublocalityPK) throws DBException;

    /**
     * try to insert Sublocality object in database
     * commit transaction
     * @param sublocality: Sublocality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertSublocality(ISublocality sublocality) throws CustomException, DataException;

    /**
     * check if Sublocality exists
     * insert if not, update if found
     * do not commit transaction
     * @param sublocality: Sublocality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateSublocality(ISublocality sublocality) throws CustomException, DataException;

    /**
     * try to update Sublocality object in database
     * commit transaction
     * @param sublocality: Sublocality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateSublocality(ISublocality sublocality) throws CustomException, DataException;
    
    /**
     * try to delete Sublocality object in database
     * commit transaction
     * @param sublocality: Sublocality Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteSublocality(ISublocality sublocality) throws CustomException;

    /**
     * try to insert Sublocality object in database
     * do not commit transaction
     * @param sublocality: Sublocality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertSublocality(ISublocality sublocality) throws CustomException, DataException;

    /**
     * try to update Sublocality object in database
     * do not commit transaction
     * @param sublocality: Sublocality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateSublocality(ISublocality sublocality) throws CustomException, DataException;
    
    /**
     * try to delete Sublocality object in database
     * do not commit transaction
     * @param sublocality: Sublocality Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteSublocality(ISublocality sublocality) throws CustomException;
    
    /**
     * @param localityPK: foreign key for Locality
     * @return all Sublocality Entity objects for Locality
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSublocalitys4locality(ILocalityPK localityPK) throws CustomException;

    
    /**
     * @param routePK: parent Route for child object Sublocality Entity
     * @return child Sublocality Entity object
     * @throws film.general.exception.CustomException
     */
    public ISublocality getRoute(IRoutePK routePK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
