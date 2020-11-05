/*
 * IBLfilmtype.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IFilmtype;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Filmtype
 * 
 * methods for manipulating data- and database objects
 * for Entity Filmtype and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLfilmtype extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Filmtype()
     * @return new empty IFilmtype object
     */
    public IFilmtype newFilmtype();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Filmtype(primarykey fields)
     * @return new IFilmtype object with initialized primary key
     */
    public IFilmtype newFilmtype(java.lang.String type);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Filmtype(IFilmtypePK filmtypePK)
     * @param filmtypePK: primary key
     * @return new IFilmtype object with initialized primary key
     */
    public IFilmtype newFilmtype(IFilmtypePK filmtypePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new FilmtypePK()
     * @return new empty IFilmtypePK object
     */
    public IFilmtypePK newFilmtypePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new FilmtypePK(primarykey fields)
     * @return new IFilmtypePK object with initialized primary key
     */
    public IFilmtypePK newFilmtypePK(java.lang.String type);

    /**
     * 
     * @return all Filmtype objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Filmtype objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getFilmtypes() throws CustomException;

    /**
     * 
     * @param filmtypePK: Filmtype primary key
     * @return Filmtype Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IFilmtype getFilmtype(IFilmtypePK filmtypePK) throws CustomException;

    /**
     * Search filmtype in database for filmtypePK:
     * @param filmtypePK: Filmtype Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getFilmtypeExists(IFilmtypePK filmtypePK) throws DBException;

    /**
     * try to insert Filmtype object in database
     * commit transaction
     * @param filmtype: Filmtype Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertFilmtype(IFilmtype filmtype) throws CustomException, DataException;

    /**
     * check if Filmtype exists
     * insert if not, update if found
     * do not commit transaction
     * @param filmtype: Filmtype Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateFilmtype(IFilmtype filmtype) throws CustomException, DataException;

    /**
     * try to update Filmtype object in database
     * commit transaction
     * @param filmtype: Filmtype Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateFilmtype(IFilmtype filmtype) throws CustomException, DataException;
    
    /**
     * try to delete Filmtype object in database
     * commit transaction
     * @param filmtype: Filmtype Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteFilmtype(IFilmtype filmtype) throws CustomException;

    /**
     * try to insert Filmtype object in database
     * do not commit transaction
     * @param filmtype: Filmtype Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertFilmtype(IFilmtype filmtype) throws CustomException, DataException;

    /**
     * try to update Filmtype object in database
     * do not commit transaction
     * @param filmtype: Filmtype Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateFilmtype(IFilmtype filmtype) throws CustomException, DataException;
    
    /**
     * try to delete Filmtype object in database
     * do not commit transaction
     * @param filmtype: Filmtype Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteFilmtype(IFilmtype filmtype) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
