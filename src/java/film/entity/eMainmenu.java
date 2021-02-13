/*
 * eMainmenu.java
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
import film.interfaces.logicentity.IMainmenu;
import film.interfaces.entity.pk.*;

/**
 * Entity class Mainmenu
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Mainmenu Entity
 * 
 * @author Franky Laseure
 */
public class eMainmenu extends AbstractEntity implements EntityInterface {

    protected MainmenuPK mainmenuPK;
    private java.lang.String popuplabel;
    private java.lang.String icon;
	  
    public static final String table = "mainmenu";
    public static final String SQLWhere1 = "mainmenu = :mainmenu.mainmenu:";
    public static final String SQLSelect1 = "select mainmenu.* from mainmenu where " + SQLWhere1;
    public static final String SQLSelectPKexists = "select count(*) as count from mainmenu where " + SQLWhere1;
    public static final String SQLSelectAll = "select mainmenu.* from mainmenu";
	  
    public String getFieldname(short fieldconstant) {
        return IMainmenu.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IMainmenu.fieldtypes[fieldconstant-1];
    }
        
    /**
     * 
     * @return table name for Mainmenu
     */
    public String getTable() { return table; }

    /**
     * 
     * @return SQL where clause for one Mainmenu (=Primarykey)
     */
    public String getSQLWhere1() { return SQLWhere1; };

    /**
     * 
     * @return SQL select statement for one Mainmenu (=Primarykey)
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
     * @return SQL select statement for all Mainmenus
     */
    public String getSQLSelectAll() { return SQLSelectAll; };

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
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getKeyFields() {
        return this.mainmenuPK.getKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with primarykey fields (fieldname, value)
     */
    @Override
    public Object[][] getInsertKeyFields() {
        return this.mainmenuPK.getInsertKeyFields();	  
    }
  
    /**
     * 
     * @return 2 dimentional Object array with all fields (fieldname, value)
     */
    public Object[][] getAll() {
        updates.put(IMainmenu.POPUPLABEL, popuplabel);
        updates.put(IMainmenu.ICON, icon);
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
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
