/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IMenuitem;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class MenuitemPK implements IMenuitemPK {

    private IMenuPK menuPK = new MenuPK();
    private java.lang.String menuitem;
  
    public MenuitemPK() {
    }

    public MenuitemPK(java.lang.String mainmenu, java.lang.String menu, java.lang.String menuitem) {
        this.menuPK = new MenuPK(mainmenu, menu);
        this.menuitem = menuitem;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"menuitem.mainmenu", menuPK.getMainmenu()}, 
            {"menuitem.menu", menuPK.getMenu()}, 
            {"menuitem.menuitem", menuitem}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IMenuitem.MAINMENU, menuPK.getMainmenu()}, 
            {IMenuitem.MENU, menuPK.getMenu()}, 
            {IMenuitem.MENUITEM, menuitem}
        };
        return new Entityvalues(keyfields);
    }

    public IMenuPK getMenuPK() {
        return this.menuPK;
    }

    public void setMenuPK(IMenuPK menuPK) {
        this.menuPK = menuPK;
    }

    public java.lang.String getMainmenu() {
        return this.menuPK.getMainmenu();
    }

    public void setMainmenu(java.lang.String mainmenu) {
        this.menuPK.setMainmenu(mainmenu);
    }

    public java.lang.String getMenu() {
        return this.menuPK.getMenu();
    }

    public void setMenu(java.lang.String menu) {
        this.menuPK.setMenu(menu);
    }

    public java.lang.String getMenuitem() {
        return this.menuitem;
    }

    public void setMenuitem(java.lang.String menuitem) {
        this.menuitem = menuitem;
    }

    public String getKeystring() {
        String key = "";
        if(getMainmenu()!=null) key += getMainmenu().length() + "_" + getMainmenu();
        key += "_";

        if(getMenu()!=null) key += getMenu().length() + "_" + getMenu();
        key += "_";

        if(getMenuitem()!=null) key += getMenuitem().length() + "_" + getMenuitem();
        return key;
    }

    public static MenuitemPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String mainmenu = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String menu = keys.substring(0, keylength);
            keys = keys.substring(keylength+1);

            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String menuitem = keys.substring(0, keylength);
            return new MenuitemPK(mainmenu, menu, menuitem);
        }
    }

    public boolean equals(IMenuitemPK menuitemPK2) {
        boolean isequal = menuitemPK2!=null;
        if(isequal) {
            isequal = isequal && this.menuPK.equals(menuitemPK2.getMenuPK());
            isequal = isequal && this.menuitem.equals(menuitemPK2.getMenuitem());
        }
        return isequal;
    }
}
