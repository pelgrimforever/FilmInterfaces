/*
 * IBLmenu.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IMenu;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Menu
 * 
 * methods for manipulating data- and database objects
 * for Entity Menu and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLmenu extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Menu()
     * @return new empty IMenu object
     */
    public IMenu newMenu();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Menu(primarykey fields)
     * @return new IMenu object with initialized primary key
     */
    public IMenu newMenu(java.lang.String mainmenu, java.lang.String menu);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Menu(IMenuPK menuPK)
     * @param menuPK: primary key
     * @return new IMenu object with initialized primary key
     */
    public IMenu newMenu(IMenuPK menuPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new MenuPK()
     * @return new empty IMenuPK object
     */
    public IMenuPK newMenuPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new MenuPK(primarykey fields)
     * @return new IMenuPK object with initialized primary key
     */
    public IMenuPK newMenuPK(java.lang.String mainmenu, java.lang.String menu);

    /**
     * 
     * @return all Menu objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Menu objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getMenus() throws CustomException;

    /**
     * 
     * @param menuPK: Menu primary key
     * @return Menu Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IMenu getMenu(IMenuPK menuPK) throws CustomException;

    /**
     * Search menu in database for menuPK:
     * @param menuPK: Menu Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getMenuExists(IMenuPK menuPK) throws DBException;

    /**
     * try to insert Menu object in database
     * commit transaction
     * @param menu: Menu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertMenu(IMenu menu) throws CustomException, DataException;

    /**
     * check if Menu exists
     * insert if not, update if found
     * do not commit transaction
     * @param menu: Menu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateMenu(IMenu menu) throws CustomException, DataException;

    /**
     * try to update Menu object in database
     * commit transaction
     * @param menu: Menu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateMenu(IMenu menu) throws CustomException, DataException;
    
    /**
     * try to delete Menu object in database
     * commit transaction
     * @param menu: Menu Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteMenu(IMenu menu) throws CustomException;

    /**
     * try to insert Menu object in database
     * do not commit transaction
     * @param menu: Menu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertMenu(IMenu menu) throws CustomException, DataException;

    /**
     * try to update Menu object in database
     * do not commit transaction
     * @param menu: Menu Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateMenu(IMenu menu) throws CustomException, DataException;
    
    /**
     * try to delete Menu object in database
     * do not commit transaction
     * @param menu: Menu Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteMenu(IMenu menu) throws CustomException;
    
    /**
     * @param mainmenuPK: foreign key for Mainmenu
     * @return all Menu Entity objects for Mainmenu
     * @throws film.general.exception.CustomException
     */
    public ArrayList getMenus4mainmenu(IMainmenuPK mainmenuPK) throws CustomException;

    
    /**
     * @param menuitemPK: parent Menuitem for child object Menu Entity
     * @return child Menu Entity object
     * @throws film.general.exception.CustomException
     */
    public IMenu getMenuitem(IMenuitemPK menuitemPK) throws CustomException;

//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
