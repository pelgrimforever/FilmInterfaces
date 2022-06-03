/*
 * Filmsubjectssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IFilmsubjectssearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Filmsubjects;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Filmsubjects table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Filmsubjectssearch extends Tablesearch implements IFilmsubjectssearch {

//foreign keys
    Foreignkeysearch subjectsearcher = new Foreignkeysearch("subject", IFilmsubjects.subjectPKfields, IFilmsubjects.subjectFKfields);
    Foreignkeysearch filmsearcher = new Foreignkeysearch("film", IFilmsubjects.filmPKfields, IFilmsubjects.filmFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Filmsubjects.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Filmsubjectssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Filmsubjectssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addKeysearcher(subjectsearcher);
        addKeysearcher(filmsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param filmsubjectsPK: Filmsubjects primery key
     */
    public void addPrimarykey(IFilmsubjectsPK filmsubjectsPK) {
        super.addPrimarykey(filmsubjectsPK);
    }

    /**
     * set foreign key subsearch subject ISubjectsearch
     * @param subjectsearch: ISubjectsearch
     */
    public void subject(ISubjectsearch subjectsearch) {
        subjectsearcher.setTablesearch(subjectsearch);
    }
    
    /**
     * get foreign key subsearch subject ISubjectsearch
     * @return Tablesearch for Filmsubjects
     */
    public ISubjectsearch getSubjectsearch() {
        if(subjectsearcher.used()) {
            return (ISubjectsearch)subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if subjectsearcher is not used
     * @return inner join statement
     */
    public String getSubjectInnerjoin() {
        return subjectsearcher.getInnerjoin();
    }

    /**
     * set foreign key subsearch film IFilmsearch
     * @param filmsearch: IFilmsearch
     */
    public void film(IFilmsearch filmsearch) {
        filmsearcher.setTablesearch(filmsearch);
    }
    
    /**
     * get foreign key subsearch film IFilmsearch
     * @return Tablesearch for Filmsubjects
     */
    public IFilmsearch getFilmsearch() {
        if(filmsearcher.used()) {
            return (IFilmsearch)filmsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if filmsearcher is not used
     * @return inner join statement
     */
    public String getFilmInnerjoin() {
        return filmsearcher.getInnerjoin();
    }

}
