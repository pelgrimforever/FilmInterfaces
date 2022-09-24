/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IMenu;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class MenuPK implements IMenuPK {

    private IMainmenuPK mainmenuPK = new MainmenuPK();
    private java.lang.String menu;
  
    public MenuPK() {
    }

    public MenuPK(java.lang.String mainmenu, java.lang.String menu) {
        this.mainmenuPK = new MainmenuPK(mainmenu);
        this.menu = menu;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"menu.mainmenu", mainmenuPK.getMainmenu()}, 
            {"menu.menu", menu}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IMenu.MAINMENU, mainmenuPK.getMainmenu()}, 
            {IMenu.MENU, menu}
        };
        return new Entityvalues(keyfields);
    }

    public IMainmenuPK getMainmenuPK() {
        return this.mainmenuPK;
    }

    public void setMainmenuPK(IMainmenuPK mainmenuPK) {
        this.mainmenuPK = mainmenuPK;
    }

    public java.lang.String getMainmenu() {
        return this.mainmenuPK.getMainmenu();
    }

    public void setMainmenu(java.lang.String mainmenu) {
        this.mainmenuPK.setMainmenu(mainmenu);
    }

    public java.lang.String getMenu() {
        return this.menu;
    }

    public void setMenu(java.lang.String menu) {
        this.menu = menu;
    }

    public String getKeystring() {
        String key = "";
        if(getMainmenu()!=null) key += getMainmenu().length() + "_" + getMainmenu();
        key += "_";

        if(getMenu()!=null) key += getMenu().length() + "_" + getMenu();
        return key;
    }

    public static MenuPK getKey(String keystring) {
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
            return new MenuPK(mainmenu, menu);
        }
    }

    public boolean equals(IMenuPK menuPK2) {
        boolean isequal = menuPK2!=null;
        if(isequal) {
            isequal = isequal && this.mainmenuPK.equals(menuPK2.getMainmenuPK());
            isequal = isequal && this.menu.equals(menuPK2.getMenu());
        }
        return isequal;
    }
}
