/*
 * IBLspatial_ref_sys.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ISpatial_ref_sys;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Spatial_ref_sys
 * 
 * methods for manipulating data- and database objects
 * for Entity Spatial_ref_sys and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLspatial_ref_sys extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Spatial_ref_sys()
     * @return new empty ISpatial_ref_sys object
     */
    public ISpatial_ref_sys newSpatial_ref_sys();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Spatial_ref_sys(primarykey fields)
     * @return new ISpatial_ref_sys object with initialized primary key
     */
    public ISpatial_ref_sys newSpatial_ref_sys(int srid);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Spatial_ref_sys(ISpatial_ref_sysPK spatial_ref_sysPK)
     * @param spatial_ref_sysPK: primary key
     * @return new ISpatial_ref_sys object with initialized primary key
     */
    public ISpatial_ref_sys newSpatial_ref_sys(ISpatial_ref_sysPK spatial_ref_sysPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Spatial_ref_sysPK()
     * @return new empty ISpatial_ref_sysPK object
     */
    public ISpatial_ref_sysPK newSpatial_ref_sysPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Spatial_ref_sysPK(primarykey fields)
     * @return new ISpatial_ref_sysPK object with initialized primary key
     */
    public ISpatial_ref_sysPK newSpatial_ref_sysPK(int srid);

    /**
     * 
     * @return all Spatial_ref_sys objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Spatial_ref_sys objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSpatial_ref_syss() throws CustomException;

    /**
     * 
     * @param spatial_ref_sysPK: Spatial_ref_sys primary key
     * @return Spatial_ref_sys Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ISpatial_ref_sys getSpatial_ref_sys(ISpatial_ref_sysPK spatial_ref_sysPK) throws CustomException;

    /**
     * Search spatial_ref_sys in database for spatial_ref_sysPK:
     * @param spatial_ref_sysPK: Spatial_ref_sys Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSpatial_ref_sysExists(ISpatial_ref_sysPK spatial_ref_sysPK) throws DBException;

    /**
     * try to insert Spatial_ref_sys object in database
     * commit transaction
     * @param spatial_ref_sys: Spatial_ref_sys Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertSpatial_ref_sys(ISpatial_ref_sys spatial_ref_sys) throws CustomException, DataException;

    /**
     * check if Spatial_ref_sys exists
     * insert if not, update if found
     * do not commit transaction
     * @param spatial_ref_sys: Spatial_ref_sys Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateSpatial_ref_sys(ISpatial_ref_sys spatial_ref_sys) throws CustomException, DataException;

    /**
     * try to update Spatial_ref_sys object in database
     * commit transaction
     * @param spatial_ref_sys: Spatial_ref_sys Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateSpatial_ref_sys(ISpatial_ref_sys spatial_ref_sys) throws CustomException, DataException;
    
    /**
     * try to delete Spatial_ref_sys object in database
     * commit transaction
     * @param spatial_ref_sys: Spatial_ref_sys Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteSpatial_ref_sys(ISpatial_ref_sys spatial_ref_sys) throws CustomException;

    /**
     * try to insert Spatial_ref_sys object in database
     * do not commit transaction
     * @param spatial_ref_sys: Spatial_ref_sys Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertSpatial_ref_sys(ISpatial_ref_sys spatial_ref_sys) throws CustomException, DataException;

    /**
     * try to update Spatial_ref_sys object in database
     * do not commit transaction
     * @param spatial_ref_sys: Spatial_ref_sys Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateSpatial_ref_sys(ISpatial_ref_sys spatial_ref_sys) throws CustomException, DataException;
    
    /**
     * try to delete Spatial_ref_sys object in database
     * do not commit transaction
     * @param spatial_ref_sys: Spatial_ref_sys Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteSpatial_ref_sys(ISpatial_ref_sys spatial_ref_sys) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
