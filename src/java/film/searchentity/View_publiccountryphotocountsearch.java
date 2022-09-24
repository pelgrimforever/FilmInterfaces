/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IView_publiccountryphotocountsearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_publiccountryphotocount;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_publiccountryphotocountsearch extends Tablesearch implements IView_publiccountryphotocountsearch {

    Stringsearch code = new Stringsearch("view_publiccountryphotocount.code");
    Stringsearch name = new Stringsearch("view_publiccountryphotocount.name");
    Numbersearch photocount = new Numbersearch("view_publiccountryphotocount.photocount");

    public String getTable() {
        return View_publiccountryphotocount.table;
    }

    public View_publiccountryphotocountsearch() {
        setFieldsearchers();
    }

    public View_publiccountryphotocountsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(code);
        addFieldsearcher(name);
        addFieldsearcher(photocount);
    }

    public void code(String[] values) {
        addStringvalues(code, values);
    }
    
    public void code(String[] values, byte compare, byte andor) {
        addStringvalues(code, values);
        code.setCompareoperator(compare);
        code.setAndoroperator(andor);
    }
    
    public void name(String[] values) {
        addStringvalues(name, values);
    }
    
    public void name(String[] values, byte compare, byte andor) {
        addStringvalues(name, values);
        name.setCompareoperator(compare);
        name.setAndoroperator(andor);
    }
    
    public void photocount(Double[] values, byte[] operators) {
        addNumbervalues(photocount, values, operators);
    }
    
    public void photocount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(photocount, values, operators);
        photocount.setAndoroperator(andor);
    }
    
}
