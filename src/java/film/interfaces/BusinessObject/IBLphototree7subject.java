/*
 * IBLphototree7subject.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IPhototree7subject;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Phototree7subject
 * 
 * methods for manipulating data- and database objects
 * for Entity Phototree7subject and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLphototree7subject extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Phototree7subject()
     * @return new empty IPhototree7subject object
     */
    public IPhototree7subject newPhototree7subject();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Phototree7subject(primarykey fields)
     * @return new IPhototree7subject object with initialized primary key
     */
    public IPhototree7subject newPhototree7subject(java.lang.String film, int id, long subjectid);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Phototree7subject(IPhototree7subjectPK phototree7subjectPK)
     * @param phototree7subjectPK: primary key
     * @return new IPhototree7subject object with initialized primary key
     */
    public IPhototree7subject newPhototree7subject(IPhototree7subjectPK phototree7subjectPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Phototree7subjectPK()
     * @return new empty IPhototree7subjectPK object
     */
    public IPhototree7subjectPK newPhototree7subjectPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Phototree7subjectPK(primarykey fields)
     * @return new IPhototree7subjectPK object with initialized primary key
     */
    public IPhototree7subjectPK newPhototree7subjectPK(java.lang.String film, int id, long subjectid);

    /**
     * 
     * @return all Phototree7subject objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Phototree7subject objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhototree7subjects() throws CustomException;

    /**
     * 
     * @param phototree7subjectPK: Phototree7subject primary key
     * @return Phototree7subject Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IPhototree7subject getPhototree7subject(IPhototree7subjectPK phototree7subjectPK) throws CustomException;

    /**
     * Search phototree7subject in database for phototree7subjectPK:
     * @param phototree7subjectPK: Phototree7subject Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getPhototree7subjectExists(IPhototree7subjectPK phototree7subjectPK) throws DBException;

    /**
     * try to insert Phototree7subject object in database
     * commit transaction
     * @param phototree7subject: Phototree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertPhototree7subject(IPhototree7subject phototree7subject) throws CustomException, DataException;

    /**
     * check if Phototree7subject exists
     * insert if not, update if found
     * do not commit transaction
     * @param phototree7subject: Phototree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdatePhototree7subject(IPhototree7subject phototree7subject) throws CustomException, DataException;

    /**
     * try to update Phototree7subject object in database
     * commit transaction
     * @param phototree7subject: Phototree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updatePhototree7subject(IPhototree7subject phototree7subject) throws CustomException, DataException;
    
    /**
     * try to delete Phototree7subject object in database
     * commit transaction
     * @param phototree7subject: Phototree7subject Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deletePhototree7subject(IPhototree7subject phototree7subject) throws CustomException;

    /**
     * try to insert Phototree7subject object in database
     * do not commit transaction
     * @param phototree7subject: Phototree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertPhototree7subject(IPhototree7subject phototree7subject) throws CustomException, DataException;

    /**
     * try to update Phototree7subject object in database
     * do not commit transaction
     * @param phototree7subject: Phototree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updatePhototree7subject(IPhototree7subject phototree7subject) throws CustomException, DataException;
    
    /**
     * try to delete Phototree7subject object in database
     * do not commit transaction
     * @param phototree7subject: Phototree7subject Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deletePhototree7subject(IPhototree7subject phototree7subject) throws CustomException;
    
    /**
     * @param tree7subjectPK: foreign key for Tree7subject
     * @return all Phototree7subject Entity objects for Tree7subject
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhototree7subjects4tree7subject(ITree7subjectPK tree7subjectPK) throws CustomException;

    /**
     * @param photoPK: foreign key for Photo
     * @return all Phototree7subject Entity objects for Photo
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhototree7subjects4photo(IPhotoPK photoPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
