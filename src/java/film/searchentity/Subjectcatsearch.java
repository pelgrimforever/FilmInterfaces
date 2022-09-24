/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.ISubjectcatsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Subjectcat;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Subjectcatsearch extends Tablesearch implements ISubjectcatsearch {

    Stringsearch cat = new Stringsearch("subjectcat.cat");
    Numbersearch catno = new Numbersearch("subjectcat.catno");
    Stringsearch description = new Stringsearch("subjectcat.description");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch subjectCat1searcher = new Primarykeysearch("subject", ISubject.subjectcatCat1PKfields, ISubject.subjectcatCat1FKfields);
    //foreign key
    Primarykeysearch subjectCat2searcher = new Primarykeysearch("subject", ISubject.subjectcatCat2PKfields, ISubject.subjectcatCat2FKfields);

    public String getTable() {
        return Subjectcat.table;
    }

    public Subjectcatsearch() {
        setFieldsearchers();
    }

    public Subjectcatsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(cat);
        addFieldsearcher(catno);
        addFieldsearcher(description);
        addKeysearcher(subjectCat1searcher);
        addKeysearcher(subjectCat2searcher);
    }

    public void addPrimarykey(ISubjectcatPK subjectcatPK) {
        super.addPrimarykey(subjectcatPK);
    }

    public void cat(String[] values) {
        addStringvalues(cat, values);
    }
    
    public void cat(String[] values, byte compare, byte andor) {
        addStringvalues(cat, values);
        cat.setCompareoperator(compare);
        cat.setAndoroperator(andor);
    }
    
    public void catno(Double[] values, byte[] operators) {
        addNumbervalues(catno, values, operators);
    }
    
    public void catno(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(catno, values, operators);
        catno.setAndoroperator(andor);
    }
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    public void subjectCat1(ISubjectsearch subjectsearch) {
        subjectCat1searcher.setTablesearch(subjectsearch);
    }
    
    public ISubjectsearch getSubjectcat1search() {
        if(subjectCat1searcher.used()) {
            return (ISubjectsearch)subjectCat1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public void subjectCat2(ISubjectsearch subjectsearch) {
        subjectCat2searcher.setTablesearch(subjectsearch);
    }
    
    public ISubjectsearch getSubjectcat2search() {
        if(subjectCat2searcher.used()) {
            return (ISubjectsearch)subjectCat2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
