/*
 * Filmsubjectssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IFilmsubjectssearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eFilmsubjects;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Filmsubjects table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Filmsubjectssearch extends Tablesearch implements IFilmsubjectssearch {

    Foreignkeysearch subjectsearcher = new Foreignkeysearch("subject", IFilmsubjects.subjectPKfields, IFilmsubjects.subjectFKfields);
    Foreignkeysearch filmsearcher = new Foreignkeysearch("film", IFilmsubjects.filmPKfields, IFilmsubjects.filmFKfields);

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
     * set subsearch subject tablesearch
     * @param subjectsearch: ISubjectsearch
     */
    public void subject(ISubjectsearch subjectsearch) {
        subjectsearcher.setTablesearch(subjectsearch);
    }
    
    /**
     * 
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
     * set subsearch film tablesearch
     * @param filmsearch: IFilmsearch
     */
    public void film(IFilmsearch filmsearch) {
        filmsearcher.setTablesearch(filmsearch);
    }
    
    /**
     * 
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
