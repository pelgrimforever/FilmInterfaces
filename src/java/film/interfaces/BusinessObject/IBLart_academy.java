/*
 * IBLart_academy.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IArt_academy;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Art_academy
 * 
 * methods for manipulating data- and database objects
 * for Entity Art_academy and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLart_academy extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_academy()
     * @return new empty IArt_academy object
     */
    public IArt_academy newArt_academy();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_academy(primarykey fields)
     * @return new IArt_academy object with initialized primary key
     */
    public IArt_academy newArt_academy(long academyid);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_academy(IArt_academyPK art_academyPK)
     * @param art_academyPK: primary key
     * @return new IArt_academy object with initialized primary key
     */
    public IArt_academy newArt_academy(IArt_academyPK art_academyPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_academyPK()
     * @return new empty IArt_academyPK object
     */
    public IArt_academyPK newArt_academyPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_academyPK(primarykey fields)
     * @return new IArt_academyPK object with initialized primary key
     */
    public IArt_academyPK newArt_academyPK(long academyid);

    /**
     * 
     * @return all Art_academy objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Art_academy objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArt_academys() throws CustomException;

    /**
     * 
     * @param art_academyPK: Art_academy primary key
     * @return Art_academy Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IArt_academy getArt_academy(IArt_academyPK art_academyPK) throws CustomException;

    /**
     * Search art_academy in database for art_academyPK:
     * @param art_academyPK: Art_academy Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getArt_academyExists(IArt_academyPK art_academyPK) throws DBException;

    /**
     * try to insert Art_academy object in database
     * commit transaction
     * @param art_academy: Art_academy Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertArt_academy(IArt_academy art_academy) throws CustomException, DataException;

    /**
     * check if Art_academy exists
     * insert if not, update if found
     * do not commit transaction
     * @param art_academy: Art_academy Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateArt_academy(IArt_academy art_academy) throws CustomException, DataException;

    /**
     * try to update Art_academy object in database
     * commit transaction
     * @param art_academy: Art_academy Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateArt_academy(IArt_academy art_academy) throws CustomException, DataException;
    
    /**
     * try to delete Art_academy object in database
     * commit transaction
     * @param art_academy: Art_academy Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteArt_academy(IArt_academy art_academy) throws CustomException;

    /**
     * try to insert Art_academy object in database
     * do not commit transaction
     * @param art_academy: Art_academy Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertArt_academy(IArt_academy art_academy) throws CustomException, DataException;

    /**
     * try to update Art_academy object in database
     * do not commit transaction
     * @param art_academy: Art_academy Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateArt_academy(IArt_academy art_academy) throws CustomException, DataException;
    
    /**
     * try to delete Art_academy object in database
     * do not commit transaction
     * @param art_academy: Art_academy Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteArt_academy(IArt_academy art_academy) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
