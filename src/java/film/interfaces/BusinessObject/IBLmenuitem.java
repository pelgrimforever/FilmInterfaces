/*
 * IBLmenuitem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import film.entity.pk.*;
import film.interfaces.logicentity.IMenuitem;
import film.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Menuitem
 * 
 * methods for manipulating data- and database objects
 * for Entity Menuitem and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLmenuitem extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Menuitem()
     * @return new empty IMenuitem object
     */
    public IMenuitem newMenuitem();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Menuitem(primarykey fields)
     * @return new IMenuitem object with initialized primary key
     */
    public IMenuitem newMenuitem(java.lang.String mainmenu, java.lang.String menu, java.lang.String menuitem);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Menuitem(IMenuitemPK menuitemPK)
     * @param menuitemPK: primary key
     * @return new IMenuitem object with initialized primary key
     */
    public IMenuitem newMenuitem(IMenuitemPK menuitemPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new MenuitemPK()
     * @return new empty IMenuitemPK object
     */
    public IMenuitemPK newMenuitemPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new MenuitemPK(primarykey fields)
     * @return new IMenuitemPK object with initialized primary key
     */
    public IMenuitemPK newMenuitemPK(java.lang.String mainmenu, java.lang.String menu, java.lang.String menuitem);

    /**
     * 
     * @return all Menuitem objects from database, unsorted
     * @throws film.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Menuitem objects from database, customizable
     * @throws film.general.exception.CustomException
     */
    public ArrayList getMenuitems() throws CustomException;

    /**
     * 
     * @param menuitemPK: Menuitem primary key
     * @return Menuitem Entity object for primary key
     * @throws film.general.exception.CustomException
     */
    public IMenuitem getMenuitem(IMenuitemPK menuitemPK) throws CustomException;

    /**
     * Search menuitem in database for menuitemPK:
     * @param menuitemPK: Menuitem Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getMenuitemExists(IMenuitemPK menuitemPK) throws DBException;

    /**
     * try to insert Menuitem object in database
     * commit transaction
     * @param menuitem: Menuitem Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertMenuitem(IMenuitem menuitem) throws CustomException, DataException;

    /**
     * check if Menuitem exists
     * insert if not, update if found
     * do not commit transaction
     * @param menuitem: Menuitem Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void insertupdateMenuitem(IMenuitem menuitem) throws CustomException, DataException;

    /**
     * try to update Menuitem object in database
     * commit transaction
     * @param menuitem: Menuitem Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void updateMenuitem(IMenuitem menuitem) throws CustomException, DataException;
    
    /**
     * try to delete Menuitem object in database
     * commit transaction
     * @param menuitem: Menuitem Entity Object
     * @throws film.general.exception.CustomException
     */
    public void deleteMenuitem(IMenuitem menuitem) throws CustomException;

    /**
     * try to insert Menuitem object in database
     * do not commit transaction
     * @param menuitem: Menuitem Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_insertMenuitem(IMenuitem menuitem) throws CustomException, DataException;

    /**
     * try to update Menuitem object in database
     * do not commit transaction
     * @param menuitem: Menuitem Entity Object
     * @throws film.general.exception.CustomException
     * @throws film.general.exception.DataException
     */
    public void trans_updateMenuitem(IMenuitem menuitem) throws CustomException, DataException;
    
    /**
     * try to delete Menuitem object in database
     * do not commit transaction
     * @param menuitem: Menuitem Entity Object
     * @throws film.general.exception.CustomException
     */
    public void trans_deleteMenuitem(IMenuitem menuitem) throws CustomException;
    
    /**
     * @param menuPK: foreign key for Menu
     * @return all Menuitem Entity objects for Menu
     * @throws film.general.exception.CustomException
     */
    public ArrayList getMenuitems4menu(IMenuPK menuPK) throws CustomException;

    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws film.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
