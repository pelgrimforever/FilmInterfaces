/*
 * View_countryphotocountsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IView_countryphotocountsearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.view.eView_countryphotocount;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_countryphotocount table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_countryphotocountsearch extends Tablesearch implements IView_countryphotocountsearch {

    Stringsearch code = new Stringsearch("view_countryphotocount.code");
    Stringsearch name = new Stringsearch("view_countryphotocount.name");
    Numbersearch photocount = new Numbersearch("view_countryphotocount.photocount");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_countryphotocountsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_countryphotocountsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(code);
        addFieldsearcher(name);
        addFieldsearcher(photocount);
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
