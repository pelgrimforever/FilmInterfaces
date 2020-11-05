/*
 * Filmsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 25.9.2020 11:35
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IFilmsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eFilm;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Film table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Filmsearch extends Tablesearch implements IFilmsearch {

    Stringsearch id = new Stringsearch("film.id");
    Stringsearch iso = new Stringsearch("film.iso");
    Datesearch startdate = new Datesearch("film.startdate");
    Datesearch enddate = new Datesearch("film.enddate");
    Stringsearch owner = new Stringsearch("film.owner");
    Stringsearch cd = new Stringsearch("film.cd");
    Booleansearch publicf_ = new Booleansearch("film.public");
    Booleansearch backup = new Booleansearch("film.backup");
    Foreignkeysearch filmtypesearcher = new Foreignkeysearch("filmtype", IFilm.filmtypePKfields, IFilm.filmtypeFKfields);
    Primarykeysearch filmsubjectssearcher = new Primarykeysearch(":extablename_o:", IFilmsubjects.filmPKfields, IFilmsubjects.filmFKfields);
    Relationalkeysearch subjectsearcher = new Relationalkeysearch("filmsubjects", IFilmsubjects.filmPKfields, IFilmsubjects.filmFKfields, "subject", IFilmsubjects.subjectPKfields, IFilmsubjects.subjectFKfields);
    Primarykeysearch photosearcher = new Primarykeysearch(":extablename_o:", IPhoto.filmPKfields, IPhoto.filmFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Filmsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Filmsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(iso);
        addFieldsearcher(startdate);
        addFieldsearcher(enddate);
        addFieldsearcher(owner);
        addFieldsearcher(cd);
        addFieldsearcher(publicf_);
        addFieldsearcher(backup);
        addKeysearcher(filmtypesearcher);
        addKeysearcher(filmsubjectssearcher);
        addKeysearcher(subjectsearcher);
        addKeysearcher(photosearcher);
    }

    /**
     * add a primary key instance to search for
     * @param filmPK: Film primery key
     */
    public void addPrimarykey(IFilmPK filmPK) {
        super.addPrimarykey(filmPK);
    }

    /**
     * add String search values for field id, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void id(String[] values) {
        addStringvalues(id, values);
    }
    
    /**
     * add String search values for field id
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void id(String[] values, byte compare, byte andor) {
        addStringvalues(id, values);
        id.setCompareoperator(compare);
        id.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field iso, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void iso(String[] values) {
        addStringvalues(iso, values);
    }
    
    /**
     * add String search values for field iso
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void iso(String[] values, byte compare, byte andor) {
        addStringvalues(iso, values);
        iso.setCompareoperator(compare);
        iso.setAndoroperator(andor);
    }
    
    /**
     * add Date search values for field startdate, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void startdate(Date[] values, byte[] operators) {
        addDatevalues(startdate, values, operators);
    }
    
    /**
     * add Date search values for field startdate
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void startdate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(startdate, values, operators);
        startdate.setAndoroperator(andor);
    }
    
    /**
     * add Date search values for field enddate, default OR operator is used
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void enddate(Date[] values, byte[] operators) {
        addDatevalues(enddate, values, operators);
    }
    
    /**
     * add Date search values for field enddate
     * @param values: Array of date search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void enddate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(enddate, values, operators);
        enddate.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field owner, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void owner(String[] values) {
        addStringvalues(owner, values);
    }
    
    /**
     * add String search values for field owner
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void owner(String[] values, byte compare, byte andor) {
        addStringvalues(owner, values);
        owner.setCompareoperator(compare);
        owner.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field cd, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void cd(String[] values) {
        addStringvalues(cd, values);
    }
    
    /**
     * add String search values for field cd
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void cd(String[] values, byte compare, byte andor) {
        addStringvalues(cd, values);
        cd.setCompareoperator(compare);
        cd.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field public
     * @param value: true or false
     */
    public void publicf_(Boolean value) {
        addBooleanvalue(publicf_, value);
    }
    
    /**
     * add Boolean search values for field backup
     * @param value: true or false
     */
    public void backup(Boolean value) {
        addBooleanvalue(backup, value);
    }
    
    /**
     * set subsearch filmtype tablesearch
     * @param filmtypesearch: IFilmtypesearch
     */
    public void filmtype(IFilmtypesearch filmtypesearch) {
        filmtypesearcher.setTablesearch(filmtypesearch);
    }
    
    /**
     * 
     * @return Tablesearch for Film
     */
    public IFilmtypesearch getFilmtypesearch() {
        if(filmtypesearcher.used()) {
            return (IFilmtypesearch)filmtypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if filmtypesearcher is not used
     * @return inner join statement
     */
    public String getFilmtypeInnerjoin() {
        return filmtypesearcher.getInnerjoin();
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
     * @return Tablesearch for Film
     */
    public IFilmsubjectssearch getFilmsubjectssearch() {
        if(filmsubjectssearcher.used()) {
            return (IFilmsubjectssearch)filmsubjectssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set relational subsearch subject tablesearch
     * @param subjectsearch: ISubjectsearch
     */
    public void subject(ISubjectsearch subjectsearch) {
        subjectsearcher.setTablesearch(subjectsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Film
     */
    public ISubjectsearch getSubjectsearch() {
        if(subjectsearcher.used()) {
            return (ISubjectsearch)subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * set subsearch photo tablesearch
     * @param photosearch: IPhotosearch
     */
    public void photo(IPhotosearch photosearch) {
        photosearcher.setTablesearch(photosearch);
    }
    
    /**
     * 
     * @return Tablesearch for Film
     */
    public IPhotosearch getPhotosearch() {
        if(photosearcher.used()) {
            return (IPhotosearch)photosearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
