/*
 * View_photodatessearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IView_photodatessearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.view.eView_photodates;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_photodates table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_photodatessearch extends Tablesearch implements IView_photodatessearch {

    Datesearch photodate = new Datesearch("view_photodates.photodate");
    Numbersearch photos = new Numbersearch("view_photodates.photos");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_photodatessearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_photodatessearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(photodate);
        addFieldsearcher(photos);
    }

    /**
     * add Date search values for field photodate, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void photodate(Date[] values, byte[] operators) {
        addDatevalues(photodate, values, operators);
    }
    
    /**
     * add Date search values for field photodate
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void photodate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(photodate, values, operators);
        photodate.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field photos, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void photos(Double[] values, byte[] operators) {
        addNumbervalues(photos, values, operators);
    }
    
    /**
     * add Numeric search values for field photos
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void photos(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(photos, values, operators);
        photos.setAndoroperator(andor);
    }
    
}
