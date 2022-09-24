/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IView_subjects_for_filmsearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_subjects_for_film;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_subjects_for_filmsearch extends Tablesearch implements IView_subjects_for_filmsearch {

    Stringsearch film = new Stringsearch("view_subjects_for_film.film");
    Stringsearch cat1 = new Stringsearch("view_subjects_for_film.cat1");
    Stringsearch cat2 = new Stringsearch("view_subjects_for_film.cat2");
    Numbersearch id = new Numbersearch("view_subjects_for_film.id");
    Stringsearch subject = new Stringsearch("view_subjects_for_film.subject");
    Stringsearch description = new Stringsearch("view_subjects_for_film.description");

    public String getTable() {
        return View_subjects_for_film.table;
    }

    public View_subjects_for_filmsearch() {
        setFieldsearchers();
    }

    public View_subjects_for_filmsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(film);
        addFieldsearcher(cat1);
        addFieldsearcher(cat2);
        addFieldsearcher(id);
        addFieldsearcher(subject);
        addFieldsearcher(description);
    }

    public void film(String[] values) {
        addStringvalues(film, values);
    }
    
    public void film(String[] values, byte compare, byte andor) {
        addStringvalues(film, values);
        film.setCompareoperator(compare);
        film.setAndoroperator(andor);
    }
    
    public void cat1(String[] values) {
        addStringvalues(cat1, values);
    }
    
    public void cat1(String[] values, byte compare, byte andor) {
        addStringvalues(cat1, values);
        cat1.setCompareoperator(compare);
        cat1.setAndoroperator(andor);
    }
    
    public void cat2(String[] values) {
        addStringvalues(cat2, values);
    }
    
    public void cat2(String[] values, byte compare, byte andor) {
        addStringvalues(cat2, values);
        cat2.setCompareoperator(compare);
        cat2.setAndoroperator(andor);
    }
    
    public void id(Double[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(Double[] values, byte[] operators, byte andor) {
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
    
}
