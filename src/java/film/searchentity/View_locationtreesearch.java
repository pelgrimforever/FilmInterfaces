/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IView_locationtreesearch;
import data.interfaces.db.*;
import film.interfaces.logicview.*;
import film.interfaces.searchentity.*;
import film.logicview.View_locationtree;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class View_locationtreesearch extends Tablesearch implements IView_locationtreesearch {

    Stringsearch countrycode = new Stringsearch("view_locationtree.countrycode");
    Stringsearch countryname = new Stringsearch("view_locationtree.countryname");
    Stringsearch postalcode = new Stringsearch("view_locationtree.postalcode");
    Stringsearch al1code = new Stringsearch("view_locationtree.al1code");
    Stringsearch al1name = new Stringsearch("view_locationtree.al1name");
    Stringsearch al2code = new Stringsearch("view_locationtree.al2code");
    Stringsearch al2name = new Stringsearch("view_locationtree.al2name");
    Stringsearch al3code = new Stringsearch("view_locationtree.al3code");
    Stringsearch al3name = new Stringsearch("view_locationtree.al3name");
    Stringsearch locality = new Stringsearch("view_locationtree.locality");
    Booleansearch hassublocality = new Booleansearch("view_locationtree.hassublocality");
    Stringsearch sublocality = new Stringsearch("view_locationtree.sublocality");
    Stringsearch routecode = new Stringsearch("view_locationtree.routecode");
    Stringsearch routename = new Stringsearch("view_locationtree.routename");

    public String getTable() {
        return View_locationtree.table;
    }

    public View_locationtreesearch() {
        setFieldsearchers();
    }

    public View_locationtreesearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(countrycode);
        addFieldsearcher(countryname);
        addFieldsearcher(postalcode);
        addFieldsearcher(al1code);
        addFieldsearcher(al1name);
        addFieldsearcher(al2code);
        addFieldsearcher(al2name);
        addFieldsearcher(al3code);
        addFieldsearcher(al3name);
        addFieldsearcher(locality);
        addFieldsearcher(hassublocality);
        addFieldsearcher(sublocality);
        addFieldsearcher(routecode);
        addFieldsearcher(routename);
    }

    public void countrycode(String[] values) {
        addStringvalues(countrycode, values);
    }
    
    public void countrycode(String[] values, byte compare, byte andor) {
        addStringvalues(countrycode, values);
        countrycode.setCompareoperator(compare);
        countrycode.setAndoroperator(andor);
    }
    
    public void countryname(String[] values) {
        addStringvalues(countryname, values);
    }
    
    public void countryname(String[] values, byte compare, byte andor) {
        addStringvalues(countryname, values);
        countryname.setCompareoperator(compare);
        countryname.setAndoroperator(andor);
    }
    
    public void postalcode(String[] values) {
        addStringvalues(postalcode, values);
    }
    
    public void postalcode(String[] values, byte compare, byte andor) {
        addStringvalues(postalcode, values);
        postalcode.setCompareoperator(compare);
        postalcode.setAndoroperator(andor);
    }
    
    public void al1code(String[] values) {
        addStringvalues(al1code, values);
    }
    
    public void al1code(String[] values, byte compare, byte andor) {
        addStringvalues(al1code, values);
        al1code.setCompareoperator(compare);
        al1code.setAndoroperator(andor);
    }
    
    public void al1name(String[] values) {
        addStringvalues(al1name, values);
    }
    
    public void al1name(String[] values, byte compare, byte andor) {
        addStringvalues(al1name, values);
        al1name.setCompareoperator(compare);
        al1name.setAndoroperator(andor);
    }
    
    public void al2code(String[] values) {
        addStringvalues(al2code, values);
    }
    
    public void al2code(String[] values, byte compare, byte andor) {
        addStringvalues(al2code, values);
        al2code.setCompareoperator(compare);
        al2code.setAndoroperator(andor);
    }
    
    public void al2name(String[] values) {
        addStringvalues(al2name, values);
    }
    
    public void al2name(String[] values, byte compare, byte andor) {
        addStringvalues(al2name, values);
        al2name.setCompareoperator(compare);
        al2name.setAndoroperator(andor);
    }
    
    public void al3code(String[] values) {
        addStringvalues(al3code, values);
    }
    
    public void al3code(String[] values, byte compare, byte andor) {
        addStringvalues(al3code, values);
        al3code.setCompareoperator(compare);
        al3code.setAndoroperator(andor);
    }
    
    public void al3name(String[] values) {
        addStringvalues(al3name, values);
    }
    
    public void al3name(String[] values, byte compare, byte andor) {
        addStringvalues(al3name, values);
        al3name.setCompareoperator(compare);
        al3name.setAndoroperator(andor);
    }
    
    public void locality(String[] values) {
        addStringvalues(locality, values);
    }
    
    public void locality(String[] values, byte compare, byte andor) {
        addStringvalues(locality, values);
        locality.setCompareoperator(compare);
        locality.setAndoroperator(andor);
    }
    
    public void hassublocality(Boolean value) {
        addBooleanvalue(hassublocality, value);
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
    
    public void routename(String[] values) {
        addStringvalues(routename, values);
    }
    
    public void routename(String[] values, byte compare, byte andor) {
        addStringvalues(routename, values);
        routename.setCompareoperator(compare);
        routename.setAndoroperator(andor);
    }
    
}
