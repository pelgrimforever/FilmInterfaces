/*
 * IBLart_photo.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IArt_photo;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Art_photo
 * 
 * methods for manipulating data- and database objects
 * for Entity Art_photo and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLart_photo extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_photo()
     * @return new empty IArt_photo object
     */
    public IArt_photo newArt_photo();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_photo(primarykey fields)
     * @return new IArt_photo object with initialized primary key
     */
    public IArt_photo newArt_photo(java.lang.String film, int photo);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_photo(IArt_photoPK art_photoPK)
     * @param art_photoPK: primary key
     * @return new IArt_photo object with initialized primary key
     */
    public IArt_photo newArt_photo(IArt_photoPK art_photoPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_photoPK()
     * @return new empty IArt_photoPK object
     */
    public IArt_photoPK newArt_photoPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Art_photoPK(primarykey fields)
     * @return new IArt_photoPK object with initialized primary key
     */
    public IArt_photoPK newArt_photoPK(java.lang.String film, int photo);

    /**
     * 
     * @return all Art_photo objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Art_photo objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArt_photos() throws CustomException;

    /**
     * 
     * @param art_photoPK: Art_photo primary key
     * @return Art_photo Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IArt_photo getArt_photo(IArt_photoPK art_photoPK) throws CustomException;

    /**
     * Search art_photo in database for art_photoPK:
     * @param art_photoPK: Art_photo Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getArt_photoExists(IArt_photoPK art_photoPK) throws DBException;

    /**
     * try to insert Art_photo object in database
     * commit transaction
     * @param art_photo: Art_photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertArt_photo(IArt_photo art_photo) throws CustomException, DataException;

    /**
     * check if Art_photo exists
     * insert if not, update if found
     * do not commit transaction
     * @param art_photo: Art_photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateArt_photo(IArt_photo art_photo) throws CustomException, DataException;

    /**
     * try to update Art_photo object in database
     * commit transaction
     * @param art_photo: Art_photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateArt_photo(IArt_photo art_photo) throws CustomException, DataException;
    
    /**
     * try to delete Art_photo object in database
     * commit transaction
     * @param art_photo: Art_photo Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteArt_photo(IArt_photo art_photo) throws CustomException;

    /**
     * try to insert Art_photo object in database
     * do not commit transaction
     * @param art_photo: Art_photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertArt_photo(IArt_photo art_photo) throws CustomException, DataException;

    /**
     * try to update Art_photo object in database
     * do not commit transaction
     * @param art_photo: Art_photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateArt_photo(IArt_photo art_photo) throws CustomException, DataException;
    
    /**
     * try to delete Art_photo object in database
     * do not commit transaction
     * @param art_photo: Art_photo Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteArt_photo(IArt_photo art_photo) throws CustomException;
    
    /**
     * @param photoPK: foreign key for Photo
     * @return all Art_photo Entity objects for Photo
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArt_photos4photo(IPhotoPK photoPK) throws CustomException;

    /**
     * @param art_subgroupPK: foreign key for Art_subgroup
     * @return all Art_photo Entity objects for Art_subgroup
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArt_photos4art_subgroup(IArt_subgroupPK art_subgroupPK) throws CustomException;

    /**
     * @param art_academyPK: foreign key for Art_academy
     * @return all Art_photo Entity objects for Art_academy
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArt_photos4art_academy(IArt_academyPK art_academyPK) throws CustomException;

    /**
     * @param art_groupPK: foreign key for Art_group
     * @return all Art_photo Entity objects for Art_group
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArt_photos4art_group(IArt_groupPK art_groupPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
