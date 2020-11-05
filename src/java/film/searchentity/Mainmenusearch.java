/*
 * Mainmenusearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IMainmenusearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eMainmenu;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Mainmenu table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Mainmenusearch extends Tablesearch implements IMainmenusearch {

    Stringsearch mainmenu = new Stringsearch("mainmenu.mainmenu");
    Stringsearch popuplabel = new Stringsearch("mainmenu.popuplabel");
    Stringsearch icon = new Stringsearch("mainmenu.icon");
    Primarykeysearch menusearcher = new Primarykeysearch(":extablename_o:", IMenu.mainmenuPKfields, IMenu.mainmenuFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Mainmenusearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Mainmenusearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(mainmenu);
        addFieldsearcher(popuplabel);
        addFieldsearcher(icon);
        addKeysearcher(menusearcher);
    }

    /**
     * add a primary key instance to search for
     * @param mainmenuPK: Mainmenu primery key
     */
    public void addPrimarykey(IMainmenuPK mainmenuPK) {
        super.addPrimarykey(mainmenuPK);
    }

    /**
     * add String search values for field mainmenu, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void mainmenu(String[] values) {
        addStringvalues(mainmenu, values);
    }
    
    /**
     * add String search values for field mainmenu
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void mainmenu(String[] values, byte compare, byte andor) {
        addStringvalues(mainmenu, values);
        mainmenu.setCompareoperator(compare);
        mainmenu.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field popuplabel, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void popuplabel(String[] values) {
        addStringvalues(popuplabel, values);
    }
    
    /**
     * add String search values for field popuplabel
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void popuplabel(String[] values, byte compare, byte andor) {
        addStringvalues(popuplabel, values);
        popuplabel.setCompareoperator(compare);
        popuplabel.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field icon, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void icon(String[] values) {
        addStringvalues(icon, values);
    }
    
    /**
     * add String search values for field icon
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void icon(String[] values, byte compare, byte andor) {
        addStringvalues(icon, values);
        icon.setCompareoperator(compare);
        icon.setAndoroperator(andor);
    }
    
    /**
     * set subsearch menu tablesearch
     * @param menusearch: IMenusearch
     */
    public void menu(IMenusearch menusearch) {
        menusearcher.setTablesearch(menusearch);
    }
    
    /**
     * 
     * @return Tablesearch for Mainmenu
     */
    public IMenusearch getMenusearch() {
        if(menusearcher.used()) {
            return (IMenusearch)menusearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
