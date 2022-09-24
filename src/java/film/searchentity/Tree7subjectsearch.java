/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.ITree7subjectsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Tree7subject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Tree7subjectsearch extends Tablesearch implements ITree7subjectsearch {

    Numbersearch subjectid = new Numbersearch("tree7subject.subjectid");
    Stringsearch tree7id = new Stringsearch("tree7subject.tree7id");
    Stringsearch subject = new Stringsearch("tree7subject.subject");
    Numbersearch treestep = new Numbersearch("tree7subject.treestep");
//foreign keys
    Foreignkeysearch tree7subjectParentsubjectidsearcher = new Foreignkeysearch("tree7subject", ITree7subject.tree7subjectParentsubjectidPKfields, ITree7subject.tree7subjectParentsubjectidFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch phototree7subjectsearcher = new Primarykeysearch("phototree7subject", IPhototree7subject.tree7subjectPKfields, IPhototree7subject.tree7subjectFKfields);
    //relational key
    Relationalkeysearch relphotosearcher = new Relationalkeysearch("phototree7subject", IPhototree7subject.tree7subjectPKfields, IPhototree7subject.tree7subjectFKfields, "photo", IPhototree7subject.photoPKfields, IPhototree7subject.photoFKfields);

    public String getTable() {
        return Tree7subject.table;
    }

    public Tree7subjectsearch() {
        setFieldsearchers();
    }

    public Tree7subjectsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(subjectid);
        addFieldsearcher(tree7id);
        addFieldsearcher(subject);
        addFieldsearcher(treestep);
        addKeysearcher(tree7subjectParentsubjectidsearcher);
        addKeysearcher(phototree7subjectsearcher);
        addKeysearcher(relphotosearcher);
    }

    public void addPrimarykey(ITree7subjectPK tree7subjectPK) {
        super.addPrimarykey(tree7subjectPK);
    }

    public void subjectid(long[] values, byte[] operators) {
        addNumbervalues(subjectid, values, operators);
    }
    
    public void subjectid(long[] values, byte[] operators, byte andor) {
        addNumbervalues(subjectid, values, operators);
        subjectid.setAndoroperator(andor);
    }
    
    public void tree7id(String[] values) {
        addStringvalues(tree7id, values);
    }
    
    public void tree7id(String[] values, byte compare, byte andor) {
        addStringvalues(tree7id, values);
        tree7id.setCompareoperator(compare);
        tree7id.setAndoroperator(andor);
    }
    
    public void subject(String[] values) {
        addStringvalues(subject, values);
    }
    
    public void subject(String[] values, byte compare, byte andor) {
        addStringvalues(subject, values);
        subject.setCompareoperator(compare);
        subject.setAndoroperator(andor);
    }
    
    public void treestep(Double[] values, byte[] operators) {
        addNumbervalues(treestep, values, operators);
    }
    
    public void treestep(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(treestep, values, operators);
        treestep.setAndoroperator(andor);
    }
    
    public void tree7subjectParentsubjectid(ITree7subjectsearch tree7subjectsearch) {
        tree7subjectParentsubjectidsearcher.setTablesearch(tree7subjectsearch);
    }
    
    public ITree7subjectsearch getTree7subjectparentsubjectidsearch() {
        if(tree7subjectParentsubjectidsearcher.used()) {
            return (ITree7subjectsearch)tree7subjectParentsubjectidsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getTree7subjectparentsubjectidInnerjoin() {
        return tree7subjectParentsubjectidsearcher.getInnerjoin();
    }

    public void phototree7subject(IPhototree7subjectsearch phototree7subjectsearch) {
        phototree7subjectsearcher.setTablesearch(phototree7subjectsearch);
    }
    
    public IPhototree7subjectsearch getPhototree7subjectsearch() {
        if(phototree7subjectsearcher.used()) {
            return (IPhototree7subjectsearch)phototree7subjectsearcher.getTablesearches().get(0);
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
