/*
 * IBLsubjectcat.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ISubjectcat;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Subjectcat
 * 
 * methods for manipulating data- and database objects
 * for Entity Subjectcat and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsubjectcat extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Subjectcat()
     * @return new empty ISubjectcat object
     */
    public ISubjectcat newSubjectcat();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Subjectcat(primarykey fields)
     * @return new ISubjectcat object with initialized primary key
     */
    public ISubjectcat newSubjectcat(java.lang.String cat);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Subjectcat(ISubjectcatPK subjectcatPK)
     * @param subjectcatPK: primary key
     * @return new ISubjectcat object with initialized primary key
     */
    public ISubjectcat newSubjectcat(ISubjectcatPK subjectcatPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SubjectcatPK()
     * @return new empty ISubjectcatPK object
     */
    public ISubjectcatPK newSubjectcatPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SubjectcatPK(primarykey fields)
     * @return new ISubjectcatPK object with initialized primary key
     */
    public ISubjectcatPK newSubjectcatPK(java.lang.String cat);

    /**
     * 
     * @return all Subjectcat objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Subjectcat objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSubjectcats() throws CustomException;

    /**
     * 
     * @param subjectcatPK: Subjectcat primary key
     * @return Subjectcat Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ISubjectcat getSubjectcat(ISubjectcatPK subjectcatPK) throws CustomException;

    /**
     * Search subjectcat in database for subjectcatPK:
     * @param subjectcatPK: Subjectcat Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSubjectcatExists(ISubjectcatPK subjectcatPK) throws DBException;

    /**
     * try to insert Subjectcat object in database
     * commit transaction
     * @param subjectcat: Subjectcat Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertSubjectcat(ISubjectcat subjectcat) throws CustomException, DataException;

    /**
     * check if Subjectcat exists
     * insert if not, update if found
     * do not commit transaction
     * @param subjectcat: Subjectcat Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateSubjectcat(ISubjectcat subjectcat) throws CustomException, DataException;

    /**
     * try to update Subjectcat object in database
     * commit transaction
     * @param subjectcat: Subjectcat Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateSubjectcat(ISubjectcat subjectcat) throws CustomException, DataException;
    
    /**
     * try to delete Subjectcat object in database
     * commit transaction
     * @param subjectcat: Subjectcat Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteSubjectcat(ISubjectcat subjectcat) throws CustomException;

    /**
     * try to insert Subjectcat object in database
     * do not commit transaction
     * @param subjectcat: Subjectcat Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertSubjectcat(ISubjectcat subjectcat) throws CustomException, DataException;

    /**
     * try to update Subjectcat object in database
     * do not commit transaction
     * @param subjectcat: Subjectcat Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateSubjectcat(ISubjectcat subjectcat) throws CustomException, DataException;
    
    /**
     * try to delete Subjectcat object in database
     * do not commit transaction
     * @param subjectcat: Subjectcat Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteSubjectcat(ISubjectcat subjectcat) throws CustomException;
    
    
    /**
     * @param subjectPK: parent Subject for child object Subjectcat Entity
     * @return child Subjectcat Entity object
     * @throws film.general.exception.CustomException
     */
    public ISubjectcat getSubjectcat1(ISubjectPK subjectPK) throws CustomException;

    /**
     * @param subjectPK: parent Subject for child object Subjectcat Entity
     * @return child Subjectcat Entity object
     * @throws film.general.exception.CustomException
     */
    public ISubjectcat getSubjectcat2(ISubjectPK subjectPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
