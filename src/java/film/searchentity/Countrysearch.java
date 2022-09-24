/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.ICountrysearch;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Country;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Countrysearch extends Tablesearch implements ICountrysearch {

    Stringsearch code = new Stringsearch("country.code");
    Stringsearch name = new Stringsearch("country.name");
    Stringsearch location = new Stringsearch("country.location");
    Stringsearch bounds = new Stringsearch("country.bounds");
    Stringsearch viewport = new Stringsearch("country.viewport");
    Booleansearch approximate = new Booleansearch("country.approximate");
    Booleansearch hasarealevel1 = new Booleansearch("country.hasarealevel1");
    Booleansearch hasarealevel2 = new Booleansearch("country.hasarealevel2");
    Booleansearch hasarealevel3 = new Booleansearch("country.hasarealevel3");
//foreign keys
//external foreign keys
    //foreign key
    Primarykeysearch arealevel1searcher = new Primarykeysearch("arealevel1", IArealevel1.countryPKfields, IArealevel1.countryFKfields);

    public String getTable() {
        return Country.table;
    }

    public Countrysearch() {
        setFieldsearchers();
    }

    public Countrysearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(code);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addFieldsearcher(hasarealevel1);
        addFieldsearcher(hasarealevel2);
        addFieldsearcher(hasarealevel3);
        addKeysearcher(arealevel1searcher);
    }

    public void addPrimarykey(ICountryPK countryPK) {
        super.addPrimarykey(countryPK);
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
    
    public void location(String[] values) {
        addStringvalues(location, values);
    }
    
    public void location(String[] values, byte compare, byte andor) {
        addStringvalues(location, values);
        location.setCompareoperator(compare);
        location.setAndoroperator(andor);
    }
    
    public void bounds(String[] values) {
        addStringvalues(bounds, values);
    }
    
    public void bounds(String[] values, byte compare, byte andor) {
        addStringvalues(bounds, values);
        bounds.setCompareoperator(compare);
        bounds.setAndoroperator(andor);
    }
    
    public void viewport(String[] values) {
        addStringvalues(viewport, values);
    }
    
    public void viewport(String[] values, byte compare, byte andor) {
        addStringvalues(viewport, values);
        viewport.setCompareoperator(compare);
        viewport.setAndoroperator(andor);
    }
    
    public void approximate(Boolean value) {
        addBooleanvalue(approximate, value);
    }
    
    public void hasarealevel1(Boolean value) {
        addBooleanvalue(hasarealevel1, value);
    }
    
    public void hasarealevel2(Boolean value) {
        addBooleanvalue(hasarealevel2, value);
    }
    
    public void hasarealevel3(Boolean value) {
        addBooleanvalue(hasarealevel3, value);
    }
    
    public void arealevel1(IArealevel1search arealevel1search) {
        arealevel1searcher.setTablesearch(arealevel1search);
    }
    
    public IArealevel1search getArealevel1search() {
        if(arealevel1searcher.used()) {
            return (IArealevel1search)arealevel1searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
