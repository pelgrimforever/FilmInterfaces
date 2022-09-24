/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IMainmenusearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Mainmenu;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Mainmenusearch extends Tablesearch implements IMainmenusearch {

    Stringsearch mainmenu = new Stringsearch("mainmenu.mainmenu");
    Stringsearch popuplabel = new Stringsearch("mainmenu.popuplabel");
    Stringsearch icon = new Stringsearch("mainmenu.icon");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch menusearcher = new Primarykeysearch("menu", IMenu.mainmenuPKfields, IMenu.mainmenuFKfields);

    public String getTable() {
        return Mainmenu.table;
    }

    public Mainmenusearch() {
        setFieldsearchers();
    }

    public Mainmenusearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(mainmenu);
        addFieldsearcher(popuplabel);
        addFieldsearcher(icon);
        addKeysearcher(menusearcher);
    }

    public void addPrimarykey(IMainmenuPK mainmenuPK) {
        super.addPrimarykey(mainmenuPK);
    }

    public void mainmenu(String[] values) {
        addStringvalues(mainmenu, values);
    }
    
    public void mainmenu(String[] values, byte compare, byte andor) {
        addStringvalues(mainmenu, values);
        mainmenu.setCompareoperator(compare);
        mainmenu.setAndoroperator(andor);
    }
    
    public void popuplabel(String[] values) {
        addStringvalues(popuplabel, values);
    }
    
    public void popuplabel(String[] values, byte compare, byte andor) {
        addStringvalues(popuplabel, values);
        popuplabel.setCompareoperator(compare);
        popuplabel.setAndoroperator(andor);
    }
    
    public void icon(String[] values) {
        addStringvalues(icon, values);
    }
    
    public void icon(String[] values, byte compare, byte andor) {
        addStringvalues(icon, values);
        icon.setCompareoperator(compare);
        icon.setAndoroperator(andor);
    }
    
    public void menu(IMenusearch menusearch) {
        menusearcher.setTablesearch(menusearch);
    }
    
    public IMenusearch getMenusearch() {
        if(menusearcher.used()) {
            return (IMenusearch)menusearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
