/*
 * Arealevel3search.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IArealevel3search;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Arealevel3;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Arealevel3 table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Arealevel3search extends Tablesearch implements IArealevel3search {

    Stringsearch al3code = new Stringsearch("arealevel3.al3code");
    Stringsearch name = new Stringsearch("arealevel3.name");
    Stringsearch location = new Stringsearch("arealevel3.location");
    Stringsearch bounds = new Stringsearch("arealevel3.bounds");
    Stringsearch viewport = new Stringsearch("arealevel3.viewport");
    Booleansearch approximate = new Booleansearch("arealevel3.approximate");
    Foreignkeysearch arealevel2searcher = new Foreignkeysearch("arealevel2", IArealevel3.arealevel2PKfields, IArealevel3.arealevel2FKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Arealevel3.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Arealevel3search() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Arealevel3search(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(al3code);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(arealevel2searcher);
    }

    /**
     * add a primary key instance to search for
     * @param arealevel3PK: Arealevel3 primery key
     */
    public void addPrimarykey(IArealevel3PK arealevel3PK) {
        super.addPrimarykey(arealevel3PK);
    }

    /**
     * add String search values for field al3code, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void al3code(String[] values) {
        addStringvalues(al3code, values);
    }
    
    /**
     * add String search values for field al3code
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void al3code(String[] values, byte compare, byte andor) {
        addStringvalues(al3code, values);
        al3code.setCompareoperator(compare);
        al3code.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    /**
     * add String search values for field name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field location, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void location(String[] values) {
        addStringvalues(location, values);
    }
    
    /**
     * add String search values for field location
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void location(String[] values, byte compare, byte andor) {
        addStringvalues(location, values);
        location.setCompareoperator(compare);
        location.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field bounds, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void bounds(String[] values) {
        addStringvalues(bounds, values);
    }
    
    /**
     * add String search values for field bounds
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void bounds(String[] values, byte compare, byte andor) {
        addStringvalues(bounds, values);
        bounds.setCompareoperator(compare);
        bounds.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field viewport, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void viewport(String[] values) {
        addStringvalues(viewport, values);
    }
    
    /**
     * add String search values for field viewport
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void viewport(String[] values, byte compare, byte andor) {
        addStringvalues(viewport, values);
        viewport.setCompareoperator(compare);
        viewport.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field approximate
     * @param value: true or false
     */
    public void approximate(Boolean value) {
        addBooleanvalue(approximate, value);
    }
    
    /**
     * set subsearch arealevel2 tablesearch
     * @param arealevel2search: IArealevel2search
     */
    public void arealevel2(IArealevel2search arealevel2search) {
        arealevel2searcher.setTablesearch(arealevel2search);
    }
    
    /**
     * 
     * @return Tablesearch for Arealevel3
     */
    public IArealevel2search getArealevel2search() {
        if(arealevel2searcher.used()) {
            return (IArealevel2search)arealevel2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if arealevel2searcher is not used
     * @return inner join statement
     */
    public String getArealevel2Innerjoin() {
        return arealevel2searcher.getInnerjoin();
    }

}
