/*
 * IBLart_subgroup.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IArt_subgroup;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Art_subgroup
 * 
 * methods for manipulating data- and database objects
 * for Entity Art_subgroup and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLart_subgroup extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_subgroup()
     * @return new empty IArt_subgroup object
     */
    public IArt_subgroup newArt_subgroup();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_subgroup(primarykey fields)
     * @return new IArt_subgroup object with initialized primary key
     */
    public IArt_subgroup newArt_subgroup(int subgroupid);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_subgroup(IArt_subgroupPK art_subgroupPK)
     * @param art_subgroupPK: primary key
     * @return new IArt_subgroup object with initialized primary key
     */
    public IArt_subgroup newArt_subgroup(IArt_subgroupPK art_subgroupPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_subgroupPK()
     * @return new empty IArt_subgroupPK object
     */
    public IArt_subgroupPK newArt_subgroupPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_subgroupPK(primarykey fields)
     * @return new IArt_subgroupPK object with initialized primary key
     */
    public IArt_subgroupPK newArt_subgroupPK(int subgroupid);

    /**
     * 
     * @return all Art_subgroup objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Art_subgroup objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArt_subgroups() throws CustomException;

    /**
     * 
     * @param art_subgroupPK: Art_subgroup primary key
     * @return Art_subgroup Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IArt_subgroup getArt_subgroup(IArt_subgroupPK art_subgroupPK) throws CustomException;

    /**
     * Search art_subgroup in database for art_subgroupPK:
     * @param art_subgroupPK: Art_subgroup Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getArt_subgroupExists(IArt_subgroupPK art_subgroupPK) throws DBException;

    /**
     * try to insert Art_subgroup object in database
     * commit transaction
     * @param art_subgroup: Art_subgroup Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertArt_subgroup(IArt_subgroup art_subgroup) throws CustomException, DataException;

    /**
     * check if Art_subgroup exists
     * insert if not, update if found
     * do not commit transaction
     * @param art_subgroup: Art_subgroup Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateArt_subgroup(IArt_subgroup art_subgroup) throws CustomException, DataException;

    /**
     * try to update Art_subgroup object in database
     * commit transaction
     * @param art_subgroup: Art_subgroup Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateArt_subgroup(IArt_subgroup art_subgroup) throws CustomException, DataException;
    
    /**
     * try to delete Art_subgroup object in database
     * commit transaction
     * @param art_subgroup: Art_subgroup Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteArt_subgroup(IArt_subgroup art_subgroup) throws CustomException;

    /**
     * try to insert Art_subgroup object in database
     * do not commit transaction
     * @param art_subgroup: Art_subgroup Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertArt_subgroup(IArt_subgroup art_subgroup) throws CustomException, DataException;

    /**
     * try to update Art_subgroup object in database
     * do not commit transaction
     * @param art_subgroup: Art_subgroup Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateArt_subgroup(IArt_subgroup art_subgroup) throws CustomException, DataException;
    
    /**
     * try to delete Art_subgroup object in database
     * do not commit transaction
     * @param art_subgroup: Art_subgroup Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteArt_subgroup(IArt_subgroup art_subgroup) throws CustomException;
    
    /**
     * @param art_groupPK: foreign key for Art_group
     * @return all Art_subgroup Entity objects for Art_group
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArt_subgroups4art_group(IArt_groupPK art_groupPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
