/*
 * Tree7subjectsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ITree7subjectsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Tree7subject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Tree7subject table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Tree7subjectsearch extends Tablesearch implements ITree7subjectsearch {

    Numbersearch subjectid = new Numbersearch("tree7subject.subjectid");
    Stringsearch tree7id = new Stringsearch("tree7subject.tree7id");
    Stringsearch subject = new Stringsearch("tree7subject.subject");
    Numbersearch treestep = new Numbersearch("tree7subject.treestep");
//foreign keys
    Foreignkeysearch tree7subjectParentsubjectidsearcher = new Foreignkeysearch("tree7subject", ITree7subject.tree7subjectParentsubjectidPKfields, ITree7subject.tree7subjectParentsubjectidFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch phototree7subjectsearcher = new Primarykeysearch("phototree7subject", IPhototree7subject.tree7subjectPKfields, IPhototree7subject.tree7subjectFKfields);
    //relational key
    Relationalkeysearch relphotosearcher = new Relationalkeysearch("phototree7subject", IPhototree7subject.tree7subjectPKfields, IPhototree7subject.tree7subjectFKfields, "photo", IPhototree7subject.photoPKfields, IPhototree7subject.photoFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Tree7subject.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Tree7subjectsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Tree7subjectsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(subjectid);
        addFieldsearcher(tree7id);
        addFieldsearcher(subject);
        addFieldsearcher(treestep);
        addKeysearcher(tree7subjectParentsubjectidsearcher);
        addKeysearcher(phototree7subjectsearcher);
        addKeysearcher(relphotosearcher);
    }

    /**
     * add a primary key instance to search for
     * @param tree7subjectPK: Tree7subject primery key
     */
    public void addPrimarykey(ITree7subjectPK tree7subjectPK) {
        super.addPrimarykey(tree7subjectPK);
    }

    /**
     * add Numeric search values for field subjectid, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void subjectid(long[] values, byte[] operators) {
        addNumbervalues(subjectid, values, operators);
    }
    
    /**
     * add Numeric search values for field subjectid
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void subjectid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(subjectid, values, operators);
        subjectid.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field tree7id, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void tree7id(String[] values) {
        addStringvalues(tree7id, values);
    }
    
    /**
     * add String search values for field tree7id
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void tree7id(String[] values, byte compare, byte andor) {
        addStringvalues(tree7id, values);
        tree7id.setCompareoperator(compare);
        tree7id.setAndoroperator(andor);
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
     * add Numeric search values for field treestep, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void treestep(Double[] values, byte[] operators) {
        addNumbervalues(treestep, values, operators);
    }
    
    /**
     * add Numeric search values for field treestep
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void treestep(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(treestep, values, operators);
        treestep.setAndoroperator(andor);
    }
    
    /**
     * set foreign key subsearch tree7subjectParentsubjectid ITree7subjectsearch
     * @param tree7subjectsearch: ITree7subjectsearch
     */
    public void tree7subjectParentsubjectid(ITree7subjectsearch tree7subjectsearch) {
        tree7subjectParentsubjectidsearcher.setTablesearch(tree7subjectsearch);
    }
    
    /**
     * get foreign key subsearch tree7subjectParentsubjectid ITree7subjectsearch
     * @return Tablesearch for Tree7subject
     */
    public ITree7subjectsearch getTree7subjectparentsubjectidsearch() {
        if(tree7subjectParentsubjectidsearcher.used()) {
            return (ITree7subjectsearch)tree7subjectParentsubjectidsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if tree7subjectParentsubjectidsearcher is not used
     * @return inner join statement
     */
    public String getTree7subjectparentsubjectidInnerjoin() {
        return tree7subjectParentsubjectidsearcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch IPhototree7subjectsearch
     * @param phototree7subjectsearch: IPhototree7subjectsearch
     */
    public void phototree7subject(IPhototree7subjectsearch phototree7subjectsearch) {
        phototree7subjectsearcher.setTablesearch(phototree7subjectsearch);
    }
    
    /**
     * get external key - foreign key subsearch IPhototree7subjectsearch
     * @return Tablesearch for IPhototree7subjectsearch
     */
    public IPhototree7subjectsearch getPhototree7subjectsearch() {
        if(phototree7subjectsearcher.used()) {
            return (IPhototree7subjectsearch)phototree7subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch photo tablesearch
     * @param photosearch: IPhotosearch
     */
    public void relphoto(IPhotosearch photosearch) {
        relphotosearcher.setTablesearch(photosearch);
    }
    
    /**
     * get external key - relational subsearch IPhotosearch
     * @return Tablesearch for IPhotosearch
     */
    public IPhotosearch getRelPhotosearch() {
        if(relphotosearcher.used()) {
            return (IPhotosearch)relphotosearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
