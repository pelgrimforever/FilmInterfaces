/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

public class Filmsubjectssearch extends Tablesearch implements IFilmsubjectssearch {

//foreign keys
    Foreignkeysearch subjectsearcher = new Foreignkeysearch("subject", IFilmsubjects.subjectPKfields, IFilmsubjects.subjectFKfields);
    Foreignkeysearch filmsearcher = new Foreignkeysearch("film", IFilmsubjects.filmPKfields, IFilmsubjects.filmFKfields);
//external foreign keys

    public String getTable() {
        return Filmsubjects.table;
    }

    public Filmsubjectssearch() {
        setFieldsearchers();
    }

    public Filmsubjectssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addKeysearcher(subjectsearcher);
        addKeysearcher(filmsearcher);
    }

    public void addPrimarykey(IFilmsubjectsPK filmsubjectsPK) {
        super.addPrimarykey(filmsubjectsPK);
    }

    public void subject(ISubjectsearch subjectsearch) {
        subjectsearcher.setTablesearch(subjectsearch);
    }
    
    public ISubjectsearch getSubjectsearch() {
        if(subjectsearcher.used()) {
            return (ISubjectsearch)subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSubjectInnerjoin() {
        return subjectsearcher.getInnerjoin();
    }

    public void film(IFilmsearch filmsearch) {
        filmsearcher.setTablesearch(filmsearch);
    }
    
    public IFilmsearch getFilmsearch() {
        if(filmsearcher.used()) {
            return (IFilmsearch)filmsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getFilmInnerjoin() {
        return filmsearcher.getInnerjoin();
    }

}
