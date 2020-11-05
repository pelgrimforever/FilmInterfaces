/*
 * IBLmainmenu.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IMainmenu;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Mainmenu
 * 
 * methods for manipulating data- and database objects
 * for Entity Mainmenu and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLmainmenu extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Mainmenu()
     * @return new empty IMainmenu object
     */
    public IMainmenu newMainmenu();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Mainmenu(primarykey fields)
     * @return new IMainmenu object with initialized primary key
     */
    public IMainmenu newMainmenu(java.lang.String mainmenu);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Mainmenu(IMainmenuPK mainmenuPK)
     * @param mainmenuPK: primary key
     * @return new IMainmenu object with initialized primary key
     */
    public IMainmenu newMainmenu(IMainmenuPK mainmenuPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new MainmenuPK()
     * @return new empty IMainmenuPK object
     */
    public IMainmenuPK newMainmenuPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new MainmenuPK(primarykey fields)
     * @return new IMainmenuPK object with initialized primary key
     */
    public IMainmenuPK newMainmenuPK(java.lang.String mainmenu);

    /**
     * 
     * @return all Mainmenu objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Mainmenu objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getMainmenus() throws CustomException;

    /**
     * 
     * @param mainmenuPK: Mainmenu primary key
     * @return Mainmenu Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IMainmenu getMainmenu(IMainmenuPK mainmenuPK) throws CustomException;

    /**
     * Search mainmenu in database for mainmenuPK:
     * @param mainmenuPK: Mainmenu Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getMainmenuExists(IMainmenuPK mainmenuPK) throws DBException;

    /**
     * try to insert Mainmenu object in database
     * commit transaction
     * @param mainmenu: Mainmenu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertMainmenu(IMainmenu mainmenu) throws CustomException, DataException;

    /**
     * check if Mainmenu exists
     * insert if not, update if found
     * do not commit transaction
     * @param mainmenu: Mainmenu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateMainmenu(IMainmenu mainmenu) throws CustomException, DataException;

    /**
     * try to update Mainmenu object in database
     * commit transaction
     * @param mainmenu: Mainmenu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateMainmenu(IMainmenu mainmenu) throws CustomException, DataException;
    
    /**
     * try to delete Mainmenu object in database
     * commit transaction
     * @param mainmenu: Mainmenu Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteMainmenu(IMainmenu mainmenu) throws CustomException;

    /**
     * try to insert Mainmenu object in database
     * do not commit transaction
     * @param mainmenu: Mainmenu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertMainmenu(IMainmenu mainmenu) throws CustomException, DataException;

    /**
     * try to update Mainmenu object in database
     * do not commit transaction
     * @param mainmenu: Mainmenu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateMainmenu(IMainmenu mainmenu) throws CustomException, DataException;
    
    /**
     * try to delete Mainmenu object in database
     * do not commit transaction
     * @param mainmenu: Mainmenu Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteMainmenu(IMainmenu mainmenu) throws CustomException;
    
    
    /**
     * @param menuPK: parent Menu for child object Mainmenu Entity
     * @return child Mainmenu Entity object
     * @throws film.general.exception.CustomException
     */
    public IMainmenu getMenu(IMenuPK menuPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
