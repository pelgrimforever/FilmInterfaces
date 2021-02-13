/*
 * eMenuitem.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.1.2021 12:6
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
import film.interfaces.logicentity.IMenuitem;
import film.interfaces.entity.pk.*;

/**
 * Entity class Menuitem
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Menuitem Entity
 * 
 * @author Franky Laseure
 */
public class eMenuitem extends AbstractEntity implements EntityInterface {

    protected MenuitemPK menuitemPK;
    private java.lang.String tabpanel;
    private java.lang.String editpanel;
    private java.lang.String servlet;
	  
    public static final String table = "menuitem";
    public static final String SQLWhere1 = "mainmenu = :menuitem.mainmenu: and menu = :menuitem.menu: and menuitem = :menuitem.menuitem:";
    public static final String SQLSelect1 = "select menuitem.* from menuitem where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from menuitem where " + SQLWhere1;
    public static final String SQLSelectAll = "select menuitem.* from menuitem";
	  
    public String getFieldname(short fieldconstant) {
        return IMenuitem.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMenuitem.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Menuitem
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Menuitem (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Menuitem (=Primarykey)
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
     * @return SQL select statement for all Menuitems
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.menuitemPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.menuitemPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IMenuitem.TABPANEL, tabpanel);
        updates.put(IMenuitem.EDITPANEL, editpanel);
        updates.put(IMenuitem.SERVLET, servlet);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
