/*
 * Menusearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
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

/**
 * Search class for Menu table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Menusearch extends Tablesearch implements IMenusearch {

    Stringsearch menu = new Stringsearch("menu.menu");
    Foreignkeysearch mainmenusearcher = new Foreignkeysearch("mainmenu", IMenu.mainmenuPKfields, IMenu.mainmenuFKfields);
    Primarykeysearch menuitemsearcher = new Primarykeysearch("menuitem", IMenuitem.menuPKfields, IMenuitem.menuFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Menu.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Menusearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Menusearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(menu);
        addKeysearcher(mainmenusearcher);
        addKeysearcher(menuitemsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param menuPK: Menu primery key
     */
    public void addPrimarykey(IMenuPK menuPK) {
        super.addPrimarykey(menuPK);
    }

    /**
     * add String search values for field menu, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void menu(String[] values) {
        addStringvalues(menu, values);
    }
    
    /**
     * add String search values for field menu
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void menu(String[] values, byte compare, byte andor) {
        addStringvalues(menu, values);
        menu.setCompareoperator(compare);
        menu.setAndoroperator(andor);
    }
    
    /**
     * set subsearch mainmenu tablesearch
     * @param mainmenusearch: IMainmenusearch
     */
    public void mainmenu(IMainmenusearch mainmenusearch) {
        mainmenusearcher.setTablesearch(mainmenusearch);
    }
    
    /**
     * 
     * @return Tablesearch for Menu
     */
    public IMainmenusearch getMainmenusearch() {
        if(mainmenusearcher.used()) {
            return (IMainmenusearch)mainmenusearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if mainmenusearcher is not used
     * @return inner join statement
     */
    public String getMainmenuInnerjoin() {
        return mainmenusearcher.getInnerjoin();
    }

    /**
     * set subsearch menuitem tablesearch
     * @param menuitemsearch: IMenuitemsearch
     */
    public void menuitem(IMenuitemsearch menuitemsearch) {
        menuitemsearcher.setTablesearch(menuitemsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Menu
     */
    public IMenuitemsearch getMenuitemsearch() {
        if(menuitemsearcher.used()) {
            return (IMenuitemsearch)menuitemsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
