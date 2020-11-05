/*
 * IBLsubject.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ISubject;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Subject
 * 
 * methods for manipulating data- and database objects
 * for Entity Subject and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsubject extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Subject()
     * @return new empty ISubject object
     */
    public ISubject newSubject();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Subject(primarykey fields)
     * @return new ISubject object with initialized primary key
     */
    public ISubject newSubject(java.lang.String cat1, java.lang.String cat2, int id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Subject(ISubjectPK subjectPK)
     * @param subjectPK: primary key
     * @return new ISubject object with initialized primary key
     */
    public ISubject newSubject(ISubjectPK subjectPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SubjectPK()
     * @return new empty ISubjectPK object
     */
    public ISubjectPK newSubjectPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SubjectPK(primarykey fields)
     * @return new ISubjectPK object with initialized primary key
     */
    public ISubjectPK newSubjectPK(java.lang.String cat1, java.lang.String cat2, int id);

    /**
     * 
     * @return all Subject objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Subject objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSubjects() throws CustomException;

    /**
     * 
     * @param subjectPK: Subject primary key
     * @return Subject Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ISubject getSubject(ISubjectPK subjectPK) throws CustomException;

    /**
     * Search subject in database for subjectPK:
     * @param subjectPK: Subject Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSubjectExists(ISubjectPK subjectPK) throws DBException;

    /**
     * try to insert Subject object in database
     * commit transaction
     * @param subject: Subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertSubject(ISubject subject) throws CustomException, DataException;

    /**
     * check if Subject exists
     * insert if not, update if found
     * do not commit transaction
     * @param subject: Subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateSubject(ISubject subject) throws CustomException, DataException;

    /**
     * try to update Subject object in database
     * commit transaction
     * @param subject: Subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateSubject(ISubject subject) throws CustomException, DataException;
    
    /**
     * try to delete Subject object in database
     * commit transaction
     * @param subject: Subject Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteSubject(ISubject subject) throws CustomException;

    /**
     * try to insert Subject object in database
     * do not commit transaction
     * @param subject: Subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertSubject(ISubject subject) throws CustomException, DataException;

    /**
     * try to update Subject object in database
     * do not commit transaction
     * @param subject: Subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateSubject(ISubject subject) throws CustomException, DataException;
    
    /**
     * try to delete Subject object in database
     * do not commit transaction
     * @param subject: Subject Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteSubject(ISubject subject) throws CustomException;
    
    /**
     * @param subjectcatPK: foreign key for Subjectcat
     * @return all Subject Entity objects for Subjectcat
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSubjects4subjectcatCat1(ISubjectcatPK subjectcatPK) throws CustomException;

    /**
     * @param tree7subjectPK: foreign key for Tree7subject
     * @return all Subject Entity objects for Tree7subject
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSubjects4tree7subject(ITree7subjectPK tree7subjectPK) throws CustomException;

    /**
     * @param subjectcatPK: foreign key for Subjectcat
     * @return all Subject Entity objects for Subjectcat
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSubjects4subjectcatCat2(ISubjectcatPK subjectcatPK) throws CustomException;

    
    /**
     * @param filmsubjectsPK: parent Filmsubjects for child object Subject Entity
     * @return child Subject Entity object
     * @throws film.general.exception.CustomException
     */
    public ISubject getFilmsubjects(IFilmsubjectsPK filmsubjectsPK) throws CustomException;

    /**
     * @param photosubjectsPK: parent Photosubjects for child object Subject Entity
     * @return child Subject Entity object
     * @throws film.general.exception.CustomException
     */
    public ISubject getPhotosubjects(IPhotosubjectsPK photosubjectsPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
