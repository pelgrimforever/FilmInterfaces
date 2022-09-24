/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 23.8.2022 15:19
 * @author Franky Laseure
 */

package film.searchentity;

import film.interfaces.searchentity.IArealevel3search;
import film.interfaces.entity.pk.*;
import data.interfaces.db.*;
import film.interfaces.logicentity.*;
import film.interfaces.searchentity.*;
import film.logicentity.Arealevel3;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Arealevel3search extends Tablesearch implements IArealevel3search {

    Stringsearch al3code = new Stringsearch("arealevel3.al3code");
    Stringsearch name = new Stringsearch("arealevel3.name");
    Stringsearch location = new Stringsearch("arealevel3.location");
    Stringsearch bounds = new Stringsearch("arealevel3.bounds");
    Stringsearch viewport = new Stringsearch("arealevel3.viewport");
    Booleansearch approximate = new Booleansearch("arealevel3.approximate");
//foreign keys
    Foreignkeysearch arealevel2searcher = new Foreignkeysearch("arealevel2", IArealevel3.arealevel2PKfields, IArealevel3.arealevel2FKfields);
//external foreign keys

    public String getTable() {
        return Arealevel3.table;
    }

    public Arealevel3search() {
        setFieldsearchers();
    }

    public Arealevel3search(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(al3code);
        addFieldsearcher(name);
        addFieldsearcher(location);
        addFieldsearcher(bounds);
        addFieldsearcher(viewport);
        addFieldsearcher(approximate);
        addKeysearcher(arealevel2searcher);
    }

    public void addPrimarykey(IArealevel3PK arealevel3PK) {
        super.addPrimarykey(arealevel3PK);
    }

    public void al3code(String[] values) {
        addStringvalues(al3code, values);
    }
    
    public void al3code(String[] values, byte compare, byte andor) {
        addStringvalues(al3code, values);
        al3code.setCompareoperator(compare);
        al3code.setAndoroperator(andor);
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

    public String getArealevel2Innerjoin() {
        return arealevel2searcher.getInnerjoin();
    }

}
