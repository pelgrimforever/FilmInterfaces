/*
 * IBLarealevel2.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IArealevel2;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Arealevel2
 * 
 * methods for manipulating data- and database objects
 * for Entity Arealevel2 and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLarealevel2 extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel2()
     * @return new empty IArealevel2 object
     */
    public IArealevel2 newArealevel2();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel2(primarykey fields)
     * @return new IArealevel2 object with initialized primary key
     */
    public IArealevel2 newArealevel2(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel2(IArealevel2PK arealevel2PK)
     * @param arealevel2PK: primary key
     * @return new IArealevel2 object with initialized primary key
     */
    public IArealevel2 newArealevel2(IArealevel2PK arealevel2PK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel2PK()
     * @return new empty IArealevel2PK object
     */
    public IArealevel2PK newArealevel2PK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel2PK(primarykey fields)
     * @return new IArealevel2PK object with initialized primary key
     */
    public IArealevel2PK newArealevel2PK(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code);

    /**
     * 
     * @return all Arealevel2 objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Arealevel2 objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArealevel2s() throws CustomException;

    /**
     * 
     * @param arealevel2PK: Arealevel2 primary key
     * @return Arealevel2 Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IArealevel2 getArealevel2(IArealevel2PK arealevel2PK) throws CustomException;

    /**
     * Search arealevel2 in database for arealevel2PK:
     * @param arealevel2PK: Arealevel2 Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getArealevel2Exists(IArealevel2PK arealevel2PK) throws DBException;

    /**
     * try to insert Arealevel2 object in database
     * commit transaction
     * @param arealevel2: Arealevel2 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertArealevel2(IArealevel2 arealevel2) throws CustomException, DataException;

    /**
     * check if Arealevel2 exists
     * insert if not, update if found
     * do not commit transaction
     * @param arealevel2: Arealevel2 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateArealevel2(IArealevel2 arealevel2) throws CustomException, DataException;

    /**
     * try to update Arealevel2 object in database
     * commit transaction
     * @param arealevel2: Arealevel2 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateArealevel2(IArealevel2 arealevel2) throws CustomException, DataException;
    
    /**
     * try to delete Arealevel2 object in database
     * commit transaction
     * @param arealevel2: Arealevel2 Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteArealevel2(IArealevel2 arealevel2) throws CustomException;

    /**
     * try to insert Arealevel2 object in database
     * do not commit transaction
     * @param arealevel2: Arealevel2 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertArealevel2(IArealevel2 arealevel2) throws CustomException, DataException;

    /**
     * try to update Arealevel2 object in database
     * do not commit transaction
     * @param arealevel2: Arealevel2 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateArealevel2(IArealevel2 arealevel2) throws CustomException, DataException;
    
    /**
     * try to delete Arealevel2 object in database
     * do not commit transaction
     * @param arealevel2: Arealevel2 Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteArealevel2(IArealevel2 arealevel2) throws CustomException;
    
    /**
     * @param arealevel1PK: foreign key for Arealevel1
     * @return all Arealevel2 Entity objects for Arealevel1
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArealevel2s4arealevel1(IArealevel1PK arealevel1PK) throws CustomException;

    
    /**
     * @param arealevel3PK: parent Arealevel3 for child object Arealevel2 Entity
     * @return child Arealevel2 Entity object
     * @throws film.general.exception.CustomException
     */
    public IArealevel2 getArealevel3(IArealevel3PK arealevel3PK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
