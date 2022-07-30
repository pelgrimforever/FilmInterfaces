/*
 * Routesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IRoutesearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Route;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Route table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Routesearch extends Tablesearch implements IRoutesearch {

    Stringsearch routecode = new Stringsearch("route.routecode");
    Stringsearch name = new Stringsearch("route.name");
    Stringsearch location = new Stringsearch("route.location");
    Stringsearch bounds = new Stringsearch("route.bounds");
    Stringsearch viewport = new Stringsearch("route.viewport");
    Booleansearch approximate = new Booleansearch("route.approximate");
//foreign keys
    Foreignkeysearch sublocalitysearcher = new Foreignkeysearch("sublocality", IRoute.sublocalityPKfields, IRoute.sublocalityFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Route.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Routesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Routesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(routecode);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(sublocalitysearcher);
    }

    /**
     * add a primary key instance to search for
     * @param routePK: Route primery key
     */
    public void addPrimarykey(IRoutePK routePK) {
        super.addPrimarykey(routePK);
    }

    /**
     * add String search values for field routecode, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void routecode(String[] values) {
        addStringvalues(routecode, values);
    }
    
    /**
     * add String search values for field routecode
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void routecode(String[] values, byte compare, byte andor) {
        addStringvalues(routecode, values);
        routecode.setCompareoperator(compare);
        routecode.setAndoroperator(andor);
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
     * set foreign key subsearch sublocality ISublocalitysearch
     * @param sublocalitysearch: ISublocalitysearch
     */
    public void sublocality(ISublocalitysearch sublocalitysearch) {
        sublocalitysearcher.setTablesearch(sublocalitysearch);
    }
    
    /**
     * get foreign key subsearch sublocality ISublocalitysearch
     * @return Tablesearch for Route
     */
    public ISublocalitysearch getSublocalitysearch() {
        if(sublocalitysearcher.used()) {
            return (ISublocalitysearch)sublocalitysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if sublocalitysearcher is not used
     * @return inner join statement
     */
    public String getSublocalityInnerjoin() {
        return sublocalitysearcher.getInnerjoin();
    }

}
