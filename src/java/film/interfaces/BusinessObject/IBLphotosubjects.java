/*
 * IBLphotosubjects.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IPhotosubjects;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Photosubjects
 * 
 * methods for manipulating data- and database objects
 * for Entity Photosubjects and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLphotosubjects extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Photosubjects()
     * @return new empty IPhotosubjects object
     */
    public IPhotosubjects newPhotosubjects();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Photosubjects(primarykey fields)
     * @return new IPhotosubjects object with initialized primary key
     */
    public IPhotosubjects newPhotosubjects(java.lang.String film, int id, java.lang.String cat1, java.lang.String cat2, int subject);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Photosubjects(IPhotosubjectsPK photosubjectsPK)
     * @param photosubjectsPK: primary key
     * @return new IPhotosubjects object with initialized primary key
     */
    public IPhotosubjects newPhotosubjects(IPhotosubjectsPK photosubjectsPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new PhotosubjectsPK()
     * @return new empty IPhotosubjectsPK object
     */
    public IPhotosubjectsPK newPhotosubjectsPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new PhotosubjectsPK(primarykey fields)
     * @return new IPhotosubjectsPK object with initialized primary key
     */
    public IPhotosubjectsPK newPhotosubjectsPK(java.lang.String film, int id, java.lang.String cat1, java.lang.String cat2, int subject);

    /**
     * 
     * @return all Photosubjects objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Photosubjects objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhotosubjectss() throws CustomException;

    /**
     * 
     * @param photosubjectsPK: Photosubjects primary key
     * @return Photosubjects Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IPhotosubjects getPhotosubjects(IPhotosubjectsPK photosubjectsPK) throws CustomException;

    /**
     * Search photosubjects in database for photosubjectsPK:
     * @param photosubjectsPK: Photosubjects Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getPhotosubjectsExists(IPhotosubjectsPK photosubjectsPK) throws DBException;

    /**
     * try to insert Photosubjects object in database
     * commit transaction
     * @param photosubjects: Photosubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertPhotosubjects(IPhotosubjects photosubjects) throws CustomException, DataException;

    /**
     * check if Photosubjects exists
     * insert if not, update if found
     * do not commit transaction
     * @param photosubjects: Photosubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdatePhotosubjects(IPhotosubjects photosubjects) throws CustomException, DataException;

    /**
     * try to update Photosubjects object in database
     * commit transaction
     * @param photosubjects: Photosubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updatePhotosubjects(IPhotosubjects photosubjects) throws CustomException, DataException;
    
    /**
     * try to delete Photosubjects object in database
     * commit transaction
     * @param photosubjects: Photosubjects Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deletePhotosubjects(IPhotosubjects photosubjects) throws CustomException;

    /**
     * try to insert Photosubjects object in database
     * do not commit transaction
     * @param photosubjects: Photosubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertPhotosubjects(IPhotosubjects photosubjects) throws CustomException, DataException;

    /**
     * try to update Photosubjects object in database
     * do not commit transaction
     * @param photosubjects: Photosubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updatePhotosubjects(IPhotosubjects photosubjects) throws CustomException, DataException;
    
    /**
     * try to delete Photosubjects object in database
     * do not commit transaction
     * @param photosubjects: Photosubjects Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deletePhotosubjects(IPhotosubjects photosubjects) throws CustomException;
    
    /**
     * @param photoPK: foreign key for Photo
     * @return all Photosubjects Entity objects for Photo
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhotosubjectss4photo(IPhotoPK photoPK) throws CustomException;

    /**
     * @param subjectPK: foreign key for Subject
     * @return all Photosubjects Entity objects for Subject
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhotosubjectss4subject(ISubjectPK subjectPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
