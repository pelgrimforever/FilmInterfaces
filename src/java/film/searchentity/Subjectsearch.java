/*
 * Subjectsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ISubjectsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Subject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Subject table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Subjectsearch extends Tablesearch implements ISubjectsearch {

    Numbersearch id = new Numbersearch("subject.id");
    Stringsearch subject = new Stringsearch("subject.subject");
    Stringsearch description = new Stringsearch("subject.description");
//foreign keys
    Foreignkeysearch subjectcatCat1searcher = new Foreignkeysearch("subjectcat", ISubject.subjectcatCat1PKfields, ISubject.subjectcatCat1FKfields);
    Foreignkeysearch tree7subjectsearcher = new Foreignkeysearch("tree7subject", ISubject.tree7subjectPKfields, ISubject.tree7subjectFKfields);
    Foreignkeysearch subjectcatCat2searcher = new Foreignkeysearch("subjectcat", ISubject.subjectcatCat2PKfields, ISubject.subjectcatCat2FKfields);
//external foreign keys
    //foreign key
    Primarykeysearch filmsubjectssearcher = new Primarykeysearch("filmsubjects", IFilmsubjects.subjectPKfields, IFilmsubjects.subjectFKfields);
    //relational key
    Relationalkeysearch relfilmsearcher = new Relationalkeysearch("filmsubjects", IFilmsubjects.subjectPKfields, IFilmsubjects.subjectFKfields, "film", IFilmsubjects.filmPKfields, IFilmsubjects.filmFKfields);
    //foreign key
    Primarykeysearch photosubjectssearcher = new Primarykeysearch("photosubjects", IPhotosubjects.subjectPKfields, IPhotosubjects.subjectFKfields);
    //relational key
    Relationalkeysearch relphotosearcher = new Relationalkeysearch("photosubjects", IPhotosubjects.subjectPKfields, IPhotosubjects.subjectFKfields, "photo", IPhotosubjects.photoPKfields, IPhotosubjects.photoFKfields);

    /**
     * @return tablename
     */
    public String getTable() {
        return Subject.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Subjectsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Subjectsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(subject);
        addFieldsearcher(description);
        addKeysearcher(subjectcatCat1searcher);
        addKeysearcher(tree7subjectsearcher);
        addKeysearcher(subjectcatCat2searcher);
        addKeysearcher(filmsubjectssearcher);
        addKeysearcher(relfilmsearcher);
        addKeysearcher(photosubjectssearcher);
        addKeysearcher(relphotosearcher);
    }

    /**
     * add a primary key instance to search for
     * @param subjectPK: Subject primery key
     */
    public void addPrimarykey(ISubjectPK subjectPK) {
        super.addPrimarykey(subjectPK);
    }

    /**
     * add Numeric search values for field id, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    /**
     * add Numeric search values for field id
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void id(long[] values, byte[] operators, byte andor) {
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
    
    /**
     * set foreign key subsearch subjectcatCat1 ISubjectcatsearch
     * @param subjectcatsearch: ISubjectcatsearch
     */
    public void subjectcatCat1(ISubjectcatsearch subjectcatsearch) {
        subjectcatCat1searcher.setTablesearch(subjectcatsearch);
    }
    
    /**
     * get foreign key subsearch subjectcatCat1 ISubjectcatsearch
     * @return Tablesearch for Subject
     */
    public ISubjectcatsearch getSubjectcatcat1search() {
        if(subjectcatCat1searcher.used()) {
            return (ISubjectcatsearch)subjectcatCat1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if subjectcatCat1searcher is not used
     * @return inner join statement
     */
    public String getSubjectcatcat1Innerjoin() {
        return subjectcatCat1searcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch tree7subject ITree7subjectsearch
     * @param tree7subjectsearch: ITree7subjectsearch
     */
    public void tree7subject(ITree7subjectsearch tree7subjectsearch) {
        tree7subjectsearcher.setTablesearch(tree7subjectsearch);
    }
    
    /**
     * get foreign key subsearch tree7subject ITree7subjectsearch
     * @return Tablesearch for Subject
     */
    public ITree7subjectsearch getTree7subjectsearch() {
        if(tree7subjectsearcher.used()) {
            return (ITree7subjectsearch)tree7subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if tree7subjectsearcher is not used
     * @return inner join statement
     */
    public String getTree7subjectInnerjoin() {
        return tree7subjectsearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch subjectcatCat2 ISubjectcatsearch
     * @param subjectcatsearch: ISubjectcatsearch
     */
    public void subjectcatCat2(ISubjectcatsearch subjectcatsearch) {
        subjectcatCat2searcher.setTablesearch(subjectcatsearch);
    }
    
    /**
     * get foreign key subsearch subjectcatCat2 ISubjectcatsearch
     * @return Tablesearch for Subject
     */
    public ISubjectcatsearch getSubjectcatcat2search() {
        if(subjectcatCat2searcher.used()) {
            return (ISubjectcatsearch)subjectcatCat2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if subjectcatCat2searcher is not used
     * @return inner join statement
     */
    public String getSubjectcatcat2Innerjoin() {
        return subjectcatCat2searcher.getInnerjoin();
    }

    /**
     * set external key - foreign key subsearch IFilmsubjectssearch
     * @param filmsubjectssearch: IFilmsubjectssearch
     */
    public void filmsubjects(IFilmsubjectssearch filmsubjectssearch) {
        filmsubjectssearcher.setTablesearch(filmsubjectssearch);
    }
    
    /**
     * get external key - foreign key subsearch IFilmsubjectssearch
     * @return Tablesearch for IFilmsubjectssearch
     */
    public IFilmsubjectssearch getFilmsubjectssearch() {
        if(filmsubjectssearcher.used()) {
            return (IFilmsubjectssearch)filmsubjectssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - relational subsearch film tablesearch
     * @param filmsearch: IFilmsearch
     */
    public void relfilm(IFilmsearch filmsearch) {
        relfilmsearcher.setTablesearch(filmsearch);
    }
    
    /**
     * get external key - relational subsearch IFilmsearch
     * @return Tablesearch for IFilmsearch
     */
    public IFilmsearch getRelFilmsearch() {
        if(relfilmsearcher.used()) {
            return (IFilmsearch)relfilmsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set external key - foreign key subsearch IPhotosubjectssearch
     * @param photosubjectssearch: IPhotosubjectssearch
     */
    public void photosubjects(IPhotosubjectssearch photosubjectssearch) {
        photosubjectssearcher.setTablesearch(photosubjectssearch);
    }
    
    /**
     * get external key - foreign key subsearch IPhotosubjectssearch
     * @return Tablesearch for IPhotosubjectssearch
     */
    public IPhotosubjectssearch getPhotosubjectssearch() {
        if(photosubjectssearcher.used()) {
            return (IPhotosubjectssearch)photosubjectssearcher.getTablesearches().get(0);
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
