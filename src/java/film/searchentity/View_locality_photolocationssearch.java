/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IView_locality_photolocationssearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_locality_photolocations;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_locality_photolocationssearch extends Tablesearch implements IView_locality_photolocationssearch {

    Stringsearch countrycode = new Stringsearch("view_locality_photolocations.countrycode");
    Stringsearch locality = new Stringsearch("view_locality_photolocations.locality");
    Stringsearch location = new Stringsearch("view_locality_photolocations.location");

    public String getTable() {
        return View_locality_photolocations.table;
    }

    public View_locality_photolocationssearch() {
        setFieldsearchers();
    }

    public View_locality_photolocationssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(countrycode);
        addFieldsearcher(locality);
        addFieldsearcher(location);
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
    
}
