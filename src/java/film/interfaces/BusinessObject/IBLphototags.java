/*
 * IBLphototags.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IPhototags;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Phototags
 * 
 * methods for manipulating data- and database objects
 * for Entity Phototags and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLphototags extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Phototags()
     * @return new empty IPhototags object
     */
    public IPhototags newPhototags();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Phototags(primarykey fields)
     * @return new IPhototags object with initialized primary key
     */
    public IPhototags newPhototags(java.lang.String film, int id, java.lang.String tag);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Phototags(IPhototagsPK phototagsPK)
     * @param phototagsPK: primary key
     * @return new IPhototags object with initialized primary key
     */
    public IPhototags newPhototags(IPhototagsPK phototagsPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new PhototagsPK()
     * @return new empty IPhototagsPK object
     */
    public IPhototagsPK newPhototagsPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new PhototagsPK(primarykey fields)
     * @return new IPhototagsPK object with initialized primary key
     */
    public IPhototagsPK newPhototagsPK(java.lang.String film, int id, java.lang.String tag);

    /**
     * 
     * @return all Phototags objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Phototags objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhototagss() throws CustomException;

    /**
     * 
     * @param phototagsPK: Phototags primary key
     * @return Phototags Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IPhototags getPhototags(IPhototagsPK phototagsPK) throws CustomException;

    /**
     * Search phototags in database for phototagsPK:
     * @param phototagsPK: Phototags Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getPhototagsExists(IPhototagsPK phototagsPK) throws DBException;

    /**
     * try to insert Phototags object in database
     * commit transaction
     * @param phototags: Phototags Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertPhototags(IPhototags phototags) throws CustomException, DataException;

    /**
     * check if Phototags exists
     * insert if not, update if found
     * do not commit transaction
     * @param phototags: Phototags Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdatePhototags(IPhototags phototags) throws CustomException, DataException;

    /**
     * try to update Phototags object in database
     * commit transaction
     * @param phototags: Phototags Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updatePhototags(IPhototags phototags) throws CustomException, DataException;
    
    /**
     * try to delete Phototags object in database
     * commit transaction
     * @param phototags: Phototags Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deletePhototags(IPhototags phototags) throws CustomException;

    /**
     * try to insert Phototags object in database
     * do not commit transaction
     * @param phototags: Phototags Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertPhototags(IPhototags phototags) throws CustomException, DataException;

    /**
     * try to update Phototags object in database
     * do not commit transaction
     * @param phototags: Phototags Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updatePhototags(IPhototags phototags) throws CustomException, DataException;
    
    /**
     * try to delete Phototags object in database
     * do not commit transaction
     * @param phototags: Phototags Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deletePhototags(IPhototags phototags) throws CustomException;
    
    /**
     * @param photoPK: foreign key for Photo
     * @return all Phototags Entity objects for Photo
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhototagss4photo(IPhotoPK photoPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
