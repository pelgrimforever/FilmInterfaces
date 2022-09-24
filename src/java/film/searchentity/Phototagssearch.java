/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
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

public class Phototagssearch extends Tablesearch implements IPhototagssearch {

    Stringsearch tag = new Stringsearch("phototags.tag");
    Stringsearch tagformat = new Stringsearch("phototags.tagformat");
    Stringsearch tagvalue = new Stringsearch("phototags.tagvalue");
//foreign keys
    Foreignkeysearch photosearcher = new Foreignkeysearch("photo", IPhototags.photoPKfields, IPhototags.photoFKfields);
//external foreign keys

    public String getTable() {
        return Phototags.table;
    }

    public Phototagssearch() {
        setFieldsearchers();
    }

    public Phototagssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(tag);
        addFieldsearcher(tagformat);
        addFieldsearcher(tagvalue);
        addKeysearcher(photosearcher);
    }

    public void addPrimarykey(IPhototagsPK phototagsPK) {
        super.addPrimarykey(phototagsPK);
    }

    public void tag(String[] values) {
        addStringvalues(tag, values);
    }
    
    public void tag(String[] values, byte compare, byte andor) {
        addStringvalues(tag, values);
        tag.setCompareoperator(compare);
        tag.setAndoroperator(andor);
    }
    
    public void tagformat(String[] values) {
        addStringvalues(tagformat, values);
    }
    
    public void tagformat(String[] values, byte compare, byte andor) {
        addStringvalues(tagformat, values);
        tagformat.setCompareoperator(compare);
        tagformat.setAndoroperator(andor);
    }
    
    public void tagvalue(String[] values) {
        addStringvalues(tagvalue, values);
    }
    
    public void tagvalue(String[] values, byte compare, byte andor) {
        addStringvalues(tagvalue, values);
        tagvalue.setCompareoperator(compare);
        tagvalue.setAndoroperator(andor);
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
