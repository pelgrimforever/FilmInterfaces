/*
 * Arealevel1search.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IArealevel1search;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eArealevel1;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Arealevel1 table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Arealevel1search extends Tablesearch implements IArealevel1search {

    Stringsearch al1code = new Stringsearch("arealevel1.al1code");
    Stringsearch name = new Stringsearch("arealevel1.name");
    Stringsearch location = new Stringsearch("arealevel1.location");
    Stringsearch bounds = new Stringsearch("arealevel1.bounds");
    Stringsearch viewport = new Stringsearch("arealevel1.viewport");
    Booleansearch approximate = new Booleansearch("arealevel1.approximate");
    Foreignkeysearch countrysearcher = new Foreignkeysearch("country", IArealevel1.countryPKfields, IArealevel1.countryFKfields);
    Primarykeysearch arealevel2searcher = new Primarykeysearch(":extablename_o:", IArealevel2.arealevel1PKfields, IArealevel2.arealevel1FKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Arealevel1search() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Arealevel1search(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(al1code);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(countrysearcher);
        addKeysearcher(arealevel2searcher);
    }

    /**
     * add a primary key instance to search for
     * @param arealevel1PK: Arealevel1 primery key
     */
    public void addPrimarykey(IArealevel1PK arealevel1PK) {
        super.addPrimarykey(arealevel1PK);
    }

    /**
     * add String search values for field al1code, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void al1code(String[] values) {
        addStringvalues(al1code, values);
    }
    
    /**
     * add String search values for field al1code
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void al1code(String[] values, byte compare, byte andor) {
        addStringvalues(al1code, values);
        al1code.setCompareoperator(compare);
        al1code.setAndoroperator(andor);
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
     * set subsearch country tablesearch
     * @param countrysearch: ICountrysearch
     */
    public void country(ICountrysearch countrysearch) {
        countrysearcher.setTablesearch(countrysearch);
    }
    
    /**
     * 
     * @return Tablesearch for Arealevel1
     */
    public ICountrysearch getCountrysearch() {
        if(countrysearcher.used()) {
            return (ICountrysearch)countrysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if countrysearcher is not used
     * @return inner join statement
     */
    public String getCountryInnerjoin() {
        return countrysearcher.getInnerjoin();
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
     * @return Tablesearch for Arealevel1
     */
    public IArealevel2search getArealevel2search() {
        if(arealevel2searcher.used()) {
            return (IArealevel2search)arealevel2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
