/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

    public String getTable() {
        return Subject.table;
    }

    public Subjectsearch() {
        setFieldsearchers();
    }

    public Subjectsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void addPrimarykey(ISubjectPK subjectPK) {
        super.addPrimarykey(subjectPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void subject(String[] values) {
        addStringvalues(subject, values);
    }
    
    public void subject(String[] values, byte compare, byte andor) {
        addStringvalues(subject, values);
        subject.setCompareoperator(compare);
        subject.setAndoroperator(andor);
    }
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    public void subjectcatCat1(ISubjectcatsearch subjectcatsearch) {
        subjectcatCat1searcher.setTablesearch(subjectcatsearch);
    }
    
    public ISubjectcatsearch getSubjectcatcat1search() {
        if(subjectcatCat1searcher.used()) {
            return (ISubjectcatsearch)subjectcatCat1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSubjectcatcat1Innerjoin() {
        return subjectcatCat1searcher.getInnerjoin();
    }

    public void tree7subject(ITree7subjectsearch tree7subjectsearch) {
        tree7subjectsearcher.setTablesearch(tree7subjectsearch);
    }
    
    public ITree7subjectsearch getTree7subjectsearch() {
        if(tree7subjectsearcher.used()) {
            return (ITree7subjectsearch)tree7subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getTree7subjectInnerjoin() {
        return tree7subjectsearcher.getInnerjoin();
    }

    public void subjectcatCat2(ISubjectcatsearch subjectcatsearch) {
        subjectcatCat2searcher.setTablesearch(subjectcatsearch);
    }
    
    public ISubjectcatsearch getSubjectcatcat2search() {
        if(subjectcatCat2searcher.used()) {
            return (ISubjectcatsearch)subjectcatCat2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getSubjectcatcat2Innerjoin() {
        return subjectcatCat2searcher.getInnerjoin();
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

    public void relfilm(IFilmsearch filmsearch) {
        relfilmsearcher.setTablesearch(filmsearch);
    }
    
    public IFilmsearch getRelFilmsearch() {
        if(relfilmsearcher.used()) {
            return (IFilmsearch)relfilmsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void photosubjects(IPhotosubjectssearch photosubjectssearch) {
        photosubjectssearcher.setTablesearch(photosubjectssearch);
    }
    
    public IPhotosubjectssearch getPhotosubjectssearch() {
        if(photosubjectssearcher.used()) {
            return (IPhotosubjectssearch)photosubjectssearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void relphoto(IPhotosearch photosearch) {
        relphotosearcher.setTablesearch(photosearch);
    }
    
    public IPhotosearch getRelPhotosearch() {
        if(relphotosearcher.used()) {
            return (IPhotosearch)relphotosearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
