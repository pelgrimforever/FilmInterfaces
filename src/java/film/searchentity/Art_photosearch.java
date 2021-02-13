/*
 * Art_photosearch.java
 *
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 4.1.2021 12:6
 *
 */

package film.searchentity;

import film.interfaces.searchentity.IArt_photosearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.entity.eArt_photo;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Search class for Art_photo table
 * construct sql where part and parameter array from search parameters
 * @author Franky Laseure
 */
public class Art_photosearch extends Tablesearch implements IArt_photosearch {

    Booleansearch selection = new Booleansearch("art_photo.selection");
    Numbersearch width = new Numbersearch("art_photo.width");
    Numbersearch height = new Numbersearch("art_photo.height");
    Stringsearch comment = new Stringsearch("art_photo.comment");
    Numbersearch seqno = new Numbersearch("art_photo.seqno");
    Booleansearch archive = new Booleansearch("art_photo.archive");
    Booleansearch surround = new Booleansearch("art_photo.surround");
    Stringsearch surrounddir = new Stringsearch("art_photo.surrounddir");
    Foreignkeysearch photosearcher = new Foreignkeysearch("photo", IArt_photo.photoPKfields, IArt_photo.photoFKfields);
    Foreignkeysearch art_subgroupsearcher = new Foreignkeysearch("art_subgroup", IArt_photo.art_subgroupPKfields, IArt_photo.art_subgroupFKfields);
    Foreignkeysearch art_academysearcher = new Foreignkeysearch("art_academy", IArt_photo.art_academyPKfields, IArt_photo.art_academyFKfields);
    Foreignkeysearch art_groupsearcher = new Foreignkeysearch("art_group", IArt_photo.art_groupPKfields, IArt_photo.art_groupFKfields);

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     */
    public Art_photosearch() {
        setFieldsearchers();
    }

    /**
     * Constructor
     * add IFieldsearcher classes for all relevant fields
     * set andor parameter
     * @param andor: containts AND or OR contant, indicates all conditions must apply or only one
     */
    public Art_photosearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    /**
     * add IFieldsearcher classes for all relevant fields
     */
    private void setFieldsearchers() {
        addFieldsearcher(selection);
        addFieldsearcher(width);
        addFieldsearcher(height);
        addFieldsearcher(comment);
        addFieldsearcher(seqno);
        addFieldsearcher(archive);
        addFieldsearcher(surround);
        addFieldsearcher(surrounddir);
        addKeysearcher(photosearcher);
        addKeysearcher(art_subgroupsearcher);
        addKeysearcher(art_academysearcher);
        addKeysearcher(art_groupsearcher);
    }

    /**
     * add a primary key instance to search for
     * @param art_photoPK: Art_photo primery key
     */
    public void addPrimarykey(IArt_photoPK art_photoPK) {
        super.addPrimarykey(art_photoPK);
    }

    /**
     * add Boolean search values for field selection
     * @param value: true or false
     */
    public void selection(Boolean value) {
        addBooleanvalue(selection, value);
    }
    
    /**
     * add Numeric search values for field width, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void width(Double[] values, byte[] operators) {
        addNumbervalues(width, values, operators);
    }
    
    /**
     * add Numeric search values for field width
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void width(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(width, values, operators);
        width.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field height, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void height(Double[] values, byte[] operators) {
        addNumbervalues(height, values, operators);
    }
    
    /**
     * add Numeric search values for field height
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void height(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(height, values, operators);
        height.setAndoroperator(andor);
    }
    
    /**
     * add String search values for field comment, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void comment(String[] values) {
        addStringvalues(comment, values);
    }
    
    /**
     * add String search values for field comment
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void comment(String[] values, byte compare, byte andor) {
        addStringvalues(comment, values);
        comment.setCompareoperator(compare);
        comment.setAndoroperator(andor);
    }
    
    /**
     * add Numeric search values for field seqno, default OR operator is used
     * @param values: Array of numeric search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     */
    public void seqno(Double[] values, byte[] operators) {
        addNumbervalues(seqno, values, operators);
    }
    
    /**
     * add Numeric search values for field seqno
     * @param values: Array of String search values
     * @param operators: Array of byte contants for comparison (= < <= > >=)
     * @param andor; AND/OR constant
     */
    public void seqno(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(seqno, values, operators);
        seqno.setAndoroperator(andor);
    }
    
    /**
     * add Boolean search values for field archive
     * @param value: true or false
     */
    public void archive(Boolean value) {
        addBooleanvalue(archive, value);
    }
    
    /**
     * add Boolean search values for field surround
     * @param value: true or false
     */
    public void surround(Boolean value) {
        addBooleanvalue(surround, value);
    }
    
    /**
     * add String search values for field surrounddir, default OR and LIKE operators are used
     * @param values: Array of String search values
     */
    public void surrounddir(String[] values) {
        addStringvalues(surrounddir, values);
    }
    
    /**
     * add String search values for field surrounddir
     * @param values: Array of String search values
     * @param andor; AND/OR constant
     * @param compare: EQUAL/LIKE constant
     */
    public void surrounddir(String[] values, byte compare, byte andor) {
        addStringvalues(surrounddir, values);
        surrounddir.setCompareoperator(compare);
        surrounddir.setAndoroperator(andor);
    }
    
    /**
     * set subsearch photo tablesearch
     * @param photosearch: IPhotosearch
     */
    public void photo(IPhotosearch photosearch) {
        photosearcher.setTablesearch(photosearch);
    }
    
    /**
     * 
     * @return Tablesearch for Art_photo
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
     * set subsearch art_subgroup tablesearch
     * @param art_subgroupsearch: IArt_subgroupsearch
     */
    public void art_subgroup(IArt_subgroupsearch art_subgroupsearch) {
        art_subgroupsearcher.setTablesearch(art_subgroupsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Art_photo
     */
    public IArt_subgroupsearch getArt_subgroupsearch() {
        if(art_subgroupsearcher.used()) {
            return (IArt_subgroupsearch)art_subgroupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if art_subgroupsearcher is not used
     * @return inner join statement
     */
    public String getArt_subgroupInnerjoin() {
        return art_subgroupsearcher.getInnerjoin();
    }

    /**
     * set subsearch art_academy tablesearch
     * @param art_academysearch: IArt_academysearch
     */
    public void art_academy(IArt_academysearch art_academysearch) {
        art_academysearcher.setTablesearch(art_academysearch);
    }
    
    /**
     * 
     * @return Tablesearch for Art_photo
     */
    public IArt_academysearch getArt_academysearch() {
        if(art_academysearcher.used()) {
            return (IArt_academysearch)art_academysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if art_academysearcher is not used
     * @return inner join statement
     */
    public String getArt_academyInnerjoin() {
        return art_academysearcher.getInnerjoin();
    }

    /**
     * set subsearch art_group tablesearch
     * @param art_groupsearch: IArt_groupsearch
     */
    public void art_group(IArt_groupsearch art_groupsearch) {
        art_groupsearcher.setTablesearch(art_groupsearch);
    }
    
    /**
     * 
     * @return Tablesearch for Art_photo
     */
    public IArt_groupsearch getArt_groupsearch() {
        if(art_groupsearcher.used()) {
            return (IArt_groupsearch)art_groupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    /**
     * force to return inner join statement
     * ignore if art_groupsearcher is not used
     * @return inner join statement
     */
    public String getArt_groupInnerjoin() {
        return art_groupsearcher.getInnerjoin();
    }

}
