/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IUploadsessionsearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Uploadsession;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Uploadsessionsearch extends Tablesearch implements IUploadsessionsearch {

    Stringsearch filename = new Stringsearch("uploadsession.filename");
    Booleansearch upload = new Booleansearch("uploadsession.upload");
    Numbersearch rotation = new Numbersearch("uploadsession.rotation");
    Stringsearch filmgroupid = new Stringsearch("uploadsession.filmgroupid");
    Stringsearch photosubjects = new Stringsearch("uploadsession.photosubjects");
    Stringsearch description = new Stringsearch("uploadsession.description");
//foreign keys
    Foreignkeysearch creatorsearcher = new Foreignkeysearch("creator", IUploadsession.creatorPKfields, IUploadsession.creatorFKfields);
//external foreign keys

    public String getTable() {
        return Uploadsession.table;
    }

    public Uploadsessionsearch() {
        setFieldsearchers();
    }

    public Uploadsessionsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(filename);
        addFieldsearcher(upload);
        addFieldsearcher(rotation);
        addFieldsearcher(filmgroupid);
        addFieldsearcher(photosubjects);
        addFieldsearcher(description);
        addKeysearcher(creatorsearcher);
    }

    public void addPrimarykey(IUploadsessionPK uploadsessionPK) {
        super.addPrimarykey(uploadsessionPK);
    }

    public void filename(String[] values) {
        addStringvalues(filename, values);
    }
    
    public void filename(String[] values, byte compare, byte andor) {
        addStringvalues(filename, values);
        filename.setCompareoperator(compare);
        filename.setAndoroperator(andor);
    }
    
    public void upload(Boolean value) {
        addBooleanvalue(upload, value);
    }
    
    public void rotation(Double[] values, byte[] operators) {
        addNumbervalues(rotation, values, operators);
    }
    
    public void rotation(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(rotation, values, operators);
        rotation.setAndoroperator(andor);
    }
    
    public void filmgroupid(String[] values) {
        addStringvalues(filmgroupid, values);
    }
    
    public void filmgroupid(String[] values, byte compare, byte andor) {
        addStringvalues(filmgroupid, values);
        filmgroupid.setCompareoperator(compare);
        filmgroupid.setAndoroperator(andor);
    }
    
    public void photosubjects(String[] values) {
        addStringvalues(photosubjects, values);
    }
    
    public void photosubjects(String[] values, byte compare, byte andor) {
        addStringvalues(photosubjects, values);
        photosubjects.setCompareoperator(compare);
        photosubjects.setAndoroperator(andor);
    }
    
    public void description(String[] values) {
        addStringvalues(description, values);
    }
    
    public void description(String[] values, byte compare, byte andor) {
        addStringvalues(description, values);
        description.setCompareoperator(compare);
        description.setAndoroperator(andor);
    }
    
    public void creator(ICreatorsearch creatorsearch) {
        creatorsearcher.setTablesearch(creatorsearch);
    }
    
    public ICreatorsearch getCreatorsearch() {
        if(creatorsearcher.used()) {
            return (ICreatorsearch)creatorsearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getCreatorInnerjoin() {
        return creatorsearcher.getInnerjoin();
    }

}
