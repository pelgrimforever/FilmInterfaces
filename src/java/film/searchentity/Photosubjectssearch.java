/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IPhotosubjectssearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Photosubjects;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Photosubjectssearch extends Tablesearch implements IPhotosubjectssearch {

//foreign keys
    Foreignkeysearch photosearcher = new Foreignkeysearch("photo", IPhotosubjects.photoPKfields, IPhotosubjects.photoFKfields);
    Foreignkeysearch subjectsearcher = new Foreignkeysearch("subject", IPhotosubjects.subjectPKfields, IPhotosubjects.subjectFKfields);
//external foreign keys

    public String getTable() {
        return Photosubjects.table;
    }

    public Photosubjectssearch() {
        setFieldsearchers();
    }

    public Photosubjectssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addKeysearcher(photosearcher);
        addKeysearcher(subjectsearcher);
    }

    public void addPrimarykey(IPhotosubjectsPK photosubjectsPK) {
        super.addPrimarykey(photosubjectsPK);
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

}
