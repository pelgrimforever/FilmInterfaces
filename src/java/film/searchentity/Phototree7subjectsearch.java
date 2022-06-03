/*
 * Phototree7subjectsearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 1.5.2022 20:24
 *
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

/**
 * Search class for Phototree7subject table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Phototree7subjectsearch extends Tablesearch implements IPhototree7subjectsearch {

//foreign keys
    Foreignkeysearch tree7subjectsearcher = new Foreignkeysearch("tree7subject", IPhototree7subject.tree7subjectPKfields, IPhototree7subject.tree7subjectFKfields);
    Foreignkeysearch photosearcher = new Foreignkeysearch("photo", IPhototree7subject.photoPKfields, IPhototree7subject.photoFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Phototree7subject.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Phototree7subjectsearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Phototree7subjectsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addKeysearcher(tree7subjectsearcher);
        addKeysearcher(photosearcher);
    }

    /**
     * add a primary key instance to search for
     * @param phototree7subjectPK: Phototree7subject primery key
     */
    public void addPrimarykey(IPhototree7subjectPK phototree7subjectPK) {
        super.addPrimarykey(phototree7subjectPK);
    }

    /**
     * set foreign key subsearch tree7subject ITree7subjectsearch
     * @param tree7subjectsearch: ITree7subjectsearch
     */
    public void tree7subject(ITree7subjectsearch tree7subjectsearch) {
        tree7subjectsearcher.setTablesearch(tree7subjectsearch);
    }
    
    /**
     * get foreign key subsearch tree7subject ITree7subjectsearch
     * @return Tablesearch for Phototree7subject
     */
    public ITree7subjectsearch getTree7subjectsearch() {
        if(tree7subjectsearcher.used()) {
            return (ITree7subjectsearch)tree7subjectsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if tree7subjectsearcher is not used
     * @return inner join statement
     */
    public String getTree7subjectInnerjoin() {
        return tree7subjectsearcher.getInnerjoin();
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
     * @return Tablesearch for Phototree7subject
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

}
