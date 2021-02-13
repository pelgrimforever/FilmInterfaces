/*
 * IBLuploadsession.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IUploadsession;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Uploadsession
 * 
 * methods for manipulating data- and database objects
 * for Entity Uploadsession and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLuploadsession extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Uploadsession()
     * @return new empty IUploadsession object
     */
    public IUploadsession newUploadsession();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Uploadsession(primarykey fields)
     * @return new IUploadsession object with initialized primary key
     */
    public IUploadsession newUploadsession(java.lang.String filename);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Uploadsession(IUploadsessionPK uploadsessionPK)
     * @param uploadsessionPK: primary key
     * @return new IUploadsession object with initialized primary key
     */
    public IUploadsession newUploadsession(IUploadsessionPK uploadsessionPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new UploadsessionPK()
     * @return new empty IUploadsessionPK object
     */
    public IUploadsessionPK newUploadsessionPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new UploadsessionPK(primarykey fields)
     * @return new IUploadsessionPK object with initialized primary key
     */
    public IUploadsessionPK newUploadsessionPK(java.lang.String filename);

    /**
     * 
     * @return all Uploadsession objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Uploadsession objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getUploadsessions() throws CustomException;

    /**
     * 
     * @param uploadsessionPK: Uploadsession primary key
     * @return Uploadsession Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IUploadsession getUploadsession(IUploadsessionPK uploadsessionPK) throws CustomException;

    /**
     * Search uploadsession in database for uploadsessionPK:
     * @param uploadsessionPK: Uploadsession Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getUploadsessionExists(IUploadsessionPK uploadsessionPK) throws DBException;

    /**
     * try to insert Uploadsession object in database
     * commit transaction
     * @param uploadsession: Uploadsession Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertUploadsession(IUploadsession uploadsession) throws CustomException, DataException;

    /**
     * check if Uploadsession exists
     * insert if not, update if found
     * do not commit transaction
     * @param uploadsession: Uploadsession Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateUploadsession(IUploadsession uploadsession) throws CustomException, DataException;

    /**
     * try to update Uploadsession object in database
     * commit transaction
     * @param uploadsession: Uploadsession Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateUploadsession(IUploadsession uploadsession) throws CustomException, DataException;
    
    /**
     * try to delete Uploadsession object in database
     * commit transaction
     * @param uploadsession: Uploadsession Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteUploadsession(IUploadsession uploadsession) throws CustomException;

    /**
     * try to insert Uploadsession object in database
     * do not commit transaction
     * @param uploadsession: Uploadsession Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertUploadsession(IUploadsession uploadsession) throws CustomException, DataException;

    /**
     * try to update Uploadsession object in database
     * do not commit transaction
     * @param uploadsession: Uploadsession Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateUploadsession(IUploadsession uploadsession) throws CustomException, DataException;
    
    /**
     * try to delete Uploadsession object in database
     * do not commit transaction
     * @param uploadsession: Uploadsession Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteUploadsession(IUploadsession uploadsession) throws CustomException;
    
    /**
     * @param creatorPK: foreign key for Creator
     * @return all Uploadsession Entity objects for Creator
     * @throws film.general.exception.CustomException
     */
    public ArrayList getUploadsessions4creator(ICreatorPK creatorPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
