/*
 * Art_groupsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IArt_groupsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Art_group;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Art_group table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Art_groupsearch extends Tablesearch implements IArt_groupsearch {

    Numbersearch groupid = new Numbersearch("art_group.groupid");
    Stringsearch groupname = new Stringsearch("art_group.groupname");
//foreign keys
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Art_group.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Art_groupsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Art_groupsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(groupid);
        addFieldsearcher(groupname);
    }

    /**
     * add a primary key instance to search for
     * @param art_groupPK: Art_group primery key
     */
    public void addPrimarykey(IArt_groupPK art_groupPK) {
        super.addPrimarykey(art_groupPK);
    }

    /**
     * add Numeric search values for field groupid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void groupid(long[] values, byte[] operators) {
        addNumbervalues(groupid, values, operators);
    }
    
    /**
     * add Numeric search values for field groupid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void groupid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(groupid, values, operators);
        groupid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field groupname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void groupname(String[] values) {
        addStringvalues(groupname, values);
    }
    
    /**
     * add String search values for field groupname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void groupname(String[] values, byte compare, byte andor) {
        addStringvalues(groupname, values);
        groupname.setCompareoperator(compare);
        groupname.setAndoroperator(andor);
    }
    
}
