/*
 * Art_academysearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IArt_academysearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Art_academy;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Art_academy table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Art_academysearch extends Tablesearch implements IArt_academysearch {

    Numbersearch academyid = new Numbersearch("art_academy.academyid");
    Stringsearch academy = new Stringsearch("art_academy.academy");
    Stringsearch academylocation = new Stringsearch("art_academy.academylocation");

    /**
     * @return tablename
     */
    public String getTable() {
        return Art_academy.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Art_academysearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Art_academysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(academyid);
        addFieldsearcher(academy);
        addFieldsearcher(academylocation);
    }

    /**
     * add a primary key instance to search for
     * @param art_academyPK: Art_academy primery key
     */
    public void addPrimarykey(IArt_academyPK art_academyPK) {
        super.addPrimarykey(art_academyPK);
    }

    /**
     * add Numeric search values for field academyid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void academyid(long[] values, byte[] operators) {
        addNumbervalues(academyid, values, operators);
    }
    
    /**
     * add Numeric search values for field academyid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void academyid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(academyid, values, operators);
        academyid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field academy, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void academy(String[] values) {
        addStringvalues(academy, values);
    }
    
    /**
     * add String search values for field academy
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void academy(String[] values, byte compare, byte andor) {
        addStringvalues(academy, values);
        academy.setCompareoperator(compare);
        academy.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field academylocation, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void academylocation(String[] values) {
        addStringvalues(academylocation, values);
    }
    
    /**
     * add String search values for field academylocation
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void academylocation(String[] values, byte compare, byte andor) {
        addStringvalues(academylocation, values);
        academylocation.setCompareoperator(compare);
        academylocation.setAndoroperator(andor);
    }
    
}
