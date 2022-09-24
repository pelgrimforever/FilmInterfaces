/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IUploadsessionsettingssearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Uploadsessionsettings;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Uploadsessionsettingssearch extends Tablesearch implements IUploadsessionsettingssearch {

    Stringsearch directory = new Stringsearch("uploadsessionsettings.directory");
    Stringsearch uploadtype = new Stringsearch("uploadsessionsettings.uploadtype");
    Stringsearch filmgroups = new Stringsearch("uploadsessionsettings.filmgroups");
    Numbersearch lastposition = new Numbersearch("uploadsessionsettings.lastposition");
    Stringsearch copymode = new Stringsearch("uploadsessionsettings.copymode");
    Numbersearch uploadingposition = new Numbersearch("uploadsessionsettings.uploadingposition");
//foreign keys
//external foreign keys

    public String getTable() {
        return Uploadsessionsettings.table;
    }

    public Uploadsessionsettingssearch() {
        setFieldsearchers();
    }

    public Uploadsessionsettingssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(directory);
        addFieldsearcher(uploadtype);
        addFieldsearcher(filmgroups);
        addFieldsearcher(lastposition);
        addFieldsearcher(copymode);
        addFieldsearcher(uploadingposition);
    }

    public void addPrimarykey(IUploadsessionsettingsPK uploadsessionsettingsPK) {
        super.addPrimarykey(uploadsessionsettingsPK);
    }

    public void directory(String[] values) {
        addStringvalues(directory, values);
    }
    
    public void directory(String[] values, byte compare, byte andor) {
        addStringvalues(directory, values);
        directory.setCompareoperator(compare);
        directory.setAndoroperator(andor);
    }
    
    public void uploadtype(String[] values) {
        addStringvalues(uploadtype, values);
    }
    
    public void uploadtype(String[] values, byte compare, byte andor) {
        addStringvalues(uploadtype, values);
        uploadtype.setCompareoperator(compare);
        uploadtype.setAndoroperator(andor);
    }
    
    public void filmgroups(String[] values) {
        addStringvalues(filmgroups, values);
    }
    
    public void filmgroups(String[] values, byte compare, byte andor) {
        addStringvalues(filmgroups, values);
        filmgroups.setCompareoperator(compare);
        filmgroups.setAndoroperator(andor);
    }
    
    public void lastposition(Double[] values, byte[] operators) {
        addNumbervalues(lastposition, values, operators);
    }
    
    public void lastposition(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(lastposition, values, operators);
        lastposition.setAndoroperator(andor);
    }
    
    public void copymode(String[] values) {
        addStringvalues(copymode, values);
    }
    
    public void copymode(String[] values, byte compare, byte andor) {
        addStringvalues(copymode, values);
        copymode.setCompareoperator(compare);
        copymode.setAndoroperator(andor);
    }
    
    public void uploadingposition(Double[] values, byte[] operators) {
        addNumbervalues(uploadingposition, values, operators);
    }
    
    public void uploadingposition(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(uploadingposition, values, operators);
        uploadingposition.setAndoroperator(andor);
    }
    
}
