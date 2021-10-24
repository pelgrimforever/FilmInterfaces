/*
 * eMainmenu.java
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
import film.interfaces.logicentity.IMainmenu;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Mainmenu
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Mainmenu Entity
 * 
 * @author Franky Laseure
 */
public class eMainmenu extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected MainmenuPK mainmenuPK;
    private java.lang.String popuplabel;
    private java.lang.String icon;
	  
    public static final String table = "mainmenu";
	  
    public String getFieldname(short fieldconstant) {
        return IMainmenu.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMainmenu.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eMainmenu.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eMainmenu.connectionpool;
    }
    
    /**
     * 
     * @return table name for Mainmenu
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Mainmenu class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Mainmenu entity
     */
    public eMainmenu() {
    }

    /**
     * Constructor
     * build an empty Mainmenu entity with initialized field values
     */
    public eMainmenu(java.lang.String mainmenu) {
        this.mainmenuPK = new MainmenuPK(mainmenu);
    }
  
    /**
     * Constructor
     * build an empty Mainmenu entity with initialized Primarykey parameter
     * @param mainmenuPK: Mainmenu Primarykey
     */
    public eMainmenu(MainmenuPK mainmenuPK) {
        this.mainmenuPK = mainmenuPK;
    }

    /**
     * @return is Mainmenu Empty ?
     */
    public boolean isEmpty() {
        return this.mainmenuPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.mainmenuPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.mainmenuPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IMainmenu.POPUPLABEL, popuplabel);
        updates.put(IMainmenu.ICON, icon);
        return getAllFields();
    }
	
    /**
     * @return MainmenuPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return MainmenuPK
     */
    @Override
    public MainmenuPK getPrimaryKey() {
        return this.mainmenuPK;
    }

    /**
     * 
     * @return popuplabel value
     */
    public java.lang.String getPopuplabel() {
        return this.popuplabel;
    }

    /**
     * set popuplabel value
     * @param popuplabel: new value
     */
    public void initPopuplabel(java.lang.String popuplabel) {
        this.popuplabel = popuplabel;
    }

    /**
     * set popuplabel value
     * @param popuplabel: new value
     */
    public void setPopuplabel(java.lang.String popuplabel) {
	if(popuplabel==null && popuplabel!=this.popuplabel || popuplabel!=null && !popuplabel.equals(this.popuplabel)) {
            updates.put(IMainmenu.POPUPLABEL, popuplabel);
        }
        this.popuplabel = popuplabel;
    }

    /**
     * 
     * @return icon value
     */
    public java.lang.String getIcon() {
        return this.icon;
    }

    /**
     * set icon value
     * @param icon: new value
     */
    public void initIcon(java.lang.String icon) {
        this.icon = icon;
    }

    /**
     * set icon value
     * @param icon: new value
     */
    public void setIcon(java.lang.String icon) {
	if(icon==null && icon!=this.icon || icon!=null && !icon.equals(this.icon)) {
            updates.put(IMainmenu.ICON, icon);
        }
        this.icon = icon;
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
