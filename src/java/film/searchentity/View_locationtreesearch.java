/*
 * View_locationtreesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IView_locationtreesearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.view.eView_locationtree;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_locationtree table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_locationtreesearch extends Tablesearch implements IView_locationtreesearch {

    Stringsearch countrycode = new Stringsearch("view_locationtree.countrycode");
    Stringsearch countryname = new Stringsearch("view_locationtree.countryname");
    Stringsearch postalcode = new Stringsearch("view_locationtree.postalcode");
    Stringsearch al1code = new Stringsearch("view_locationtree.al1code");
    Stringsearch al1name = new Stringsearch("view_locationtree.al1name");
    Stringsearch al2code = new Stringsearch("view_locationtree.al2code");
    Stringsearch al2name = new Stringsearch("view_locationtree.al2name");
    Stringsearch al3code = new Stringsearch("view_locationtree.al3code");
    Stringsearch al3name = new Stringsearch("view_locationtree.al3name");
    Stringsearch locality = new Stringsearch("view_locationtree.locality");
    Booleansearch hassublocality = new Booleansearch("view_locationtree.hassublocality");
    Stringsearch sublocality = new Stringsearch("view_locationtree.sublocality");
    Stringsearch routecode = new Stringsearch("view_locationtree.routecode");
    Stringsearch routename = new Stringsearch("view_locationtree.routename");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_locationtreesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_locationtreesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(countrycode);
        addFieldsearcher(countryname);
        addFieldsearcher(postalcode);
        addFieldsearcher(al1code);
        addFieldsearcher(al1name);
        addFieldsearcher(al2code);
        addFieldsearcher(al2name);
        addFieldsearcher(al3code);
        addFieldsearcher(al3name);
        addFieldsearcher(locality);
        addFieldsearcher(hassublocality);
        addFieldsearcher(sublocality);
        addFieldsearcher(routecode);
        addFieldsearcher(routename);
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
     * add String search values for field countryname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void countryname(String[] values) {
        addStringvalues(countryname, values);
    }
    
    /**
     * add String search values for field countryname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void countryname(String[] values, byte compare, byte andor) {
        addStringvalues(countryname, values);
        countryname.setCompareoperator(compare);
        countryname.setAndoroperator(andor);
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
     * add String search values for field al1name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void al1name(String[] values) {
        addStringvalues(al1name, values);
    }
    
    /**
     * add String search values for field al1name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void al1name(String[] values, byte compare, byte andor) {
        addStringvalues(al1name, values);
        al1name.setCompareoperator(compare);
        al1name.setAndoroperator(andor);
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
     * add String search values for field al2name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void al2name(String[] values) {
        addStringvalues(al2name, values);
    }
    
    /**
     * add String search values for field al2name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void al2name(String[] values, byte compare, byte andor) {
        addStringvalues(al2name, values);
        al2name.setCompareoperator(compare);
        al2name.setAndoroperator(andor);
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
     * add String search values for field al3name, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void al3name(String[] values) {
        addStringvalues(al3name, values);
    }
    
    /**
     * add String search values for field al3name
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void al3name(String[] values, byte compare, byte andor) {
        addStringvalues(al3name, values);
        al3name.setCompareoperator(compare);
        al3name.setAndoroperator(andor);
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
     * add Boolean search values for field hassublocality
     * @param value: true or false
     */
    public void hassublocality(Boolean value) {
        addBooleanvalue(hassublocality, value);
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
     * add String search values for field routename, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void routename(String[] values) {
        addStringvalues(routename, values);
    }
    
    /**
     * add String search values for field routename
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void routename(String[] values, byte compare, byte andor) {
        addStringvalues(routename, values);
        routename.setCompareoperator(compare);
        routename.setAndoroperator(andor);
    }
    
}
