/*
 * IBLcreator.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ICreator;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Creator
 * 
 * methods for manipulating data- and database objects
 * for Entity Creator and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLcreator extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Creator()
     * @return new empty ICreator object
     */
    public ICreator newCreator();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Creator(primarykey fields)
     * @return new ICreator object with initialized primary key
     */
    public ICreator newCreator(java.lang.String creatorid);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Creator(ICreatorPK creatorPK)
     * @param creatorPK: primary key
     * @return new ICreator object with initialized primary key
     */
    public ICreator newCreator(ICreatorPK creatorPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new CreatorPK()
     * @return new empty ICreatorPK object
     */
    public ICreatorPK newCreatorPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new CreatorPK(primarykey fields)
     * @return new ICreatorPK object with initialized primary key
     */
    public ICreatorPK newCreatorPK(java.lang.String creatorid);

    /**
     * 
     * @return all Creator objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Creator objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getCreators() throws CustomException;

    /**
     * 
     * @param creatorPK: Creator primary key
     * @return Creator Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ICreator getCreator(ICreatorPK creatorPK) throws CustomException;

    /**
     * Search creator in database for creatorPK:
     * @param creatorPK: Creator Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getCreatorExists(ICreatorPK creatorPK) throws DBException;

    /**
     * try to insert Creator object in database
     * commit transaction
     * @param creator: Creator Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertCreator(ICreator creator) throws CustomException, DataException;

    /**
     * check if Creator exists
     * insert if not, update if found
     * do not commit transaction
     * @param creator: Creator Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateCreator(ICreator creator) throws CustomException, DataException;

    /**
     * try to update Creator object in database
     * commit transaction
     * @param creator: Creator Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateCreator(ICreator creator) throws CustomException, DataException;
    
    /**
     * try to delete Creator object in database
     * commit transaction
     * @param creator: Creator Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteCreator(ICreator creator) throws CustomException;

    /**
     * try to insert Creator object in database
     * do not commit transaction
     * @param creator: Creator Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertCreator(ICreator creator) throws CustomException, DataException;

    /**
     * try to update Creator object in database
     * do not commit transaction
     * @param creator: Creator Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateCreator(ICreator creator) throws CustomException, DataException;
    
    /**
     * try to delete Creator object in database
     * do not commit transaction
     * @param creator: Creator Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteCreator(ICreator creator) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
