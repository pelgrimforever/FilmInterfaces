/*
 * IBLarealevel1.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IArealevel1;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Arealevel1
 * 
 * methods for manipulating data- and database objects
 * for Entity Arealevel1 and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLarealevel1 extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel1()
     * @return new empty IArealevel1 object
     */
    public IArealevel1 newArealevel1();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel1(primarykey fields)
     * @return new IArealevel1 object with initialized primary key
     */
    public IArealevel1 newArealevel1(java.lang.String countrycode, java.lang.String al1code);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel1(IArealevel1PK arealevel1PK)
     * @param arealevel1PK: primary key
     * @return new IArealevel1 object with initialized primary key
     */
    public IArealevel1 newArealevel1(IArealevel1PK arealevel1PK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel1PK()
     * @return new empty IArealevel1PK object
     */
    public IArealevel1PK newArealevel1PK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel1PK(primarykey fields)
     * @return new IArealevel1PK object with initialized primary key
     */
    public IArealevel1PK newArealevel1PK(java.lang.String countrycode, java.lang.String al1code);

    /**
     * 
     * @return all Arealevel1 objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Arealevel1 objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArealevel1s() throws CustomException;

    /**
     * 
     * @param arealevel1PK: Arealevel1 primary key
     * @return Arealevel1 Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IArealevel1 getArealevel1(IArealevel1PK arealevel1PK) throws CustomException;

    /**
     * Search arealevel1 in database for arealevel1PK:
     * @param arealevel1PK: Arealevel1 Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getArealevel1Exists(IArealevel1PK arealevel1PK) throws DBException;

    /**
     * try to insert Arealevel1 object in database
     * commit transaction
     * @param arealevel1: Arealevel1 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertArealevel1(IArealevel1 arealevel1) throws CustomException, DataException;

    /**
     * check if Arealevel1 exists
     * insert if not, update if found
     * do not commit transaction
     * @param arealevel1: Arealevel1 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateArealevel1(IArealevel1 arealevel1) throws CustomException, DataException;

    /**
     * try to update Arealevel1 object in database
     * commit transaction
     * @param arealevel1: Arealevel1 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateArealevel1(IArealevel1 arealevel1) throws CustomException, DataException;
    
    /**
     * try to delete Arealevel1 object in database
     * commit transaction
     * @param arealevel1: Arealevel1 Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteArealevel1(IArealevel1 arealevel1) throws CustomException;

    /**
     * try to insert Arealevel1 object in database
     * do not commit transaction
     * @param arealevel1: Arealevel1 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertArealevel1(IArealevel1 arealevel1) throws CustomException, DataException;

    /**
     * try to update Arealevel1 object in database
     * do not commit transaction
     * @param arealevel1: Arealevel1 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateArealevel1(IArealevel1 arealevel1) throws CustomException, DataException;
    
    /**
     * try to delete Arealevel1 object in database
     * do not commit transaction
     * @param arealevel1: Arealevel1 Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteArealevel1(IArealevel1 arealevel1) throws CustomException;
    
    /**
     * @param countryPK: foreign key for Country
     * @return all Arealevel1 Entity objects for Country
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArealevel1s4country(ICountryPK countryPK) throws CustomException;

    
    /**
     * @param arealevel2PK: parent Arealevel2 for child object Arealevel1 Entity
     * @return child Arealevel1 Entity object
     * @throws film.general.exception.CustomException
     */
    public IArealevel1 getArealevel2(IArealevel2PK arealevel2PK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
