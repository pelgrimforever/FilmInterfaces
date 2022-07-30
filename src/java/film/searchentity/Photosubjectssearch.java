/*
 * Photosubjectssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
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

/**
 * Search class for Photosubjects table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Photosubjectssearch extends Tablesearch implements IPhotosubjectssearch {

//foreign keys
    Foreignkeysearch photosearcher = new Foreignkeysearch("photo", IPhotosubjects.photoPKfields, IPhotosubjects.photoFKfields);
    Foreignkeysearch subjectsearcher = new Foreignkeysearch("subject", IPhotosubjects.subjectPKfields, IPhotosubjects.subjectFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Photosubjects.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Photosubjectssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Photosubjectssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addKeysearcher(photosearcher);
        addKeysearcher(subjectsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param photosubjectsPK: Photosubjects primery key
     */
    public void addPrimarykey(IPhotosubjectsPK photosubjectsPK) {
        super.addPrimarykey(photosubjectsPK);
    }

    /**
     * set foreign key subsearch photo IPhotosearch
     * @param photosearch: IPhotosearch
     */
    public void photo(IPhotosearch photosearch) {
        photosearcher.setTablesearch(photosearch);
    }
    
    /**
     * get foreign key subsearch photo IPhotosearch
     * @return Tablesearch for Photosubjects
     */
    public IPhotosearch getPhotosearch() {
        if(photosearcher.used()) {
            return (IPhotosearch)photosearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if photosearcher is not used
     * @return inner join statement
     */
    public String getPhotoInnerjoin() {
        return photosearcher.getInnerjoin();
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
     * @return Tablesearch for Photosubjects
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

}
