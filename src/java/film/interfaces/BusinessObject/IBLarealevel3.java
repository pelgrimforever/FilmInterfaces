/*
 * IBLarealevel3.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IArealevel3;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Arealevel3
 * 
 * methods for manipulating data- and database objects
 * for Entity Arealevel3 and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLarealevel3 extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel3()
     * @return new empty IArealevel3 object
     */
    public IArealevel3 newArealevel3();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel3(primarykey fields)
     * @return new IArealevel3 object with initialized primary key
     */
    public IArealevel3 newArealevel3(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code, java.lang.String al3code);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel3(IArealevel3PK arealevel3PK)
     * @param arealevel3PK: primary key
     * @return new IArealevel3 object with initialized primary key
     */
    public IArealevel3 newArealevel3(IArealevel3PK arealevel3PK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel3PK()
     * @return new empty IArealevel3PK object
     */
    public IArealevel3PK newArealevel3PK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Arealevel3PK(primarykey fields)
     * @return new IArealevel3PK object with initialized primary key
     */
    public IArealevel3PK newArealevel3PK(java.lang.String countrycode, java.lang.String al1code, java.lang.String al2code, java.lang.String al3code);

    /**
     * 
     * @return all Arealevel3 objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Arealevel3 objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArealevel3s() throws CustomException;

    /**
     * 
     * @param arealevel3PK: Arealevel3 primary key
     * @return Arealevel3 Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IArealevel3 getArealevel3(IArealevel3PK arealevel3PK) throws CustomException;

    /**
     * Search arealevel3 in database for arealevel3PK:
     * @param arealevel3PK: Arealevel3 Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getArealevel3Exists(IArealevel3PK arealevel3PK) throws DBException;

    /**
     * try to insert Arealevel3 object in database
     * commit transaction
     * @param arealevel3: Arealevel3 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertArealevel3(IArealevel3 arealevel3) throws CustomException, DataException;

    /**
     * check if Arealevel3 exists
     * insert if not, update if found
     * do not commit transaction
     * @param arealevel3: Arealevel3 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateArealevel3(IArealevel3 arealevel3) throws CustomException, DataException;

    /**
     * try to update Arealevel3 object in database
     * commit transaction
     * @param arealevel3: Arealevel3 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateArealevel3(IArealevel3 arealevel3) throws CustomException, DataException;
    
    /**
     * try to delete Arealevel3 object in database
     * commit transaction
     * @param arealevel3: Arealevel3 Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteArealevel3(IArealevel3 arealevel3) throws CustomException;

    /**
     * try to insert Arealevel3 object in database
     * do not commit transaction
     * @param arealevel3: Arealevel3 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertArealevel3(IArealevel3 arealevel3) throws CustomException, DataException;

    /**
     * try to update Arealevel3 object in database
     * do not commit transaction
     * @param arealevel3: Arealevel3 Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateArealevel3(IArealevel3 arealevel3) throws CustomException, DataException;
    
    /**
     * try to delete Arealevel3 object in database
     * do not commit transaction
     * @param arealevel3: Arealevel3 Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteArealevel3(IArealevel3 arealevel3) throws CustomException;
    
    /**
     * @param arealevel2PK: foreign key for Arealevel2
     * @return all Arealevel3 Entity objects for Arealevel2
     * @throws film.general.exception.CustomException
     */
    public ArrayList getArealevel3s4arealevel2(IArealevel2PK arealevel2PK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
