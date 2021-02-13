/*
 * IBLfilm.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IFilm;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Film
 * 
 * methods for manipulating data- and database objects
 * for Entity Film and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLfilm extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Film()
     * @return new empty IFilm object
     */
    public IFilm newFilm();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Film(primarykey fields)
     * @return new IFilm object with initialized primary key
     */
    public IFilm newFilm(java.lang.String id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Film(IFilmPK filmPK)
     * @param filmPK: primary key
     * @return new IFilm object with initialized primary key
     */
    public IFilm newFilm(IFilmPK filmPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new FilmPK()
     * @return new empty IFilmPK object
     */
    public IFilmPK newFilmPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new FilmPK(primarykey fields)
     * @return new IFilmPK object with initialized primary key
     */
    public IFilmPK newFilmPK(java.lang.String id);

    /**
     * 
     * @return all Film objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Film objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getFilms() throws CustomException;

    /**
     * 
     * @param filmPK: Film primary key
     * @return Film Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IFilm getFilm(IFilmPK filmPK) throws CustomException;

    /**
     * Search film in database for filmPK:
     * @param filmPK: Film Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getFilmExists(IFilmPK filmPK) throws DBException;

    /**
     * try to insert Film object in database
     * commit transaction
     * @param film: Film Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertFilm(IFilm film) throws CustomException, DataException;

    /**
     * check if Film exists
     * insert if not, update if found
     * do not commit transaction
     * @param film: Film Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateFilm(IFilm film) throws CustomException, DataException;

    /**
     * try to update Film object in database
     * commit transaction
     * @param film: Film Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateFilm(IFilm film) throws CustomException, DataException;
    
    /**
     * try to delete Film object in database
     * commit transaction
     * @param film: Film Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteFilm(IFilm film) throws CustomException;

    /**
     * try to insert Film object in database
     * do not commit transaction
     * @param film: Film Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertFilm(IFilm film) throws CustomException, DataException;

    /**
     * try to update Film object in database
     * do not commit transaction
     * @param film: Film Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateFilm(IFilm film) throws CustomException, DataException;
    
    /**
     * try to delete Film object in database
     * do not commit transaction
     * @param film: Film Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteFilm(IFilm film) throws CustomException;
    
    /**
     * @param filmtypePK: foreign key for Filmtype
     * @return all Film Entity objects for Filmtype
     * @throws film.general.exception.CustomException
     */
    public ArrayList getFilms4filmtype(IFilmtypePK filmtypePK) throws CustomException;

    
    /**
     * @param filmsubjectsPK: parent Filmsubjects for child object Film Entity
     * @return child Film Entity object
     * @throws film.general.exception.CustomException
     */
    public IFilm getFilmsubjects(IFilmsubjectsPK filmsubjectsPK) throws CustomException;

    /**
     * @param photoPK: parent Photo for child object Film Entity
     * @return child Film Entity object
     * @throws film.general.exception.CustomException
     */
    public IFilm getPhoto(IPhotoPK photoPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
