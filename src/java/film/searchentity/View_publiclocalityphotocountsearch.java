/*
 * View_publiclocalityphotocountsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IView_publiclocalityphotocountsearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_publiclocalityphotocount;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_publiclocalityphotocount table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_publiclocalityphotocountsearch extends Tablesearch implements IView_publiclocalityphotocountsearch {

    Stringsearch countrycode = new Stringsearch("view_publiclocalityphotocount.countrycode");
    Stringsearch locality = new Stringsearch("view_publiclocalityphotocount.locality");
    Stringsearch location = new Stringsearch("view_publiclocalityphotocount.location");
    Numbersearch photocount = new Numbersearch("view_publiclocalityphotocount.photocount");

    /**
     * @return viewname
     */
    public String getTable() {
        return View_publiclocalityphotocount.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_publiclocalityphotocountsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_publiclocalityphotocountsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(countrycode);
        addFieldsearcher(locality);
        addFieldsearcher(location);
        addFieldsearcher(photocount);
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
     * add Numeric search values for field photocount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void photocount(Double[] values, byte[] operators) {
        addNumbervalues(photocount, values, operators);
    }
    
    /**
     * add Numeric search values for field photocount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void photocount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(photocount, values, operators);
        photocount.setAndoroperator(andor);
    }
    
}
