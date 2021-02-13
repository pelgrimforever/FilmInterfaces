/*
 * Subjectcatsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ISubjectcatsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eSubjectcat;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Subjectcat table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Subjectcatsearch extends Tablesearch implements ISubjectcatsearch {

    Stringsearch cat = new Stringsearch("subjectcat.cat");
    Numbersearch catno = new Numbersearch("subjectcat.catno");
    Stringsearch description = new Stringsearch("subjectcat.description");
    Primarykeysearch subjectCat1searcher = new Primarykeysearch(":extablename_o:", ISubject.subjectcatCat1PKfields, ISubject.subjectcatCat1FKfields);
    Primarykeysearch subjectCat2searcher = new Primarykeysearch(":extablename_o:", ISubject.subjectcatCat2PKfields, ISubject.subjectcatCat2FKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Subjectcatsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Subjectcatsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(cat);
        addFieldsearcher(catno);
        addFieldsearcher(description);
        addKeysearcher(subjectCat1searcher);
        addKeysearcher(subjectCat2searcher);
    }

    /**
     * add a primary key instance to search for
     * @param subjectcatPK: Subjectcat primery key
     */
    public void addPrimarykey(ISubjectcatPK subjectcatPK) {
        super.addPrimarykey(subjectcatPK);
    }

    /**
     * add String search values for field cat, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void cat(String[] values) {
        addStringvalues(cat, values);
    }
    
    /**
     * add String search values for field cat
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void cat(String[] values, byte compare, byte andor) {
        addStringvalues(cat, values);
        cat.setCompareoperator(compare);
        cat.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field catno, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void catno(Double[] values, byte[] operators) {
        addNumbervalues(catno, values, operators);
    }
    
    /**
     * add Numeric search values for field catno
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void catno(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(catno, values, operators);
        catno.setAndoroperator(andor);
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
    
    /**
     * set subsearch subject tablesearch
     * @param subjectsearch: ISubjectsearch
     */
    public void subjectCat1(ISubjectsearch subjectsearch) {
        subjectCat1searcher.setTablesearch(subjectsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Subjectcat
     */
    public ISubjectsearch getSubjectcat1search() {
        if(subjectCat1searcher.used()) {
            return (ISubjectsearch)subjectCat1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch subject tablesearch
     * @param subjectsearch: ISubjectsearch
     */
    public void subjectCat2(ISubjectsearch subjectsearch) {
        subjectCat2searcher.setTablesearch(subjectsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Subjectcat
     */
    public ISubjectsearch getSubjectcat2search() {
        if(subjectCat2searcher.used()) {
            return (ISubjectsearch)subjectCat2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
