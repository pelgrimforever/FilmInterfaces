/*
 * eMenu.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.entity;

import data.interfaces.db.AbstractEntity;
import data.interfaces.db.EntityInterface;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import film.entity.pk.*;
import film.interfaces.logicentity.IMenu;
import film.interfaces.entity.pk.*;

/**
 * Entity class Menu
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Menu Entity
 * 
 * @author Franky Laseure
 */
public class eMenu extends AbstractEntity implements EntityInterface {

    protected MenuPK menuPK;
	  
    public static final String table = "menu";
    public static final String SQLWhere1 = "mainmenu = :menu.mainmenu: and menu = :menu.menu:";
    public static final String SQLSelect1 = "select menu.* from menu where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from menu where " + SQLWhere1;
    public static final String SQLSelectAll = "select menu.* from menu";
	  
    public String getFieldname(short fieldconstant) {
        return IMenu.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMenu.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Menu
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Menu (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Menu (=Primarykey)
     */
    public String getSQLSelect1() { return SQLSelect1; };

    /**
     * @return Select statement for Primary key, with count field as result
     * count = 1: exists
     * count = 0: not found
     */
    public String getSQLPKExcists() { return SQLSelectPKexists; };
    
    /**
     * 
     * @return SQL select statement for all Menus
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

    /**
     * 
     * @return Menu class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Menu entity
     */
    public eMenu() {
    }

    /**
     * Constructor
     * build an empty Menu entity with initialized field values
     */
    public eMenu(java.lang.String mainmenu, java.lang.String menu) {
        this.menuPK = new MenuPK(mainmenu, menu);
    }
  
    /**
     * Constructor
     * build an empty Menu entity with initialized Primarykey parameter
     * @param menuPK: Menu Primarykey
     */
    public eMenu(MenuPK menuPK) {
        this.menuPK = menuPK;
    }

    /**
     * @return is Menu Empty ?
     */
    public boolean isEmpty() {
        return this.menuPK == null;
    }

    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.menuPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.menuPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        return getAllFields();
    }
	
    /* (non-Javadoc)
     * @see .interfaces.db.EntityInterface#getKey()
     */
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return Primary Key Object
     */
    public MenuPK getPrimaryKey() {
        return this.menuPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
