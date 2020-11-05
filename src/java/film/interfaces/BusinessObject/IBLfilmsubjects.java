/*
 * IBLfilmsubjects.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IFilmsubjects;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Filmsubjects
 * 
 * methods for manipulating data- and database objects
 * for Entity Filmsubjects and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLfilmsubjects extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Filmsubjects()
     * @return new empty IFilmsubjects object
     */
    public IFilmsubjects newFilmsubjects();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Filmsubjects(primarykey fields)
     * @return new IFilmsubjects object with initialized primary key
     */
    public IFilmsubjects newFilmsubjects(java.lang.String film, java.lang.String cat1, java.lang.String cat2, int subject);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Filmsubjects(IFilmsubjectsPK filmsubjectsPK)
     * @param filmsubjectsPK: primary key
     * @return new IFilmsubjects object with initialized primary key
     */
    public IFilmsubjects newFilmsubjects(IFilmsubjectsPK filmsubjectsPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new FilmsubjectsPK()
     * @return new empty IFilmsubjectsPK object
     */
    public IFilmsubjectsPK newFilmsubjectsPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new FilmsubjectsPK(primarykey fields)
     * @return new IFilmsubjectsPK object with initialized primary key
     */
    public IFilmsubjectsPK newFilmsubjectsPK(java.lang.String film, java.lang.String cat1, java.lang.String cat2, int subject);

    /**
     * 
     * @return all Filmsubjects objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Filmsubjects objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getFilmsubjectss() throws CustomException;

    /**
     * 
     * @param filmsubjectsPK: Filmsubjects primary key
     * @return Filmsubjects Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IFilmsubjects getFilmsubjects(IFilmsubjectsPK filmsubjectsPK) throws CustomException;

    /**
     * Search filmsubjects in database for filmsubjectsPK:
     * @param filmsubjectsPK: Filmsubjects Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getFilmsubjectsExists(IFilmsubjectsPK filmsubjectsPK) throws DBException;

    /**
     * try to insert Filmsubjects object in database
     * commit transaction
     * @param filmsubjects: Filmsubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertFilmsubjects(IFilmsubjects filmsubjects) throws CustomException, DataException;

    /**
     * check if Filmsubjects exists
     * insert if not, update if found
     * do not commit transaction
     * @param filmsubjects: Filmsubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateFilmsubjects(IFilmsubjects filmsubjects) throws CustomException, DataException;

    /**
     * try to update Filmsubjects object in database
     * commit transaction
     * @param filmsubjects: Filmsubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateFilmsubjects(IFilmsubjects filmsubjects) throws CustomException, DataException;
    
    /**
     * try to delete Filmsubjects object in database
     * commit transaction
     * @param filmsubjects: Filmsubjects Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteFilmsubjects(IFilmsubjects filmsubjects) throws CustomException;

    /**
     * try to insert Filmsubjects object in database
     * do not commit transaction
     * @param filmsubjects: Filmsubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertFilmsubjects(IFilmsubjects filmsubjects) throws CustomException, DataException;

    /**
     * try to update Filmsubjects object in database
     * do not commit transaction
     * @param filmsubjects: Filmsubjects Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateFilmsubjects(IFilmsubjects filmsubjects) throws CustomException, DataException;
    
    /**
     * try to delete Filmsubjects object in database
     * do not commit transaction
     * @param filmsubjects: Filmsubjects Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteFilmsubjects(IFilmsubjects filmsubjects) throws CustomException;
    
    /**
     * @param subjectPK: foreign key for Subject
     * @return all Filmsubjects Entity objects for Subject
     * @throws film.general.exception.CustomException
     */
    public ArrayList getFilmsubjectss4subject(ISubjectPK subjectPK) throws CustomException;

    /**
     * @param filmPK: foreign key for Film
     * @return all Filmsubjects Entity objects for Film
     * @throws film.general.exception.CustomException
     */
    public ArrayList getFilmsubjectss4film(IFilmPK filmPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
