/*
 * Uploadsessionsettingssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IUploadsessionsettingssearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Uploadsessionsettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Uploadsessionsettings table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Uploadsessionsettingssearch extends Tablesearch implements IUploadsessionsettingssearch {

    Stringsearch directory = new Stringsearch("uploadsessionsettings.directory");
    Stringsearch uploadtype = new Stringsearch("uploadsessionsettings.uploadtype");
    Stringsearch filmgroups = new Stringsearch("uploadsessionsettings.filmgroups");
    Numbersearch lastposition = new Numbersearch("uploadsessionsettings.lastposition");
    Stringsearch copymode = new Stringsearch("uploadsessionsettings.copymode");
    Numbersearch uploadingposition = new Numbersearch("uploadsessionsettings.uploadingposition");
//foreign keys
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Uploadsessionsettings.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Uploadsessionsettingssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Uploadsessionsettingssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(directory);
        addFieldsearcher(uploadtype);
        addFieldsearcher(filmgroups);
        addFieldsearcher(lastposition);
        addFieldsearcher(copymode);
        addFieldsearcher(uploadingposition);
    }

    /**
     * add a primary key instance to search for
     * @param uploadsessionsettingsPK: Uploadsessionsettings primery key
     */
    public void addPrimarykey(IUploadsessionsettingsPK uploadsessionsettingsPK) {
        super.addPrimarykey(uploadsessionsettingsPK);
    }

    /**
     * add String search values for field directory, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void directory(String[] values) {
        addStringvalues(directory, values);
    }
    
    /**
     * add String search values for field directory
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void directory(String[] values, byte compare, byte andor) {
        addStringvalues(directory, values);
        directory.setCompareoperator(compare);
        directory.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field uploadtype, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void uploadtype(String[] values) {
        addStringvalues(uploadtype, values);
    }
    
    /**
     * add String search values for field uploadtype
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void uploadtype(String[] values, byte compare, byte andor) {
        addStringvalues(uploadtype, values);
        uploadtype.setCompareoperator(compare);
        uploadtype.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field filmgroups, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void filmgroups(String[] values) {
        addStringvalues(filmgroups, values);
    }
    
    /**
     * add String search values for field filmgroups
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void filmgroups(String[] values, byte compare, byte andor) {
        addStringvalues(filmgroups, values);
        filmgroups.setCompareoperator(compare);
        filmgroups.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field lastposition, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void lastposition(Double[] values, byte[] operators) {
        addNumbervalues(lastposition, values, operators);
    }
    
    /**
     * add Numeric search values for field lastposition
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void lastposition(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lastposition, values, operators);
        lastposition.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field copymode, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void copymode(String[] values) {
        addStringvalues(copymode, values);
    }
    
    /**
     * add String search values for field copymode
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void copymode(String[] values, byte compare, byte andor) {
        addStringvalues(copymode, values);
        copymode.setCompareoperator(compare);
        copymode.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field uploadingposition, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void uploadingposition(Double[] values, byte[] operators) {
        addNumbervalues(uploadingposition, values, operators);
    }
    
    /**
     * add Numeric search values for field uploadingposition
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void uploadingposition(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(uploadingposition, values, operators);
        uploadingposition.setAndoroperator(andor);
    }
    
}
