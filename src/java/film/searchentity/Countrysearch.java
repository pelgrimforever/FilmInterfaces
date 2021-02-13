/*
 * Countrysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ICountrysearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eCountry;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Country table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Countrysearch extends Tablesearch implements ICountrysearch {

    Stringsearch code = new Stringsearch("country.code");
    Stringsearch name = new Stringsearch("country.name");
    Stringsearch location = new Stringsearch("country.location");
    Stringsearch bounds = new Stringsearch("country.bounds");
    Stringsearch viewport = new Stringsearch("country.viewport");
    Booleansearch approximate = new Booleansearch("country.approximate");
    Booleansearch hasarealevel1 = new Booleansearch("country.hasarealevel1");
    Booleansearch hasarealevel2 = new Booleansearch("country.hasarealevel2");
    Booleansearch hasarealevel3 = new Booleansearch("country.hasarealevel3");
    Primarykeysearch arealevel1searcher = new Primarykeysearch(":extablename_o:", IArealevel1.countryPKfields, IArealevel1.countryFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Countrysearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Countrysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(code);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addFieldsearcher(hasarealevel1);
        addFieldsearcher(hasarealevel2);
        addFieldsearcher(hasarealevel3);
        addKeysearcher(arealevel1searcher);
    }

    /**
     * add a primary key instance to search for
     * @param countryPK: Country primery key
     */
    public void addPrimarykey(ICountryPK countryPK) {
        super.addPrimarykey(countryPK);
    }

    /**
     * add String search values for field code, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void code(String[] values) {
        addStringvalues(code, values);
    }
    
    /**
     * add String search values for field code
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void code(String[] values, byte compare, byte andor) {
        addStringvalues(code, values);
        code.setCompareoperator(compare);
        code.setAndoroperator(andor);
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
     * add Boolean search values for field hasarealevel1
     * @param value: true or false
     */
    public void hasarealevel1(Boolean value) {
        addBooleanvalue(hasarealevel1, value);
    }
    
    /**
     * add Boolean search values for field hasarealevel2
     * @param value: true or false
     */
    public void hasarealevel2(Boolean value) {
        addBooleanvalue(hasarealevel2, value);
    }
    
    /**
     * add Boolean search values for field hasarealevel3
     * @param value: true or false
     */
    public void hasarealevel3(Boolean value) {
        addBooleanvalue(hasarealevel3, value);
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
     * @return Tablesearch for Country
     */
    public IArealevel1search getArealevel1search() {
        if(arealevel1searcher.used()) {
            return (IArealevel1search)arealevel1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
