/*
 * IBLuploadsessionsettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IUploadsessionsettings;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Uploadsessionsettings
 * 
 * methods for manipulating data- and database objects
 * for Entity Uploadsessionsettings and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLuploadsessionsettings extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Uploadsessionsettings()
     * @return new empty IUploadsessionsettings object
     */
    public IUploadsessionsettings newUploadsessionsettings();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Uploadsessionsettings(primarykey fields)
     * @return new IUploadsessionsettings object with initialized primary key
     */
    public IUploadsessionsettings newUploadsessionsettings(java.lang.String directory);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Uploadsessionsettings(IUploadsessionsettingsPK uploadsessionsettingsPK)
     * @param uploadsessionsettingsPK: primary key
     * @return new IUploadsessionsettings object with initialized primary key
     */
    public IUploadsessionsettings newUploadsessionsettings(IUploadsessionsettingsPK uploadsessionsettingsPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new UploadsessionsettingsPK()
     * @return new empty IUploadsessionsettingsPK object
     */
    public IUploadsessionsettingsPK newUploadsessionsettingsPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new UploadsessionsettingsPK(primarykey fields)
     * @return new IUploadsessionsettingsPK object with initialized primary key
     */
    public IUploadsessionsettingsPK newUploadsessionsettingsPK(java.lang.String directory);

    /**
     * 
     * @return all Uploadsessionsettings objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Uploadsessionsettings objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getUploadsessionsettingss() throws CustomException;

    /**
     * 
     * @param uploadsessionsettingsPK: Uploadsessionsettings primary key
     * @return Uploadsessionsettings Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IUploadsessionsettings getUploadsessionsettings(IUploadsessionsettingsPK uploadsessionsettingsPK) throws CustomException;

    /**
     * Search uploadsessionsettings in database for uploadsessionsettingsPK:
     * @param uploadsessionsettingsPK: Uploadsessionsettings Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getUploadsessionsettingsExists(IUploadsessionsettingsPK uploadsessionsettingsPK) throws DBException;

    /**
     * try to insert Uploadsessionsettings object in database
     * commit transaction
     * @param uploadsessionsettings: Uploadsessionsettings Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertUploadsessionsettings(IUploadsessionsettings uploadsessionsettings) throws CustomException, DataException;

    /**
     * check if Uploadsessionsettings exists
     * insert if not, update if found
     * do not commit transaction
     * @param uploadsessionsettings: Uploadsessionsettings Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateUploadsessionsettings(IUploadsessionsettings uploadsessionsettings) throws CustomException, DataException;

    /**
     * try to update Uploadsessionsettings object in database
     * commit transaction
     * @param uploadsessionsettings: Uploadsessionsettings Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateUploadsessionsettings(IUploadsessionsettings uploadsessionsettings) throws CustomException, DataException;
    
    /**
     * try to delete Uploadsessionsettings object in database
     * commit transaction
     * @param uploadsessionsettings: Uploadsessionsettings Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteUploadsessionsettings(IUploadsessionsettings uploadsessionsettings) throws CustomException;

    /**
     * try to insert Uploadsessionsettings object in database
     * do not commit transaction
     * @param uploadsessionsettings: Uploadsessionsettings Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertUploadsessionsettings(IUploadsessionsettings uploadsessionsettings) throws CustomException, DataException;

    /**
     * try to update Uploadsessionsettings object in database
     * do not commit transaction
     * @param uploadsessionsettings: Uploadsessionsettings Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateUploadsessionsettings(IUploadsessionsettings uploadsessionsettings) throws CustomException, DataException;
    
    /**
     * try to delete Uploadsessionsettings object in database
     * do not commit transaction
     * @param uploadsessionsettings: Uploadsessionsettings Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteUploadsessionsettings(IUploadsessionsettings uploadsessionsettings) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
