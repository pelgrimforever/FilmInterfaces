/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IMenusearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Menu;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Menusearch extends Tablesearch implements IMenusearch {

    Stringsearch menu = new Stringsearch("menu.menu");
//foreign keys
    Foreignkeysearch mainmenusearcher = new Foreignkeysearch("mainmenu", IMenu.mainmenuPKfields, IMenu.mainmenuFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch menuitemsearcher = new Primarykeysearch("menuitem", IMenuitem.menuPKfields, IMenuitem.menuFKfields);

    public String getTable() {
        return Menu.table;
    }

    public Menusearch() {
        setFieldsearchers();
    }

    public Menusearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(menu);
        addKeysearcher(mainmenusearcher);
        addKeysearcher(menuitemsearcher);
    }

    public void addPrimarykey(IMenuPK menuPK) {
        super.addPrimarykey(menuPK);
    }

    public void menu(String[] values) {
        addStringvalues(menu, values);
    }
    
    public void menu(String[] values, byte compare, byte andor) {
        addStringvalues(menu, values);
        menu.setCompareoperator(compare);
        menu.setAndoroperator(andor);
    }
    
    public void mainmenu(IMainmenusearch mainmenusearch) {
        mainmenusearcher.setTablesearch(mainmenusearch);
    }
    
    public IMainmenusearch getMainmenusearch() {
        if(mainmenusearcher.used()) {
            return (IMainmenusearch)mainmenusearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getMainmenuInnerjoin() {
        return mainmenusearcher.getInnerjoin();
    }

    public void menuitem(IMenuitemsearch menuitemsearch) {
        menuitemsearcher.setTablesearch(menuitemsearch);
    }
    
    public IMenuitemsearch getMenuitemsearch() {
        if(menuitemsearcher.used()) {
            return (IMenuitemsearch)menuitemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
