/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IArt_photosearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Art_photo;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Art_photosearch extends Tablesearch implements IArt_photosearch {

    Booleansearch selection = new Booleansearch("art_photo.selection");
    Numbersearch width = new Numbersearch("art_photo.width");
    Numbersearch height = new Numbersearch("art_photo.height");
    Stringsearch comment = new Stringsearch("art_photo.comment");
    Numbersearch seqno = new Numbersearch("art_photo.seqno");
    Booleansearch archive = new Booleansearch("art_photo.archive");
    Booleansearch surround = new Booleansearch("art_photo.surround");
    Stringsearch surrounddir = new Stringsearch("art_photo.surrounddir");
//foreign keys
    Foreignkeysearch photosearcher = new Foreignkeysearch("photo", IArt_photo.photoPKfields, IArt_photo.photoFKfields);
    Foreignkeysearch art_subgroupsearcher = new Foreignkeysearch("art_subgroup", IArt_photo.art_subgroupPKfields, IArt_photo.art_subgroupFKfields);
    Foreignkeysearch art_academysearcher = new Foreignkeysearch("art_academy", IArt_photo.art_academyPKfields, IArt_photo.art_academyFKfields);
    Foreignkeysearch art_groupsearcher = new Foreignkeysearch("art_group", IArt_photo.art_groupPKfields, IArt_photo.art_groupFKfields);
//external foreign keys

    public String getTable() {
        return Art_photo.table;
    }

    public Art_photosearch() {
        setFieldsearchers();
    }

    public Art_photosearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

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

    public void addPrimarykey(IArt_photoPK art_photoPK) {
        super.addPrimarykey(art_photoPK);
    }

    public void selection(Boolean value) {
        addBooleanvalue(selection, value);
    }
    
    public void width(Double[] values, byte[] operators) {
        addNumbervalues(width, values, operators);
    }
    
    public void width(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(width, values, operators);
        width.setAndoroperator(andor);
    }
    
    public void height(Double[] values, byte[] operators) {
        addNumbervalues(height, values, operators);
    }
    
    public void height(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(height, values, operators);
        height.setAndoroperator(andor);
    }
    
    public void comment(String[] values) {
        addStringvalues(comment, values);
    }
    
    public void comment(String[] values, byte compare, byte andor) {
        addStringvalues(comment, values);
        comment.setCompareoperator(compare);
        comment.setAndoroperator(andor);
    }
    
    public void seqno(Double[] values, byte[] operators) {
        addNumbervalues(seqno, values, operators);
    }
    
    public void seqno(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(seqno, values, operators);
        seqno.setAndoroperator(andor);
    }
    
    public void archive(Boolean value) {
        addBooleanvalue(archive, value);
    }
    
    public void surround(Boolean value) {
        addBooleanvalue(surround, value);
    }
    
    public void surrounddir(String[] values) {
        addStringvalues(surrounddir, values);
    }
    
    public void surrounddir(String[] values, byte compare, byte andor) {
        addStringvalues(surrounddir, values);
        surrounddir.setCompareoperator(compare);
        surrounddir.setAndoroperator(andor);
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

    public void art_subgroup(IArt_subgroupsearch art_subgroupsearch) {
        art_subgroupsearcher.setTablesearch(art_subgroupsearch);
    }
    
    public IArt_subgroupsearch getArt_subgroupsearch() {
        if(art_subgroupsearcher.used()) {
            return (IArt_subgroupsearch)art_subgroupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getArt_subgroupInnerjoin() {
        return art_subgroupsearcher.getInnerjoin();
    }

    public void art_academy(IArt_academysearch art_academysearch) {
        art_academysearcher.setTablesearch(art_academysearch);
    }
    
    public IArt_academysearch getArt_academysearch() {
        if(art_academysearcher.used()) {
            return (IArt_academysearch)art_academysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getArt_academyInnerjoin() {
        return art_academysearcher.getInnerjoin();
    }

    public void art_group(IArt_groupsearch art_groupsearch) {
        art_groupsearcher.setTablesearch(art_groupsearch);
    }
    
    public IArt_groupsearch getArt_groupsearch() {
        if(art_groupsearcher.used()) {
            return (IArt_groupsearch)art_groupsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getArt_groupInnerjoin() {
        return art_groupsearcher.getInnerjoin();
    }

}
