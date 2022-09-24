/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IPhototree7subjectsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Phototree7subject;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Phototree7subjectsearch extends Tablesearch implements IPhototree7subjectsearch {

//foreign keys
    Foreignkeysearch tree7subjectsearcher = new Foreignkeysearch("tree7subject", IPhototree7subject.tree7subjectPKfields, IPhototree7subject.tree7subjectFKfields);
    Foreignkeysearch photosearcher = new Foreignkeysearch("photo", IPhototree7subject.photoPKfields, IPhototree7subject.photoFKfields);
//external foreign keys

    public String getTable() {
        return Phototree7subject.table;
    }

    public Phototree7subjectsearch() {
        setFieldsearchers();
    }

    public Phototree7subjectsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addKeysearcher(tree7subjectsearcher);
        addKeysearcher(photosearcher);
    }

    public void addPrimarykey(IPhototree7subjectPK phototree7subjectPK) {
        super.addPrimarykey(phototree7subjectPK);
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

    public String getPhotoInnerjoin() {
        return photosearcher.getInnerjoin();
    }

}
