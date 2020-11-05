/*
 * Subjectsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.searchentity;

import film.interfaces.searchentity.ISubjectsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eSubject;
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
    Foreignkeysearch subjectcatCat1searcher = new Foreignkeysearch("subjectcat", ISubject.subjectcatCat1PKfields, ISubject.subjectcatCat1FKfields);
    Foreignkeysearch tree7subjectsearcher = new Foreignkeysearch("tree7subject", ISubject.tree7subjectPKfields, ISubject.tree7subjectFKfields);
    Foreignkeysearch subjectcatCat2searcher = new Foreignkeysearch("subjectcat", ISubject.subjectcatCat2PKfields, ISubject.subjectcatCat2FKfields);
    Primarykeysearch filmsubjectssearcher = new Primarykeysearch(":extablename_o:", IFilmsubjects.subjectPKfields, IFilmsubjects.subjectFKfields);
    Relationalkeysearch filmsearcher = new Relationalkeysearch("filmsubjects", IFilmsubjects.subjectPKfields, IFilmsubjects.subjectFKfields, "film", IFilmsubjects.filmPKfields, IFilmsubjects.filmFKfields);
    Primarykeysearch photosubjectssearcher = new Primarykeysearch(":extablename_o:", IPhotosubjects.subjectPKfields, IPhotosubjects.subjectFKfields);
    Relationalkeysearch photosearcher = new Relationalkeysearch("photosubjects", IPhotosubjects.subjectPKfields, IPhotosubjects.subjectFKfields, "photo", IPhotosubjects.photoPKfields, IPhotosubjects.photoFKfields);

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
        addKeysearcher(filmsearcher);
        addKeysearcher(photosubjectssearcher);
        addKeysearcher(photosearcher);
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
     * set subsearch subjectcatCat1 tablesearch
     * @param subjectcatsearch: ISubjectcatsearch
     */
    public void subjectcatCat1(ISubjectcatsearch subjectcatsearch) {
        subjectcatCat1searcher.setTablesearch(subjectcatsearch);
    }
    
    /**
     * 
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
     * set subsearch tree7subject tablesearch
     * @param tree7subjectsearch: ITree7subjectsearch
     */
    public void tree7subject(ITree7subjectsearch tree7subjectsearch) {
        tree7subjectsearcher.setTablesearch(tree7subjectsearch);
    }
    
    /**
     * 
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
     * set subsearch subjectcatCat2 tablesearch
     * @param subjectcatsearch: ISubjectcatsearch
     */
    public void subjectcatCat2(ISubjectcatsearch subjectcatsearch) {
        subjectcatCat2searcher.setTablesearch(subjectcatsearch);
    }
    
    /**
     * 
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
     * set subsearch filmsubjects tablesearch
     * @param filmsubjectssearch: IFilmsubjectssearch
     */
    public void filmsubjects(IFilmsubjectssearch filmsubjectssearch) {
        filmsubjectssearcher.setTablesearch(filmsubjectssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Subject
     */
    public IFilmsubjectssearch getFilmsubjectssearch() {
        if(filmsubjectssearcher.used()) {
            return (IFilmsubjectssearch)filmsubjectssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch film tablesearch
     * @param filmsearch: IFilmsearch
     */
    public void film(IFilmsearch filmsearch) {
        filmsearcher.setTablesearch(filmsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Subject
     */
    public IFilmsearch getFilmsearch() {
        if(filmsearcher.used()) {
            return (IFilmsearch)filmsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch photosubjects tablesearch
     * @param photosubjectssearch: IPhotosubjectssearch
     */
    public void photosubjects(IPhotosubjectssearch photosubjectssearch) {
        photosubjectssearcher.setTablesearch(photosubjectssearch);
    }
    
    /**
     * 
     * @return Tablesearch for Subject
     */
    public IPhotosubjectssearch getPhotosubjectssearch() {
        if(photosubjectssearcher.used()) {
            return (IPhotosubjectssearch)photosubjectssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch photo tablesearch
     * @param photosearch: IPhotosearch
     */
    public void photo(IPhotosearch photosearch) {
        photosearcher.setTablesearch(photosearch);
    }
    
    /**
     * 
     * @return Tablesearch for Subject
     */
    public IPhotosearch getPhotosearch() {
        if(photosearcher.used()) {
            return (IPhotosearch)photosearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
