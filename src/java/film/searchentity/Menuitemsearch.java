/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IMenuitemsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Menuitem;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Menuitemsearch extends Tablesearch implements IMenuitemsearch {

    Stringsearch menuitem = new Stringsearch("menuitem.menuitem");
    Stringsearch tabpanel = new Stringsearch("menuitem.tabpanel");
    Stringsearch editpanel = new Stringsearch("menuitem.editpanel");
    Stringsearch servlet = new Stringsearch("menuitem.servlet");
//foreign keys
    Foreignkeysearch menusearcher = new Foreignkeysearch("menu", IMenuitem.menuPKfields, IMenuitem.menuFKfields);
//external foreign keys

    public String getTable() {
        return Menuitem.table;
    }

    public Menuitemsearch() {
        setFieldsearchers();
    }

    public Menuitemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(menuitem);
        addFieldsearcher(tabpanel);
        addFieldsearcher(editpanel);
        addFieldsearcher(servlet);
        addKeysearcher(menusearcher);
    }

    public void addPrimarykey(IMenuitemPK menuitemPK) {
        super.addPrimarykey(menuitemPK);
    }

    public void menuitem(String[] values) {
        addStringvalues(menuitem, values);
    }
    
    public void menuitem(String[] values, byte compare, byte andor) {
        addStringvalues(menuitem, values);
        menuitem.setCompareoperator(compare);
        menuitem.setAndoroperator(andor);
    }
    
    public void tabpanel(String[] values) {
        addStringvalues(tabpanel, values);
    }
    
    public void tabpanel(String[] values, byte compare, byte andor) {
        addStringvalues(tabpanel, values);
        tabpanel.setCompareoperator(compare);
        tabpanel.setAndoroperator(andor);
    }
    
    public void editpanel(String[] values) {
        addStringvalues(editpanel, values);
    }
    
    public void editpanel(String[] values, byte compare, byte andor) {
        addStringvalues(editpanel, values);
        editpanel.setCompareoperator(compare);
        editpanel.setAndoroperator(andor);
    }
    
    public void servlet(String[] values) {
        addStringvalues(servlet, values);
    }
    
    public void servlet(String[] values, byte compare, byte andor) {
        addStringvalues(servlet, values);
        servlet.setCompareoperator(compare);
        servlet.setAndoroperator(andor);
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

    public String getMenuInnerjoin() {
        return menusearcher.getInnerjoin();
    }

}
