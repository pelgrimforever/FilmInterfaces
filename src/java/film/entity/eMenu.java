/*
 * eMenu.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.entity;

import film.filmDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import film.entity.pk.*;
import film.interfaces.logicentity.IMenu;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Menu
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Menu Entity
 * 
 * @author Franky Laseure
 */
public class eMenu extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected MenuPK menuPK;
	  
    public static final String table = "menu";
	  
    public String getFieldname(short fieldconstant) {
        return IMenu.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMenu.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eMenu.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eMenu.connectionpool;
    }
    
    /**
     * 
     * @return table name for Menu
     */
    public String getTable() { return table; }

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
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.menuPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.menuPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    /**
     * @return MenuPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return MenuPK
     */
    @Override
    public MenuPK getPrimaryKey() {
        return this.menuPK;
    }

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
