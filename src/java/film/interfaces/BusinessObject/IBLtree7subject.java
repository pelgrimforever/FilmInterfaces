/*
 * IBLtree7subject.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ITree7subject;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Tree7subject
 * 
 * methods for manipulating data- and database objects
 * for Entity Tree7subject and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLtree7subject extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tree7subject()
     * @return new empty ITree7subject object
     */
    public ITree7subject newTree7subject();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tree7subject(primarykey fields)
     * @return new ITree7subject object with initialized primary key
     */
    public ITree7subject newTree7subject(long subjectid);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tree7subject(ITree7subjectPK tree7subjectPK)
     * @param tree7subjectPK: primary key
     * @return new ITree7subject object with initialized primary key
     */
    public ITree7subject newTree7subject(ITree7subjectPK tree7subjectPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tree7subjectPK()
     * @return new empty ITree7subjectPK object
     */
    public ITree7subjectPK newTree7subjectPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Tree7subjectPK(primarykey fields)
     * @return new ITree7subjectPK object with initialized primary key
     */
    public ITree7subjectPK newTree7subjectPK(long subjectid);

    /**
     * 
     * @return all Tree7subject objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Tree7subject objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getTree7subjects() throws CustomException;

    /**
     * 
     * @param tree7subjectPK: Tree7subject primary key
     * @return Tree7subject Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ITree7subject getTree7subject(ITree7subjectPK tree7subjectPK) throws CustomException;

    /**
     * Search tree7subject in database for tree7subjectPK:
     * @param tree7subjectPK: Tree7subject Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getTree7subjectExists(ITree7subjectPK tree7subjectPK) throws DBException;

    /**
     * try to insert Tree7subject object in database
     * commit transaction
     * @param tree7subject: Tree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertTree7subject(ITree7subject tree7subject) throws CustomException, DataException;

    /**
     * check if Tree7subject exists
     * insert if not, update if found
     * do not commit transaction
     * @param tree7subject: Tree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateTree7subject(ITree7subject tree7subject) throws CustomException, DataException;

    /**
     * try to update Tree7subject object in database
     * commit transaction
     * @param tree7subject: Tree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateTree7subject(ITree7subject tree7subject) throws CustomException, DataException;
    
    /**
     * try to delete Tree7subject object in database
     * commit transaction
     * @param tree7subject: Tree7subject Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteTree7subject(ITree7subject tree7subject) throws CustomException;

    /**
     * try to insert Tree7subject object in database
     * do not commit transaction
     * @param tree7subject: Tree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertTree7subject(ITree7subject tree7subject) throws CustomException, DataException;

    /**
     * try to update Tree7subject object in database
     * do not commit transaction
     * @param tree7subject: Tree7subject Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateTree7subject(ITree7subject tree7subject) throws CustomException, DataException;
    
    /**
     * try to delete Tree7subject object in database
     * do not commit transaction
     * @param tree7subject: Tree7subject Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteTree7subject(ITree7subject tree7subject) throws CustomException;
    
    /**
     * @param tree7subjectPK: foreign key for Tree7subject
     * @return all Tree7subject Entity objects for Tree7subject
     * @throws film.general.exception.CustomException
     */
    public ArrayList getTree7subjects4tree7subjectParentsubjectid(ITree7subjectPK tree7subjectPK) throws CustomException;

    
    /**
     * @param phototree7subjectPK: parent Phototree7subject for child object Tree7subject Entity
     * @return child Tree7subject Entity object
     * @throws film.general.exception.CustomException
     */
    public ITree7subject getPhototree7subject(IPhototree7subjectPK phototree7subjectPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
