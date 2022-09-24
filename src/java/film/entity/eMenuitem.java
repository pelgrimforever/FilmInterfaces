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
import film.interfaces.logicentity.IMenuitem;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eMenuitem.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eMenuitem.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eMenuitem() {
    }

    public eMenuitem(java.lang.String mainmenu, java.lang.String menu, java.lang.String menuitem) {
        this.menuitemPK = new MenuitemPK(mainmenu, menu, menuitem);
    }
  
    public eMenuitem(MenuitemPK menuitemPK) {
        this.menuitemPK = menuitemPK;
    }

    public boolean isEmpty() {
        return this.menuitemPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.menuitemPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.menuitemPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IMenuitem.TABPANEL, tabpanel);
        updates.put(IMenuitem.EDITPANEL, editpanel);
        updates.put(IMenuitem.SERVLET, servlet);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public MenuitemPK getPrimaryKey() {
        return this.menuitemPK;
    }

    public java.lang.String getTabpanel() {
        return this.tabpanel;
    }

    public void initTabpanel(java.lang.String tabpanel) {
        this.tabpanel = tabpanel;
    }

    public void setTabpanel(java.lang.String tabpanel) {
	if(tabpanel==null && tabpanel!=this.tabpanel || tabpanel!=null && !tabpanel.equals(this.tabpanel)) {
            updates.put(IMenuitem.TABPANEL, tabpanel);
        }
        this.tabpanel = tabpanel;
    }

    public java.lang.String getEditpanel() {
        return this.editpanel;
    }

    public void initEditpanel(java.lang.String editpanel) {
        this.editpanel = editpanel;
    }

    public void setEditpanel(java.lang.String editpanel) {
	if(editpanel==null && editpanel!=this.editpanel || editpanel!=null && !editpanel.equals(this.editpanel)) {
            updates.put(IMenuitem.EDITPANEL, editpanel);
        }
        this.editpanel = editpanel;
    }

    public java.lang.String getServlet() {
        return this.servlet;
    }

    public void initServlet(java.lang.String servlet) {
        this.servlet = servlet;
    }

    public void setServlet(java.lang.String servlet) {
	if(servlet==null && servlet!=this.servlet || servlet!=null && !servlet.equals(this.servlet)) {
            updates.put(IMenuitem.SERVLET, servlet);
        }
        this.servlet = servlet;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
