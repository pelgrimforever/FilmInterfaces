/*
 * View_publicphotolocationssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IView_publicphotolocationssearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_publicphotolocations;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_publicphotolocations table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_publicphotolocationssearch extends Tablesearch implements IView_publicphotolocationssearch {

    Stringsearch location = new Stringsearch("view_publicphotolocations.location");
    Booleansearch exactlocation = new Booleansearch("view_publicphotolocations.exactlocation");
    Numbersearch locationradius = new Numbersearch("view_publicphotolocations.locationradius");
    Stringsearch countrycode = new Stringsearch("view_publicphotolocations.countrycode");
    Stringsearch postalcode = new Stringsearch("view_publicphotolocations.postalcode");
    Stringsearch locality = new Stringsearch("view_publicphotolocations.locality");
    Stringsearch sublocality = new Stringsearch("view_publicphotolocations.sublocality");
    Stringsearch routecode = new Stringsearch("view_publicphotolocations.routecode");
    Stringsearch streetnumber = new Stringsearch("view_publicphotolocations.streetnumber");
    Numbersearch locationcount = new Numbersearch("view_publicphotolocations.locationcount");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_publicphotolocations.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_publicphotolocationssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_publicphotolocationssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(location);
        addFieldsearcher(exactlocation);
        addFieldsearcher(locationradius);
        addFieldsearcher(countrycode);
        addFieldsearcher(postalcode);
        addFieldsearcher(locality);
        addFieldsearcher(sublocality);
        addFieldsearcher(routecode);
        addFieldsearcher(streetnumber);
        addFieldsearcher(locationcount);
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
     * add Boolean search values for field exactlocation
     * @param value: true or false
     */
    public void exactlocation(Boolean value) {
        addBooleanvalue(exactlocation, value);
    }
    
    /**
     * add Numeric search values for field locationradius, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void locationradius(Double[] values, byte[] operators) {
        addNumbervalues(locationradius, values, operators);
    }
    
    /**
     * add Numeric search values for field locationradius
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void locationradius(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationradius, values, operators);
        locationradius.setAndoroperator(andor);
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
     * add String search values for field streetnumber, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void streetnumber(String[] values) {
        addStringvalues(streetnumber, values);
    }
    
    /**
     * add String search values for field streetnumber
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void streetnumber(String[] values, byte compare, byte andor) {
        addStringvalues(streetnumber, values);
        streetnumber.setCompareoperator(compare);
        streetnumber.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field locationcount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void locationcount(Double[] values, byte[] operators) {
        addNumbervalues(locationcount, values, operators);
    }
    
    /**
     * add Numeric search values for field locationcount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void locationcount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationcount, values, operators);
        locationcount.setAndoroperator(andor);
    }
    
}
