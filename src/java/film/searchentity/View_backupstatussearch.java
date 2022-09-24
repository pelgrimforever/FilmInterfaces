/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IView_backupstatussearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_backupstatus;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_backupstatussearch extends Tablesearch implements IView_backupstatussearch {

    Stringsearch id = new Stringsearch("view_backupstatus.id");
    Numbersearch photocount = new Numbersearch("view_backupstatus.photocount");
    Numbersearch backupcount = new Numbersearch("view_backupstatus.backupcount");
    Numbersearch imagebackupcount = new Numbersearch("view_backupstatus.imagebackupcount");

    public String getTable() {
        return View_backupstatus.table;
    }

    public View_backupstatussearch() {
        setFieldsearchers();
    }

    public View_backupstatussearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(photocount);
        addFieldsearcher(backupcount);
        addFieldsearcher(imagebackupcount);
    }

    public void id(String[] values) {
        addStringvalues(id, values);
    }
    
    public void id(String[] values, byte compare, byte andor) {
        addStringvalues(id, values);
        id.setCompareoperator(compare);
        id.setAndoroperator(andor);
    }
    
    public void photocount(Double[] values, byte[] operators) {
        addNumbervalues(photocount, values, operators);
    }
    
    public void photocount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(photocount, values, operators);
        photocount.setAndoroperator(andor);
    }
    
    public void backupcount(Double[] values, byte[] operators) {
        addNumbervalues(backupcount, values, operators);
    }
    
    public void backupcount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(backupcount, values, operators);
        backupcount.setAndoroperator(andor);
    }
    
    public void imagebackupcount(Double[] values, byte[] operators) {
        addNumbervalues(imagebackupcount, values, operators);
    }
    
    public void imagebackupcount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(imagebackupcount, values, operators);
        imagebackupcount.setAndoroperator(andor);
    }
    
}
