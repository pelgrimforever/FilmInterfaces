/*
 * View_backupstatussearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IView_backupstatussearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.view.eView_backupstatus;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_backupstatus table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_backupstatussearch extends Tablesearch implements IView_backupstatussearch {

    Stringsearch id = new Stringsearch("view_backupstatus.id");
    Numbersearch photocount = new Numbersearch("view_backupstatus.photocount");
    Numbersearch backupcount = new Numbersearch("view_backupstatus.backupcount");
    Numbersearch imagebackupcount = new Numbersearch("view_backupstatus.imagebackupcount");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_backupstatussearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_backupstatussearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(photocount);
        addFieldsearcher(backupcount);
        addFieldsearcher(imagebackupcount);
    }

    /**
     * add String search values for field id, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void id(String[] values) {
        addStringvalues(id, values);
    }
    
    /**
     * add String search values for field id
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void id(String[] values, byte compare, byte andor) {
        addStringvalues(id, values);
        id.setCompareoperator(compare);
        id.setAndoroperator(andor);
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
    
    /**
     * add Numeric search values for field backupcount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void backupcount(Double[] values, byte[] operators) {
        addNumbervalues(backupcount, values, operators);
    }
    
    /**
     * add Numeric search values for field backupcount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void backupcount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(backupcount, values, operators);
        backupcount.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field imagebackupcount, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void imagebackupcount(Double[] values, byte[] operators) {
        addNumbervalues(imagebackupcount, values, operators);
    }
    
    /**
     * add Numeric search values for field imagebackupcount
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void imagebackupcount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(imagebackupcount, values, operators);
        imagebackupcount.setAndoroperator(andor);
    }
    
}
