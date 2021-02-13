/*
 * IBLcountry.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ICountry;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Country
 * 
 * methods for manipulating data- and database objects
 * for Entity Country and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLcountry extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Country()
     * @return new empty ICountry object
     */
    public ICountry newCountry();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Country(primarykey fields)
     * @return new ICountry object with initialized primary key
     */
    public ICountry newCountry(java.lang.String code);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Country(ICountryPK countryPK)
     * @param countryPK: primary key
     * @return new ICountry object with initialized primary key
     */
    public ICountry newCountry(ICountryPK countryPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new CountryPK()
     * @return new empty ICountryPK object
     */
    public ICountryPK newCountryPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new CountryPK(primarykey fields)
     * @return new ICountryPK object with initialized primary key
     */
    public ICountryPK newCountryPK(java.lang.String code);

    /**
     * 
     * @return all Country objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Country objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getCountrys() throws CustomException;

    /**
     * 
     * @param countryPK: Country primary key
     * @return Country Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ICountry getCountry(ICountryPK countryPK) throws CustomException;

    /**
     * Search country in database for countryPK:
     * @param countryPK: Country Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getCountryExists(ICountryPK countryPK) throws DBException;

    /**
     * try to insert Country object in database
     * commit transaction
     * @param country: Country Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertCountry(ICountry country) throws CustomException, DataException;

    /**
     * check if Country exists
     * insert if not, update if found
     * do not commit transaction
     * @param country: Country Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateCountry(ICountry country) throws CustomException, DataException;

    /**
     * try to update Country object in database
     * commit transaction
     * @param country: Country Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateCountry(ICountry country) throws CustomException, DataException;
    
    /**
     * try to delete Country object in database
     * commit transaction
     * @param country: Country Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteCountry(ICountry country) throws CustomException;

    /**
     * try to insert Country object in database
     * do not commit transaction
     * @param country: Country Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertCountry(ICountry country) throws CustomException, DataException;

    /**
     * try to update Country object in database
     * do not commit transaction
     * @param country: Country Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateCountry(ICountry country) throws CustomException, DataException;
    
    /**
     * try to delete Country object in database
     * do not commit transaction
     * @param country: Country Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteCountry(ICountry country) throws CustomException;
    
    
    /**
     * @param arealevel1PK: parent Arealevel1 for child object Country Entity
     * @return child Country Entity object
     * @throws film.general.exception.CustomException
     */
    public ICountry getArealevel1(IArealevel1PK arealevel1PK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
