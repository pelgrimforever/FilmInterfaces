/*
 * Phototagssearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 5.5.2022 10:44
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IPhototagssearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Phototags;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Phototags table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Phototagssearch extends Tablesearch implements IPhototagssearch {

    Stringsearch tag = new Stringsearch("phototags.tag");
    Stringsearch tagformat = new Stringsearch("phototags.tagformat");
    Stringsearch tagvalue = new Stringsearch("phototags.tagvalue");
//foreign keys
    Foreignkeysearch photosearcher = new Foreignkeysearch("photo", IPhototags.photoPKfields, IPhototags.photoFKfields);
//external foreign keys

    /**
     * @return tablename
     */
    public String getTable() {
        return Phototags.table;
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Phototagssearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Phototagssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(tag);
        addFieldsearcher(tagformat);
        addFieldsearcher(tagvalue);
        addKeysearcher(photosearcher);
    }

    /**
     * add a primary key instance to search for
     * @param phototagsPK: Phototags primery key
     */
    public void addPrimarykey(IPhototagsPK phototagsPK) {
        super.addPrimarykey(phototagsPK);
    }

    /**
     * add String search values for field tag, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void tag(String[] values) {
        addStringvalues(tag, values);
    }
    
    /**
     * add String search values for field tag
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void tag(String[] values, byte compare, byte andor) {
        addStringvalues(tag, values);
        tag.setCompareoperator(compare);
        tag.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field tagformat, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void tagformat(String[] values) {
        addStringvalues(tagformat, values);
    }
    
    /**
     * add String search values for field tagformat
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void tagformat(String[] values, byte compare, byte andor) {
        addStringvalues(tagformat, values);
        tagformat.setCompareoperator(compare);
        tagformat.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field tagvalue, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void tagvalue(String[] values) {
        addStringvalues(tagvalue, values);
    }
    
    /**
     * add String search values for field tagvalue
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void tagvalue(String[] values, byte compare, byte andor) {
        addStringvalues(tagvalue, values);
        tagvalue.setCompareoperator(compare);
        tagvalue.setAndoroperator(andor);
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
     * @return Tablesearch for Phototags
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
