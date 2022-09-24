/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

public class eMenu extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected MenuPK menuPK;
	  
    public static final String table = "menu";
	  
    public String getFieldname(short fieldconstant) {
        return IMenu.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMenu.fieldtypes[fieldconstant-1];
    }
        
    @Override
    public String getDbtool() {
        return eMenu.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eMenu.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eMenu() {
    }

    public eMenu(java.lang.String mainmenu, java.lang.String menu) {
        this.menuPK = new MenuPK(mainmenu, menu);
    }
  
    public eMenu(MenuPK menuPK) {
        this.menuPK = menuPK;
    }

    public boolean isEmpty() {
        return this.menuPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.menuPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.menuPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public MenuPK getPrimaryKey() {
        return this.menuPK;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
