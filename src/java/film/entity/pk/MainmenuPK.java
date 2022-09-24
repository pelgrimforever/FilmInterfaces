/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.entity.pk;

import data.interfaces.db.EntityPK;
import film.interfaces.entity.pk.*;
import film.interfaces.logicentity.IMainmenu;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import db.SQLparameters;
import db.Entityvalues;

public class MainmenuPK implements IMainmenuPK {

    private java.lang.String mainmenu;
  
    public MainmenuPK() {
    }

    public MainmenuPK(java.lang.String mainmenu) {
        this.mainmenu = mainmenu;
    }

    public SQLparameters getSQLprimarykey() {
        Object[][] keyfields = { 
            {"mainmenu.mainmenu", mainmenu}
        };
        return new SQLparameters(keyfields);
    }

    public Entityvalues getPrimarykeyvalues() {
        Object[][] keyfields = { 
            {IMainmenu.MAINMENU, mainmenu}
        };
        return new Entityvalues(keyfields);
    }

    public java.lang.String getMainmenu() {
        return this.mainmenu;
    }

    public void setMainmenu(java.lang.String mainmenu) {
        this.mainmenu = mainmenu;
    }

    public String getKeystring() {
        String key = "";
        if(getMainmenu()!=null) key += getMainmenu().length() + "_" + getMainmenu();
        return key;
    }

    public static MainmenuPK getKey(String keystring) {
        if(keystring==null || keystring.length()==0) return null;
        else {
            String keys = keystring;
            int keylength = 0;
            keylength = Integer.valueOf(keys.substring(0, keys.indexOf("_")));
            keys.substring(keys.indexOf("_")+1);
            String mainmenu = keys.substring(0, keylength);
            return new MainmenuPK(mainmenu);
        }
    }

    public boolean equals(IMainmenuPK mainmenuPK2) {
        boolean isequal = mainmenuPK2!=null;
        if(isequal) {
            isequal = isequal && this.mainmenu.equals(mainmenuPK2.getMainmenu());
        }
        return isequal;
    }
}
