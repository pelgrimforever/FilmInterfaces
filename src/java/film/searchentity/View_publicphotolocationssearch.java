/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IView_publicphotolocationssearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_publicphotolocations;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_publicphotolocationssearch extends Tablesearch implements IView_publicphotolocationssearch {

    Stringsearch location = new Stringsearch("view_publicphotolocations.location");
    Booleansearch exactlocation = new Booleansearch("view_publicphotolocations.exactlocation");
    Numbersearch locationradius = new Numbersearch("view_publicphotolocations.locationradius");
    Stringsearch countrycode = new Stringsearch("view_publicphotolocations.countrycode");
    Stringsearch postalcode = new Stringsearch("view_publicphotolocations.postalcode");
    Stringsearch locality = new Stringsearch("view_publicphotolocations.locality");
    Stringsearch sublocality = new Stringsearch("view_publicphotolocations.sublocality");
    Stringsearch routecode = new Stringsearch("view_publicphotolocations.routecode");
    Stringsearch streetnumber = new Stringsearch("view_publicphotolocations.streetnumber");
    Numbersearch locationcount = new Numbersearch("view_publicphotolocations.locationcount");

    public String getTable() {
        return View_publicphotolocations.table;
    }

    public View_publicphotolocationssearch() {
        setFieldsearchers();
    }

    public View_publicphotolocationssearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(location);
        addFieldsearcher(exactlocation);
        addFieldsearcher(locationradius);
        addFieldsearcher(countrycode);
        addFieldsearcher(postalcode);
        addFieldsearcher(locality);
        addFieldsearcher(sublocality);
        addFieldsearcher(routecode);
        addFieldsearcher(streetnumber);
        addFieldsearcher(locationcount);
    }

    public void location(String[] values) {
        addStringvalues(location, values);
    }
    
    public void location(String[] values, byte compare, byte andor) {
        addStringvalues(location, values);
        location.setCompareoperator(compare);
        location.setAndoroperator(andor);
    }
    
    public void exactlocation(Boolean value) {
        addBooleanvalue(exactlocation, value);
    }
    
    public void locationradius(Double[] values, byte[] operators) {
        addNumbervalues(locationradius, values, operators);
    }
    
    public void locationradius(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationradius, values, operators);
        locationradius.setAndoroperator(andor);
    }
    
    public void countrycode(String[] values) {
        addStringvalues(countrycode, values);
    }
    
    public void countrycode(String[] values, byte compare, byte andor) {
        addStringvalues(countrycode, values);
        countrycode.setCompareoperator(compare);
        countrycode.setAndoroperator(andor);
    }
    
    public void postalcode(String[] values) {
        addStringvalues(postalcode, values);
    }
    
    public void postalcode(String[] values, byte compare, byte andor) {
        addStringvalues(postalcode, values);
        postalcode.setCompareoperator(compare);
        postalcode.setAndoroperator(andor);
    }
    
    public void locality(String[] values) {
        addStringvalues(locality, values);
    }
    
    public void locality(String[] values, byte compare, byte andor) {
        addStringvalues(locality, values);
        locality.setCompareoperator(compare);
        locality.setAndoroperator(andor);
    }
    
    public void sublocality(String[] values) {
        addStringvalues(sublocality, values);
    }
    
    public void sublocality(String[] values, byte compare, byte andor) {
        addStringvalues(sublocality, values);
        sublocality.setCompareoperator(compare);
        sublocality.setAndoroperator(andor);
    }
    
    public void routecode(String[] values) {
        addStringvalues(routecode, values);
    }
    
    public void routecode(String[] values, byte compare, byte andor) {
        addStringvalues(routecode, values);
        routecode.setCompareoperator(compare);
        routecode.setAndoroperator(andor);
    }
    
    public void streetnumber(String[] values) {
        addStringvalues(streetnumber, values);
    }
    
    public void streetnumber(String[] values, byte compare, byte andor) {
        addStringvalues(streetnumber, values);
        streetnumber.setCompareoperator(compare);
        streetnumber.setAndoroperator(andor);
    }
    
    public void locationcount(Double[] values, byte[] operators) {
        addNumbervalues(locationcount, values, operators);
    }
    
    public void locationcount(Double[] values, byte[] operators, byte andor) {
        addNumbervalues(locationcount, values, operators);
        locationcount.setAndoroperator(andor);
    }
    
}
