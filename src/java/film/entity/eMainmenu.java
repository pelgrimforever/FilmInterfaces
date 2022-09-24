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
import film.interfaces.logicentity.IMainmenu;
import film.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

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
        
    @Override
    public String getDbtool() {
        return eMainmenu.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eMainmenu.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eMainmenu() {
    }

    public eMainmenu(java.lang.String mainmenu) {
        this.mainmenuPK = new MainmenuPK(mainmenu);
    }
  
    public eMainmenu(MainmenuPK mainmenuPK) {
        this.mainmenuPK = mainmenuPK;
    }

    public boolean isEmpty() {
        return this.mainmenuPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.mainmenuPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.mainmenuPK.getPrimarykeyvalues();	  
    }
  
    @Override
    public Entityvalues getAll() {
        updates.put(IMainmenu.POPUPLABEL, popuplabel);
        updates.put(IMainmenu.ICON, icon);
        return getAllFields();
    }
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public MainmenuPK getPrimaryKey() {
        return this.mainmenuPK;
    }

    public java.lang.String getPopuplabel() {
        return this.popuplabel;
    }

    public void initPopuplabel(java.lang.String popuplabel) {
        this.popuplabel = popuplabel;
    }

    public void setPopuplabel(java.lang.String popuplabel) {
	if(popuplabel==null && popuplabel!=this.popuplabel || popuplabel!=null && !popuplabel.equals(this.popuplabel)) {
            updates.put(IMainmenu.POPUPLABEL, popuplabel);
        }
        this.popuplabel = popuplabel;
    }

    public java.lang.String getIcon() {
        return this.icon;
    }

    public void initIcon(java.lang.String icon) {
        this.icon = icon;
    }

    public void setIcon(java.lang.String icon) {
	if(icon==null && icon!=this.icon || icon!=null && !icon.equals(this.icon)) {
            updates.put(IMainmenu.ICON, icon);
        }
        this.icon = icon;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
