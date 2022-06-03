/*
 * Postalcodesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IPostalcodesearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Postalcode;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Postalcode table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Postalcodesearch extends Tablesearch implements IPostalcodesearch {

    Stringsearch countrycode = new Stringsearch("postalcode.countrycode");
    Stringsearch postalcode = new Stringsearch("postalcode.postalcode");
    Stringsearch location = new Stringsearch("postalcode.location");
    Stringsearch bounds = new Stringsearch("postalcode.bounds");
    Stringsearch viewport = new Stringsearch("postalcode.viewport");
    Booleansearch approximate = new Booleansearch("postalcode.approximate");
//foreign keys
    Foreignkeysearch arealevel3searcher = new Foreignkeysearch("arealevel3", IPostalcode.arealevel3PKfields, IPostalcode.arealevel3FKfields);
//external foreign keys
    //foreign key
    Primarykeysearch localitysearcher = new Primarykeysearch("locality", ILocality.postalcodePKfields, ILocality.postalcodeFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Postalcode.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Postalcodesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Postalcodesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(countrycode);
        addFieldsearcher(postalcode);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(arealevel3searcher);
        addKeysearcher(localitysearcher);
    }

    /**
     * add a primary key instance to search for
     * @param postalcodePK: Postalcode primery key
     */
    public void addPrimarykey(IPostalcodePK postalcodePK) {
        super.addPrimarykey(postalcodePK);
    }

    /**
     * add String search values for field countrycode, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void countrycode(String[] values) {
        addStringvalues(countrycode, values);
    }
    
    /**
     * add String search values for field countrycode
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void countrycode(String[] values, byte compare, byte andor) {
        addStringvalues(countrycode, values);
        countrycode.setCompareoperator(compare);
        countrycode.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field postalcode, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void postalcode(String[] values) {
        addStringvalues(postalcode, values);
    }
    
    /**
     * add String search values for field postalcode
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void postalcode(String[] values, byte compare, byte andor) {
        addStringvalues(postalcode, values);
        postalcode.setCompareoperator(compare);
        postalcode.setAndoroperator(andor);
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
     * set foreign key subsearch arealevel3 IArealevel3search
     * @param arealevel3search: IArealevel3search
     */
    public void arealevel3(IArealevel3search arealevel3search) {
        arealevel3searcher.setTablesearch(arealevel3search);
    }
    
    /**
     * get foreign key subsearch arealevel3 IArealevel3search
     * @return Tablesearch for Postalcode
     */
    public IArealevel3search getArealevel3search() {
        if(arealevel3searcher.used()) {
            return (IArealevel3search)arealevel3searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if arealevel3searcher is not used
     * @return inner join statement
     */
    public String getArealevel3Innerjoin() {
        return arealevel3searcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch ILocalitysearch
     * @param localitysearch: ILocalitysearch
     */
    public void locality(ILocalitysearch localitysearch) {
        localitysearcher.setTablesearch(localitysearch);
    }
    
    /**
     * get external key - foreign key subsearch ILocalitysearch
     * @return Tablesearch for ILocalitysearch
     */
    public ILocalitysearch getLocalitysearch() {
        if(localitysearcher.used()) {
            return (ILocalitysearch)localitysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
