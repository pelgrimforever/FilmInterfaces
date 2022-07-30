/*
 * Menuitemsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
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

/**
 * Search class for Menuitem table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Menuitemsearch extends Tablesearch implements IMenuitemsearch {

    Stringsearch menuitem = new Stringsearch("menuitem.menuitem");
    Stringsearch tabpanel = new Stringsearch("menuitem.tabpanel");
    Stringsearch editpanel = new Stringsearch("menuitem.editpanel");
    Stringsearch servlet = new Stringsearch("menuitem.servlet");
//foreign keys
    Foreignkeysearch menusearcher = new Foreignkeysearch("menu", IMenuitem.menuPKfields, IMenuitem.menuFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Menuitem.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Menuitemsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Menuitemsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(menuitem);
        addFieldsearcher(tabpanel);
        addFieldsearcher(editpanel);
        addFieldsearcher(servlet);
        addKeysearcher(menusearcher);
    }

    /**
     * add a primary key instance to search for
     * @param menuitemPK: Menuitem primery key
     */
    public void addPrimarykey(IMenuitemPK menuitemPK) {
        super.addPrimarykey(menuitemPK);
    }

    /**
     * add String search values for field menuitem, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void menuitem(String[] values) {
        addStringvalues(menuitem, values);
    }
    
    /**
     * add String search values for field menuitem
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void menuitem(String[] values, byte compare, byte andor) {
        addStringvalues(menuitem, values);
        menuitem.setCompareoperator(compare);
        menuitem.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field tabpanel, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void tabpanel(String[] values) {
        addStringvalues(tabpanel, values);
    }
    
    /**
     * add String search values for field tabpanel
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void tabpanel(String[] values, byte compare, byte andor) {
        addStringvalues(tabpanel, values);
        tabpanel.setCompareoperator(compare);
        tabpanel.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field editpanel, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void editpanel(String[] values) {
        addStringvalues(editpanel, values);
    }
    
    /**
     * add String search values for field editpanel
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void editpanel(String[] values, byte compare, byte andor) {
        addStringvalues(editpanel, values);
        editpanel.setCompareoperator(compare);
        editpanel.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field servlet, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void servlet(String[] values) {
        addStringvalues(servlet, values);
    }
    
    /**
     * add String search values for field servlet
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void servlet(String[] values, byte compare, byte andor) {
        addStringvalues(servlet, values);
        servlet.setCompareoperator(compare);
        servlet.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch menu IMenusearch
     * @param menusearch: IMenusearch
     */
    public void menu(IMenusearch menusearch) {
        menusearcher.setTablesearch(menusearch);
    }
    
    /**
     * get foreign key subsearch menu IMenusearch
     * @return Tablesearch for Menuitem
     */
    public IMenusearch getMenusearch() {
        if(menusearcher.used()) {
            return (IMenusearch)menusearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if menusearcher is not used
     * @return inner join statement
     */
    public String getMenuInnerjoin() {
        return menusearcher.getInnerjoin();
    }

}
