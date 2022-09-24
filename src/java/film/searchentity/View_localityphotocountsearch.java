/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IView_localityphotocountsearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_localityphotocount;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_localityphotocountsearch extends Tablesearch implements IView_localityphotocountsearch {

    Stringsearch countrycode = new Stringsearch("view_localityphotocount.countrycode");
    Stringsearch locality = new Stringsearch("view_localityphotocount.locality");
    Stringsearch location = new Stringsearch("view_localityphotocount.location");
    Numbersearch photocount = new Numbersearch("view_localityphotocount.photocount");

    public String getTable() {
        return View_localityphotocount.table;
    }

    public View_localityphotocountsearch() {
        setFieldsearchers();
    }

    public View_localityphotocountsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(countrycode);
        addFieldsearcher(locality);
        addFieldsearcher(location);
        addFieldsearcher(photocount);
    }

    public void countrycode(String[] values) {
        addStringvalues(countrycode, values);
    }
    
    public void countrycode(String[] values, byte compare, byte andor) {
        addStringvalues(countrycode, values);
        countrycode.setCompareoperator(compare);
        countrycode.setAndoroperator(andor);
    }
    
    public void locality(String[] values) {
        addStringvalues(locality, values);
    }
    
    public void locality(String[] values, byte compare, byte andor) {
        addStringvalues(locality, values);
        locality.setCompareoperator(compare);
        locality.setAndoroperator(andor);
    }
    
    public void location(String[] values) {
        addStringvalues(location, values);
    }
    
    public void location(String[] values, byte compare, byte andor) {
        addStringvalues(location, values);
        location.setCompareoperator(compare);
        location.setAndoroperator(andor);
    }
    
    public void photocount(Double[] values, byte[] operators) {
        addNumbervalues(photocount, values, operators);
    }
    
    public void photocount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(photocount, values, operators);
        photocount.setAndoroperator(andor);
    }
    
}
