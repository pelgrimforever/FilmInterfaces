/*
 * View_subjects_for_photosearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IView_subjects_for_photosearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.view.eView_subjects_for_photo;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for View_subjects_for_photo table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class View_subjects_for_photosearch extends Tablesearch implements IView_subjects_for_photosearch {

    Stringsearch film = new Stringsearch("view_subjects_for_photo.film");
    Numbersearch photoid = new Numbersearch("view_subjects_for_photo.photoid");
    Stringsearch cat1 = new Stringsearch("view_subjects_for_photo.cat1");
    Stringsearch cat2 = new Stringsearch("view_subjects_for_photo.cat2");
    Numbersearch id = new Numbersearch("view_subjects_for_photo.id");
    Stringsearch subject = new Stringsearch("view_subjects_for_photo.subject");
    Stringsearch description = new Stringsearch("view_subjects_for_photo.description");

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public View_subjects_for_photosearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public View_subjects_for_photosearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(film);
        addFieldsearcher(photoid);
        addFieldsearcher(cat1);
        addFieldsearcher(cat2);
        addFieldsearcher(id);
        addFieldsearcher(subject);
        addFieldsearcher(description);
    }

    /**
     * add String search values for field film, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void film(String[] values) {
        addStringvalues(film, values);
    }
    
    /**
     * add String search values for field film
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void film(String[] values, byte compare, byte andor) {
        addStringvalues(film, values);
        film.setCompareoperator(compare);
        film.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field photoid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void photoid(Double[] values, byte[] operators) {
        addNumbervalues(photoid, values, operators);
    }
    
    /**
     * add Numeric search values for field photoid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void photoid(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(photoid, values, operators);
        photoid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field cat1, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void cat1(String[] values) {
        addStringvalues(cat1, values);
    }
    
    /**
     * add String search values for field cat1
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void cat1(String[] values, byte compare, byte andor) {
        addStringvalues(cat1, values);
        cat1.setCompareoperator(compare);
        cat1.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field cat2, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void cat2(String[] values) {
        addStringvalues(cat2, values);
    }
    
    /**
     * add String search values for field cat2
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void cat2(String[] values, byte compare, byte andor) {
        addStringvalues(cat2, values);
        cat2.setCompareoperator(compare);
        cat2.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field subject, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void subject(String[] values) {
        addStringvalues(subject, values);
    }
    
    /**
     * add String search values for field subject
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void subject(String[] values, byte compare, byte andor) {
        addStringvalues(subject, values);
        subject.setCompareoperator(compare);
        subject.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field description, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    /**
     * add String search values for field description
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
}
