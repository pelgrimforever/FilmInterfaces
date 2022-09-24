/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IArealevel1search;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Arealevel1;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Arealevel1search extends Tablesearch implements IArealevel1search {

    Stringsearch al1code = new Stringsearch("arealevel1.al1code");
    Stringsearch name = new Stringsearch("arealevel1.name");
    Stringsearch location = new Stringsearch("arealevel1.location");
    Stringsearch bounds = new Stringsearch("arealevel1.bounds");
    Stringsearch viewport = new Stringsearch("arealevel1.viewport");
    Booleansearch approximate = new Booleansearch("arealevel1.approximate");
//foreign keys
    Foreignkeysearch countrysearcher = new Foreignkeysearch("country", IArealevel1.countryPKfields, IArealevel1.countryFKfields);
//external foreign keys
    //foreign key
    Primarykeysearch arealevel2searcher = new Primarykeysearch("arealevel2", IArealevel2.arealevel1PKfields, IArealevel2.arealevel1FKfields);

    public String getTable() {
        return Arealevel1.table;
    }

    public Arealevel1search() {
        setFieldsearchers();
    }

    public Arealevel1search(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(al1code);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(countrysearcher);
        addKeysearcher(arealevel2searcher);
    }

    public void addPrimarykey(IArealevel1PK arealevel1PK) {
        super.addPrimarykey(arealevel1PK);
    }

    public void al1code(String[] values) {
        addStringvalues(al1code, values);
    }
    
    public void al1code(String[] values, byte compare, byte andor) {
        addStringvalues(al1code, values);
        al1code.setCompareoperator(compare);
        al1code.setAndoroperator(andor);
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
    
    public void country(ICountrysearch countrysearch) {
        countrysearcher.setTablesearch(countrysearch);
    }
    
    public ICountrysearch getCountrysearch() {
        if(countrysearcher.used()) {
            return (ICountrysearch)countrysearcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

    public String getCountryInnerjoin() {
        return countrysearcher.getInnerjoin();
    }

    public void arealevel2(IArealevel2search arealevel2search) {
        arealevel2searcher.setTablesearch(arealevel2search);
    }
    
    public IArealevel2search getArealevel2search() {
        if(arealevel2searcher.used()) {
            return (IArealevel2search)arealevel2searcher.getTablesearches().get(0);
        } else {
            return null;
        }
    }

}
