/*
 * IBLsecurityuserprofile.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.ISecurityuserprofile;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Securityuserprofile
 * 
 * methods for manipulating data- and database objects
 * for Entity Securityuserprofile and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLsecurityuserprofile extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Securityuserprofile()
     * @return new empty ISecurityuserprofile object
     */
    public ISecurityuserprofile newSecurityuserprofile();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Securityuserprofile(primarykey fields)
     * @return new ISecurityuserprofile object with initialized primary key
     */
    public ISecurityuserprofile newSecurityuserprofile(java.lang.String siteusername, java.lang.String userprofile);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Securityuserprofile(ISecurityuserprofilePK securityuserprofilePK)
     * @param securityuserprofilePK: primary key
     * @return new ISecurityuserprofile object with initialized primary key
     */
    public ISecurityuserprofile newSecurityuserprofile(ISecurityuserprofilePK securityuserprofilePK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SecurityuserprofilePK()
     * @return new empty ISecurityuserprofilePK object
     */
    public ISecurityuserprofilePK newSecurityuserprofilePK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new SecurityuserprofilePK(primarykey fields)
     * @return new ISecurityuserprofilePK object with initialized primary key
     */
    public ISecurityuserprofilePK newSecurityuserprofilePK(java.lang.String siteusername, java.lang.String userprofile);

    /**
     * 
     * @return all Securityuserprofile objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Securityuserprofile objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSecurityuserprofiles() throws CustomException;

    /**
     * 
     * @param securityuserprofilePK: Securityuserprofile primary key
     * @return Securityuserprofile Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public ISecurityuserprofile getSecurityuserprofile(ISecurityuserprofilePK securityuserprofilePK) throws CustomException;

    /**
     * Search securityuserprofile in database for securityuserprofilePK:
     * @param securityuserprofilePK: Securityuserprofile Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getSecurityuserprofileExists(ISecurityuserprofilePK securityuserprofilePK) throws DBException;

    /**
     * try to insert Securityuserprofile object in database
     * commit transaction
     * @param securityuserprofile: Securityuserprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertSecurityuserprofile(ISecurityuserprofile securityuserprofile) throws CustomException, DataException;

    /**
     * check if Securityuserprofile exists
     * insert if not, update if found
     * do not commit transaction
     * @param securityuserprofile: Securityuserprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateSecurityuserprofile(ISecurityuserprofile securityuserprofile) throws CustomException, DataException;

    /**
     * try to update Securityuserprofile object in database
     * commit transaction
     * @param securityuserprofile: Securityuserprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateSecurityuserprofile(ISecurityuserprofile securityuserprofile) throws CustomException, DataException;
    
    /**
     * try to delete Securityuserprofile object in database
     * commit transaction
     * @param securityuserprofile: Securityuserprofile Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteSecurityuserprofile(ISecurityuserprofile securityuserprofile) throws CustomException;

    /**
     * try to insert Securityuserprofile object in database
     * do not commit transaction
     * @param securityuserprofile: Securityuserprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertSecurityuserprofile(ISecurityuserprofile securityuserprofile) throws CustomException, DataException;

    /**
     * try to update Securityuserprofile object in database
     * do not commit transaction
     * @param securityuserprofile: Securityuserprofile Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateSecurityuserprofile(ISecurityuserprofile securityuserprofile) throws CustomException, DataException;
    
    /**
     * try to delete Securityuserprofile object in database
     * do not commit transaction
     * @param securityuserprofile: Securityuserprofile Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteSecurityuserprofile(ISecurityuserprofile securityuserprofile) throws CustomException;
    
    /**
     * @param securityprofilePK: foreign key for Securityprofile
     * @return all Securityuserprofile Entity objects for Securityprofile
     * @throws film.general.exception.CustomException
     */
    public ArrayList getSecurityuserprofiles4securityprofile(ISecurityprofilePK securityprofilePK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
