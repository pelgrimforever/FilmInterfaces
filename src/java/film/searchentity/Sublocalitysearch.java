/*
 * Sublocalitysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ISublocalitysearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Sublocality;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Sublocality table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Sublocalitysearch extends Tablesearch implements ISublocalitysearch {

    Stringsearch sublocality = new Stringsearch("sublocality.sublocality");
    Stringsearch location = new Stringsearch("sublocality.location");
    Stringsearch bounds = new Stringsearch("sublocality.bounds");
    Stringsearch viewport = new Stringsearch("sublocality.viewport");
    Booleansearch approximate = new Booleansearch("sublocality.approximate");
//foreign keys
    Foreignkeysearch localitysearcher = new Foreignkeysearch("locality", ISublocality.localityPKfields, ISublocality.localityFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch routesearcher = new Primarykeysearch("route", IRoute.sublocalityPKfields, IRoute.sublocalityFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Sublocality.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Sublocalitysearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Sublocalitysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(sublocality);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(localitysearcher);
        addKeysearcher(routesearcher);
    }

    /**
     * add a primary key instance to search for
     * @param sublocalityPK: Sublocality primery key
     */
    public void addPrimarykey(ISublocalityPK sublocalityPK) {
        super.addPrimarykey(sublocalityPK);
    }

    /**
     * add String search values for field sublocality, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void sublocality(String[] values) {
        addStringvalues(sublocality, values);
    }
    
    /**
     * add String search values for field sublocality
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void sublocality(String[] values, byte compare, byte andor) {
        addStringvalues(sublocality, values);
        sublocality.setCompareoperator(compare);
        sublocality.setAndoroperator(andor);
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
     * set foreign key subsearch locality ILocalitysearch
     * @param localitysearch: ILocalitysearch
     */
    public void locality(ILocalitysearch localitysearch) {
        localitysearcher.setTablesearch(localitysearch);
    }
    
    /**
     * get foreign key subsearch locality ILocalitysearch
     * @return Tablesearch for Sublocality
     */
    public ILocalitysearch getLocalitysearch() {
        if(localitysearcher.used()) {
            return (ILocalitysearch)localitysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if localitysearcher is not used
     * @return inner join statement
     */
    public String getLocalityInnerjoin() {
        return localitysearcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch IRoutesearch
     * @param routesearch: IRoutesearch
     */
    public void route(IRoutesearch routesearch) {
        routesearcher.setTablesearch(routesearch);
    }
    
    /**
     * get external key - foreign key subsearch IRoutesearch
     * @return Tablesearch for IRoutesearch
     */
    public IRoutesearch getRoutesearch() {
        if(routesearcher.used()) {
            return (IRoutesearch)routesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
