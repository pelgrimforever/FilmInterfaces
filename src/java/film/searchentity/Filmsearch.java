/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IFilmsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Film;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Filmsearch extends Tablesearch implements IFilmsearch {

    Stringsearch id = new Stringsearch("film.id");
    Stringsearch iso = new Stringsearch("film.iso");
    Datesearch startdate = new Datesearch("film.startdate");
    Datesearch enddate = new Datesearch("film.enddate");
    Stringsearch owner = new Stringsearch("film.owner");
    Stringsearch cd = new Stringsearch("film.cd");
    Booleansearch publicf_ = new Booleansearch("film.public");
    Booleansearch backup = new Booleansearch("film.backup");
//foreign keys
    Foreignkeysearch filmtypesearcher = new Foreignkeysearch("filmtype", IFilm.filmtypePKfields, IFilm.filmtypeFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch filmsubjectssearcher = new Primarykeysearch("filmsubjects", IFilmsubjects.filmPKfields, IFilmsubjects.filmFKfields);
    //relational key
    Relationalkeysearch relsubjectsearcher = new Relationalkeysearch("filmsubjects", IFilmsubjects.filmPKfields, IFilmsubjects.filmFKfields, "subject", IFilmsubjects.subjectPKfields, IFilmsubjects.subjectFKfields);
    //foreign key
    Primarykeysearch photosearcher = new Primarykeysearch("photo", IPhoto.filmPKfields, IPhoto.filmFKfields);

    public String getTable() {
        return Film.table;
    }

    public Filmsearch() {
        setFieldsearchers();
    }

    public Filmsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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
        addKeysearcher(relsubjectsearcher);
        addKeysearcher(photosearcher);
    }

    public void addPrimarykey(IFilmPK filmPK) {
        super.addPrimarykey(filmPK);
    }

    public void id(String[] values) {
        addStringvalues(id, values);
    }
    
    public void id(String[] values, byte compare, byte andor) {
        addStringvalues(id, values);
        id.setCompareoperator(compare);
        id.setAndoroperator(andor);
    }
    
    public void iso(String[] values) {
        addStringvalues(iso, values);
    }
    
    public void iso(String[] values, byte compare, byte andor) {
        addStringvalues(iso, values);
        iso.setCompareoperator(compare);
        iso.setAndoroperator(andor);
    }
    
    public void startdate(Date[] values, byte[] operators) {
        addDatevalues(startdate, values, operators);
    }
    
    public void startdate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(startdate, values, operators);
        startdate.setAndoroperator(andor);
    }
    
    public void enddate(Date[] values, byte[] operators) {
        addDatevalues(enddate, values, operators);
    }
    
    public void enddate(Date[] values, byte[] operators, byte andor) {
        addDatevalues(enddate, values, operators);
        enddate.setAndoroperator(andor);
    }
    
    public void owner(String[] values) {
        addStringvalues(owner, values);
    }
    
    public void owner(String[] values, byte compare, byte andor) {
        addStringvalues(owner, values);
        owner.setCompareoperator(compare);
        owner.setAndoroperator(andor);
    }
    
    public void cd(String[] values) {
        addStringvalues(cd, values);
    }
    
    public void cd(String[] values, byte compare, byte andor) {
        addStringvalues(cd, values);
        cd.setCompareoperator(compare);
        cd.setAndoroperator(andor);
    }
    
    public void publicf_(Boolean value) {
        addBooleanvalue(publicf_, value);
    }
    
    public void backup(Boolean value) {
        addBooleanvalue(backup, value);
    }
    
    public void filmtype(IFilmtypesearch filmtypesearch) {
        filmtypesearcher.setTablesearch(filmtypesearch);
    }
    
    public IFilmtypesearch getFilmtypesearch() {
        if(filmtypesearcher.used()) {
            return (IFilmtypesearch)filmtypesearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getFilmtypeInnerjoin() {
        return filmtypesearcher.getInnerjoin();
    }

    public void filmsubjects(IFilmsubjectssearch filmsubjectssearch) {
        filmsubjectssearcher.setTablesearch(filmsubjectssearch);
    }
    
    public IFilmsubjectssearch getFilmsubjectssearch() {
        if(filmsubjectssearcher.used()) {
            return (IFilmsubjectssearch)filmsubjectssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relsubject(ISubjectsearch subjectsearch) {
        relsubjectsearcher.setTablesearch(subjectsearch);
    }
    
    public ISubjectsearch getRelSubjectsearch() {
        if(relsubjectsearcher.used()) {
            return (ISubjectsearch)relsubjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void photo(IPhotosearch photosearch) {
        photosearcher.setTablesearch(photosearch);
    }
    
    public IPhotosearch getPhotosearch() {
        if(photosearcher.used()) {
            return (IPhotosearch)photosearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
