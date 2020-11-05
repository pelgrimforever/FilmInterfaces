/*
 * IBLlocality.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ILocality;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Locality
 * 
 * methods for manipulating data- and database objects
 * for Entity Locality and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLlocality extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Locality()
     * @return new empty ILocality object
     */
    public ILocality newLocality();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Locality(primarykey fields)
     * @return new ILocality object with initialized primary key
     */
    public ILocality newLocality(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Locality(ILocalityPK localityPK)
     * @param localityPK: primary key
     * @return new ILocality object with initialized primary key
     */
    public ILocality newLocality(ILocalityPK localityPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new LocalityPK()
     * @return new empty ILocalityPK object
     */
    public ILocalityPK newLocalityPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new LocalityPK(primarykey fields)
     * @return new ILocalityPK object with initialized primary key
     */
    public ILocalityPK newLocalityPK(java.lang.String countrycode, java.lang.String postalcode, java.lang.String locality);

    /**
     * 
     * @return all Locality objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Locality objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getLocalitys() throws CustomException;

    /**
     * 
     * @param localityPK: Locality primary key
     * @return Locality Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ILocality getLocality(ILocalityPK localityPK) throws CustomException;

    /**
     * Search locality in database for localityPK:
     * @param localityPK: Locality Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getLocalityExists(ILocalityPK localityPK) throws DBException;

    /**
     * try to insert Locality object in database
     * commit transaction
     * @param locality: Locality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertLocality(ILocality locality) throws CustomException, DataException;

    /**
     * check if Locality exists
     * insert if not, update if found
     * do not commit transaction
     * @param locality: Locality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateLocality(ILocality locality) throws CustomException, DataException;

    /**
     * try to update Locality object in database
     * commit transaction
     * @param locality: Locality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateLocality(ILocality locality) throws CustomException, DataException;
    
    /**
     * try to delete Locality object in database
     * commit transaction
     * @param locality: Locality Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteLocality(ILocality locality) throws CustomException;

    /**
     * try to insert Locality object in database
     * do not commit transaction
     * @param locality: Locality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertLocality(ILocality locality) throws CustomException, DataException;

    /**
     * try to update Locality object in database
     * do not commit transaction
     * @param locality: Locality Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateLocality(ILocality locality) throws CustomException, DataException;
    
    /**
     * try to delete Locality object in database
     * do not commit transaction
     * @param locality: Locality Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteLocality(ILocality locality) throws CustomException;
    
    /**
     * @param postalcodePK: foreign key for Postalcode
     * @return all Locality Entity objects for Postalcode
     * @throws film.general.exception.CustomException
     */
    public ArrayList getLocalitys4postalcode(IPostalcodePK postalcodePK) throws CustomException;

    
    /**
     * @param sublocalityPK: parent Sublocality for child object Locality Entity
     * @return child Locality Entity object
     * @throws film.general.exception.CustomException
     */
    public ILocality getSublocality(ISublocalityPK sublocalityPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
