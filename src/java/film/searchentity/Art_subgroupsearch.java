/*
 * Art_subgroupsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 24.9.2021 14:50
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IArt_subgroupsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Art_subgroup;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Art_subgroup table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Art_subgroupsearch extends Tablesearch implements IArt_subgroupsearch {

    Numbersearch subgroupid = new Numbersearch("art_subgroup.subgroupid");
    Stringsearch subgroupname = new Stringsearch("art_subgroup.subgroupname");
    Numbersearch lastseqno = new Numbersearch("art_subgroup.lastseqno");
    Foreignkeysearch art_groupsearcher = new Foreignkeysearch("art_group", IArt_subgroup.art_groupPKfields, IArt_subgroup.art_groupFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Art_subgroup.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Art_subgroupsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Art_subgroupsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(subgroupid);
        addFieldsearcher(subgroupname);
        addFieldsearcher(lastseqno);
        addKeysearcher(art_groupsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param art_subgroupPK: Art_subgroup primery key
     */
    public void addPrimarykey(IArt_subgroupPK art_subgroupPK) {
        super.addPrimarykey(art_subgroupPK);
    }

    /**
     * add Numeric search values for field subgroupid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void subgroupid(long[] values, byte[] operators) {
        addNumbervalues(subgroupid, values, operators);
    }
    
    /**
     * add Numeric search values for field subgroupid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void subgroupid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(subgroupid, values, operators);
        subgroupid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field subgroupname, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void subgroupname(String[] values) {
        addStringvalues(subgroupname, values);
    }
    
    /**
     * add String search values for field subgroupname
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void subgroupname(String[] values, byte compare, byte andor) {
        addStringvalues(subgroupname, values);
        subgroupname.setCompareoperator(compare);
        subgroupname.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field lastseqno, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void lastseqno(Double[] values, byte[] operators) {
        addNumbervalues(lastseqno, values, operators);
    }
    
    /**
     * add Numeric search values for field lastseqno
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void lastseqno(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lastseqno, values, operators);
        lastseqno.setAndoroperator(andor);
    }
    
    /**
     * set subsearch art_group tablesearch
     * @param art_groupsearch: IArt_groupsearch
     */
    public void art_group(IArt_groupsearch art_groupsearch) {
        art_groupsearcher.setTablesearch(art_groupsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Art_subgroup
     */
    public IArt_groupsearch getArt_groupsearch() {
        if(art_groupsearcher.used()) {
            return (IArt_groupsearch)art_groupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if art_groupsearcher is not used
     * @return inner join statement
     */
    public String getArt_groupInnerjoin() {
        return art_groupsearcher.getInnerjoin();
    }

}
