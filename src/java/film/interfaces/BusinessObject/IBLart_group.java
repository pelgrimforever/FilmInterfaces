/*
 * IBLart_group.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IArt_group;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Art_group
 * 
 * methods for manipulating data- and database objects
 * for Entity Art_group and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLart_group extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_group()
     * @return new empty IArt_group object
     */
    public IArt_group newArt_group();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_group(primarykey fields)
     * @return new IArt_group object with initialized primary key
     */
    public IArt_group newArt_group(long groupid);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_group(IArt_groupPK art_groupPK)
     * @param art_groupPK: primary key
     * @return new IArt_group object with initialized primary key
     */
    public IArt_group newArt_group(IArt_groupPK art_groupPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_groupPK()
     * @return new empty IArt_groupPK object
     */
    public IArt_groupPK newArt_groupPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_groupPK(primarykey fields)
     * @return new IArt_groupPK object with initialized primary key
     */
    public IArt_groupPK newArt_groupPK(long groupid);

    /**
     * 
     * @return all Art_group objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Art_group objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArt_groups() throws CustomException;

    /**
     * 
     * @param art_groupPK: Art_group primary key
     * @return Art_group Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IArt_group getArt_group(IArt_groupPK art_groupPK) throws CustomException;

    /**
     * Search art_group in database for art_groupPK:
     * @param art_groupPK: Art_group Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getArt_groupExists(IArt_groupPK art_groupPK) throws DBException;

    /**
     * try to insert Art_group object in database
     * commit transaction
     * @param art_group: Art_group Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertArt_group(IArt_group art_group) throws CustomException, DataException;

    /**
     * check if Art_group exists
     * insert if not, update if found
     * do not commit transaction
     * @param art_group: Art_group Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateArt_group(IArt_group art_group) throws CustomException, DataException;

    /**
     * try to update Art_group object in database
     * commit transaction
     * @param art_group: Art_group Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateArt_group(IArt_group art_group) throws CustomException, DataException;
    
    /**
     * try to delete Art_group object in database
     * commit transaction
     * @param art_group: Art_group Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteArt_group(IArt_group art_group) throws CustomException;

    /**
     * try to insert Art_group object in database
     * do not commit transaction
     * @param art_group: Art_group Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertArt_group(IArt_group art_group) throws CustomException, DataException;

    /**
     * try to update Art_group object in database
     * do not commit transaction
     * @param art_group: Art_group Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateArt_group(IArt_group art_group) throws CustomException, DataException;
    
    /**
     * try to delete Art_group object in database
     * do not commit transaction
     * @param art_group: Art_group Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteArt_group(IArt_group art_group) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
