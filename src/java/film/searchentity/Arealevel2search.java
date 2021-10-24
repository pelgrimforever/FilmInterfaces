/*
 * Arealevel2search.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IArealevel2search;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Arealevel2;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Arealevel2 table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Arealevel2search extends Tablesearch implements IArealevel2search {

    Stringsearch al2code = new Stringsearch("arealevel2.al2code");
    Stringsearch name = new Stringsearch("arealevel2.name");
    Stringsearch location = new Stringsearch("arealevel2.location");
    Stringsearch bounds = new Stringsearch("arealevel2.bounds");
    Stringsearch viewport = new Stringsearch("arealevel2.viewport");
    Booleansearch approximate = new Booleansearch("arealevel2.approximate");
    Foreignkeysearch arealevel1searcher = new Foreignkeysearch("arealevel1", IArealevel2.arealevel1PKfields, IArealevel2.arealevel1FKfields);
    Primarykeysearch arealevel3searcher = new Primarykeysearch("arealevel3", IArealevel3.arealevel2PKfields, IArealevel3.arealevel2FKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Arealevel2.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Arealevel2search() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Arealevel2search(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(al2code);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(arealevel1searcher);
        addKeysearcher(arealevel3searcher);
    }

    /**
     * add a primary key instance to search for
     * @param arealevel2PK: Arealevel2 primery key
     */
    public void addPrimarykey(IArealevel2PK arealevel2PK) {
        super.addPrimarykey(arealevel2PK);
    }

    /**
     * add String search values for field al2code, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void al2code(String[] values) {
        addStringvalues(al2code, values);
    }
    
    /**
     * add String search values for field al2code
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void al2code(String[] values, byte compare, byte andor) {
        addStringvalues(al2code, values);
        al2code.setCompareoperator(compare);
        al2code.setAndoroperator(andor);
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
     * set subsearch arealevel1 tablesearch
     * @param arealevel1search: IArealevel1search
     */
    public void arealevel1(IArealevel1search arealevel1search) {
        arealevel1searcher.setTablesearch(arealevel1search);
    }
    
    /**
     * 
     * @return Tablesearch for Arealevel2
     */
    public IArealevel1search getArealevel1search() {
        if(arealevel1searcher.used()) {
            return (IArealevel1search)arealevel1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if arealevel1searcher is not used
     * @return inner join statement
     */
    public String getArealevel1Innerjoin() {
        return arealevel1searcher.getInnerjoin();
    }

    /**
     * set subsearch arealevel3 tablesearch
     * @param arealevel3search: IArealevel3search
     */
    public void arealevel3(IArealevel3search arealevel3search) {
        arealevel3searcher.setTablesearch(arealevel3search);
    }
    
    /**
     * 
     * @return Tablesearch for Arealevel2
     */
    public IArealevel3search getArealevel3search() {
        if(arealevel3searcher.used()) {
            return (IArealevel3search)arealevel3searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
