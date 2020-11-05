/*
 * IBLphoto.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IPhoto;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Photo
 * 
 * methods for manipulating data- and database objects
 * for Entity Photo and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLphoto extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Photo()
     * @return new empty IPhoto object
     */
    public IPhoto newPhoto();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Photo(primarykey fields)
     * @return new IPhoto object with initialized primary key
     */
    public IPhoto newPhoto(java.lang.String film, int id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Photo(IPhotoPK photoPK)
     * @param photoPK: primary key
     * @return new IPhoto object with initialized primary key
     */
    public IPhoto newPhoto(IPhotoPK photoPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new PhotoPK()
     * @return new empty IPhotoPK object
     */
    public IPhotoPK newPhotoPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new PhotoPK(primarykey fields)
     * @return new IPhotoPK object with initialized primary key
     */
    public IPhotoPK newPhotoPK(java.lang.String film, int id);

    /**
     * 
     * @return all Photo objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Photo objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhotos() throws CustomException;

    /**
     * 
     * @param photoPK: Photo primary key
     * @return Photo Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IPhoto getPhoto(IPhotoPK photoPK) throws CustomException;

    /**
     * Search photo in database for photoPK:
     * @param photoPK: Photo Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getPhotoExists(IPhotoPK photoPK) throws DBException;

    /**
     * try to insert Photo object in database
     * commit transaction
     * @param photo: Photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertPhoto(IPhoto photo) throws CustomException, DataException;

    /**
     * check if Photo exists
     * insert if not, update if found
     * do not commit transaction
     * @param photo: Photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdatePhoto(IPhoto photo) throws CustomException, DataException;

    /**
     * try to update Photo object in database
     * commit transaction
     * @param photo: Photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updatePhoto(IPhoto photo) throws CustomException, DataException;
    
    /**
     * try to delete Photo object in database
     * commit transaction
     * @param photo: Photo Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deletePhoto(IPhoto photo) throws CustomException;

    /**
     * try to insert Photo object in database
     * do not commit transaction
     * @param photo: Photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertPhoto(IPhoto photo) throws CustomException, DataException;

    /**
     * try to update Photo object in database
     * do not commit transaction
     * @param photo: Photo Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updatePhoto(IPhoto photo) throws CustomException, DataException;
    
    /**
     * try to delete Photo object in database
     * do not commit transaction
     * @param photo: Photo Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deletePhoto(IPhoto photo) throws CustomException;
    
    /**
     * @param routePK: foreign key for Route
     * @return all Photo Entity objects for Route
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhotos4route(IRoutePK routePK) throws CustomException;

    /**
     * @param creatorPK: foreign key for Creator
     * @return all Photo Entity objects for Creator
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhotos4creator(ICreatorPK creatorPK) throws CustomException;

    /**
     * @param filmPK: foreign key for Film
     * @return all Photo Entity objects for Film
     * @throws film.general.exception.CustomException
     */
    public ArrayList getPhotos4film(IFilmPK filmPK) throws CustomException;

    
    /**
     * @param phototree7subjectPK: parent Phototree7subject for child object Photo Entity
     * @return child Photo Entity object
     * @throws film.general.exception.CustomException
     */
    public IPhoto getPhototree7subject(IPhototree7subjectPK phototree7subjectPK) throws CustomException;

    /**
     * @param art_photoPK: parent Art_photo for child object Photo Entity
     * @return child Photo Entity object
     * @throws film.general.exception.CustomException
     */
    public IPhoto getArt_photo(IArt_photoPK art_photoPK) throws CustomException;

    /**
     * @param photosubjectsPK: parent Photosubjects for child object Photo Entity
     * @return child Photo Entity object
     * @throws film.general.exception.CustomException
     */
    public IPhoto getPhotosubjects(IPhotosubjectsPK photosubjectsPK) throws CustomException;

    /**
     * @param phototagsPK: parent Phototags for child object Photo Entity
     * @return child Photo Entity object
     * @throws film.general.exception.CustomException
     */
    public IPhoto getPhototags(IPhototagsPK phototagsPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
