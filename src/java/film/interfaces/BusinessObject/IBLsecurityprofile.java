/*
 * IBLsecurityprofile.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ISecurityprofile;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Securityprofile
 * 
 * methods for manipulating data- and database objects
 * for Entity Securityprofile and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsecurityprofile extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Securityprofile()
     * @return new empty ISecurityprofile object
     */
    public ISecurityprofile newSecurityprofile();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Securityprofile(primarykey fields)
     * @return new ISecurityprofile object with initialized primary key
     */
    public ISecurityprofile newSecurityprofile(java.lang.String userprofile);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Securityprofile(ISecurityprofilePK securityprofilePK)
     * @param securityprofilePK: primary key
     * @return new ISecurityprofile object with initialized primary key
     */
    public ISecurityprofile newSecurityprofile(ISecurityprofilePK securityprofilePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SecurityprofilePK()
     * @return new empty ISecurityprofilePK object
     */
    public ISecurityprofilePK newSecurityprofilePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SecurityprofilePK(primarykey fields)
     * @return new ISecurityprofilePK object with initialized primary key
     */
    public ISecurityprofilePK newSecurityprofilePK(java.lang.String userprofile);

    /**
     * 
     * @return all Securityprofile objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Securityprofile objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSecurityprofiles() throws CustomException;

    /**
     * 
     * @param securityprofilePK: Securityprofile primary key
     * @return Securityprofile Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ISecurityprofile getSecurityprofile(ISecurityprofilePK securityprofilePK) throws CustomException;

    /**
     * Search securityprofile in database for securityprofilePK:
     * @param securityprofilePK: Securityprofile Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSecurityprofileExists(ISecurityprofilePK securityprofilePK) throws DBException;

    /**
     * try to insert Securityprofile object in database
     * commit transaction
     * @param securityprofile: Securityprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertSecurityprofile(ISecurityprofile securityprofile) throws CustomException, DataException;

    /**
     * check if Securityprofile exists
     * insert if not, update if found
     * do not commit transaction
     * @param securityprofile: Securityprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateSecurityprofile(ISecurityprofile securityprofile) throws CustomException, DataException;

    /**
     * try to update Securityprofile object in database
     * commit transaction
     * @param securityprofile: Securityprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateSecurityprofile(ISecurityprofile securityprofile) throws CustomException, DataException;
    
    /**
     * try to delete Securityprofile object in database
     * commit transaction
     * @param securityprofile: Securityprofile Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteSecurityprofile(ISecurityprofile securityprofile) throws CustomException;

    /**
     * try to insert Securityprofile object in database
     * do not commit transaction
     * @param securityprofile: Securityprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertSecurityprofile(ISecurityprofile securityprofile) throws CustomException, DataException;

    /**
     * try to update Securityprofile object in database
     * do not commit transaction
     * @param securityprofile: Securityprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateSecurityprofile(ISecurityprofile securityprofile) throws CustomException, DataException;
    
    /**
     * try to delete Securityprofile object in database
     * do not commit transaction
     * @param securityprofile: Securityprofile Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteSecurityprofile(ISecurityprofile securityprofile) throws CustomException;
    
    
    /**
     * @param securityuserprofilePK: parent Securityuserprofile for child object Securityprofile Entity
     * @return child Securityprofile Entity object
     * @throws film.general.exception.CustomException
     */
    public ISecurityprofile getSecurityuserprofile(ISecurityuserprofilePK securityuserprofilePK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
