/*
 * Localitysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ILocalitysearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Locality;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Locality table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Localitysearch extends Tablesearch implements ILocalitysearch {

    Stringsearch locality = new Stringsearch("locality.locality");
    Stringsearch location = new Stringsearch("locality.location");
    Stringsearch bounds = new Stringsearch("locality.bounds");
    Stringsearch viewport = new Stringsearch("locality.viewport");
    Booleansearch approximate = new Booleansearch("locality.approximate");
    Booleansearch hassublocality = new Booleansearch("locality.hassublocality");
//foreign keys
    Foreignkeysearch postalcodesearcher = new Foreignkeysearch("postalcode", ILocality.postalcodePKfields, ILocality.postalcodeFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch sublocalitysearcher = new Primarykeysearch("sublocality", ISublocality.localityPKfields, ISublocality.localityFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Locality.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Localitysearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Localitysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(locality);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addFieldsearcher(hassublocality);
        addKeysearcher(postalcodesearcher);
        addKeysearcher(sublocalitysearcher);
    }

    /**
     * add a primary key instance to search for
     * @param localityPK: Locality primery key
     */
    public void addPrimarykey(ILocalityPK localityPK) {
        super.addPrimarykey(localityPK);
    }

    /**
     * add String search values for field locality, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void locality(String[] values) {
        addStringvalues(locality, values);
    }
    
    /**
     * add String search values for field locality
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void locality(String[] values, byte compare, byte andor) {
        addStringvalues(locality, values);
        locality.setCompareoperator(compare);
        locality.setAndoroperator(andor);
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
     * add Boolean search values for field hassublocality
     * @param value: true or false
     */
    public void hassublocality(Boolean value) {
        addBooleanvalue(hassublocality, value);
    }
    
    /**
     * set foreign key subsearch postalcode IPostalcodesearch
     * @param postalcodesearch: IPostalcodesearch
     */
    public void postalcode(IPostalcodesearch postalcodesearch) {
        postalcodesearcher.setTablesearch(postalcodesearch);
    }
    
    /**
     * get foreign key subsearch postalcode IPostalcodesearch
     * @return Tablesearch for Locality
     */
    public IPostalcodesearch getPostalcodesearch() {
        if(postalcodesearcher.used()) {
            return (IPostalcodesearch)postalcodesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if postalcodesearcher is not used
     * @return inner join statement
     */
    public String getPostalcodeInnerjoin() {
        return postalcodesearcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch ISublocalitysearch
     * @param sublocalitysearch: ISublocalitysearch
     */
    public void sublocality(ISublocalitysearch sublocalitysearch) {
        sublocalitysearcher.setTablesearch(sublocalitysearch);
    }
    
    /**
     * get external key - foreign key subsearch ISublocalitysearch
     * @return Tablesearch for ISublocalitysearch
     */
    public ISublocalitysearch getSublocalitysearch() {
        if(sublocalitysearcher.used()) {
            return (ISublocalitysearch)sublocalitysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
