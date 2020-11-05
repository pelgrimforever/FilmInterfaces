/*
 * IBLpostalcode.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IPostalcode;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Postalcode
 * 
 * methods for manipulating data- and database objects
 * for Entity Postalcode and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLpostalcode extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Postalcode()
     * @return new empty IPostalcode object
     */
    public IPostalcode newPostalcode();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Postalcode(primarykey fields)
     * @return new IPostalcode object with initialized primary key
     */
    public IPostalcode newPostalcode(java.lang.String countrycode, java.lang.String postalcode);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Postalcode(IPostalcodePK postalcodePK)
     * @param postalcodePK: primary key
     * @return new IPostalcode object with initialized primary key
     */
    public IPostalcode newPostalcode(IPostalcodePK postalcodePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new PostalcodePK()
     * @return new empty IPostalcodePK object
     */
    public IPostalcodePK newPostalcodePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new PostalcodePK(primarykey fields)
     * @return new IPostalcodePK object with initialized primary key
     */
    public IPostalcodePK newPostalcodePK(java.lang.String countrycode, java.lang.String postalcode);

    /**
     * 
     * @return all Postalcode objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Postalcode objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPostalcodes() throws CustomException;

    /**
     * 
     * @param postalcodePK: Postalcode primary key
     * @return Postalcode Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IPostalcode getPostalcode(IPostalcodePK postalcodePK) throws CustomException;

    /**
     * Search postalcode in database for postalcodePK:
     * @param postalcodePK: Postalcode Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getPostalcodeExists(IPostalcodePK postalcodePK) throws DBException;

    /**
     * try to insert Postalcode object in database
     * commit transaction
     * @param postalcode: Postalcode Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertPostalcode(IPostalcode postalcode) throws CustomException, DataException;

    /**
     * check if Postalcode exists
     * insert if not, update if found
     * do not commit transaction
     * @param postalcode: Postalcode Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdatePostalcode(IPostalcode postalcode) throws CustomException, DataException;

    /**
     * try to update Postalcode object in database
     * commit transaction
     * @param postalcode: Postalcode Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updatePostalcode(IPostalcode postalcode) throws CustomException, DataException;
    
    /**
     * try to delete Postalcode object in database
     * commit transaction
     * @param postalcode: Postalcode Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deletePostalcode(IPostalcode postalcode) throws CustomException;

    /**
     * try to insert Postalcode object in database
     * do not commit transaction
     * @param postalcode: Postalcode Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertPostalcode(IPostalcode postalcode) throws CustomException, DataException;

    /**
     * try to update Postalcode object in database
     * do not commit transaction
     * @param postalcode: Postalcode Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updatePostalcode(IPostalcode postalcode) throws CustomException, DataException;
    
    /**
     * try to delete Postalcode object in database
     * do not commit transaction
     * @param postalcode: Postalcode Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deletePostalcode(IPostalcode postalcode) throws CustomException;
    
    /**
     * @param arealevel3PK: foreign key for Arealevel3
     * @return all Postalcode Entity objects for Arealevel3
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPostalcodes4arealevel3(IArealevel3PK arealevel3PK) throws CustomException;

    
    /**
     * @param localityPK: parent Locality for child object Postalcode Entity
     * @return child Postalcode Entity object
     * @throws film.general.exception.CustomException
     */
    public IPostalcode getLocality(ILocalityPK localityPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
