/*
 * View_photo_firstlastdatesearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IView_photo_firstlastdatesearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.view.eView_photo_firstlastdate;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_photo_firstlastdate table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_photo_firstlastdatesearch extends Tablesearch implements IView_photo_firstlastdatesearch {

    Datesearch minphotodate = new Datesearch("view_photo_firstlastdate.minphotodate");
    Datesearch maxphotodate = new Datesearch("view_photo_firstlastdate.maxphotodate");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_photo_firstlastdatesearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_photo_firstlastdatesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(minphotodate);
        addFieldsearcher(maxphotodate);
    }

    /**
     * add Date search values for field minphotodate, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void minphotodate(Date[] values, byte[] operators) {
        addDatevalues(minphotodate, values, operators);
    }
    
    /**
     * add Date search values for field minphotodate
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void minphotodate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(minphotodate, values, operators);
        minphotodate.setAndoroperator(andor);
    }
    
    /**
     * add Date search values for field maxphotodate, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void maxphotodate(Date[] values, byte[] operators) {
        addDatevalues(maxphotodate, values, operators);
    }
    
    /**
     * add Date search values for field maxphotodate
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void maxphotodate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(maxphotodate, values, operators);
        maxphotodate.setAndoroperator(andor);
    }
    
}
