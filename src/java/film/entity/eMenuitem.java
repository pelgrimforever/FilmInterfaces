/*
 * eMenuitem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.5.2022 10:44
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
import film.interfaces.logicentity.IMenuitem;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Menuitem
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Menuitem Entity
 * 
 * @author Franky Laseure
 */
public class eMenuitem extends AbstractEntity implements filmDatabaseproperties, Entity {

    protected MenuitemPK menuitemPK;
    private java.lang.String tabpanel;
    private java.lang.String editpanel;
    private java.lang.String servlet;
	  
    public static final String table = "menuitem";
	  
    public String getFieldname(short fieldconstant) {
        return IMenuitem.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMenuitem.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eMenuitem.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eMenuitem.connectionpool;
    }
    
    /**
     * 
     * @return table name for Menuitem
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Menuitem class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Menuitem entity
     */
    public eMenuitem() {
    }

    /**
     * Constructor
     * build an empty Menuitem entity with initialized field values
     */
    public eMenuitem(java.lang.String mainmenu, java.lang.String menu, java.lang.String menuitem) {
        this.menuitemPK = new MenuitemPK(mainmenu, menu, menuitem);
    }
  
    /**
     * Constructor
     * build an empty Menuitem entity with initialized Primarykey parameter
     * @param menuitemPK: Menuitem Primarykey
     */
    public eMenuitem(MenuitemPK menuitemPK) {
        this.menuitemPK = menuitemPK;
    }

    /**
     * @return is Menuitem Empty ?
     */
    public boolean isEmpty() {
        return this.menuitemPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.menuitemPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.menuitemPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IMenuitem.TABPANEL, tabpanel);
        updates.put(IMenuitem.EDITPANEL, editpanel);
        updates.put(IMenuitem.SERVLET, servlet);
        return getAllFields();
    }
	
    /**
     * @return MenuitemPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return MenuitemPK
     */
    @Override
    public MenuitemPK getPrimaryKey() {
        return this.menuitemPK;
    }

    /**
     * 
     * @return tabpanel value
     */
    public java.lang.String getTabpanel() {
        return this.tabpanel;
    }

    /**
     * set tabpanel value
     * @param tabpanel: new value
     */
    public void initTabpanel(java.lang.String tabpanel) {
        this.tabpanel = tabpanel;
    }

    /**
     * set tabpanel value
     * @param tabpanel: new value
     */
    public void setTabpanel(java.lang.String tabpanel) {
	if(tabpanel==null && tabpanel!=this.tabpanel || tabpanel!=null && !tabpanel.equals(this.tabpanel)) {
            updates.put(IMenuitem.TABPANEL, tabpanel);
        }
        this.tabpanel = tabpanel;
    }

    /**
     * 
     * @return editpanel value
     */
    public java.lang.String getEditpanel() {
        return this.editpanel;
    }

    /**
     * set editpanel value
     * @param editpanel: new value
     */
    public void initEditpanel(java.lang.String editpanel) {
        this.editpanel = editpanel;
    }

    /**
     * set editpanel value
     * @param editpanel: new value
     */
    public void setEditpanel(java.lang.String editpanel) {
	if(editpanel==null && editpanel!=this.editpanel || editpanel!=null && !editpanel.equals(this.editpanel)) {
            updates.put(IMenuitem.EDITPANEL, editpanel);
        }
        this.editpanel = editpanel;
    }

    /**
     * 
     * @return servlet value
     */
    public java.lang.String getServlet() {
        return this.servlet;
    }

    /**
     * set servlet value
     * @param servlet: new value
     */
    public void initServlet(java.lang.String servlet) {
        this.servlet = servlet;
    }

    /**
     * set servlet value
     * @param servlet: new value
     */
    public void setServlet(java.lang.String servlet) {
	if(servlet==null && servlet!=this.servlet || servlet!=null && !servlet.equals(this.servlet)) {
            updates.put(IMenuitem.SERVLET, servlet);
        }
        this.servlet = servlet;
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
